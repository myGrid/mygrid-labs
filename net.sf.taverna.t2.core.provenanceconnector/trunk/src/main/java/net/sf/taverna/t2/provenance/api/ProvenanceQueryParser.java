/**
 * 
 */
package net.sf.taverna.t2.provenance.api;

import java.io.FileReader;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.taverna.t2.provenance.lineageservice.utils.ProvenanceProcessor;
import net.sf.taverna.t2.provenance.lineageservice.utils.QueryVar;
import net.sf.taverna.t2.provenance.lineageservice.utils.Var;
import net.sf.taverna.t2.provenance.lineageservice.utils.Workflow;
import net.sf.taverna.t2.provenance.lineageservice.utils.WorkflowInstance;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

/**
 * @author paolo
 *
 */
public class ProvenanceQueryParser {

	private static Logger logger = Logger.getLogger(ProvenanceQueryParser.class);


	// PQuery type
	private static final String PQUERY_EL = "pquery";  // top level
	private static final String PQUERY_SCOPE_EL = "scope";
	private static final String PQUERY_SELECT_EL = "select";
	private static final String PQUERY_FOCUS_EL = "focus";

	// Query type
	private static final String QUERY_SCOPE_ATTR = "workflowId";
	private static final String QUERY_RUNS_EL = "runs";

	// Runs type
	private static final Object RUNS_RUN_EL = "run";
	private static final Object RUNS_RANGE_EL = "range";

	// Run type
	private static final String RUN_ID_ATTR = "id";

	// Range type	
	private static final String RANGE_FROM_ATTR = "from";
	private static final String RANGE_TO_ATTR = "to";

	// Selection type
	private static final String SELECTION_WORKFLOW_EL = "workflow";
	private static final String SELECTION_PROCESSOR_EL = "processor";
	private static final String SELECTION_PORT_EL = "port";

	// Workflow type
	private static final String WORKFLOW_NAME_ATTR = "name";
	private static final String WORKFLOW_WORKFLOW_EL = "workflow";  // code missing for nested workflow elements
	private static final String WORKFLOW_PROCESSOR_EL = "processor";
	private static final String WORKFLOW_PORT_EL = "port";

	// Processor type	
	private static final String PROCESSOR_NAME_ATTR = "name";
	private static final String PROCESSOR_PORT_EL = "port";

	//Port type
	private static final String PORT_NAME_ATTR = "name";
	private static final String PORT_INDEX_ATTR = "index";

	// Focus type
	private static final String FOCUS_WORKFLOW_EL = "workflow";
	private static final String FOCUS_PROCESSOR_EL = "processor";

	private static final String PQUERY_NS = "http://taverna.org.uk/2009/provenance/pquery/";

	private static Namespace ns = Namespace.getNamespace(PQUERY_NS);

	private ProvenanceAccess pAccess;

	private String mainWorkflowUUID = null;
	private String mainWorkflowID = null;

	/**
	 * 
	 * @param XMLQuerySpec A string representation of the XML provenace query
	 * @return
	 * @throws QueryValidationException 
	 * @throws QueryParseException 
	 */
	@SuppressWarnings("unchecked")
	public Query parseProvenanceQuery(String XMLQuerySpecFilename) throws QueryParseException, QueryValidationException {

		Query q = new Query();
		Document d=null; 

		// parse the XML using JDOM
		SAXBuilder  b = new SAXBuilder();

		try {
			d = b.build (new FileReader((XMLQuerySpecFilename)));
		} catch (Exception e) {
			logger.error("Problem parsing provenance query: " + e);
			return null;
		}

		// root is PQuery
		Element root = d.getRootElement();  // this should be a <pquery>

		if (!root.getName().equals(PQUERY_EL)) {
			logger.fatal("input XML query is invalid");
			return null;
		}

		q.setRunIDList(parseQuery(root));  // parse the RunSelection fragment and extracts workflowId
		q.setWorkflowName(mainWorkflowUUID);
		q.setTargetVars(parseSelection(d, q.getRunIDList()));
		q.setSelectedProcessors(parseFocus(d));

		return q;
	}


	/**
	 * processor the <processorFocus> section of the query spec
	 * @param d
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<ProvenanceProcessor> parseFocus(Document d) {

		List<ProvenanceProcessor> selectedProcessors = new ArrayList<ProvenanceProcessor>();

		Element root = d.getRootElement();

		if (!root.getName().equals(PQUERY_EL)) {
			logger.fatal("input XML query is invalid");
			return null;
		}

		Element processorFocusEl = root.getChild(PQUERY_FOCUS_EL, ns);

		if (processorFocusEl == null) {  // completely implicit: set to output ports of topLevelWorkflowID
			return processProcessorFocus(mainWorkflowUUID, mainWorkflowID, null);
		}

		logger.debug("setting explicit processor focus");

		// expect a sequence of a mix of PROCESSOR or WORKFLOW elements
		List<Element> children = processorFocusEl.getChildren();
		for (Element childEl: children) {

			logger.debug("processing element "+childEl.getName());

			if (childEl.getName().equals(FOCUS_WORKFLOW_EL)) { // 
				logger.debug("processorFocus>workflow");  // set new workflow scope
				selectedProcessors.addAll(processWorkflowFocus(childEl));

			} else if (childEl.getName().equals(FOCUS_PROCESSOR_EL)) { // ports within this processor
				logger.debug("processorFocus>processor");  // set new workflow scope		
				String procName = childEl.getAttributeValue(PORT_NAME_ATTR);
				if (procName == null) {
					logger.warn("processor name not found in processorFocus > processor element");
					continue;
				}
				selectedProcessors.addAll(processProcessorFocus(mainWorkflowID, procName, childEl));
			}

		}
		return selectedProcessors;
	}



	/**
	 * here we are processing <processor> within <workflow> within <processorFocus>
	 * @param procScope 
	 * @param procScope 
	 */
	private List<ProvenanceProcessor> processProcessorFocus(String workflowID, String procScope, Element childEl) {

		//		String processorNameScope = childEl.getAttributeValue(PROC_NAME_ATTR);
		//		if (processorNameScope == null) {
		//		logger.warn("no processor name found in <processor> tag");
		//		return null;
		//		}

		// get the ProvenanceProcessor object within the current scope

		// this gets a map workflowId -> [ProvenanceProcessor] for all workflows nested within the top workflowID
		Map<String, List<ProvenanceProcessor>> allProcessors = pAccess.getProcessorsInWorkflow(workflowID);

		List<ProvenanceProcessor> myProcs = allProcessors.get(workflowID);  // processors for this specific workflow
		for (ProvenanceProcessor pp:myProcs) {
			if (procScope.equals(pp.getPname())) {
				List<ProvenanceProcessor> ppList = new ArrayList<ProvenanceProcessor>();
				ppList.add(pp);
				return ppList;
			}
		}
		return null;
	}


	/**
	 * here we are parsing <workflow> inside <processorFocus>
	 * @param childEl a <workflow> element
	 * @return
	 */
	private Collection<? extends ProvenanceProcessor> processWorkflowFocus(
			Element childEl) {

		List<ProvenanceProcessor> processors = new ArrayList<ProvenanceProcessor>();

		String workflowNameScope = childEl.getAttributeValue(WORKFLOW_NAME_ATTR);
		if (workflowNameScope == null) {
			logger.warn("no workflow name found in <workflow> tag");
			return null;
		}
		String workflowIDScope = pAccess.getWorkflowIDForExternalName(workflowNameScope);

		List<Element> children = childEl.getChildren();  // expect <processor> elements, or nothing
		if (children.size()==0) {  // add all processors within this workflow	

			// does a deep traversal of nesting hierarchy collecting all processors along the way
			Map<String, List<ProvenanceProcessor>> allProcs = pAccess.getProcessorsInWorkflow(workflowIDScope);
			for (Map.Entry<String, List<ProvenanceProcessor>> procList:allProcs.entrySet()) {
				processors.addAll(procList.getValue());				
			}
			return processors;		
		}
		for (Element processorEl:children) {
			String procScope = processorEl.getAttributeValue(PORT_NAME_ATTR);

			if (!processorEl.getName().equals(FOCUS_PROCESSOR_EL) || procScope == null) {
				logger.debug("no processorFocus > workflow > processor element or "+
						" no attribute "+PORT_NAME_ATTR+" in element processorFocus > workflow > processor");
				continue;
			}
			processors.addAll(processProcessorFocus(workflowIDScope, procScope, childEl));
		}
		return processors;		
	}



	@SuppressWarnings("unchecked")
	private List<QueryVar> parsePorts(String workflowUUID, String procName, Element childEl, String runID) {

		List<QueryVar>  queryVars = new ArrayList<QueryVar>();
		List<String> portNames = new ArrayList<String>();

		List<Var> ports = pAccess.getPortsForProcessor(workflowUUID, procName);

		List<Element> children = null;
		if (childEl != null)  {
			children = childEl.getChildren();
		}
		if (children == null || children.size() == 0) {  
			// add all output ports 
			for (Var p:ports) {
				if (!p.isInput()) {
					QueryVar qv = new QueryVar();
					qv.setWfName(p.getWfInstanceRef());
					qv.setPname(p.getPName());
					qv.setVname(p.getVName());
					qv.setPath("ALL");
					qv.setWfInstanceId(runID);
					queryVars.add(qv);	
				}
			}
		} else {
			Map<String, String> portToIndex = new HashMap<String, String>();
			for (Element portEl:children) {
				if (portEl.getName().equals(WORKFLOW_PORT_EL) ||
						portEl.getName().equals(PROCESSOR_PORT_EL) ||
						portEl.getName().equals(SELECTION_PORT_EL))  {
					String portName = portEl.getAttributeValue(PORT_NAME_ATTR);
					String index    = portEl.getAttributeValue(PORT_INDEX_ATTR);
					portNames.add(portName);
					if (index == null) portToIndex.put(portName, "ALL");
					else portToIndex.put(portName, index);
				}
			}

			Set<String> availableOutPortNames = new HashSet<String>();
			for (Var p:ports) if (!p.isInput()) { availableOutPortNames.add(p.getVName()); }

			for (String portName:portNames) {

				boolean found = false;
				for (Var p1:ports) {				
					if (portName.equals(p1.getVName())) {
						QueryVar qv = new QueryVar();
						qv.setWfName(p1.getWfInstanceRef());
						qv.setPname(p1.getPName());
						qv.setVname(p1.getVName());
						qv.setWfInstanceId(runID);
						String index = portToIndex.get(p1.getVName());
						if (index != null) qv.setPath(portToIndex.get(p1.getVName()));
						else qv.setPath("ALL");
						queryVars.add(qv);	
						found = true;
						logger.debug("adding port "+p1.getPName()+":"+p1.getVName()+" to targetVars");
						break;
					}
				} if (!found)  {
					logger.warn("output port "+portNames+" not found while processing <select>");
				}
			}
		}
		return queryVars;
	}


	private List<QueryVar> parseProcessor(String workflowID, Element childEl, String runID) {
		String procName = childEl.getAttributeValue(PROCESSOR_NAME_ATTR);
		logger.debug("portSelection > processor");

		return parsePorts(workflowID, procName, childEl, runID);  		// parse all ports within this processor		
	}


	@SuppressWarnings("unchecked")
	// TODO process nested Workflow elements??
	private List<QueryVar> parseWorkflow(Element workflowEl, String runID) {

		List<QueryVar>  queryVars = new ArrayList<QueryVar>();

		String workflowNameScope = workflowEl.getAttributeValue(WORKFLOW_NAME_ATTR);
		String workflowIDScope = pAccess.getWorkflowIDForExternalName(workflowNameScope);
		//String defaultProcName = pAccess.getProcessorNameForWorkflowID(workflowIDScope);

		// expect nested processor elements
		List<Element> children = workflowEl.getChildren();
		for (Element childEl:children) {
			if (childEl.getName().equals(WORKFLOW_PROCESSOR_EL)) {
				queryVars.addAll(parseProcessor(workflowIDScope, childEl, runID));
			} else if (childEl.getName().equals(WORKFLOW_PORT_EL)) {   // pport with implicit processor scope = workflow scope 
				queryVars.addAll(parsePorts(workflowIDScope, workflowNameScope, workflowEl, runID));  // pass the parent's element
			}
		}
		return queryVars;
	}



	/**
	 * the scope for a query can be partially specified. Please see doc elsewhere
	 * @param d
	 * @param RunIDList 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private List<QueryVar> parseSelection(Document d, List<String> runIDList) {

		List<QueryVar>  queryVars = new ArrayList<QueryVar>();

		Element root = d.getRootElement();

		// this has probably been validated earlier??
		//		if (!root.getName().equals(PQUERY_EL)) {
		//			logger.fatal("input XML query is invalid");
		//			return null;
		//		}
		
		// use fist run id... TODO
		String runID = runIDList.get(0);

		Element portSelection = root.getChild(PQUERY_SELECT_EL, ns);

		if (portSelection == null) {  // completely implicit: set to output ports of topLevelWorkflowID
			return parsePorts(mainWorkflowUUID, mainWorkflowID, null, runID);
		}

		logger.debug("setting explicit port selections");

		// expect a sequence of a mix of PORT elements or PROCESSOR or WORKFLOW elements
		List<Element> children = portSelection.getChildren();
		for (Element childEl: children) {
			logger.debug("processing element "+childEl.getName());

			if (childEl.getName().equals(SELECTION_WORKFLOW_EL)) { // 
				logger.debug("portSelection>workflow");  // set new workflow scope
				queryVars.addAll(parseWorkflow(childEl, runID));
			} else if (childEl.getName().equals(SELECTION_PROCESSOR_EL)) { // ports within this processor
				queryVars.addAll(parseProcessor(mainWorkflowID, childEl, runID));
			} else if (childEl.getName().equals(SELECTION_PORT_EL)) { // ports within this processor
				queryVars.addAll(parsePorts(mainWorkflowID, mainWorkflowUUID, portSelection, runID));
			}
		}
		return queryVars;
	}



	/**
	 * process runs scope, with the constraint that all the runs refer to the same (top level) workflow: queries over multiple workflows 
	 * are not supported.
	 * @return
	 * @throws QueryValidationException 
	 * @throws SQLException 
	 */	
	@SuppressWarnings("unchecked")
	private List<String> parseQuery(Element pqueryEl) throws QueryParseException, QueryValidationException {

		List<String> runsScope = new ArrayList<String>();  // list of run IDs
		List<WorkflowInstance> feasibleWfInstances = new ArrayList<WorkflowInstance>();
		List<String> feasibleRuns = new ArrayList<String>();

		Element queryScopeEl = pqueryEl.getChild(PQUERY_SCOPE_EL, ns);

		// expect workflow UUID 
		if (queryScopeEl == null) {	  // no scope at all 

			// assume the default: UUID of latest run
			String latestRunID;
			try {
				latestRunID = pAccess.getLatestRunID();
				List<Workflow> workflowIDs = pAccess.getWorkflowForRun(latestRunID);

				for (Workflow w: workflowIDs) {
					if (pAccess.isTopLevelDataflow(w.getWfname())) {
						mainWorkflowUUID = w.getWfname();
					}
				}			
				logger.info("no explicit scope for the query: using latest run id "+latestRunID+
						" and top level workflow id "+mainWorkflowUUID);
				
				runsScope.add(latestRunID);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		} else {  // scope element available 
			mainWorkflowUUID = queryScopeEl.getAttributeValue(QUERY_SCOPE_ATTR);

			if (mainWorkflowUUID == null) {
				logger.fatal("no workflow ID specified in query scope - giving up");				
				throw new QueryValidationException();
			}
		}
		
		//  validate this workflowID
		List<WorkflowInstance>  allWfInstances = pAccess.listRuns(null, null); // returns all available runs ordered by timestamp
		// is this workflow in one of the instances?

		for (WorkflowInstance i:allWfInstances) {
			if (mainWorkflowUUID.equals(i.getWorkflowIdentifier())) {
				logger.debug("workflow name found corresponding to ID "+mainWorkflowID);
				feasibleWfInstances.add(i);
				feasibleRuns.add(i.getInstanceID());
			}
		}

		if (feasibleWfInstances.size() == 0) {
			logger.debug("workflow "+mainWorkflowUUID+" not found -- giving up");
			throw new QueryValidationException();
		}

		// get workflow name from workflowUUID
		mainWorkflowID = pAccess.getWorkflowNameByWorkflowID(mainWorkflowUUID);

		// parse the Runs fragment
		
		if (queryScopeEl == null ) {
			return runsScope;
		}
		
			Element runs = queryScopeEl.getChild(QUERY_RUNS_EL, ns);

		if (runs == null) {
			// no explicit run:  using latest from feasible
			logger.debug("null runs scope: using latest run: "+feasibleWfInstances.get(0).getInstanceID());
			if (feasibleWfInstances != null) runsScope.add(feasibleWfInstances.get(0).getInstanceID());
			return runsScope;
		}

		logger.debug("setting explicit runs scope");

		// expect a sequence of run elements and/ or a single <range> element
		List<Element> runElList = runs.getChildren();
		for (Element runEl:runElList) {

			// explicit runID given
			if (runEl.getName().equals(RUNS_RUN_EL)) {
				String runID = runEl.getAttributeValue(RUN_ID_ATTR);
				if (runID!=null) {
					if (feasibleRuns.contains(runID)) {
						logger.debug("adding runID "+runID+" to runs scope");
						runsScope.add(runID);
					} else {
						logger.debug("selected runID "+runID+" not in provenance DB -- ignored");
					}
				} else {
					logger.warn("<run> element with no ID");
				}					

				// time range given 
			} else if (runEl.getName().equals(RUNS_RANGE_EL)) {
				String from = runEl.getAttributeValue(RANGE_FROM_ATTR,ns);
				String to   = runEl.getAttributeValue(RANGE_TO_ATTR,ns);

				logger.debug("processing runs range from "+from+" to "+to);

				for (WorkflowInstance i:feasibleWfInstances) {

					Date fromInstanceDate = null;
					Date toInstanceDate = null;
					DateFormat f = new SimpleDateFormat();
					Date fromDate=null, toDate=null;

					if (from != null) {
						try {
							fromDate = f.parse(from);
							fromInstanceDate = f.parse(i.getTimestamp());
						} catch (ParseException e) {
							logger.warn(from+" cannot be parsed as a date -- ignored");
						}
					}

					if (to != null) {
						try {
							toDate = f.parse(to);
							toInstanceDate = f.parse(i.getTimestamp());
						} catch (ParseException e) {
							logger.warn(to+" cannot be parsed as a date -- ignored");
						}
					}
					if (fromDate == null || (fromDate != null && fromDate.before(fromInstanceDate))) {
						if (toDate == null || (toDate != null && toInstanceDate.before(toDate)));
						runsScope.add(i.getInstanceID());
					}
				}
			}

			logger.debug("runs scope:");
			for (String r:runsScope) logger.debug(r);
		}
		return runsScope;
	}


	/**
	 * @return the provenance Access object
	 */
	public ProvenanceAccess getPAccess() {
		return pAccess;
	}

	/**
	 * @param access the pAccess to set
	 */
	public void setPAccess(ProvenanceAccess access) {
		pAccess = access;
	}
}

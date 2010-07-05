/**
 * 
 */
package net.sf.taverna.t2.provenance.api.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;

import net.sf.taverna.t2.invocation.InvocationContext;
import net.sf.taverna.t2.provenance.api.NativeAnswer;
import net.sf.taverna.t2.provenance.api.ProvenanceAccess;
import net.sf.taverna.t2.provenance.api.ProvenanceConnectorType;
import net.sf.taverna.t2.provenance.api.ProvenanceQueryParser;
import net.sf.taverna.t2.provenance.api.Query;
import net.sf.taverna.t2.provenance.api.QueryAnswer;
import net.sf.taverna.t2.provenance.api.QueryParseException;
import net.sf.taverna.t2.provenance.api.QueryValidationException;
import net.sf.taverna.t2.provenance.lineageservice.Dependencies;
import net.sf.taverna.t2.provenance.lineageservice.LineageQueryResultRecord;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProvenanceProcessor;
import net.sf.taverna.t2.provenance.lineageservice.utils.QueryVar;
import net.sf.taverna.t2.provenance.lineageservice.utils.Var;
import net.sf.taverna.t2.provenance.lineageservice.utils.VarBinding;
import net.sf.taverna.t2.provenance.lineageservice.utils.Workflow;
import net.sf.taverna.t2.reference.T2Reference;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;

/**
 * @author Paolo Missier<p/>
 * This is a provenance API client designed to extract a complete set of dependencies from a native provenance DB 
 * so that it can be uploaded into the DataONE common provenance model<br/>
 * this class simplifies the users' task by using the hard-coded provenance query <it>completeGraph.xml</it> rather than reading 
 * a query file from an explicit user config.<br/>
 * All of the info extracted refers to the <it>latest run</it> stored in the DB. Therefore if you want to extract provenance
 * for a specific workflow, first run it in Taverna, then run this app.
 */
public class NativeToDataONEModel extends ProvenanceBaseClient {

	List<String> wfNames = null;
	Set<String> selectedProcessors = null;

	private static String queryFile = "src/main/resources/completeGraph.xml";

	private static Logger logger = Logger.getLogger(NativeToDataONEModel.class);

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		p.put("query.file", queryFile);

		NativeToDataONEModel client = new NativeToDataONEModel();

		client.setUp();

		////// 
		// step 1: extract structural information from the DB
		//////
		client.reportStructure();


		////// 
		// step 2: extract dynamic provenance trace for the latest run, using a provenance query
		//////		
		QueryAnswer answer = client.queryProvenance(p);

		// look at this for clues on how to extract information from the native trace
		if (answer!=null) client.reportAnswer(answer);

		////// 
		// step 3: infer OPM-style relationships
		//////

		// TODO

	}



	private void reportStructure() throws SQLException {

		String mainWorkflowUUID = null; // internal workflow name
		String mainWorkflowID = null;   // external name

		// get the ID for the latest run in the DB
		String latestRunID = pAccess.getLatestRunID();

		// get all the workflow ID for the latest run
		List<Workflow> workflowIDs = pAccess.getWorkflowForRun(latestRunID);

		// only one of these is the top level workflow, if there is more than one then the others are 
		// nested (sub-) workflows
		for (Workflow w: workflowIDs) {
			if (pAccess.isTopLevelDataflow(w.getWfname())) {
				mainWorkflowUUID = w.getWfname();
			}
		}			

		if (mainWorkflowUUID == null) {
			logger.fatal("null "+workflowIDs+" cannot continue");
			return;
		}

		// get workflow name from workflowUUID
		mainWorkflowID = pAccess.getWorkflowNameByWorkflowID(mainWorkflowUUID);

		logger.info("extracting provenance for workflow: "+workflowIDs+ " and for run with ID: "+latestRunID);

		// ports for the entire workflow
		logger.info("here are the ports for the top level workflow: ");
		List<Var> ports = pAccess.getPortsForProcessor(mainWorkflowUUID, mainWorkflowID);

		for (Var p:ports) {
			if (!p.isInput()) {
				logger.info("\tOUTPUT port "+p.getVName());
			} else {
				logger.info("\tINPUT port "+p.getVName());
			}
		}

		logger.info("listing all other processors (actors) along with their input and output ports (channels) for this workflow");

		Map<String, List<ProvenanceProcessor>> allProcessors = pAccess.getProcessorsInWorkflow(mainWorkflowUUID);

		List<ProvenanceProcessor> myProcs = allProcessors.get(mainWorkflowUUID);  // processors for this specific workflow
		for (ProvenanceProcessor pp:myProcs) {
			
			String pname = pp.getPname();
			logger.info("processor: "+pname);
			
			logger.info("\twith ports: ");
			ports = pAccess.getPortsForProcessor(pp.getWfInstanceRef(), pname);

			for (Var p:ports) {
				if (!p.isInput()) {
					logger.info("\t\tOUTPUT port "+p.getVName());
				} else {
					logger.info("\t\tINPUT port "+p.getVName());
				}
			}
		}

		
	}



	protected  QueryAnswer queryProvenance() throws QueryParseException, QueryValidationException {
		return queryProvenance(null);
	}


	/**
	 * parses an XML provenance query into a Query object and invokes {@link ProvenanceAccess.executeQuery()} 
	 * @return a bean representing the query answer
	 * @throws QueryValidationException 
	 * @throws QueryParseException 
	 * @see QueryAnswer
	 */
	protected  QueryAnswer queryProvenance(Properties p) throws QueryParseException, QueryValidationException {

		Query q = new Query();

		String querySpecFile = null;
		if (p != null && p.get("query.file") != null)  
			querySpecFile = (String) p.get("query.file");
		else {
			// get filename for XML query spec
			querySpecFile = PropertiesReader.getString("query.file");
		}
		logger.info("executing query "+querySpecFile);

		ProvenanceQueryParser pqp = new ProvenanceQueryParser();
		pqp.setPAccess(pAccess);

		q = pqp.parseProvenanceQuery(querySpecFile);

		if (q == null) {
			logger.fatal("query processing failed. So sorry.");
			return null;
		}
		logger.info("YOUR QUERY: "+q.toString());

		QueryAnswer answer=null;
		try {
			answer = pAccess.executeQuery (q);
		} catch (SQLException e) {
			logger.fatal("Exception while executing query: "+e.getMessage());
			return null;
		}
		return answer;
	}



	/////////
	/// preliminary setup methods
	/////////

	private void reportAnswer(QueryAnswer answer) {

		NativeAnswer nAnswer = answer.getNativeAnswer();

		// nAnswer contains a Map of the form 
		// 	Map<QueryVar, Map<String, List<Dependencies>>>  answer;

		logger.info("*** list of all provenance paths ***");

		Map<QueryVar, Map<String, List<Dependencies>>>  dependenciesByVar = nAnswer.getAnswer();	
		for (QueryVar v:dependenciesByVar.keySet()) {
			logger.info("reporting provenance paths for values on TARGET port: "+v.getPname()+":"+v.getVname()+":"+v.getPath());

			Map<String, List<Dependencies>> deps = dependenciesByVar.get(v);
			for (String path:deps.keySet()) {

				logger.info("provenance of value at position "+path);
				
				Map<String, String> constraints = new HashMap<String, String>();
				constraints.put("VB.varNameRef", v.getVname());
				constraints.put("VB.PNameRef", v.getPname());
				constraints.put("VB.iteration", path);
				constraints.put("VB.wfNameRef", v.getWfName());
				constraints.put("VB.wfInstanceRef", v.getWfInstanceId());

				List<VarBinding> bindings = null;
				try {
					bindings = pAccess.getVarBindings(constraints);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Object value = ic.getReferenceService().renderIdentifier(
						ic.getReferenceService().referenceFromString(bindings.get(0).getValue()), Object.class, ic);

				logger.info("\tvalue at position "+path+" is:\n\t "+value);
				
				// for each Dependencies in the list
				for (Dependencies dep:deps.get(path)) {

					// each list of records in Dependencies
					logger.info("\t\tdependencies at processor "+dep.getRecords().get(0).getPname());
					for (LineageQueryResultRecord record: dep.getRecords()) {

						// we now resolve values on the client, there are no values in the record
						// returned through the API
						record.setPrintResolvedValue(false);  
						logger.info("\t\t\t"+"depends on: "+record.toString());

						// resolve reference if so desired
						if (derefValues && record.getValue() != null) {
							T2Reference ref = ic.getReferenceService().referenceFromString(record.getValue());

							Object o = ic.getReferenceService().renderIdentifier(ref, Object.class, ic); 
							logger.info("\t\t\tvalue: "+o);
						}
					}
				}
			}
		}		
	}


}

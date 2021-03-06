/**
 * 
 */
package net.sf.taverna.t2.provenance.client.Janus;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter;
import net.sf.taverna.t2.provenance.lineageservice.utils.Port;
import net.sf.taverna.t2.provenance.lineageservice.utils.PortBinding;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProcessorEnactment;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProvenanceProcessor;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.ModelMaker;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * @author paolo
 *
 */
public class RDFProvenanceWriter extends ProvenanceWriter {

	static Logger logger = Logger.getLogger(RDFProvenanceWriter.class);

	private static final String DEF_MODEL_NAME = "janus-instance-graph.rdf";
	private static final String BASE_DIR = "src/test/resources/";
	private static final String URI_QUALIFIER_SEPARATOR = "/";
	private static final String PROVENIR_PREFIX = "knoesis";
	private static final String PROVENIR_NS = "http://knoesis.wright.edu/provenir/provenir.owl#";
	private static final String OBO_NS = "http://obofoundry.org/ro/ro.owl#";
	private static final String OBO_PREFIX = "obo";
	private static final String RDFS_PREFIX = "rdfs";
	private static final String RDFS_NS = "http://www.w3.org/2000/01/rdf-schema#";

	private static Property RDFS_COMMENT = null;

	ModelMaker mm = null;
	Model      m  = null;

	String modelName = DEF_MODEL_NAME;

	// local mapping tables from our labels to resources
	Map<String, Resource> processorToResource = new HashMap<String, Resource>();
	Map<String, Resource> portToResource = new HashMap<String, Resource>();
	Map<String, Resource> workflowToResource = new HashMap<String, Resource>();
	Map<String, Resource> pBindingToResource = new HashMap<String, Resource>();
	Map<String, Resource> collectionToResource = new HashMap<String, Resource>();

	// not sure this is ever needed. just in case addArcs is called before the corresponding vars are added
	HashMap<String, String> unresolvedArc = new HashMap<String, String> (); 

	public RDFProvenanceWriter() {
		
		super();
		
		mm =     ModelFactory.createFileModelMaker(modelName);		
		logger.info("creating file-based model. Writing to  ["+this.BASE_DIR+this.modelName+"]");

		// TODO add open model to append to existing models
		m = mm.createModel(this.modelName);		
		m.setNsPrefix("janus",JanusOntology.getURI());
		m.setNsPrefix(PROVENIR_PREFIX, PROVENIR_NS);
		m.setNsPrefix(OBO_PREFIX, OBO_NS);
		m.setNsPrefix(RDFS_PREFIX, RDFS_NS);
		
		RDFS_COMMENT = m.createProperty(RDFS_NS, "comment");
	}


	public void closeCurrentModel() {	

		resolveArcs();

		if (m != null) {
			logger.info("writing  RDF model ");
			dumpCurrentModel(BASE_DIR+"/"+DEF_MODEL_NAME);
			logger.debug("model written to "+BASE_DIR+DEF_MODEL_NAME);
		} else {
			logger.info("Error: cannot close  model.");
		}
	}


	private void resolveArcs() {

		for (Map.Entry<String, String> arc: unresolvedArc.entrySet()) {

			Resource fromPort = portToResource.get(arc.getKey());
			Resource toPort   = portToResource.get(arc.getValue());

			if (fromPort != null && toPort != null) {
				toPort.addProperty(JanusOntology.links_from, fromPort);
			} else {
				logger.debug("fromPort or toPort still null on resolveArcs -- why??");
			}
		}
	}


	public void dumpCurrentModel(String fileName) {	
		if (m!=null) {
			try {
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName));
				m.write(osw);	
				logger.info("Model written to ["+fileName+"]");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			logger.fatal("could not write current model to ["+fileName+"]");
		}
	}


	///////
	/// following methods create the actual graph
	//////

	@Override
	public void addWFId(String wfId, String parentWFname, String externalName, Blob dataflow) throws SQLException {

		super.addWFId(wfId, parentWFname, externalName, dataflow);

		String wfNameURI = makeWorkflowURI(wfId);
		Resource wfResource = getModel().createResource(wfNameURI, JanusOntology.workflow_spec);

		// record this wf resource locally
		workflowToResource.put(wfNameURI, wfResource);

		if (parentWFname != null)  {
			// do we have a resource for the parent?
			Resource parentWFResource = workflowToResource.get(makeWorkflowURI(parentWFname));
			if (parentWFResource != null) {
				// link wfResource to its parent
				wfResource.addProperty(JanusOntology.has_parent_workflow, parentWFResource);
			}
		}
	}



	@Override
	public ProvenanceProcessor addProcessor(String pName, String wfNameRef, boolean isTopLevel)
	throws SQLException {
		
		ProvenanceProcessor p = super.addProcessor(pName, wfNameRef, isTopLevel);

		// create a Processor resource in the context of wfNameRef
		// wfNameRef rdf:type Workflow 
		// pName rdf:type j:Processor
		// pName part-Of wfNameRef

		String pNameURI = makeProcessorURI(pName, wfNameRef);
		Resource pResource = getModel().createResource(pNameURI, JanusOntology.processor_spec);
//		pResource.addLiteral(JanusOntology.has_processor_type, type);
		pResource.addLiteral(JanusOntology.is_top_level, isTopLevel);

		// associate this proc to its workflow
		Resource wfResource = workflowToResource.get(makeWorkflowURI(wfNameRef));
		if (wfResource != null) {
			pResource.addProperty(JanusOntology.part_of, wfResource);
		}

		// record this in our local mapping table
		processorToResource.put(pNameURI, pResource);
		return p;
	}


	@Override
	public void addPorts(List<Port> ports, String wfId) throws SQLException {

		super.addPorts(ports, wfId);

		for (Port v : ports) {
			String portURI = makePortURI(v.getWorkflowId(), v.getProcessorName(), v.getPortName());
			Resource portResource = getModel().createResource(portURI, JanusOntology.port);
			//if (v.getType()!=null) portResource.addLiteral(JanusOntology.has_port_type, v.getType());
			portResource.addLiteral(JanusOntology.has_port_order, v.getIterationStrategyOrder());
			portResource.addLiteral(JanusOntology.is_processor_input, v.isInputPort());

			portToResource.put(portURI, portResource);

			// associate this port to its processor
			String procURI = makeProcessorURI(v.getProcessorName(), v.getWorkflowId());

			Resource procResource = processorToResource.get(procURI);

			if (procResource != null) {
				procResource.addProperty(JanusOntology.has_parameter, portResource);
			}
		}
	}

	@Override
	public void addDataLink(Port sourcePort, Port destinationPort,
			String workflowId) throws SQLException {
		super.addDataLink(sourcePort, destinationPort, workflowId);
		addArc(sourcePort.getPortName(), sourcePort.getProcessorName(), destinationPort.getPortName(),
				destinationPort.getProcessorName(), sourcePort.getWorkflowId());
	}

	
	public void addArc(String sourceVarName, String sourceProcName,
			String sinkVarName, String sinkProcName, String wfId) {
		logger.debug("addArc called on source: "+makePortURI(wfId, sourceProcName, sourceVarName)+" and sink "+
				makePortURI(wfId, sinkVarName, sinkProcName));

		Resource fromPort = portToResource.get(makePortURI(wfId, sourceProcName, sourceVarName));
		Resource toPort   = portToResource.get(makePortURI(wfId, sinkProcName, sinkVarName));

		if (fromPort != null && toPort != null) {
			toPort.addProperty(JanusOntology.links_from, fromPort);
		} else {
			logger.debug("fromPort or toPort null -- arcs postponed");
			unresolvedArc.put(makePortURI(wfId, sourceProcName, sourceVarName), makePortURI(wfId, sinkVarName, sinkProcName));
		}
	}


	
	////////////
	//// runtime provenance
	///////////

	@Override
	public void addWorkflowRun(String wfId, String workflowRunId)
			throws SQLException {
		// TODO Auto-generated method stub
		super.addWorkflowRun(wfId, workflowRunId);
	
		String wfInstanceURI = makeWFInstanceURI(workflowRunId);
		Resource wfInstanceResource = getModel().createResource(wfInstanceURI, JanusOntology.workflow_run);

		// associate to static workflow resource
		Resource workflowResource = workflowToResource.get(makeWorkflowURI(wfId));

		if (workflowResource!=null) {
			workflowResource.addProperty(JanusOntology.has_execution, wfInstanceResource);
		}
	}

	
	@Override
	public void addProcessorEnactment(ProcessorEnactment pe)
			throws SQLException {
		super.addProcessorEnactment(pe);

		
		String pBindingURI = makePBindingURI(pe.getWorkflowRunId(), pe.getProcessEnactmentId());
		Resource pBindingResource = getModel().createResource(pBindingURI, JanusOntology.processor_exec);
		ProvenanceProcessor proc = getQuery().getProvenanceProcessorById(pe.getProcessorId());
		Resource procResource = processorToResource.get(makeProcessorURI(proc.getProcessorName(), proc.getWorkflowId()));

		if (procResource != null) {
			procResource.addProperty(JanusOntology.has_execution, pBindingResource);
		}

		pBindingToResource.put(pBindingURI, pBindingResource);
	}


	@Override
	public String addCollection(String processorId, String collId,
			String parentCollectionId, String iteration, String portName,
			String dataflowId) throws SQLException {


		String s = super.addCollection(processorId, collId, parentCollectionId, iteration, portName, dataflowId);

		String collectionURI = makeCollectionURI(collId);
		Resource collectionResource = getModel().createResource(collectionURI, JanusOntology.collection_structure);

		collectionToResource.put(collectionURI, collectionResource);

		return s;
	}


/**
 * also fetches data values from the Data table of the relational provenance DB and adds it as a rdfs:comment to the RDF graph 
 */	
	
	@Override
	public void addPortBinding(PortBinding vb) throws SQLException {

		logger.debug("RDF addVarBinding START with pname "+vb.getProcessorName()+" port "+vb.getPortName());
		
		super.addPortBinding(vb);
		
		// get the data value from the DB
		// logger.debug("pq is "+(getQuery() == null ? "null" : "not null"));
		
//		ProvenanceQuery q = getQuery();
//		String v = vb.getValue();
//		
//		q.getDataValue(v);
		
		String value = getQuery().getDataValue(vb.getValue());

		String vbURI = makeCollectionURI(vb.getValue());
		Resource vbResource = getModel().createResource(vbURI, JanusOntology.port_value);

		// add various attributes
		if (vb.getIteration() != null) {
			vbResource.addLiteral(JanusOntology.has_iteration, vb.getIteration());
		}
		vbResource.addLiteral(JanusOntology.has_port_value_order, vb.getPositionInColl());

		// add the actual value as rdfs:comment
		if (value != null)	vbResource.addLiteral(RDFS_COMMENT, value);
		
		// is it part of a collection structure?
		if (vb.getCollIDRef() != null) {
			// get resource for the collection
			Resource collResource = collectionToResource.get(makeCollectionURI(vb.getCollIDRef()));
			if (collResource != null) {
				vbResource.addProperty(JanusOntology.part_of, collResource);
			}
		}

		// link from the port this comes from
		Resource portResource = portToResource.get(makePortURI(vb.getWorkflowId(), vb.getProcessorName(), vb.getPortName()));
		if (portResource != null) {
			portResource.addProperty(JanusOntology.has_value_binding, vbResource);
		}

		logger.debug("RDF addVarBinding COMPLETE with pname "+vb.getProcessorName()+" port "+vb.getPortName());

	}

	//////////
	///  create URIs out of key values
	///////////

	private String makeCollectionURI(String collId) {

		// collId is of the form t2:list//<UUID>
		// map to a proper URI

		String[] tokens = collId.split("//");
		return makeURI(tokens[1]);
	}


	private String makePBindingURI(String execIDRef, String process) {
		return makeURI(execIDRef+URI_QUALIFIER_SEPARATOR+process.replace(":", "/"));
	}


	private String makeWFInstanceURI(String wfInstanceId) {
		return makeURI(wfInstanceId);
	}

	private String makeWorkflowURI(String wfId) {
		return makeURI(wfId);
	}


	private String makePortURI(String wfNameRef, String pName, String vName) {
		return makeURI(wfNameRef+URI_QUALIFIER_SEPARATOR+pName+URI_QUALIFIER_SEPARATOR+vName);
	}

	private String makeProcessorURI(String pName, String wfNameRef) {
		return makeURI(wfNameRef+URI_QUALIFIER_SEPARATOR+pName);
	}

	private String makeURI(String s) {

		URI u;
		try {
			u = new URI(JanusOntology.getURI()+"/"+s);
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}
		return u.toASCIIString();
	}

	/**
	 * @return the m
	 */
	public Model getModel() {
		return m;
	}


	/**
	 * @param m the m to set
	 */
	public void setModel(Model m) {
		this.m = m;
	}



}

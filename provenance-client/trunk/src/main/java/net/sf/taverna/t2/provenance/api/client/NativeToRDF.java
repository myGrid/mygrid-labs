/**
 * 
 */
package net.sf.taverna.t2.provenance.api.client;

import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import net.sf.taverna.t2.provenance.client.Janus.StandAloneRDFProvenanceWriter;
import net.sf.taverna.t2.provenance.lineageservice.utils.Port;
import net.sf.taverna.t2.provenance.lineageservice.utils.Collection;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProcessorBinding;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProvenanceProcessor;
import net.sf.taverna.t2.provenance.lineageservice.utils.DataLink;
import net.sf.taverna.t2.provenance.lineageservice.utils.PortBinding;
import net.sf.taverna.t2.provenance.lineageservice.utils.Workflow;
import net.sf.taverna.t2.reference.Identified;
import net.sf.taverna.t2.reference.T2Reference;
import net.sf.taverna.t2.reference.T2ReferenceType;
import net.sf.taverna.t2.reference.impl.ReferenceSetImpl;
import net.sf.taverna.t2.reference.impl.T2ReferenceImpl;

/**
 * @author paolo
 *
 */
public class NativeToRDF extends ProvenanceBaseClient {

	static Logger logger = Logger.getLogger(NativeToRDF.class);
	private static URL resource;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		NativeToRDF n2RDF = null;
		if (System.getProperty("conf") != null) {
			n2RDF = new NativeToRDF(System.getProperty("conf") );
		} else {
			n2RDF = new NativeToRDF();
		}
		n2RDF.setUp();
		n2RDF.generateRDF();
	}

	public NativeToRDF() { super(); }

	public NativeToRDF(String resourceFile) { super(resourceFile); }

	private String topLevelWorkflowID;

	void generateRDF() throws SQLException {

		StandAloneRDFProvenanceWriter  RDFpw = new StandAloneRDFProvenanceWriter(pAccess.getPq());

		String latestRun = pAccess.getLatestRunID();

		logger.info("generating RDF for run ID: "+latestRun);


		for (Workflow w: pAccess.getWorkflowsForRun(latestRun)) {
			// add each wfID to the RDF graph

			// single out the top level workflow in the list
			if (w.getParentWorkflowId() == null) { 
				topLevelWorkflowID = w.getWorkflowId();
			}
			RDFpw.addWFId(topLevelWorkflowID, w.getParentWorkflowId(), w.getExternalName(), null);

			// also add the <workflow ID, wfinstanceID> pair
			RDFpw.addWorkflowRun(topLevelWorkflowID, latestRun);
		}



		// add all processors. 
		List<ProvenanceProcessor> allProcessors = pAccess.getProcessorsForWorkflowID(topLevelWorkflowID);

		for (ProvenanceProcessor pp:allProcessors) {
			boolean isTopLevel = (pp.getFirstActivityClassName().equals("net.sf.taverna.t2.activities.dataflow.DataflowActivity") &&
					pp.getWorkflowId().equals(topLevelWorkflowID) ? true: false);
			RDFpw.addProcessor(pp.getProcessorName(), pp.getFirstActivityClassName(), pp.getWorkflowId(), isTopLevel);
		}

		// add all Portiables
		List<Port> allPorts = pAccess.getPortsForDataflow(latestRun);

		for (Port v:allPorts) { RDFpw.addPort(v); }

		// add all DataLinks
		List<DataLink> datalinks = pAccess.getDataLinks(topLevelWorkflowID);
		for (DataLink a:datalinks) {
			RDFpw.addDataLink(a.getSourcePortName(), a.getSourceProcessorName(), a.getDestinationPortName(), a.getDestinationProcessorName(), a.getWorkflowId());
		}


		// add all processorBindings 
		//		for (Workflow w: latestWorkflows) {
//		HashMap<String, String> queryConstraints = new HashMap<String,String>();
//				queryConstraints.put("execIDRef", latestRun);
//		List<ProcBinding> bindings = pAccess.getProcBindings(queryConstraints);
//		for (ProcBinding pb: bindings) { RDFpw.addProcessorBinding(pb); }
//		//		}


		// add all collections CHECK this appears to be incomplete!!
		List<Collection> collections = pAccess.getCollectionsForRun(latestRun);
		for (Collection c:collections) { RDFpw.addCollection(c.getCollId()); }

		// add all varBindings
		HashMap<String, String> queryConstraints = new HashMap<String,String>();
		queryConstraints.put("VB.wfInstanceRef", latestRun);
		List<PortBinding> varBindings = pAccess.getPortBindings(queryConstraints);

		for (PortBinding vb:varBindings) { 
			T2Reference ref = ic.getReferenceService().referenceFromString(vb.getValue());			

			// Identified data = ic.getReferenceService().resolveIdentifier(ref, null, ic);

			Object data = ic.getReferenceService().renderIdentifier(ref, Object.class, ic); 

			//			logger.info("data for ref "+vb.getValue()+" : "+ data);

			RDFpw.addPortBinding(vb, data);
		}
		RDFpw.closeCurrentModel();
	}



}

/**
 * 
 */
package net.sf.taverna.t2.provenance.api.client;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import net.sf.taverna.t2.provenance.lineageservice.rdf.StandAloneRDFProvenanceWriter;
import net.sf.taverna.t2.provenance.lineageservice.utils.Arc;
import net.sf.taverna.t2.provenance.lineageservice.utils.Collection;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProcBinding;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProvenanceProcessor;
import net.sf.taverna.t2.provenance.lineageservice.utils.Var;
import net.sf.taverna.t2.provenance.lineageservice.utils.VarBinding;
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



	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		NativeToRDF n2RDF = new NativeToRDF();
		n2RDF.setUp();
		n2RDF.generateRDF();
	}

	private String topLevelWorkflowID;

	void generateRDF() throws SQLException {

		StandAloneRDFProvenanceWriter  RDFpw = new StandAloneRDFProvenanceWriter(pAccess.getPq());

		String latestRun = pAccess.getLatestRunID();
		
		logger.info("generating RDF for run ID: "+latestRun);
		
		List<Workflow> latestWorkflows = pAccess.getWorkflowForRun(latestRun);


		for (Workflow w:latestWorkflows) {
			// add each wfID to the RDF graph

			// single out the top level workflow in the list
			if (w.getParentWFname() == null) { 
				topLevelWorkflowID = w.getWfname();
			}
			RDFpw.addWFId(w.getWfname(), w.getParentWFname(), w.getExternalName(), null);

			// also add the <workflow ID, wfinstanceID> pair
			RDFpw.addWFInstanceId(w.getWfname(), latestRun);
		}



		// add all processors. 
		List<ProvenanceProcessor> allProcessors = pAccess.getProcessorsForWorkflowID(topLevelWorkflowID);

		for (ProvenanceProcessor pp:allProcessors) {
			boolean isTopLevel = (pp.getType().equals("net.sf.taverna.t2.activities.dataflow.DataflowActivity") &&
					pp.getWfInstanceRef().equals(topLevelWorkflowID) ? true: false);
			RDFpw.addProcessor(pp.getPname(), pp.getType(), pp.getWfInstanceRef(), isTopLevel);
		}

		// add all Variables
		Map<String, String> queryConstraints = new HashMap<String, String>();
		queryConstraints.put("instanceID", latestRun);		
		List<Var> allVars = pAccess.getVars(queryConstraints);

		for (Var v:allVars) { RDFpw.addVar(v); }

		// add all Arcs
		queryConstraints = new HashMap<String, String>();
		queryConstraints.put("instanceID", latestRun);		
		List<Arc> arcs = pAccess.getArcs(queryConstraints);

		for (Arc a:arcs) {
			RDFpw.addArc(a.getSourceVarNameRef(), a.getSourcePnameRef(), a.getSinkVarNameRef(), a.getSinkPnameRef(), a.getWfInstanceRef());
		}


		// add all processorBindings 
		for (Workflow w: latestWorkflows) {
			queryConstraints.clear();
			queryConstraints.put("execIDRef", latestRun);

			List<ProcBinding> bindings = pAccess.getProcBindings(queryConstraints);

			for (ProcBinding pb: bindings) { RDFpw.addProcessorBinding(pb); }
		}


		// add all collections CHECK this appears to be incomplete!!
		List<Collection> collections = pAccess.getCollectionsForRun(latestRun);
		for (Collection c:collections) { RDFpw.addCollection(c.getCollId()); }

		// add all varBindings
		queryConstraints.put("wfInstanceRef", latestRun);
		queryConstraints.clear();
		List<VarBinding> varBindings = pAccess.getVarBindings(queryConstraints);

		for (VarBinding vb:varBindings) { 
			T2Reference ref = ic.getReferenceService().referenceFromString(vb.getValue());			
			
			// Identified data = ic.getReferenceService().resolveIdentifier(ref, null, ic);
			
			Object data = ic.getReferenceService().renderIdentifier(ref, Object.class, ic); 
			
//			logger.info("data for ref "+vb.getValue()+" : "+ data);
			
			RDFpw.addVarBinding(vb, data);
		}



		RDFpw.closeCurrentModel();
	}



}

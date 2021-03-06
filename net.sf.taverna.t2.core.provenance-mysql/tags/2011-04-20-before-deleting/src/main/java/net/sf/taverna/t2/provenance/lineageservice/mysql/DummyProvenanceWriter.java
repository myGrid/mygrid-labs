/**
 * 
 */
package net.sf.taverna.t2.provenance.lineageservice.mysql;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter;
import net.sf.taverna.t2.provenance.lineageservice.utils.ProcBinding;
import net.sf.taverna.t2.provenance.lineageservice.utils.Var;
import net.sf.taverna.t2.provenance.lineageservice.utils.VarBinding;

/**
 * used to cut out mySQL writes altogether -- for testing purposes only
 * @author paolo
 *
 */
public class DummyProvenanceWriter extends ProvenanceWriter {

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addArc(net.sf.taverna.t2.provenance.lineageservice.utils.Var, net.sf.taverna.t2.provenance.lineageservice.utils.Var, java.lang.String)
	 */
	public void addArc(Var sourceVar, Var sinkVar, String wfId)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addArc(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public void addArc(String sourceVarName, String sourceProcName,
			String sinkVarName, String sinkProcName, String wfId)
			{
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addCollection(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	public String addCollection(String processorId, String collId,
			String parentCollectionId, String iteration, String portName,
			String dataflowId) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addProcessor(java.lang.String, java.lang.String)
	 */
	public void addProcessor(String name, String wfID) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addProcessor(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void addProcessor(String name, String type, String wfNameRef)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addProcessorBinding(net.sf.taverna.t2.provenance.lineageservice.utils.ProcBinding)
	 */
	public void addProcessorBinding(ProcBinding pb) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addVarBinding(net.sf.taverna.t2.provenance.lineageservice.utils.VarBinding)
	 */
	public void addVarBinding(VarBinding vb) throws SQLException {
		// TODO Auto-generated method stub
		logger.info("addVarBinding called");

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addVariables(java.util.List, java.lang.String)
	 */
	public void addVariables(List<Var> vars, String wfId) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addWFId(java.lang.String)
	 */
	public void addWFId(String wfId) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addWFId(java.lang.String, java.lang.String)
	 */
	public void addWFId(String wfId, String parentWFname) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#addWFInstanceId(java.lang.String, java.lang.String)
	 */
	public void addWFInstanceId(String wfId, String wfInstanceId)
			throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#clearDBDynamic()
	 */
	public Set<String> clearDBDynamic() throws SQLException {
		return null;
	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#clearDBStatic()
	 */
	public void clearDBStatic() throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#clearDBStatic(java.lang.String)
	 */
	public void clearDBStatic(String wfID) throws SQLException {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.sf.taverna.t2.provenance.lineageservice.ProvenanceWriter#openConnection()
	 */
	public void openConnection() throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeCurrentModel() {
		// TODO Auto-generated method stub
		
	}

}

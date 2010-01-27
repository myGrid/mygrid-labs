package net.sf.taverna.t2.provenance.consumer;


import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import net.sf.taverna.raven.appconfig.ApplicationRuntime;
import net.sf.taverna.raven.plugins.PluginManager;
import net.sf.taverna.t2.invocation.InvocationContext;
import net.sf.taverna.t2.provenance.api.ProvenanceAccess;
import net.sf.taverna.t2.provenance.api.ProvenanceConnectorType;
import net.sf.taverna.t2.provenance.api.ProvenanceQueryParser;
import net.sf.taverna.t2.provenance.api.Query;
import net.sf.taverna.t2.provenance.api.QueryAnswer;

/**
 * 
 */

/**
 * @author paolo
 *
 */
public class WorkflowAnalyser {

	static {
		PluginManager.setRepository(ApplicationRuntime.getInstance()
				.getRavenRepository());
		PluginManager.getInstance();
	}

	ProvenanceAccess pAccess = null;

	//////
	//  MYSQL connections
	//////
	String DB_URL_LOCAL = PropertiesReader.getString("dbhost");  // URL of database server //$NON-NLS-1$
	String DB_USER = PropertiesReader.getString("dbuser");                        // database user id //$NON-NLS-1$
	String DB_PASSWD = PropertiesReader.getString("dbpassword"); //$NON-NLS-1$
	String MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	String MYSQL_CONNECT_STRING = "jdbc:mysql://"+DB_URL_LOCAL+"/T2Provenance"+"?user="+DB_USER+"&password="+DB_PASSWD;

	List<String> wfNames = null;
	Set<String> selectedProcessors = null;

	private boolean derefValues = false;
	InvocationContext ic = null;

	private static Logger logger = Logger.getLogger(WorkflowAnalyser.class);

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		WorkflowAnalyser analyser = new WorkflowAnalyser();

		analyser.setUp(ProvenanceConnectorType.MYSQL);  // default is MySQL. 
		
		QueryAnswer answer = analyser.queryProvenance();

	}


	/**
	 * default connector is mysql
	 * @throws Exception
	 */
	protected void setUp() throws Exception { setUp(ProvenanceConnectorType.MYSQL); }

	protected void setUp(String targetDB) throws Exception {

		logger.info("creating DB connection of type "+targetDB);

		ProvenanceAccess.initDataSource(MYSQL_DRIVER_CLASS,MYSQL_CONNECT_STRING); 			

		System.setProperty("raven.eclipse","true");
		pAccess = new ProvenanceAccess(targetDB);  // creates and initializes the provenance API
		configureInterface();              // sets user-defined preferences

		if (derefValues) ic = pAccess.getInvocationContext();
	}


	/**
	 * set user-defined values for toggles on the API
	 */
	protected void configureInterface() {

		// do we need to return output processor values in addition to inputs?
		String returnOutputsPref = PropertiesReader.getString("query.returnOutputs");
		if (returnOutputsPref != null) {
			pAccess.toggleIncludeProcessorOutputs(Boolean.parseBoolean(returnOutputsPref));	
		}

		// do we need to record actual values as part of the OPM graph?
		String recordArtifacValuesPref = PropertiesReader.getString("OPM.recordArtifactValues");
		if (recordArtifacValuesPref != null) {			
			pAccess.toggleAttachOPMArtifactValues(Boolean.parseBoolean(recordArtifacValuesPref));
			logger.info("OPM.recordArtifactValues: "+ pAccess.isAttachOPMArtifactValues());
		}


		String computeOPMGraph = PropertiesReader.getString("OPM.computeGraph");
		if (computeOPMGraph != null) {
			pAccess.toggleOPMGeneration(Boolean.parseBoolean(computeOPMGraph));
			logger.info("OPM.computeGraph: "+pAccess.isOPMGenerationActive());			
		}

		// are we recording the actual (de-referenced) values at all?!
		// NOTE this is a client feature: the API only returns references. They are deref'd locally
		String derefValuesString = PropertiesReader.getString("query.returnDataValues");
		if (derefValuesString != null) {
			logger.info("query.returnDataValues: "+derefValuesString);
			derefValues = Boolean.parseBoolean(derefValuesString);
		}

	}


	/**
	 * parses an XML provenance query into a Query object and invokes {@link ProvenanceAccess.executeQuery()} 
	 * @return a bean representing the query answer
	 * @see QueryAnswer
	 */
	protected  QueryAnswer queryProvenance() {

		Query q = new Query();

		// get filename for XML query spec
		String querySpecFile = PropertiesReader.getString("query.file");
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



}

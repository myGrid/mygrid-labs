/**
 * 
 */
package net.sf.taverna.t2.provenance.api.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
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
import net.sf.taverna.t2.provenance.lineageservice.utils.QueryVar;
import net.sf.taverna.t2.reference.T2Reference;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;

/**
 * @author Paolo Missier<p/>
 * Example provenance API client.
 */
public class ProvenanceAPISampleClient extends ProvenanceBaseClient {

	private static final String DEFAULT_OPM_FILENAME = "src/test/resources/OPMGraph.rdf";

	static String OPMGraphFilename = null;

	List<String> wfNames = null;
	Set<String> selectedProcessors = null;

	private static Logger logger = Logger.getLogger(ProvenanceAPISampleClient.class);

	/**
	 * Creates an instance of the client, uses it to submit a pre-defined query, and displays the results on a console 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		ProvenanceAPISampleClient client = new ProvenanceAPISampleClient();

		client.setUp();
		OPMGraphFilename = setOPMFilename();
		QueryAnswer answer = client.queryProvenance();

		client.reportAnswer(answer);
		client.saveOPMGraph(answer, OPMGraphFilename);
	}



	/**
	 * parses an XML provenance query into a Query object and invokes {@link ProvenanceAccess.executeQuery()} 
	 * @return a bean representing the query answer
	 * @throws QueryValidationException 
	 * @throws QueryParseException 
	 * @see QueryAnswer
	 */
	protected  QueryAnswer queryProvenance() throws QueryParseException, QueryValidationException {

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

	
	
	/////////
	/// preliminary setup methods
	/////////
	
	// user-selected file name for OPM graph?
	protected static String setOPMFilename() {
		
		String OPMGraphFilename = PropertiesReader.getString("OPM.rdf.file");
		if (OPMGraphFilename == null) {
			OPMGraphFilename = DEFAULT_OPM_FILENAME;
			logger.info("OPM.filename: "+OPMGraphFilename);			
		}
		return OPMGraphFilename;
	}
	


	/**
	 * writes the RDF/XML OPM string to file
	 * @param opmFilename
	 */
	private void saveOPMGraph(QueryAnswer answer, String opmFilename) {

		if (answer.getOPMAnswer_AsRDF() == null) {
			logger.info("save OPM graph: OPM graph was NOT generated.");
			return;
		}

		try {
			FileWriter fw= new FileWriter(new File(opmFilename));
			fw.write(answer.getOPMAnswer_AsRDF());
			fw.close();
		} catch (IOException e) {
			logger.warn("saveOPMGraph: error saving graph to file "+opmFilename);
			logger.warn(e.getMessage());
		}
		logger.info("OPM graph saved to "+opmFilename);
	}



	private void reportAnswer(QueryAnswer answer) {

		NativeAnswer nAnswer = answer.getNativeAnswer();

		// nAnswer contains a Map of the form 
		// 	Map<QueryVar, Map<String, List<Dependencies>>>  answer;

		Map<QueryVar, Map<String, List<Dependencies>>>  dependenciesByVar = nAnswer.getAnswer();	
		for (QueryVar v:dependenciesByVar.keySet()) {
			logger.info("dependencies for port: "+v.getPname()+":"+v.getVname()+":"+v.getPath());

			Map<String, List<Dependencies>> deps = dependenciesByVar.get(v);
			for (String path:deps.keySet()) {
				logger.info("dependencies on path "+path);
				for (Dependencies dep:deps.get(path)) {

					for (LineageQueryResultRecord record: dep.getRecords()) {
						
						// we now resolve values on the client, there are no values in the record
						// returned through the API
						record.setPrintResolvedValue(false);  
						logger.info(record.toString());
						
						// resolve reference if so desired
						if (derefValues) {
							T2Reference ref = ic.getReferenceService().referenceFromString(record.getValue());
							Object o = ic.getReferenceService().resolveIdentifier(ref, null, ic);
							
							logger.info("deref value for ref: "+ref+" "+o);
						}
					}
				}
			}
		}		
	}


}

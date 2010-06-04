/**
 * 
 */
package net.sf.taverna.t2.provenance.api.client;

import java.sql.Connection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;

import net.sf.taverna.t2.invocation.InvocationContext;
import net.sf.taverna.t2.provenance.api.ProvenanceAccess;
import net.sf.taverna.t2.provenance.api.ProvenanceConnectorType;
import net.sf.taverna.t2.provenance.lineageservice.Dependencies;
import net.sf.taverna.t2.provenance.lineageservice.LineageQueryResultRecord;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;

/**
 * @author paolo
 *
 */
public class FinalValueRetrievalExample {

	static ProvenanceAccess pAccess = null;

	String DB_URL_LOCAL = PropertiesReader.getString("dbhost");  // URL of database server //$NON-NLS-1$
	String DB_USER = PropertiesReader.getString("dbuser");                        // database user id //$NON-NLS-1$
	String DB_PASSWD = PropertiesReader.getString("dbpassword"); //$NON-NLS-1$

	List<String> wfNames = null;
	Set<String> selectedProcessors = null;

	private static Logger logger = Logger.getLogger(FinalValueRetrievalExample.class);


	/**
	 * @param args
	 */
	public static void main(String[] args)  throws Exception {

		FinalValueRetrievalExample client = new FinalValueRetrievalExample();
		client.setUp();
		
		String wfInstance = "24bb6ee4-4c78-4176-a875-8341884b6ba4";
		String workflowId = "3af9e9f2-bf04-436f-b50e-721ca1d96e11";
		String pname      = "Beanshell";
		String port       = "out";
		String iteration  = null;
		
		Dependencies deps = pAccess.fetchPortData(wfInstance, workflowId,pname, port, iteration); 
		
		for ( LineageQueryResultRecord r:deps.getRecords()) {			
			logger.info(r.getValue()+"  in list: "+pAccess.getContainingCollection(r));
		}
			
			// getContainingCollection
		logger.info(deps.toString());
		
	}


	protected void setUp() throws Exception {
		setDataSource();
		System.setProperty("raven.eclipse","true");
		pAccess = new ProvenanceAccess(ProvenanceConnectorType.MYSQL);  // creates and initializes the provenance API
	}

	protected  void setDataSource() {

		System.setProperty(Context.INITIAL_CONTEXT_FACTORY,"org.osjava.sj.memory.MemoryContextFactory");
		System.setProperty("org.osjava.sj.jndi.shared", "true");

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setDefaultTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		ds.setMaxActive(50);
		ds.setMinIdle(10);
		ds.setMaxIdle(50);
		ds.setDefaultAutoCommit(true);
		ds.setUsername(DB_USER);
		ds.setPassword(DB_PASSWD);

		try {
			ds.setUrl("jdbc:mysql://"+DB_URL_LOCAL+"/T2Provenance");

			InitialContext context = new InitialContext();
			context.rebind("jdbc/taverna", ds);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

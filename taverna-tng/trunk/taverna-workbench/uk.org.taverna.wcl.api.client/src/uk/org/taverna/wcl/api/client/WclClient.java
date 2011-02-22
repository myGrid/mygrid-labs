package uk.org.taverna.wcl.api.client;

import java.io.IOException;
import java.net.URL;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

/**
 * Singleton class to handle stateless and non-instance specific interactions with any
 * Workflow Component Library.
 * 
 * @see WclInstanceClient
 * 
 * @author Jits
 *
 */
public class WclClient {
	
	/*
	 * ==================
	 * Singleton handling
	 */

	// Private constructor prevents instantiation from other classes
	private WclClient() {

	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * WclClient.getInstance() or the first access to
	 * SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		public static final WclClient INSTANCE = new WclClient();
	}

	public static WclClient getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/*
	 * ==================
	 */
	
	HttpClient httpClient = new HttpClient();
	
	public String getResource(URL url, String userAgent) {
		String output = null;
		
		GetMethod method = new GetMethod(url.toString());

		method.setRequestHeader(new Header("User-Agent", userAgent));

		method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
				new DefaultHttpMethodRetryHandler(3, false));

		try {
			int statusCode = httpClient.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				// TODO: change to use proper logging mechanism.
				System.err.println("Method failed: " + method.getStatusLine());
			}

			output = method.getResponseBodyAsString();

		} catch (HttpException e) {
			// TODO: change to use proper logging mechanism.
			System.err.println("Fatal protocol violation: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: change to use proper logging mechanism.
			System.err.println("Fatal transport error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// Release the connection.
			method.releaseConnection();
		}
		
		return output;
	}
}

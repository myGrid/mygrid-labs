package uk.org.taverna.wcl.api.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import lombok.Getter;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class WclClient {
	public static final String COMPONENTS_PATH = "/components";

	HttpClient client = new HttpClient();

	@Getter
	private URL apiBaseUrl;

	@Getter
	private String userAgent;

	public WclClient(URL apiBaseUrl, String userAgent) {
		this.apiBaseUrl = apiBaseUrl;
		this.userAgent = userAgent;
	}

	public String getComponentsJson() {
		URL url;
		try {
			url = new URL(apiBaseUrl, COMPONENTS_PATH);
			return doGet(url);
		} catch (MalformedURLException e) {
			// TODO: change to use proper logging mechanism.
			// Dependent on JIRA task:
			// http://www.mygrid.org.uk/dev/issues/browse/TNG-105
			e.printStackTrace();
			return null;
		}
	}

	protected String doGet(URL url) {
		String output = null;
		
		GetMethod method = new GetMethod(url.toString());

		method.setRequestHeader(new Header("User-Agent", userAgent));

		method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
				new DefaultHttpMethodRetryHandler(3, false));

		try {
			int statusCode = client.executeMethod(method);

			if (statusCode != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + method.getStatusLine());
			}

			// Read the response body.
			byte[] responseBody = method.getResponseBody();

			output = new String(responseBody, "UTF-8");

		} catch (HttpException e) {
			// TODO: change to use proper logging mechanism.
			// Dependent on JIRA task:
			// http://www.mygrid.org.uk/dev/issues/browse/TNG-105
			System.err.println("Fatal protocol violation: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: change to use proper logging mechanism.
			// Dependent on JIRA task:
			// http://www.mygrid.org.uk/dev/issues/browse/TNG-105
			System.err.println("Fatal transport error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// Release the connection.
			method.releaseConnection();
		}
		
		return output;
	}
}

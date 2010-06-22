package net.sf.taverna.t2.provenance.api.client;


import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PropertiesReader {
	private static String BUNDLE_NAME = "net.sf.taverna.t2.provenance.api.client.resources.APIClient"; //$NON-NLS-1$

	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	public static void setBundleName(String bundleName) { 
		BUNDLE_NAME = bundleName;
		RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
		}
	
	
	private PropertiesReader() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}

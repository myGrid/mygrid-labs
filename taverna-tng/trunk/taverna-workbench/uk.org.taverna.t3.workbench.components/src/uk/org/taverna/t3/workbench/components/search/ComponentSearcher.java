package uk.org.taverna.t3.workbench.components.search;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;

public class ComponentSearcher {

	/*
	 * ================== 
	 * Singleton handling
	 */

	// Private constructor prevents instantiation from other classes
	private ComponentSearcher() {
		init();
	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * ComponentSearcher.getInstance() or the first access to
	 * SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		public static final ComponentSearcher INSTANCE = new ComponentSearcher();
	}

	public static ComponentSearcher getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/*
	 * ==================
	 */

	private List<IComponentSearchProvider> providers;

	private void init() {
		providers = new ArrayList<IComponentSearchProvider>();
	}

	public List<ComponentSearchResults> search(
			String query) {
		List<ComponentSearchResults> results = new ArrayList<ComponentSearchResults>();
		
		System.out.println("[ComponentSearcher] Searching for: " + query);
		
		for (IComponentSearchProvider provider : providers) {
			System.out.println("[ComponentSearcher] ... using search provider: " + provider.getName());
			results.add(provider.search(query));
		}

		return results;
	}
	
	public synchronized void addProvider(IComponentSearchProvider provider) {
		Preconditions.checkNotNull(provider);
		providers.add(provider);
		System.out.println("Added component search provider: " + provider.getName());
	}
	
	public synchronized void removeProvider(IComponentSearchProvider provider) {
		Preconditions.checkNotNull(provider);
		providers.remove(provider);
		System.out.println("Removed component search provider: " + provider.getName());
	}
}

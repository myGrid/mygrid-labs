package net.sf.taverna.biocatalogue.model.search;

import java.io.Serializable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import javax.swing.ImageIcon;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.ServiceFilteringSettings;
import net.sf.taverna.biocatalogue.model.Tag;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.ui.PartialSearchResultsRenderer;


/**
 * Class to hold settings for search instance. Objects of this type will
 * be used to re-run a search instance at a later time.
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchInstance implements Comparable<SearchInstance>, Serializable
{
  private static final long serialVersionUID = -5236966374301885370L;
  
  // CONSTANTS
  public static final int QUERY_SEARCH = 1;
  public static final int TAG_SEARCH = 2;
  public static final int SERVICE_FILTERING = 3;
  
  public static final int NO_FILTERING_IN_THIS_SEARCH_INSTANCE = -1;
  
  // SEARCH SETTINGS - for either search by query or search by tag
  private final int iSearchType;
  private final int iServiceFilteringBasedOn; // SERVICE_FILTERING may be based on QUERY_SEARCH or TAG_SEARCH
  
  private final String searchString;
  private final Tag searchTag;
  
  private final boolean searchSOAPOperations;
  private final boolean searchRESTMethods;
  private final boolean searchServices;
  private final boolean searchServiceProviders;
  private final boolean searchUsers;
  
  // SERVICE FILTERING settings
  private ServiceFilteringSettings filteringSettings;
  
  // SEARCH RESULTS
  private SearchResults searchResults;
  
  
  /**
   * Constructing a query search instance.
   *  
   * @param searchString
   * @param searchSOAPOperations
   * @param searchRESTMethods
   * @param searchServices
   * @param searchServiceProviders
   * @param searchUsers
   */
  public SearchInstance(String searchString, boolean searchSOAPOperations, boolean searchRESTMethods,
                                             boolean searchServices, boolean searchServiceProviders,
                                             boolean searchUsers)
  {
    this.iSearchType = QUERY_SEARCH;
    this.iServiceFilteringBasedOn = NO_FILTERING_IN_THIS_SEARCH_INSTANCE;
    
    this.searchString = searchString;
    this.searchTag = null;
    
    this.searchSOAPOperations = searchSOAPOperations;
    this.searchRESTMethods = searchRESTMethods;
    this.searchServices = searchServices;
    this.searchServiceProviders = searchServiceProviders;
    this.searchUsers = searchUsers;
  }
  
  /**
   * Constructing tag search instance.
   * 
   * @param searchTag
   */
  public SearchInstance(Tag searchTag)
  {
    this.iSearchType = TAG_SEARCH;
    this.iServiceFilteringBasedOn = NO_FILTERING_IN_THIS_SEARCH_INSTANCE;
    
    this.searchTag = searchTag;
    this.searchString = null;
    
    this.searchSOAPOperations = true;
    this.searchRESTMethods = true;
    this.searchServices = true;
    this.searchServiceProviders = false;
    this.searchUsers = false;
  }
  
  
  /**
   * Constructing service filtering search instance.
   * 
   * @param si SearchInstance to base the current on.
   *           Can be either TAG_SEARCH or QUERY_SEARCH type of SearchInstance.
   * @param filteringSettings Filtering settings associated with this search instance.
   */
  public SearchInstance(SearchInstance si, ServiceFilteringSettings filteringSettings) throws IllegalArgumentException
  {
    if (!si.isTagSearch() && !si.isQuerySearch()) {
      throw new IllegalArgumentException("Cannot create SERVICE_FILTERING search instance - " +
                                         "supplied instance must be either QUERY_SEARCH or TAG_SEARCH");
    }
    
    this.iSearchType = SERVICE_FILTERING;
    this.filteringSettings = filteringSettings;
    
    // this search instance inherits search term from the supplied search instance
    this.iServiceFilteringBasedOn = si.iSearchType;
    this.searchString = si.isQuerySearch() ? si.searchString : null;
    this.searchTag = si.isTagSearch() ? si.searchTag : null;
    
    // we will only be looking for services
    this.searchSOAPOperations = true;
    this.searchRESTMethods = true;
    this.searchServices = true;
    this.searchServiceProviders = false;
    this.searchUsers = false;
  }
  
  
  /**
   * Determines whether the two search instances are identical.
   */
  // TODO - fix the equals() method
  public boolean equals(Object other)
  {
    if (other instanceof SearchInstance)
    {
      SearchInstance s = (SearchInstance)other;
      
      boolean bSearchTypesMatch = (this.iSearchType == s.iSearchType);
      if (bSearchTypesMatch) {
        switch (this.iSearchType) {
          case QUERY_SEARCH: bSearchTypesMatch = this.searchString.equals(s.getSearchString()); break;
          case TAG_SEARCH:   bSearchTypesMatch = this.searchTag.equals(s.getSearchTag()); break;
          case SERVICE_FILTERING:
                             bSearchTypesMatch = this.iServiceFilteringBasedOn == s.iServiceFilteringBasedOn;
                             if (bSearchTypesMatch) {
                               if (this.iServiceFilteringBasedOn == QUERY_SEARCH) {
                                 bSearchTypesMatch = this.searchString.equals(s.getSearchString());
                               }
                               else {
                                 bSearchTypesMatch = this.searchTag.equals(s.getSearchTag());
                               }
                             }
                             if (bSearchTypesMatch) {
                               if (this.filteringSettings != null) {
                                 bSearchTypesMatch = this.filteringSettings.equals(s.filteringSettings);
                               }
                               else if (s.filteringSettings != null) {
                                 // other isn't null, this one is - so 'false'
                                 bSearchTypesMatch = false;
                               }
                               else {
                                 // both could be null
                                 bSearchTypesMatch = (this.filteringSettings == s.filteringSettings);
                               }
                             }
                             break;
          default: bSearchTypesMatch = false;
        }
      }
      
      return (bSearchTypesMatch &&
          /* TODO re-enable this when limits are implemented -- this.iResultCountLimit == s.getResultCountLimit() && */
          this.searchSOAPOperations == s.getSearchSOAPOperations() && this.searchRESTMethods == s.getSearchRESTMethods() &&
          this.searchServices == s.getSearchServices() && this.searchServiceProviders == s.getSearchServiceProviders() &&
          this.searchUsers == s.getSearchUsers());
    }
    else
      return (false);
  }
  
  
  public int compareTo(SearchInstance other)
  {
    if (this.equals(other)) return(0);
    else
    {
      // this will return results in the descending order - which is
      // fine, because the way this collection will be rendered will
      // eventually traverse it from the rear end first; so results
      // will be shown alphabetically
      return (-1 * this.toString().compareTo(other.toString()));
    }
  }
  
  
  public String toString()
  {
    String out = "<html>";
    
    if (this.isQuerySearch() || this.isTagSearch()) {
      out += (this.isTagSearch() ? "Tag s" : "S") + "earch: '" + getSearchTerm() + "' [" + this.detailsAsString() + "]";
    }
    else if (this.isServiceFilteringSearch()) {
      out += "Filter:<br>" +
             (getSearchTerm().length() > 0 ? ("- based on " + (this.isQuerySearch() ? "term" : "tag") + " '" + getSearchTerm() + "'<br>") : "") +
             "- scope: " + detailsAsString() + "<br>" +
             "- " + this.filteringSettings.detailsAsString();
    }
    
    out += "</html>";
    
    return (out);
  }
  
  
  /**
   * @return A string representation of search settings held in this object;
   *         actual search value (string/tag) are ignored - this only affects
   *         types to search and the number of objects to fetch.
   */
  public String detailsAsString()
  {
    String str = "";
    
    // output types that were searched for
    int iCnt = 0;
    if (this.searchSOAPOperations) { str += "SOAP operations, "; iCnt++; }
    if (this.searchRESTMethods) { str += "REST methods, "; iCnt++; }
    if (this.searchServices) { str += "services, "; iCnt++; }
    if (this.searchServiceProviders) { str += "service providers, "; iCnt++; }
    if (this.searchUsers) { str += "users, "; iCnt++; }
    
    // if that's all types, have just the word 'all'
    if (iCnt == 5) str = "all";
    else str = str.substring(0, str.length() - 2); // remove trailing ", "
    
    // add the rest to the string representation of the search instance
    str = str /* TODO re-enable when limits are implemented -- "; limit: " + this.iResultCountLimit +*/;
    
    return (str);
  }
  
  
  /**
   * This method is to be used when the type of search is not checked - in
   * case of query search the method returns the search string, otherwise
   * the tag that is to be searched.
   * @return
   */
  public String getSearchTerm()
  {
    return (this.iSearchType == QUERY_SEARCH || this.iServiceFilteringBasedOn == QUERY_SEARCH ?
            this.searchString :
            this.searchTag.getTagDisplayName());
  }
  
  
  /**
   * @return An icon that is most suitable to display this search instance in a UI component.
   */
  public ImageIcon getIcon()
  {
    switch (this.iSearchType) {
      case QUERY_SEARCH: return (ResourceManager.getImageIcon(ResourceManager.SEARCH_ICON));
      case TAG_SEARCH: return (ResourceManager.getImageIcon(ResourceManager.TAG_ICON));
      case SERVICE_FILTERING: return (ResourceManager.getImageIcon(ResourceManager.FILTER_ICON));
      default: return null;
    }
  }
  
  
  /**
   * @return True if this search settings instance describes a search by tag.
   */
  public boolean isTagSearch() {
    return (this.iSearchType == TAG_SEARCH);
  }
  
  
  /**
   * @return True if this search settings instance describes a search by query.
   */
  public boolean isQuerySearch() {
    return (this.iSearchType == QUERY_SEARCH);
  }
  
  
  /**
   * @return True if this search settings instance describes service filtering operation.
   */
  public boolean isServiceFilteringSearch() {
    return (this.iSearchType == SERVICE_FILTERING);
  }
  
  
  /**
   * @return True if search results are available;
   *         False if no search results are available - probably search hasn't been carried out yet.
   */
  public boolean hasSearchResults() {
    return (searchResults != null);
  }
  
  
  /**
   * @return True if this is a new search; false otherwise.
   *         (Search is currently treated as new if there are no search results available yet.)
   */
  public boolean isNewSearch() {
    return (!hasSearchResults());
  }
  
  
  /**
   * Removes any previous search results; after execution of
   * this method this search instance is treated as "new search".
   */
  public void clearSearchResults() {
    this.searchResults = null;
  }
  
  
  // *** The following methods are similar to those in SearchEngine interface ***
  //
  // They are used to relay external calls to these methods to the underlying instance
  // of SearchEngine which will perform the actual search operations for this search instance.
  
  /**
   * This method determines whether a new search should be performed or an associated SearchEngine
   * must be told to fetch more / all results for this search instance.
   * 
   * All results will only be fetched if this isn't a new search.
   */
  public void executeSearch(Vector<Long> currentParentSearchThreadIDContainer,
                            Long parentSearchThreadID, CountDownLatch doneSignal, boolean doFetchAllResults,
                            PartialSearchResultsRenderer renderer)
  {
    if (this.isNewSearch()) {
      startNewSearch(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
    }
    else if (!doFetchAllResults) {
      fetchMoreResults(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
    }
    else {
      fetchAllResults(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
    }
  }
  
  
  public void startNewSearch(Vector<Long> currentParentSearchThreadIDContainer,
                            Long parentSearchThreadID, CountDownLatch doneSignal, PartialSearchResultsRenderer renderer)
  {
    instantiateSearchEngine(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer).startNewSearch();
  }
  
  
  public void fetchMoreResults(Vector<Long> currentParentSearchThreadIDContainer,
      Long parentSearchThreadID, CountDownLatch doneSignal, PartialSearchResultsRenderer renderer)
  {
    instantiateSearchEngine(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer).fetchMoreResults();
  }
  
  
  public void fetchAllResults(Vector<Long> currentParentSearchThreadIDContainer,
                              Long parentSearchThreadID, CountDownLatch doneSignal, PartialSearchResultsRenderer renderer)
  {
    instantiateSearchEngine(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer).fetchAllResults();
  }
  
  
  /**
   * This method simply instantiates a search engine for the current search operation.
   * 
   * @param currentParentSearchThreadIDContainer Vector, where 0th element contains Long ID of the current search thread.
   * @param parentSearchThreadID ID of the search thread that has requested this search operation to be performed.
   * @param doneSignal Means of notifying the parentSeachThread of completing the requested search operation.
   *                   The parent thread will block until doneSignal is activated.
   * @return Instance of the SearchEngine that is to be used for the current search operation.
   */
  private SearchEngine instantiateSearchEngine(Vector<Long> currentParentSearchThreadIDContainer,
                                               Long parentSearchThreadID, CountDownLatch doneSignal, PartialSearchResultsRenderer renderer)
  {
    switch (this.iSearchType) {
      case QUERY_SEARCH: return new QuerySearchEngine(this, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
      case TAG_SEARCH: return new TagSearchEngine(this, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
      case SERVICE_FILTERING: return new ServiceFilteringSearchEngine(this, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
      default: return (null);
    }
  }
  
  
  /**
   * Used in the plugin, for example, to transfer search results from Search tab to
   * Filtering tab. This way both tabs will remain completely independent.
   * 
   * @return Deep copy of this SearchInstance object. If deep copying doesn't succeed,
   *         <code>null</code> is returned.
   */
  public SearchInstance deepCopy()
  {
    return (SearchInstance)Util.deepCopy(this);
  }
  
  
  // *** Getters for all fields ***
  
  /**
   * @return Type of the current SearchSettings object. Value is of one of: {QUERY_SEARCH, TAG_SEARCH}. 
   */
  public int getSearchType() {
    return iSearchType;
  }
  
  
  /**
   * @return Value of <code>QUERY_SEARCH</code> or <code>TAG_SEARCH</code> in successful case,
   *         <code>NO_FILTERING_IN_THIS_SEARCH_INSTANCE</code> otherwise. 
   */
  public int getServiceFilteringBasedOn() {
    return iServiceFilteringBasedOn;
  }
  
  
  /**
   * @return Search string; only valid when SearchSettings object holds data about a search by query, not a tag search.
   */
  public String getSearchString() {
    return searchString;
  }
  
  public Tag getSearchTag() {
    return searchTag;
  }
  
  public boolean getSearchSOAPOperations() {
    return searchSOAPOperations;
  }
  
  public boolean getSearchRESTMethods() {
    return searchRESTMethods;
  }
  
  public boolean getSearchServices() {
    return searchServices;
  }
  
  public boolean getSearchServiceProviders() {
    return searchServiceProviders;
  }
  
  public boolean getSearchUsers() {
    return searchUsers;
  }
  
  
  public void setFilteringParameters(ServiceFilteringSettings filteringSettings) {
    this.filteringSettings = filteringSettings;
  }
  
  public ServiceFilteringSettings getFilteringSettings() {
    return filteringSettings;
  }
  
  public void setSearchResults(SearchResults searchResults) {
    this.searchResults = searchResults;
  }
  
  public SearchResults getSearchResults() {
    return searchResults;
  }

  
}

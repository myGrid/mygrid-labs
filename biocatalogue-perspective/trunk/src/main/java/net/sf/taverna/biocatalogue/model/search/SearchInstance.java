package net.sf.taverna.biocatalogue.model.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.ServiceFilteringSettings;
import net.sf.taverna.biocatalogue.model.Tag;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.ui.search_results.SearchResultsRenderer;


/**
 * Class to hold settings for search instance. Objects of this type will
 * be used to re-run a search instance at a later time -- or to apply
 * filtering onto a previously executed search.
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchInstance implements Comparable<SearchInstance>, Serializable
{
  private static final long serialVersionUID = -5236966374301885370L;
  
  // CONSTANTS
  public static enum TYPE
  {
    QuerySearch(ResourceManager.getImageIcon(ResourceManager.SEARCH_ICON)),
    TagSearch(ResourceManager.getImageIcon(ResourceManager.TAG_ICON)),
    ServiceFiltering(ResourceManager.getImageIcon(ResourceManager.FILTER_ICON));
    
    private Icon icon;
    
    TYPE(Icon icon) {
      this.icon = icon;
    }
    
    /**
     * @return An icon that is most suitable to display search instance of this type in a UI component.
     */
    public Icon getIcon() {
      return this.icon;
    }
  }
  
  
  
  // SEARCH SETTINGS - for either search by query or search by tag
  private final TYPE searchType;
  private final TYPE serviceFilteringBasedOn; // service filtering may be based on {@link TYPE.QuerySearch} or {@link TYPE.TagSearch}
  private final Resource.TYPE resourceTypeToSearchFor;
  
  private final String searchString;
  private final List<Tag> searchTags;
  
  
  // SERVICE FILTERING settings
  private ServiceFilteringSettings filteringSettings;
  
  // SEARCH RESULTS
  private SearchResults searchResults;
  
  
  
  /**
   * Constructs a query search instance for finding instance of a specific resource type.
   * 
   * @param searchString
   * @param resourceTypeToSearchFor
   */
  public SearchInstance(String searchString, Resource.TYPE resourceTypeToSearchFor)
  {
    this.searchType = TYPE.QuerySearch;
    this.serviceFilteringBasedOn = null;
    
    this.resourceTypeToSearchFor = resourceTypeToSearchFor; 
    
    this.searchString = searchString;
    this.searchTags = null;
  }
  
  
  
  /**
   * Constructing a search instance for finding instance of a specific resource type by a single tag.
   * 
   * @param searchTag
   * @param resourceTypeToSearchFor
   */
  public SearchInstance(Tag searchTag, Resource.TYPE resourceTypeToSearchFor)
  {
    this.searchType = TYPE.TagSearch;
    this.serviceFilteringBasedOn = null;
    
    this.resourceTypeToSearchFor = resourceTypeToSearchFor;
    
    this.searchTags = Collections.singletonList(searchTag);
    this.searchString = null;
  }
  
  
  /**
   * Constructing a search instance for finding instance of a specific resource type by a list of tags.
   * 
   * @param searchTags
   * @param resourceTypeToSearchFor
   */
  public SearchInstance(List<Tag> searchTags, Resource.TYPE resourceTypeToSearchFor)
  {
    this.searchType = TYPE.TagSearch;
    this.serviceFilteringBasedOn = null;
    
    this.resourceTypeToSearchFor = resourceTypeToSearchFor;
    
    this.searchTags = searchTags;
    this.searchString = null;
  }
  
  
  
  /**
   * Constructing service filtering search instance.
   * 
   * @param si SearchInstance to base the current on.
   *           Can be either {@link TYPE#TagSearch} or {@link TYPE#QuerySearch} type of SearchInstance.
   * @param filteringSettings Filtering settings associated with this search instance.
   */
  public SearchInstance(SearchInstance si, ServiceFilteringSettings filteringSettings) throws IllegalArgumentException
  {
    if (!si.isTagSearch() && !si.isQuerySearch()) {
      throw new IllegalArgumentException("Cannot create Service Filtering search instance - " +
                                         "supplied base search instance must be either QuerySearch or TagSearch");
    }
    
    this.searchType = TYPE.ServiceFiltering;
    this.serviceFilteringBasedOn = si.searchType;
    
    this.resourceTypeToSearchFor = si.resourceTypeToSearchFor;
    
    // this search instance inherits search term (i.e. search query or the tag) from the supplied search instance
    this.searchString = si.isQuerySearch() ? si.searchString : null;
    this.searchTags = si.isTagSearch() ? si.searchTags : null;
    
    // also, store the filtering settings that are to be applied to the newly
    // created search instance
    this.filteringSettings = filteringSettings;
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
      
      boolean bSearchTypesMatch = (this.searchType == s.getSearchType());
      if (bSearchTypesMatch) {
        switch (this.searchType) {
          case QuerySearch:  bSearchTypesMatch = this.searchString.equals(s.getSearchString()); break;
          case TagSearch:    bSearchTypesMatch = this.searchTags.equals(s.getSearchTags()); break;
          case ServiceFiltering:
                             bSearchTypesMatch = this.serviceFilteringBasedOn == s.getServiceFilteringBasedOn();
                             if (bSearchTypesMatch) {
                               if (this.serviceFilteringBasedOn == TYPE.QuerySearch) {
                                 bSearchTypesMatch = this.searchString.equals(s.getSearchString());
                               }
                               else {
                                 bSearchTypesMatch = this.searchTags.equals(s.getSearchTags());
                               }
                             }
                             if (bSearchTypesMatch) {
                               if (this.filteringSettings != null) {
                                 bSearchTypesMatch = this.filteringSettings.equals(s.getFilteringSettings());
                               }
                               else if (s.filteringSettings != null) {
                                 // other isn't null, this one is - so 'false'
                                 bSearchTypesMatch = false;
                               }
                               else {
                                 // both could be null
                                 bSearchTypesMatch = (this.filteringSettings == s.getFilteringSettings());
                               }
                             }
                             break;
          default: bSearchTypesMatch = false;
        }
      }
      
      return (bSearchTypesMatch &&
              /* TODO re-enable this when limits are implemented -- this.iResultCountLimit == s.getResultCountLimit() && */
              this.resourceTypeToSearchFor == s.getResourceTypeToSearchFor());
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
    // include the name of the resource type collection that is to be / was searched for
    String str = this.getResourceTypeToSearchFor().getCollectionName();
    
    // add the rest to the string representation of the search instance
    str = str /* TODO re-enable when limits are implemented -- "; limit: " + this.iResultCountLimit +*/;
    
    return (str);
  }
  
  
  
  // ***** Getters for all fields *****
  
  /**
   * @return Type of this search instance.
   */
  public TYPE getSearchType() {
    return (this.searchType);
  }
  
  
  /**
   * @return True if this search settings instance describes a search by tag.
   */
  public boolean isTagSearch() {
    return (this.searchType == TYPE.TagSearch);
  }
  
  
  /**
   * @return True if this search settings instance describes a search by query.
   */
  public boolean isQuerySearch() {
    return (this.searchType == TYPE.QuerySearch);
  }
  
  
  /**
   * @return True if this search settings instance describes service filtering operation.
   */
  public boolean isServiceFilteringSearch() {
    return (this.searchType == TYPE.ServiceFiltering);
  }
  
  
  /**
   * Allows to test which type of search this filtering operation is based on -- any filtering
   * operation can be:
   * <li>derived from an initial search by tag(s) or by free-text query</li>
   * <li>or can be just a standalone filtering operation, where filtering criteria are
   *     applied to all resources of the specified type, without prior search.</li> 
   * 
   * @return Value {@link TYPE#QuerySearch} or {@link TYPE#TagSearch} if this filtering operation has a known "parent",<br/>
   *         <code>null</code> if this is a proper search (not a filtering!) operation, or
   *         if this filtering operation was not based on any search. 
   */
  public TYPE getServiceFilteringBasedOn() {
    return serviceFilteringBasedOn;
  }
  
  
  public Resource.TYPE getResourceTypeToSearchFor() {
    return this.resourceTypeToSearchFor;
  }
  
  
  /**
   * @return Search string; only valid when SearchSettings object holds data about a search by query, not a tag search.
   */
  public String getSearchString() {
    return searchString;
  }
  
  public List<Tag> getSearchTags() {
    return searchTags;
  }
  
  /**
   * This method is to be used when the type of search is not checked - in
   * case of query search the method returns the search string, otherwise
   * the tag that is to be searched.
   * @return
   */
  public String getSearchTerm()
  {
    if (this.searchType == TYPE.QuerySearch || this.serviceFilteringBasedOn == TYPE.QuerySearch) {
      return (this.searchString);
    }
    else {
      List<String> tagDisplayNames = new ArrayList<String>();
      for (Tag t : this.searchTags) {
        tagDisplayNames.add(t.getTagDisplayName());
      }
      return (Util.join(tagDisplayNames, ", "));
    }
  }
  
  
  public ServiceFilteringSettings getFilteringSettings() {
    return filteringSettings;
  }
  public void setFilteringSettings(ServiceFilteringSettings filteringSettings) {
    this.filteringSettings = filteringSettings;
  }
  
  
  public SearchResults getSearchResults() {
    return searchResults;
  }
  public void setSearchResults(SearchResults searchResults) {
    this.searchResults = searchResults;
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
      SearchResultsRenderer renderer)
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
  
  
  private void startNewSearch(Vector<Long> currentParentSearchThreadIDContainer,
      Long parentSearchThreadID, CountDownLatch doneSignal, SearchResultsRenderer renderer)
  {
    instantiateSearchEngine(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer).startNewSearch();
  }
  
  
  private void fetchMoreResults(Vector<Long> currentParentSearchThreadIDContainer,
      Long parentSearchThreadID, CountDownLatch doneSignal, SearchResultsRenderer renderer)
  {
    instantiateSearchEngine(currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer).fetchMoreResults();
  }
  
  
  private void fetchAllResults(Vector<Long> currentParentSearchThreadIDContainer,
      Long parentSearchThreadID, CountDownLatch doneSignal, SearchResultsRenderer renderer)
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
      Long parentSearchThreadID, CountDownLatch doneSignal, SearchResultsRenderer renderer)
  {
    switch (this.searchType) {
      case QuerySearch: return new QuerySearchEngine(this, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
      case TagSearch: return new TagSearchEngine(this, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
      case ServiceFiltering: return new ServiceFilteringSearchEngine(this, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
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
  public SearchInstance deepCopy() {
    return (SearchInstance)Util.deepCopy(this);
  }
  
  
}

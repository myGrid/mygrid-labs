package net.sf.taverna.biocatalogue.model.search;

/**
 * @author Sergejs Aleksejevs
 */
public interface SearchEngine
{
  public void startNewSearch();
  public void fetchMoreResults(int resultPageNumber);
}

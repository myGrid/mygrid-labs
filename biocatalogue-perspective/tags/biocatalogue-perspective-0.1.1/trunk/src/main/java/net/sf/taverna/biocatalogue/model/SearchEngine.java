package net.sf.taverna.biocatalogue.model;

/**
 * @author Sergejs Aleksejevs
 */
public interface SearchEngine
{
  public void startNewSearch();
  public void fetchMoreResults();
  public void fetchAllResults();
}

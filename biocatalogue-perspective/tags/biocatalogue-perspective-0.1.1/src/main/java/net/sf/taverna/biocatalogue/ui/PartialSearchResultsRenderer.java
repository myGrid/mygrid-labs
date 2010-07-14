package net.sf.taverna.biocatalogue.ui;

import net.sf.taverna.biocatalogue.model.SearchInstance;

/**
 * This interfaces avoids coupling of search engine classes
 * directly with the UI classes.
 * 
 * This is important while performing 'fetch all resuls' kind
 * of search. Partial results need to be rendered during the
 * course of the search - to avoid the long delay before all
 * results will eventually appear.
 * 
 * @author Sergejs Aleksejevs
 */
public interface PartialSearchResultsRenderer
{
  /**
   * The only method in this interface. It will render partial results
   * (or make other UI updates - progress bar, etc).
   * 
   * @param searchThreadID This is the ID of the thread that initiated search
   *                       from within the UI component, rather than the ID of
   *                       the real worker search engine's search thread.
   *                       It is used to test whether that thread is still active -
   *                       to determine whether the partial results need to be rendered.
   * @param si The search instance containing partial search results to be rendered. 
   */
  void renderPartialResults(Long searchThreadID, SearchInstance si);
}

// Copyright (C) 2008 The University of Manchester, University of Southampton and Cardiff University
package net.sf.taverna.biocatalogue.model;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Jiten Bhagat
 */
public class TagCloud {

	private List<Tag> tags = new ArrayList<Tag>();
	
	public List<Tag> getTags() {
		return this.tags;
	}
	
	
	/**
	 * Removes all tags from the current tag cloud.
	 */
	public void clear() {
	  this.tags.clear();
	}
	
	
	/**
	 * Adds all tags from the supplied collection into the tag cloud.
	 */
	public void addAll(List<Tag> newTags)	{
	  this.tags.addAll(newTags);
	}
	
	
	/**
	 * @return Count of the occurrences of the most popular tag in the cloud data.
	 */
	public int getMaxTagCount()	{
    int iMax = 0;
    
    for (Tag t : tags) {
      if (t.getItemCount() > iMax) {
        iMax = t.getItemCount();
      }
    }
    
    return (iMax);
  }
	
	
	/**
   * @return Count of the occurrences of the least popular tag in the cloud data.
   */
  public int getMinTagCount() {
    int iMin = Integer.MAX_VALUE;
    
    for (Tag t : tags) {
      if (t.getItemCount() < iMin) {
        iMin = t.getItemCount();
      }
    }
    
    return (iMin);
  }
	
	
	/**
	 * This method is used to lookup the Tag instance within this tag cloud by the URI of that
	 * tag in BioCatalogue.
	 * 
	 * @param tagURI Tag URI to search for.
	 * @return Found tag instance.
	 */
	public Tag getTagByTagURI(String tagURI)
	{
	  // strip out the action prefix if it is present; use tag URI as-is otherwise
	  String strTagURI = (tagURI.startsWith(BioCataloguePluginConstants.ACTION_TAG_SEARCH_PREFIX) ?
	                      tagURI.substring(BioCataloguePluginConstants.ACTION_TAG_SEARCH_PREFIX.length()) :
	                      tagURI);
	  
	  // lookup the tag by its URI
	  for (Tag t : this.tags) {
	    if (t.getTagURI().equals(strTagURI)) {
	      return (t);
	    }
	  }
	  
	  // nothing was found
	  return (null);
	}
}

/*******************************************************************************
 * Copyright (C) 2009 The University of Manchester
 * 
 * Modifications to the initial code base are copyright of their respective
 * authors, or their employers as appropriate.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307
 ******************************************************************************/
package org.myexperiment.api.client.model;

import java.io.Serializable;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.myexperiment.api.client.MyExperimentClient;

/**
 * @author Sergejs Aleksejevs
 */
public class SearchEngine {
  // holds a reference to the instance of the search thread in the current context
  // that should be active at the moment (will aid early termination of older searches
  // when new ones are started)
  private Vector<Long> vCurrentSearchThreadID;

  private boolean bSearchByTag; // indicates what kind of search this is
  private String strSearchQuery; // stores the actual query

  private MyExperimentClient myExperimentClient;
  private Logger logger;

  /**
   * Creates an instance of a search engine that is aware of the current context
   * of the search.
   */
  public SearchEngine(Vector<Long> currentSearchThreadIDVector, boolean bSearchByTag, MyExperimentClient client, Logger logger) {
	super();

	this.vCurrentSearchThreadID = currentSearchThreadIDVector;
	this.bSearchByTag = bSearchByTag;

	this.myExperimentClient = client;
	this.logger = logger;
  }

  /**
   * Class to hold settings for a query search. This will then be used to re-run
   * a search instance at a later time.
   */
  public static class QuerySearchInstance implements Comparable<QuerySearchInstance>, Serializable {
	private String strSearchQuery;
	private int iResultCountLimit;
	private boolean bSearchWorkflows;
	private boolean bSearchFiles;
	private boolean bSearchPacks;
	private boolean bSearchUsers;
	private boolean bSearchGroups;

	// constructor
	public QuerySearchInstance(String searchQuery, int resultCountLimit, boolean searchWorkflows, boolean searchFiles, boolean searchPacks, boolean searchUsers, boolean searchGroups) {
	  this.strSearchQuery = searchQuery;
	  this.iResultCountLimit = resultCountLimit;
	  this.bSearchWorkflows = searchWorkflows;
	  this.bSearchFiles = searchFiles;
	  this.bSearchPacks = searchPacks;
	  this.bSearchUsers = searchUsers;
	  this.bSearchGroups = searchGroups;
	}

	// determines whether the two search instances are identical
	public boolean equals(Object other) {
	  if (other instanceof QuerySearchInstance) {
		QuerySearchInstance si = (QuerySearchInstance) other;

		return (this.strSearchQuery.equals(si.getSearchQuery())
			&& this.iResultCountLimit == si.getResultCountLimit()
			&& this.bSearchWorkflows == si.getSearchWorkflows()
			&& this.bSearchFiles == si.getSearchFiles()
			&& this.bSearchPacks == si.getSearchPacks()
			&& this.bSearchUsers == si.getSearchUsers() && this.bSearchGroups == si.getSearchGroups());
	  } else
		return (false);
	}

	public int compareTo(QuerySearchInstance other) {
	  if (this.equals(other))
		return (0);
	  else {
		// this will return results in the descending order - which is
		// fine, because the way this collection will be rendered will
		// eventually traverse it from the rear end first; so results
		// will be shown alphabetically
		return (-1 * this.toString().compareTo(other.toString()));
	  }
	}

	public String toString() {
	  return ("Search: '" + this.strSearchQuery + "' " + this.detailsAsString());
	}

	public String detailsAsString() {
	  String str = "";

	  // output types that were searched for
	  int iCnt = 0;
	  if (this.bSearchWorkflows) {
		str += "workflows, ";
		iCnt++;
	  }
	  if (this.bSearchFiles) {
		str += "files, ";
		iCnt++;
	  }
	  if (this.bSearchPacks) {
		str += "packs, ";
		iCnt++;
	  }
	  if (this.bSearchUsers) {
		str += "users, ";
		iCnt++;
	  }
	  if (this.bSearchGroups) {
		str += "groups, ";
		iCnt++;
	  }

	  // if that's all types, have just the word 'all'
	  if (iCnt == 5)
		str = "all";
	  else
		str = str.substring(0, str.length() - 2); // remove trailing ", "

	  // add the rest to the string representation of the search instance
	  str = "[" + str + "; limit: " + this.iResultCountLimit + "]";

	  return (str);
	}

	public String getSearchQuery() {
	  return (this.strSearchQuery);
	}

	public int getResultCountLimit() {
	  return (this.iResultCountLimit);
	}

	public boolean getSearchWorkflows() {
	  return (this.bSearchWorkflows);
	}

	public boolean getSearchFiles() {
	  return (this.bSearchFiles);
	}

	public boolean getSearchPacks() {
	  return (this.bSearchPacks);
	}

	public boolean getSearchUsers() {
	  return (this.bSearchUsers);
	}

	public boolean getSearchGroups() {
	  return (this.bSearchGroups);
	}
  }
}

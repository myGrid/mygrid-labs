package uk.org.taverna.t3.workbench.components.definitions;

public interface IComponentDefinition {
	public String getExternalId();
	public String getName();
	public String getDescription();
	public String getGroup();
	public String getFamily();
	public String getIcon();
	
	// POSSIBLY GET RID OF THE .CORE PROJECT AND INSTEAD MOVE THE RELEVANT THHINGS...
	// MAYBE RENAME .CORE TO .COMMON
}

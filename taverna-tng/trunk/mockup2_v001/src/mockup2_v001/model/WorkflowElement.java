		package mockup2_v001.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Rectangle;

public class WorkflowElement implements IAdaptable {

	private String name;
	private String comment;
	private String id;
	
	private int counter;
	private int x;
	private int y;
	private int width;
	private int height;
	
	private List<WorkflowElement> children;
	private Rectangle layout;
	private WorkflowElement parent;
	
	// moving workflowelements
	private PropertyChangeSupport listeners;
	public static final String PROPERTY_LAYOUT = "NodeLayout";
	
	// connecting WorkflowElements
	private List sourceConnections;
    private List targetConnections;
    // ...
    public static final String SOURCE_CONNECTION = "SourceConnectionAdded";
    public static final String TARGET_CONNECTION = "TargetConnectionAdded";
	
    // delete
    public static final String PROPERTY_ADD = "NodeAddChild";
    public static final String PROPERTY_REMOVE = "NodeRemoveChild";
    
    // rename action
    public static final String PROPERTY_RENAME = "NodeRename";
    
	public WorkflowElement() {
		this.name = "A default name";
		
		this.layout = new Rectangle(10,10,100,100);		//intial co-ords
		//this.x = this.layout.x;
		//this.y = this.layout.y;
		//this.width = this.layout.width;
		//this.height = this.layout.height;
		
		this.children = new ArrayList<WorkflowElement>();
		this.parent = null;
		this.listeners = new PropertyChangeSupport(this);
		this.sourceConnections = new ArrayList();
	    this.targetConnections = new ArrayList();
	}
	
	/* 
		Getters and Setters. Id, name, comment, x, y, width, height
							  layout, parent, children.
	 */
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		String oldName = this.name;
		this.name = name;
		getListeners().firePropertyChange(PROPERTY_RENAME, oldName, this.name);
	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setLayout(Rectangle newLayout) {
		Rectangle oldLayout = this.layout;
		this.layout = newLayout;
		getListeners().firePropertyChange(PROPERTY_LAYOUT, oldLayout, newLayout);
	}
	
	public Rectangle getLayout() {
		return this.layout;
	}
	
	public void setParent(WorkflowElement parent) {
		this.parent = parent;
	}
	
	public WorkflowElement getParent() {
		return this.parent;
	}
	
	public List<WorkflowElement> getChildrenArray() {
		return this.children;
	}
	/* 
		Adding and Removing
	*/
	public boolean addChild(WorkflowElement child) {

		boolean b = this.children.add(child);
		
		if (b) {
			child.setParent(this);
			getListeners().firePropertyChange(PROPERTY_ADD, null, child);
		}
		
		return b;
	}
	
	public boolean removeChild(WorkflowElement child) {
		
		boolean b = this.children.remove(child);
		if (b) {
			getListeners().firePropertyChange(PROPERTY_REMOVE, child, null);
		}
		return b;
		
	}
	/*
	 	Property change 
	*/
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		listeners.addPropertyChangeListener(listener);
	}
	
	public PropertyChangeSupport getListeners() {
		return listeners;
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		listeners.removePropertyChangeListener(listener);
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// connect WorkflowElements
	
	  public boolean addConnections (Connection conn) {
	        if (conn.getSourceNode() == this) { 
	            if (!sourceConnections.contains(conn)) {
	                if (sourceConnections.add(conn)) {
	                    getListeners().firePropertyChange(SOURCE_CONNECTION, null, conn);
	                    return true;    
	                }
	                return false;
	            }
	        }
	        else if (conn.getTargetNode() == this) { 
	            if (!targetConnections.contains(conn)) {
	                if (targetConnections.add(conn)) {
	                    getListeners().firePropertyChange(TARGET_CONNECTION, null, conn);
	                    return true;
	                }
	                return false;
	            }
	        }
	        return false;
	    }
	    
	    public boolean removeConnection(Connection conn) {
	        if (conn.getSourceNode() == this) { 
	            if (sourceConnections.contains(conn)) {
	                if (sourceConnections.remove(conn)) {
	                    getListeners().firePropertyChange(SOURCE_CONNECTION, null, conn);
	                    return true;
	                }
	                return false;
	            }
	        }
	        else if (conn.getTargetNode() == this) {
	            if (targetConnections.contains(conn)) {
	                if (targetConnections.remove(conn)) {
	                    getListeners().firePropertyChange(TARGET_CONNECTION, null, conn);
	                    return true;
	                }
	                return false;
	            }
	        }    
	        return false;
	    }

	// ... 


	    public List getSourceConnectionsArray() {
	        return this.sourceConnections;
	    }
	    
	    public List getTargetConnectionsArray() {
	        return this.targetConnections;
	    }
	    
	    // node creation
	    public boolean contains (WorkflowElement child) {
	    	return children.contains(child);
	    }
}
	


package mockup2_v001.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList; 
import java.util.List; 

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

// parent class for model elements. Derived classes will inherit the basic properties
public class Node {
	
	private String name;
	private Rectangle layout;
	private List<Node> children;
	private Node parent;
	private PropertyChangeSupport listeners;
	private List sourceConnections;
	private List targetConnections;
	
	public static final String PROPERTY_LAYOUT = "NodeLayout";
	public static final String PROPERTY_ADD = "NodeAddChild";
	public static final String PROPERTY_REMOVE = "NodeRemoveChild";
	
	public static final String SOURCE_CONNECTION = "SourceConnectionAdded";
	public static final String TARGET_CONNECTION = "TargetConnectionAdded";

	
	public Node() {
		this.name = "Unknown";
		this.layout = new Rectangle(10,10,100,100);
		this.children = new ArrayList<Node>();
		this.parent = null;
		this.sourceConnections = new ArrayList();
		this.targetConnections = new ArrayList();
		this.listeners = new PropertyChangeSupport(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLayout(Rectangle layout2) {
		Rectangle oldLayout = this.layout;
		this.layout = layout2;
		getListeners().firePropertyChange(PROPERTY_LAYOUT, oldLayout, layout2);
	}
	
	public Rectangle getLayout() {
		return this.layout;
	}
	
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node getParent() {
		return this.parent;
	}
	
	public boolean addChild(Node child) {
		boolean b = this.children.add(child);
		if (b) {
			child.setParent(this);
			getListeners().firePropertyChange(PROPERTY_ADD, null, child);
		}
		return b;
	}
	
	public boolean removeChild(Node child) {
		boolean b = this.children.remove(child);
		if (b) {
			child.setParent(this);
			getListeners().firePropertyChange(PROPERTY_REMOVE, child, null);
		}
		return this.children.remove(child);
	}
	
	public List<Node> getChildrenArray() {
		return this.children;
	}
	
	 public boolean addConnection (Connection conn) {
		 
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
	 
	public List getSourceConnectionsArray() {
		return this.sourceConnections;
	}
	
	public List getTargetConnectionsArray() {
		return this.targetConnections;
	}
	 
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		listeners.addPropertyChangeListener(listener);
	}
	
	public PropertyChangeSupport getListeners() {
		return listeners;
	}
	
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		listeners.removePropertyChangeListener(listener);
	}
	
}

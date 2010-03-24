package mockup2_v001.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList; 
import java.util.List; 

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class Node {
	
	private String name;
	private Rectangle layout;
	private List<Node> children;
	private Node parent;
	private PropertyChangeSupport listeners;
	public static final String PROPERTY_LAYOUT = "NodeLayout";
	
	public Node() {
		this.name = "Unknown";
		this.layout = new Rectangle(10,10,100,100);
		this.children = new ArrayList<Node>();
		this.parent = null;
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
		child.setParent(this);
		return this.children.add(child);
	}
	
	public boolean removeChild(Node child) {
		return this.children.remove(child);
	}
	
	public List<Node> getChildrenArray() {
		return this.children;
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

package mockup2_v001.model;

import org.eclipse.draw2d.geometry.Rectangle;

public class Port extends WorkflowElement {
	
	private String portName;
	private boolean isOutput;
	
	public void setPortName(String name) {
		portName = name;
		isOutput = false; //default false
	}
	
	public String getPortName() {
		return portName;
	}
	
	public void setIsOutput(boolean val) {
		isOutput = val;
	}
	
	public boolean getIsOutput() {
		return isOutput;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Port port = new Port();
		port.setName(this.getName());
		port.setIsOutput(this.getIsOutput());
		port.setParent(this.getParent());
		port.setLayout(new Rectangle(getLayout().x + 10, getLayout().y + 10, getLayout().width, getLayout().height));
		return port;
	}
	
}

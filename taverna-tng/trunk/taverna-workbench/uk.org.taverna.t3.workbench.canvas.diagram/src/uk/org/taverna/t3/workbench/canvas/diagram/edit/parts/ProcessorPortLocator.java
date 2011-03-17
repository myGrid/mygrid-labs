package uk.org.taverna.t3.workbench.canvas.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

public class ProcessorPortLocator extends BorderItemLocator {

	private int numberOfPorts;
	
	private int order;
	
	private IFigure parentFigure;
	
	private String positionOnNode;
	
	public ProcessorPortLocator(IFigure parentFig, int iP) {
		super(parentFig);
		numberOfPorts = iP;
		parentFigure = parentFig;
		
	}
	
	public void setNumberOfPorts(int i) {
		
		numberOfPorts = i;
		
	}
	
	public void setOrder(int i) {
		
		order = i;
		
	}
	
	public void setPositionOnNode(String i) {
		
		positionOnNode = i;
		
	}
	
	public void relocate(IFigure borderItem) {
		
		// get the total number of output ports
		Dimension parentSize = parentFigure.getSize();
		Dimension childSize = borderItem.getSize();
		
		System.out.println(" parent size is -> " + parentSize);
		System.out.println(" child size is -> " + childSize);
		
		int xPos = 0;
		int interval = (numberOfPorts + 1) * 2;
		
		xPos  = (parentSize.width / interval) + (numberOfPorts+1 * interval);
		
		int yVal;
		if (positionOnNode.equals("north")) {
			
			yVal = -10;
			
		} else {
			
			yVal = 40;
			
		}
		
		borderItem.setLocation(new Point (xPos, yVal));
	}

}

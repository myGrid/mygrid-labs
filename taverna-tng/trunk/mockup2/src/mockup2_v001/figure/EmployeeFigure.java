package mockup2_v001.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.ColorConstants; 
import org.eclipse.draw2d.Figure; 
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label; 
import org.eclipse.draw2d.LineBorder; 
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Display;

public class EmployeeFigure extends Figure {

	private Label labelName = new Label();
	private Label labelFirstName = new Label();
	
	public EmployeeFigure() {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		
		labelFirstName.setForegroundColor(ColorConstants.black);
		add(labelFirstName, ToolbarLayout.ALIGN_CENTER);
		
		labelName.setForegroundColor(ColorConstants.darkGray);
		add(labelName, ToolbarLayout.ALIGN_CENTER);
			
		setForegroundColor(ColorConstants.black);
		setBackgroundColor(ColorConstants.orange);
		
		//setBorder(new LineBorder(1));
		setOpaque(true);
		
	}
	
	public void setName(String text) {
		labelName.setText(text);
	}
	
	public void setFirstName(String text) {
		labelFirstName.setText(text);
	}
	
	public void setLayout(Rectangle rectangle) {
		getParent().setConstraint(this, rectangle);
	}

	protected void paintFigure(Graphics graphics) {
		
		Display display = Display.getCurrent();	
		Rectangle boundingRect = getBounds();
		Rectangle myBoundingRect = getBounds();


		Point topLeft = boundingRect.getTopLeft();	
		Point bottomRight = boundingRect.getBottomRight();

		Pattern pattern = new Pattern(display, topLeft.x, topLeft.y, bottomRight.x, bottomRight.y,ColorConstants.orange , ColorConstants.white);
		graphics.setBackgroundPattern(pattern);	
		//graphics.fillRectangle(boundingRect);
		graphics.fillRoundRectangle(boundingRect, 8, 8);
		graphics.setBackgroundPattern(null);	
		pattern.dispose();
		
		/*
		// new pattern
		
		myBoundingRect.x += 1;
		myBoundingRect.y += 1;
		
		myBoundingRect.setSize(boundingRect.getSize().width - 1, boundingRect.getSize().height - 1);
		
		
		Pattern pattern2 = new Pattern(display, topLeft.x, topLeft.y, bottomRight.x, bottomRight.y,ColorConstants.white , ColorConstants.orange);
		graphics.setBackgroundPattern(pattern2);
		graphics.fillRoundRectangle(myBoundingRect, 8, 8);
		graphics.setBackgroundPattern(null);	
		pattern.dispose();
		*/
		
	}
	
}

package mockup2_v001.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Display;

public class PortFigure extends Figure {

	private Label labelName = new Label();
	private boolean isOutputPort;
	

	
	public PortFigure() {
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		labelName.setForegroundColor(ColorConstants.darkGray);
		
		add(labelName, ToolbarLayout.ALIGN_CENTER);

		setForegroundColor(ColorConstants.darkGray);
		setBackgroundColor(ColorConstants.lightGray);
		//setBorder(new LineBorder(1));
		setOpaque(true);
		
		Label labelName1 = new Label();
		labelName1.setText("Semantic Type: x");
		setToolTip(labelName1);
		
	}
	
	public void setName(String text) {
		labelName.setText(text);
	}
	
	public void setLayout(Rectangle rect) {
		getParent().setConstraint(this, rect);
	}
	
	public void setPortType(boolean val) {
		isOutputPort = val;
	}
	
	protected void paintFigure(Graphics graphics) {
		
		Display display = Display.getCurrent();
		Rectangle boundingRect = getBounds();
		
		Point topLeft = boundingRect.getTopLeft();
		Point bottomRight = boundingRect.getBottomRight();
		
		Pattern pattern;
		
		if (isOutputPort) {
			 pattern = new Pattern(display, topLeft.x, topLeft.y, bottomRight.x, bottomRight.y, ColorConstants.lightGray, ColorConstants.white);

		} else {
			 pattern = new Pattern(display, topLeft.x, topLeft.y, bottomRight.x, bottomRight.y, ColorConstants.white, ColorConstants.lightGray);
		}
		graphics.setBackgroundPattern(pattern);
		graphics.fillRoundRectangle(boundingRect, 8, 8);
		graphics.setBackgroundPattern(null);
		pattern.dispose();
		
		// circle
		if (isOutputPort) {
		//	pattern = new Pattern(display, topLeft.x, topLeft.y, bottomRight.x, bottomRight.y, ColorConstants.gray, ColorConstants.white);
			graphics.setBackgroundColor(ColorConstants.gray);
			//graphics.setBackgroundPattern(pattern);
		    graphics.fillOval(boundingRect.x + 90, boundingRect.y +5, 10, 10);
		    graphics.setBackgroundPattern(null);
			pattern.dispose();
		} else {
			  pattern = new Pattern(display, topLeft.x, topLeft.y, bottomRight.x, bottomRight.y, ColorConstants.gray, ColorConstants.white);
			  graphics.setBackgroundPattern(pattern);
			  graphics.fillOval(boundingRect.x + 10, boundingRect.y +5, 10, 10);
			  graphics.setBackgroundPattern(null);
			  pattern.dispose();
		}
	  
		
	}
	
}

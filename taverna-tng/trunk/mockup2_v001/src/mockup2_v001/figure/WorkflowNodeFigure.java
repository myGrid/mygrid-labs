package mockup2_v001.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.widgets.Display;

public class WorkflowNodeFigure extends Figure {

	private Label labelName = new Label();
	private Label myLabel = new Label();
	private Label toolTipLabel = new Label();


	public static final int WORKFLOWNODE_FIGURE_DEFWIDTH = 200;
	public static final int WORKFLOWNODE_FIGURE_DEFHEIGHT = 100;
	
	public WorkflowNodeFigure() {
		
		XYLayout layout = new XYLayout();
		setLayoutManager(layout);

		labelName.setForegroundColor(ColorConstants.black);
		add(labelName, ToolbarLayout.ALIGN_CENTER);
		setConstraint(labelName, new Rectangle(5,17,-1,-1));
			
		myLabel.setForegroundColor(ColorConstants.white);
		add(myLabel, ToolbarLayout.ALIGN_CENTER);
		setConstraint(myLabel, new Rectangle(4,18,-1,-1));
		
		setForegroundColor(ColorConstants.lightGray);
		setBackgroundColor(ColorConstants.lightGray);
		
		setOpaque(true);
		
		toolTipLabel.setText("Service Name: x \nService Description: ...\nService Location:");
		setToolTip(toolTipLabel);
		
	}
	
	public void setName(String text) {
		labelName.setText(text);
		myLabel.setText(text);
		toolTipLabel.setText("Service Name: : " + text + "\nService Description: ...");
	}
	
	public void setLayout(Rectangle rect) {
		getParent().setConstraint(this, rect);
	}

	protected void paintFigure(Graphics graphics) {
		
		
		Display display = Display.getCurrent();
		Rectangle boundingRect = getBounds();
		
		Point topLeft = boundingRect.getTopLeft();
		Point bottomRight = boundingRect.getBottomRight();
		
		
		Pattern pattern = new Pattern(display, topLeft.x, topLeft.y, bottomRight.x, bottomRight.y, ColorConstants.lightGray, ColorConstants.gray);
		graphics.setBackgroundPattern(pattern);
		
		// make new smaller boundingrect
		Rectangle myRect = getBounds();

		//myRect.setSize(100, 100);
		graphics.fillRoundRectangle(myRect, 25, 25);
		
		graphics.setBackgroundPattern(null);
		pattern.dispose();
		
		
		/* Two Gradients
		Display display = Display.getCurrent();

		Rectangle rect = getBounds();
		Color color1 = ColorConstants.lightGray;
		Color color2 = ColorConstants.darkGray;
		graphics.setForegroundColor(color1);
		graphics.setBackgroundColor(color2);
		graphics.fillGradient(rect.x, rect.y, rect.width, rect.height / 2, true);
		color1.dispose ();
		color2.dispose ();
		Color color3 = new Color (display, 190, 230, 253);
		Color color4 = new Color (display, 167, 217, 245);
		graphics.setForegroundColor(color3);
		graphics.setBackgroundColor(color4);
		graphics.fillGradient(rect.x, rect.y + (rect.height / 2), rect.width, rect.height / 2 + 1, true);
		graphics.fillRoundRectangle(rect, 25, 25);

		color3.dispose ();
		color4.dispose ();
		*/
	}
	
}
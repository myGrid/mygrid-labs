package mockup2_v001.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class WorkflowFigure extends Figure {
	
	private Label labelName = new Label();
	private Label labelId = new Label();
	private XYLayout layout;
	
	public WorkflowFigure() {
		
		layout = new XYLayout();
		setLayoutManager(layout);
		
		labelName.setForegroundColor(ColorConstants.blue);
		add(labelName);
		setConstraint(labelName, new Rectangle(5,5,-1,-1));
		
		labelId.setForegroundColor(ColorConstants.lightBlue);
		add(labelId);
		setConstraint(labelId, new Rectangle(5,17,-1,-1));
				
		setForegroundColor(ColorConstants.white);
		setBorder(new LineBorder(5));
	}
	
	public void setLayout(Rectangle rect) {
		setBounds(rect);
	}
	
	public void setName(String text) {
		labelName.setText(text);
	}
	
	public void setId(String text) {
		labelId.setText(text);
	}
	
}

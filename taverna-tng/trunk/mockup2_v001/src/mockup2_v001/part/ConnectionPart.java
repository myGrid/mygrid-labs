package mockup2_v001.part;

import mockup2_v001.editpolicies.ApplicationConnectionDeleteEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.eclipse.swt.SWT;

public class ConnectionPart extends ApplicationAbstractConnectionEditPart {

	protected IFigure createFigure() {
		
		PolylineConnection connection = (PolylineConnection) super.createFigure();
        connection.setLineWidth(2);
        PolygonDecoration decoration = new PolygonDecoration();
        decoration.setTemplate(PolygonDecoration.TRIANGLE_TIP);
        connection.setTargetDecoration(decoration);
        Label label = new Label();
        
        label.setText("Connection"); 
        connection.setLineStyle(SWT.LINE_DASH);
        label.setBackgroundColor(ColorConstants.green);
        
        label.setOpaque( true );
        connection.add(label, new MidpointLocator(connection, 0));
        
        Label labelName1 = new Label();
		labelName1.setText("Semantic Type: x");
		
        connection.setToolTip(labelName1);
        return connection;
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ApplicationConnectionDeleteEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
	}
	
}
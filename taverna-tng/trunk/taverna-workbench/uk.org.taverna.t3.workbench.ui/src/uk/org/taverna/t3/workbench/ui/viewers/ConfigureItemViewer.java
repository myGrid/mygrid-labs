package uk.org.taverna.t3.workbench.ui.viewers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.Processor2EditPart;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;

import com.google.common.base.Preconditions;


/**
 * Viewer to allow configuring of an item.
 * 
 * Currently, this specifically supports configuring of
 * {@link ConfigurationProperty} items for either a {@link ComponentEditPart} or {@link Processor2EditPart},
 * but in the future it could be made to handle other things
 * in a pluggable fashion (possibly building on {@link StructuredViewer})
 * 
 * @author Jiten Bhagat
 *
 */
public class ConfigureItemViewer implements IDisposable {

	private Composite container;
	
	@Getter
	private ShapeNodeEditPart shapeNodeEditPart;
	
	// Cache of EditConfigurationPropertiesViewer widgets for 
	// specific ShapeNodeEditPart objects.
	Map<ShapeNodeEditPart, EditConfigurationPropertiesViewer> editConfigurationPropertiesViewers;
	
	private EditConfigurationPropertiesViewer currentEditConfigurationPropertiesViewer;
	
	public ConfigureItemViewer(ViewPart viewPart, Composite parent) {
		container = new Composite(parent, SWT.NONE);
		editConfigurationPropertiesViewers = new HashMap<ShapeNodeEditPart, EditConfigurationPropertiesViewer>();
		
		createControls();
	}
	
	private void createControls() {
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		container.setLayout(mainLayout);
	}

	public Control getControl() {
		return container;
	}
	
	public void setFocus() {
		if (currentEditConfigurationPropertiesViewer != null) {
			currentEditConfigurationPropertiesViewer.setFocus();
		}
	}
	
	public void setShapeNodeEditPart(ShapeNodeEditPart shapeNodeEditPart) {
		Preconditions.checkNotNull(shapeNodeEditPart);
		
		this.shapeNodeEditPart = shapeNodeEditPart;
		
		currentEditConfigurationPropertiesViewer = editConfigurationPropertiesViewers.get(shapeNodeEditPart);
		
		// Create it because if it doesn't exist
		if (currentEditConfigurationPropertiesViewer == null) {
			// Get the ConfigurationProperties for this ShapeNodeEditPart
			List<ConfigurationProperty> properties = new ArrayList<ConfigurationProperty>();
			if (shapeNodeEditPart instanceof ComponentEditPart) {
				ComponentEditPart part = (ComponentEditPart) shapeNodeEditPart;
				Component component = (Component) part.getModel();
				properties.addAll(component.getConfigurationProperties());
			} else if (shapeNodeEditPart instanceof Processor2EditPart) {
				// TODO
			}
			
			EditConfigurationPropertiesViewer newViewer = new EditConfigurationPropertiesViewer(container, properties);
			editConfigurationPropertiesViewers.put(shapeNodeEditPart, newViewer);
			currentEditConfigurationPropertiesViewer = newViewer;
		}
		
		container.setRedraw(false);
		// TODO: figure out how to set the new viewer in the composite!
		
		container.setRedraw(true);
		container.layout();
	}
	
	@Override
	public void dispose() {
		for (EditConfigurationPropertiesViewer viewer : editConfigurationPropertiesViewers.values()) {
			viewer.dispose();
		}
	}

}

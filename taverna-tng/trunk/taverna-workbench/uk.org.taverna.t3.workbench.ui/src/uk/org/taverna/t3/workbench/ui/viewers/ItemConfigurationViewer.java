package uk.org.taverna.t3.workbench.ui.viewers;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.Processor2EditPart;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;

import com.google.common.base.Preconditions;


/**
 * Viewer to allow configuring of an item.
 * 
 * Currently, this specifically supports configuring of a {@link Component}, 
 * but in the future it could be made to handle other things in a pluggable 
 * fashion (possibly building on {@link StructuredViewer})
 * 
 * @author Jiten Bhagat
 *
 */
public class ItemConfigurationViewer implements IDisposable {

	private Composite container;
	private Composite stacksContainer;
	private StackLayout stacksContainerLayout;
	
	// Cache of ComponentConfigurationViewer widgets for 
	// specific ShapeNodeEditPart objects.
	Map<ShapeNodeEditPart, ComponentConfigurationViewer> componentConfigurationViewers;
	
	@Getter
	private ShapeNodeEditPart currentShapeNodeEditPart;
	
	@Getter
	private ComponentConfigurationViewer currentComponentConfigurationViewer;
	
	public ItemConfigurationViewer(ViewPart viewPart, Composite parent) {
		container = new Composite(parent, SWT.NONE);
		
		componentConfigurationViewers = new HashMap<ShapeNodeEditPart, ComponentConfigurationViewer>();
		
		createControls();
	}
	
	private void createControls() {
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		container.setLayout(mainLayout);
		
		stacksContainer = new Composite(container, SWT.NONE);
		stacksContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
		stacksContainerLayout = new StackLayout();
		stacksContainer.setLayout(stacksContainerLayout);
	}

	public Control getControl() {
		return container;
	}
	
	public void setFocus() {
		if (currentComponentConfigurationViewer != null) {
			currentComponentConfigurationViewer.setFocus();
		}
	}
	
	public void setShapeNodeEditPart(ShapeNodeEditPart shapeNodeEditPart) {
		Preconditions.checkNotNull(shapeNodeEditPart);
		
		this.currentShapeNodeEditPart = shapeNodeEditPart;
		
		currentComponentConfigurationViewer = componentConfigurationViewers.get(shapeNodeEditPart);
		
		// Create it if it doesn't exist
		if (currentComponentConfigurationViewer == null) {
			if (shapeNodeEditPart instanceof ComponentEditPart) {
				ComponentEditPart part = (ComponentEditPart) shapeNodeEditPart;
				Component component = (Component) ((ShapeImpl) part.getModel()).getElement();
				ComponentConfigurationViewer newViewer = new ComponentConfigurationViewer(stacksContainer, component);
				componentConfigurationViewers.put(shapeNodeEditPart, newViewer);
				currentComponentConfigurationViewer = newViewer;
			} else if (shapeNodeEditPart instanceof Processor2EditPart) {
				// TODO (possibly)
			}
		}
		
		stacksContainer.setRedraw(false);
		stacksContainerLayout.topControl = currentComponentConfigurationViewer.getControl();
		stacksContainer.setRedraw(true);
		stacksContainer.layout();
	}
	
	@Override
	public void dispose() {
		for (ComponentConfigurationViewer viewer : componentConfigurationViewers.values()) {
			viewer.dispose();
		}
	}

}

package uk.org.taverna.t3.workbench.ui.presentations.shelf;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.presentations.IPresentablePart;
import org.eclipse.ui.presentations.IStackPresentationSite;
import org.eclipse.ui.presentations.StackDropResult;
import org.eclipse.ui.presentations.StackPresentation;

/**
 * This is based on PShelfStackPresentation but instead pushes most of the logic to a new class - 
 * PShelfStack - which allows wrapping the PShelf in a Composite; 
 * 
 * @author Jits
 *
 */
public class PShelfStackPresentation2 extends StackPresentation {
	
	private PShelfStack shelfStack;

	public PShelfStackPresentation2(IStackPresentationSite stackSite,
			Composite parent) {
		super(stackSite);
		
		shelfStack = new PShelfStack(getSite(), parent);
	}
	
	@Override
	public void setBounds(Rectangle bounds) {
		shelfStack.setBounds(bounds);
	}

	@Override
	public void dispose() {
		shelfStack.dispose();
	}

	@Override
	public void setActive(int newState) {
		shelfStack.setActive(newState);

	}

	@Override
	public void setVisible(boolean isVisible) {
		shelfStack.setVisible(isVisible);

	}

	@Override
	public void setState(int state) {

	}

	@Override
	public Control getControl() {
		return shelfStack.getControl();
	}

	@Override
	public void addPart(IPresentablePart newPart, Object cookie) {
		shelfStack.addPart(newPart, cookie);
	}

	@Override
	public void removePart(IPresentablePart oldPart) {
		shelfStack.removePart(oldPart);
	}

	@Override
	public void selectPart(IPresentablePart toSelect) {
		shelfStack.selectPart(toSelect);
	}

	@Override
	public StackDropResult dragOver(Control currentControl, Point location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showSystemMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showPaneMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public Control[] getTabList(IPresentablePart part) {
		// TODO Auto-generated method stub
		return null;
	}

}

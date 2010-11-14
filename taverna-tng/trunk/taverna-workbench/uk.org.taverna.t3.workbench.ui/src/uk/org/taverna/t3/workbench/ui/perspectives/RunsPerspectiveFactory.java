package uk.org.taverna.t3.workbench.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class RunsPerspectiveFactory implements IPerspectiveFactory {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.perspectives.runs";	//$NON-NLS-1$
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
        layout.setEditorAreaVisible(false);
	}

}

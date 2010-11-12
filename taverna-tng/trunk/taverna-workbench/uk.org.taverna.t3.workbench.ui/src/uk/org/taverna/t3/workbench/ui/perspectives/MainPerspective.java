package uk.org.taverna.t3.workbench.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class MainPerspective implements IPerspectiveFactory {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.perspectives.main";	//$NON-NLS-1$
	
	public static final String LEFT_FOLDER = ID + ".folders.left";
	public static final String RIGHT_FOLDER = ID + ".folders.right";
	
	private IPageLayout layout;

	public void createInitialLayout(IPageLayout layout) {
		this.layout = layout; 
        String editorAreaId = layout.getEditorArea();
        layout.setEditorAreaVisible(true);
        
        layout.createFolder(LEFT_FOLDER, IPageLayout.LEFT, 0.25f, editorAreaId);
        layout.createFolder(RIGHT_FOLDER, IPageLayout.RIGHT, 0.70f, editorAreaId);
	}
	
	public IPageLayout getLayout() {
        return layout;
    }
}

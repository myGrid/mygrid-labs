package uk.org.taverna.t3.workbench.ui.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPlaceholderFolderLayout;

import uk.org.taverna.t3.workbench.ui.views.ComponentInfoView;

public class MainPerspective implements IPerspectiveFactory {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.perspectives.main";	//$NON-NLS-1$
	
	public static final String LEFT_FOLDER = ID + ".folders.left";
	public static final String RIGHT_FOLDER = ID + ".folders.right";
	public static final String CONTEXTUAL_FOLDER = ID + ".folders.contextual";
	
	private IPageLayout layout;

	public void createInitialLayout(IPageLayout layout) {
		this.layout = layout; 
        String editorAreaId = layout.getEditorArea();
        layout.setEditorAreaVisible(true);
        
        /* NOTE: Due to the following bugs, in order for IFolderLayout.setProperty to work,
         * have to programmatically add one view to each folder now and then other views 
         * for each folder can be stacked on top of the already added one (via the perspectiveExtensions):
         * 
         * [PresentationAPI] Values set by IPlaceholderFolderLayout.setProperty not found in PresentationFactory
         * https://bugs.eclipse.org/bugs/show_bug.cgi?id=311277
         * 
         * [WorkbenchParts] Bug with IFolderLayout and placeholder view
         * https://bugs.eclipse.org/bugs/show_bug.cgi?id=118693
         */
        
        IPlaceholderFolderLayout leftFolder = layout.createPlaceholderFolder(LEFT_FOLDER, IPageLayout.LEFT, 0.22f, editorAreaId);
        
        IPlaceholderFolderLayout rightFolder = layout.createPlaceholderFolder(RIGHT_FOLDER, IPageLayout.RIGHT, 0.78f, editorAreaId);
        
        layout.addStandaloneView(ComponentInfoView.ID, false, IPageLayout.BOTTOM, 0.8f, editorAreaId);
	}
	
	public IPageLayout getLayout() {
        return layout;
    }
}

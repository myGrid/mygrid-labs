package uk.org.taverna.t3.workbench.ui.perspectives;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPlaceholderFolderLayout;

public class MainPerspectiveFactory implements IPerspectiveFactory {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.perspectives.main";	//$NON-NLS-1$
	
	public static final String LEFT_FOLDER = ID + ".folders.left";
	public static final String RIGHT_FOLDER = ID + ".folders.right";
	public static final String BOTTOM_FOLDER = ID + ".folders.bottom";
	
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
        
        IPlaceholderFolderLayout bottomFolder = layout.createPlaceholderFolder(BOTTOM_FOLDER, IPageLayout.BOTTOM, 0.75f, editorAreaId);
	}
	
	public IPageLayout getLayout() {
        return layout;
    }
	
}

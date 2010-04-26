package mockup2_v001;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

// RCP class - gets the current active workbench and opens our editor (launch the editor at application startup)

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "mockup2_v001.perspective";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
	
	
	@Override
	public void postStartup() {
		
		// make and open Editor
		try {
	
			IWorkbenchPage page =
	
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	
			page.openEditor(new MyEditorInput("TutoGEF"), MyEditor.ID, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

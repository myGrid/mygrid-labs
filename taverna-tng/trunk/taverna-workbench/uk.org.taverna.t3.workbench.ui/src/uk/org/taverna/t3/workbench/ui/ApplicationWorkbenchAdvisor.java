package uk.org.taverna.t3.workbench.ui;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import uk.org.taverna.t3.workbench.ui.perspectives.MainPerspective;
import uk.org.taverna.t3.workbench.ui.themes.ThemeHelper;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	
	public void initialize(IWorkbenchConfigurer configurer) {
		configurer.setSaveAndRestore(true);
		ThemeHelper.getEngine().setTheme("uk.org.taverna.t3.workbench.ui.css.themes.default", false);
		super.initialize(configurer);
	}

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return MainPerspective.ID;
	}
	
}

package prototype003;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.jface.action.IStatusLineManager;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    @Override
	public void postWindowOpen() {
		// TODO Auto-generated method stub
    	IStatusLineManager statusline = getWindowConfigurer().getActionBarConfigurer().getStatusLineManager();
    	statusline.setMessage(null, "Here's the status: not too bad ");
		super.postWindowOpen();
	}

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setInitialSize(new Point(1000, 1000));
        configurer.setShowCoolBar(false);
        configurer.setShowStatusLine(true);
        configurer.setShowCoolBar (true);

        //configurer.setTitle("Here's the status of what you're doing. Kind regards.");
    }
}

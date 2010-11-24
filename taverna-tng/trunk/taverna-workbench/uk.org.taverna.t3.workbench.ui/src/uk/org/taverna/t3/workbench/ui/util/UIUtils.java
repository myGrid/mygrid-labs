package uk.org.taverna.t3.workbench.ui.util;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.widgets.Display;

public final class UIUtils {
	
	private UIUtils() {
		throw new AssertionError();
	}
	
	public static void updateStatusBar(final IStatusLineManager statusLine, final String message) {
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				statusLine.setMessage(message);
			}
		});
	}
}

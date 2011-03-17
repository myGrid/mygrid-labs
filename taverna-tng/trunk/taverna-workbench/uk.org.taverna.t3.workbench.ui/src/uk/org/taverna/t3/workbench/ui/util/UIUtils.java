package uk.org.taverna.t3.workbench.ui.util;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TableColumn;

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
	
	public static TableViewerColumn createTableViewerColumn(TableViewer tableViewer, String title, int bound, int colNumber) {
		TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}
}

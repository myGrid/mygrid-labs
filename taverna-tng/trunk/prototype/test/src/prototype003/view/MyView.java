package prototype003.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class MyView extends ViewPart {
	public static final String ID = "prototype003.MyView";
	Text text;
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		text = new Text(parent, SWT.BORDER);
		text.setText("Imagine a fantastic user interface here");
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	public void setTextInfo(String serviceName)
	{
		System.out.println("ABOUT TO PRINT");
		text.setText(serviceName);
		text.update();
	}

}
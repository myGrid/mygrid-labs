package mockup2_v001;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;


public class MyEditorInput implements IEditorInput {
	
	public String name = null;
		
	public MyEditorInput(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return (this.name != null);
	}

	public boolean equals(Object o) {
		if (!(o instanceof MyEditorInput))
			return false;
		return ((MyEditorInput)o).getName().equals(getName());
	}
	
	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return ImageDescriptor.getMissingImageDescriptor();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

}

package mockup2_v001;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
/*
 * This class describes the EditorPart.
 * 
 */
public class MyEditorInput implements IEditorInput {

	public String name = null;
	
	public MyEditorInput(String name) {
		this.name = name;
	}
	
	@Override
	public boolean exists() {
		return (this.name != null);
	}

	public boolean equals(Object o) {
		if (!(o instanceof MyEditorInput)) {
			return false;
		}
		return ((MyEditorInput)o).getName().equals(getName());
	}
	
	@Override
	public ImageDescriptor getImageDescriptor() {
		return ImageDescriptor.getMissingImageDescriptor();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return this.name;
	}

	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

}

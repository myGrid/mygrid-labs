package uk.org.taverna.t3.workbench.ui.editors;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.editors.text.ILocationProvider;
import org.eclipse.ui.internal.editors.text.NonExistingFileEditorInput;

import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasDiagramEditorUtil;

/**
 * This is heavily inspired by {@link NonExistingFileEditorInput}
 * 
 * @author Jiten Bhagat
 * 
 */
@SuppressWarnings("restriction")
public class NonExistingCanvasEditorInput extends URIEditorInput implements
		IEditorInput, ILocationProvider {

	private static int fgNonExisting = 1;

	private IFileStore fFileStore;
	private String fName;

	public NonExistingCanvasEditorInput(IFileStore fileStore, String namePrefix) {
		super(org.eclipse.emf.common.util.URI.createURI(fileStore.toURI()
				.toString()
				+ File.separator
				+ namePrefix.replaceAll(" ", "%20")
				+ "%20"
				+ fgNonExisting));

		Assert.isNotNull(fileStore);
		Assert.isTrue(EFS.SCHEME_FILE.equals(fileStore.getFileSystem()
				.getScheme()));
		fFileStore = fileStore;
		fName = namePrefix + " " + fgNonExisting; //$NON-NLS-1$
		fgNonExisting++;
		
		createEmptyCanvas();
	}

	private void createEmptyCanvas() {
		CanvasDiagramEditorUtil.createDiagram(super.getURI(), new NullProgressMonitor());
	}

	/*
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	public boolean exists() {
		return false;
	}

	/*
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	/*
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	public String getName() {
		return fName;
	}

	/*
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	public IPersistableElement getPersistable() {
		return null;
	}

	/*
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	public String getToolTipText() {
		return fName;
	}

	/*
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class adapter) {
		if (ILocationProvider.class.equals(adapter))
			return this;
		return Platform.getAdapterManager().getAdapter(this, adapter);
	}

	/*
	 * @see
	 * org.eclipse.ui.editors.text.ILocationProvider#getPath(java.lang.Object)
	 */
	public IPath getPath(Object element) {
		if (element instanceof NonExistingCanvasEditorInput) {
			NonExistingCanvasEditorInput input = (NonExistingCanvasEditorInput) element;
			return new Path(input.fFileStore.toURI().getPath());
		}
		return null;
	}

	/*
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		if (o == this)
			return true;

		if (o instanceof NonExistingCanvasEditorInput) {
			NonExistingCanvasEditorInput input = (NonExistingCanvasEditorInput) o;
			return fFileStore.equals(input.fFileStore);
		}

		return false;
	}

	/*
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return fFileStore.hashCode();
	}

}

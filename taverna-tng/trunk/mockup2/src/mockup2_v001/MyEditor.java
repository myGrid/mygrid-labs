package mockup2_v001;
import java.util.ArrayList;

import mockup2_v001.model.Connection;
import mockup2_v001.model.ConnectionCreationFactory;
import mockup2_v001.model.Employee;
import mockup2_v001.model.Enterprise;
import mockup2_v001.model.Service;
import mockup2_v001.part.AppEditPartFactory;
import mockup2_v001.part.tree.AppTreeEditPartFactory;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
// the base Graphical Editor

public class MyEditor extends GraphicalEditorWithFlyoutPalette {

	public static final String ID = "mygraphicaleditor";
	private Enterprise model;
	private KeyHandler keyHandler;
	
	protected class OutlinePage extends ContentOutlinePage {
		
		private SashForm sash;
		private ScrollableThumbnail thumbnail;
		private DisposeListener disposeListener;
		
		public OutlinePage() {
			super(new TreeViewer());
		}
		
		public void createControl(Composite parent) {
			sash = new SashForm(parent, SWT.VERTICAL);
			
			getViewer().createControl(sash);
			
			getViewer().setEditDomain(getEditDomain());
			getViewer().setEditPartFactory(new AppTreeEditPartFactory());
			getViewer().setContents(model);
			
			getSelectionSynchronizer().addViewer(getViewer());
			
			// Minature View
			Canvas canvas = new Canvas(sash, SWT.BORDER);
			LightweightSystem lws = new LightweightSystem(canvas);
			
			thumbnail = new ScrollableThumbnail(
					(Viewport)((ScalableRootEditPart) getGraphicalViewer()
							.getRootEditPart()).getFigure());
			thumbnail.setSource(((ScalableRootEditPart) getGraphicalViewer()
					.getRootEditPart())
					.getLayer(LayerConstants.PRINTABLE_LAYERS));
			
			lws.setContents(thumbnail);
			
			disposeListener = new DisposeListener() {
			
				@Override
				public void widgetDisposed(DisposeEvent e) {
						if (thumbnail != null) {
						thumbnail.deactivate();
						thumbnail = null;
					}
				}
			};
			getGraphicalViewer().getControl().addDisposeListener(disposeListener);
		}
		
		public void init(IPageSite pageSite) {
			super.init(pageSite);
			
			IActionBars bars = getSite().getActionBars();
			bars.setGlobalActionHandler(ActionFactory.UNDO.getId(), getActionRegistry().getAction(ActionFactory.UNDO.getId()));
			bars.setGlobalActionHandler(ActionFactory.REDO.getId(), getActionRegistry().getAction(ActionFactory.REDO.getId()));
			bars.setGlobalActionHandler(ActionFactory.DELETE.getId(), getActionRegistry().getAction(ActionFactory.DELETE.getId()));
			bars.updateActionBars();
			
			ContextMenuProvider provider = new AppContextMenuProvider(getViewer(), getActionRegistry());
			
			getViewer().setKeyHandler(keyHandler);
			getViewer().setContextMenu(provider);
		}
		
		public Control getControl() {
			return sash;
		}
		
		public void dispose() {
			getSelectionSynchronizer().removeViewer(getViewer());
			if (getGraphicalViewer().getControl() != null
					&& !getGraphicalViewer().getControl().isDisposed())
				getGraphicalViewer().getControl().removeDisposeListener(disposeListener);
			super.dispose();
		}
	}

	public MyEditor() {

		setEditDomain(new DefaultEditDomain(this));
		
	}
	
	public Enterprise CreateEnterprise() {
		
		Enterprise myEnterprise = new Enterprise();
		myEnterprise.setName("My Workflow");
		myEnterprise.setAddress("some details about workflow");
		myEnterprise.setCapital(1);
		
			Service componentOne = new Service();
			componentOne.setName("Component One");
			componentOne.setStage(1);
			componentOne.setLayout(new Rectangle(30,50,250,150));
			
			
				Employee serviceOne = new Employee();
				serviceOne.setName("Service One");
				serviceOne.setFirstName("Service detail");
				serviceOne.setLayout(new Rectangle(25, 40, 100, 40));
				componentOne.addChild(serviceOne);
				
				Employee serviceTwo = new Employee();
				serviceTwo.setName("Service Two");
				serviceTwo.setFirstName("Service detail");
				serviceTwo.setLayout(new Rectangle(25, 95, 100, 40));
				componentOne.addChild(serviceTwo);
				
			Service componentTwo = new Service();
			componentTwo.setName("Component Two");
			componentTwo.setStage(2);
			componentTwo.setLayout(new Rectangle(30,250,250,150));
			
			
				Employee serviceThree = new Employee();
				serviceThree.setName("Service Three");
				serviceThree.setFirstName("Service detail");
				serviceThree.setLayout(new Rectangle(25, 40, 100, 40));
				componentTwo.addChild(serviceThree);
				
				Employee serviceFour = new Employee();
				serviceFour.setName("Service Four");
				serviceFour.setFirstName("Service detail");
				serviceFour.setLayout(new Rectangle(25, 95, 100, 40));
				componentTwo.addChild(serviceFour);
				
			Service componentThree = new Service();
			componentThree.setName("Component Three");
			componentThree.setStage(3);
			componentThree.setLayout(new Rectangle(300,150,300,150));
			
			
				Employee serviceFive = new Employee();
				serviceFive.setName("Service Five");
				serviceFive.setFirstName("Service detail");
				serviceFive.setLayout(new Rectangle(25, 40, 100, 40));
				componentThree.addChild(serviceFive);
				
				Employee serviceSix = new Employee();
				serviceSix.setName("Service Six");
				serviceSix.setFirstName("Service detail");
				serviceSix.setLayout(new Rectangle(80, 95, 100, 40));
				componentThree.addChild(serviceSix);	
				
				Employee serviceSeven = new Employee();
				serviceSeven.setName("Service Seven");
				serviceSeven.setFirstName("Service detail");
				serviceSeven.setLayout(new Rectangle(140, 40, 100, 40));
				componentThree.addChild(serviceSeven);	
			
			myEnterprise.addChild(componentOne);	
			myEnterprise.addChild(componentTwo);
			myEnterprise.addChild(componentThree);
			
		return myEnterprise;
	}
	
	protected void configureGraphicalViewer() {
		
		// zooming action on the graph (not the model)
		
		double[] zoomLevels;
		ArrayList<String>zoomContributions;
		
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new AppEditPartFactory());
		
		ScalableRootEditPart rootEditPart = new ScalableRootEditPart();
		viewer.setRootEditPart(rootEditPart);
		
		ZoomManager manager = rootEditPart.getZoomManager();
		manager.setZoomAnimationStyle(ZoomManager.ANIMATE_ZOOM_IN_OUT);
		getActionRegistry().registerAction(new ZoomInAction(manager));
		getActionRegistry().registerAction(new ZoomOutAction(manager));
		
		zoomLevels = new double[] {0.25, 0.5, 0.75, 1.0, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0, 20.0};
		manager.setZoomLevels(zoomLevels);
		
		zoomContributions = new ArrayList<String>();
		zoomContributions.add(ZoomManager.FIT_ALL);
		zoomContributions.add(ZoomManager.FIT_HEIGHT);
		zoomContributions.add(ZoomManager.FIT_WIDTH);
		
		manager.setZoomLevelContributions(zoomContributions);
		
		ContextMenuProvider provider = new AppContextMenuProvider(viewer, getActionRegistry());
		viewer.setContextMenu(provider);

	}
	
	public Object getAdapter(Class type) {
		if (type == ZoomManager.class) 
			return ((ScalableRootEditPart)
					getGraphicalViewer().getRootEditPart()).getZoomManager();
		if (type == IContentOutlinePage.class) {
			return new OutlinePage();
		}
			return super.getAdapter(type);
	}

	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
		GraphicalViewer viewer = getGraphicalViewer();
		model = CreateEnterprise();
		viewer.setContents(model);

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		
		PaletteRoot root = new PaletteRoot();
		
		PaletteGroup manipGroup = new PaletteGroup("Manipulation");
		root.add(manipGroup);
		
		SelectionToolEntry selectionToolEntry = new SelectionToolEntry();
		manipGroup.add(selectionToolEntry);
		manipGroup.add(new MarqueeToolEntry());
		
		root.setDefaultEntry(selectionToolEntry);
		
		PaletteDrawer connectionElement = new PaletteDrawer("Connections");
		root.add(connectionElement);
		
		connectionElement.add( new ConnectionCreationToolEntry("Connect", "create", 
				new ConnectionCreationFactory(Connection.CONNECTION_SERVICE), null, null));
		
		return root;
	}
	
	@Override
	protected PaletteViewerProvider createPaletteViewerProvider() {
		
		return new PaletteViewerProvider(getEditDomain()) {
	        protected void configurePaletteViewer(PaletteViewer viewer) {
	            super.configurePaletteViewer(viewer);
	            viewer.addDragSourceListener(new TemplateTransferDragSourceListener(viewer));
	        }
	    };
		
	}

}

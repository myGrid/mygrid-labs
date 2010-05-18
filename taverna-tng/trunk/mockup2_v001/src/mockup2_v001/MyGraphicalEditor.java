package mockup2_v001;

import java.util.ArrayList;

import javax.xml.ws.Service;

import mockup2_v001.action.CopyWorkflowElementAction;
import mockup2_v001.action.PasteWorkflowElementAction;
import mockup2_v001.action.RenameAction;
import mockup2_v001.model.Connection;
import mockup2_v001.model.ConnectionCreationFactory;
import mockup2_v001.model.Port;
import mockup2_v001.model.Workflow;
import mockup2_v001.model.WorkflowElementCreationFactory;
import mockup2_v001.model.WorkflowNode;
import mockup2_v001.part.ApplicationEditPartFactory;
import mockup2_v001.part.tree.ApplicationTreeEditPartFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.LightweightSystem;
import org.eclipse.draw2d.Viewport;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.parts.ScrollableThumbnail;
import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyHandler;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.MouseWheelHandler;
import org.eclipse.gef.MouseWheelZoomHandler;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.ContentOutlinePage;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.GraphicalEditorWithPalette;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class MyGraphicalEditor extends GraphicalEditorWithPalette {

	public static final String ID = "mockup2_v001.mygraphicaleditor";
	
	private Workflow model;
	private KeyHandler keyHandler;

	/*
	 *  Nested class - Outline view
	 */
	protected class OutlinePage extends ContentOutlinePage {

		private SashForm sash;
		//mini view
		private ScrollableThumbnail thumbnail;
		private DisposeListener disposeListener;
		
		public OutlinePage() {
			super(new TreeViewer());
		}
		
		public void createControl(Composite parent) {
			sash = new SashForm(parent, SWT.VERTICAL);
			
	
			getViewer().createControl(sash);
			
			getViewer().setEditDomain(getEditDomain());
			getViewer().setEditPartFactory(new ApplicationTreeEditPartFactory());
			getViewer().setContents(model);
			
			getSelectionSynchronizer().addViewer(getViewer());
			
			//
			IActionBars bars = getSite().getActionBars();
			ActionRegistry ar = getActionRegistry();
			
			bars.setGlobalActionHandler(ActionFactory.COPY.getId(), ar.getAction(ActionFactory.COPY.getId()));
			bars.setGlobalActionHandler(ActionFactory.PASTE.getId(), ar.getAction(ActionFactory.PASTE.getId()));
			
			//
			// Minature view
			Canvas canvas = new Canvas(sash, SWT.BORDER);
			LightweightSystem lws = new LightweightSystem(canvas);
			
			thumbnail = new ScrollableThumbnail((Viewport) ((ScalableRootEditPart) getGraphicalViewer().getRootEditPart()).getFigure());
			
			thumbnail.setSource(((ScalableRootEditPart) getGraphicalViewer().getRootEditPart()).getLayer(LayerConstants.PRINTABLE_LAYERS));
			
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
		
			getViewer().setKeyHandler(keyHandler);
			
			//context menu
			ContextMenuProvider provider = new ApplicationContextMenuProvider(getViewer(), getActionRegistry());
			getViewer().setContextMenu(provider);
			
		}
		
		public Control getControl() {
			return sash;
		}
		
		public void dispose() {
			getSelectionSynchronizer().removeViewer(getViewer());
			if (getGraphicalViewer().getControl() != null
					&& !getGraphicalViewer().getControl().isDisposed()) getGraphicalViewer().getControl().removeDisposeListener(disposeListener);
			
			super.dispose();
		}
		
	}
	
	
	// end of nested class
	
	public MyGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	protected void configureGraphicalViewer() {
		// Set your Edit Parts Factory here
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new ApplicationEditPartFactory());
		
		// Zooming
		double [] zoomLevels;
		ArrayList<String> zoomContributions;
		
		ScalableRootEditPart rootEditPart = new ScalableRootEditPart();
		viewer.setRootEditPart(rootEditPart);
		
		ZoomManager manager = rootEditPart.getZoomManager();
		getActionRegistry().registerAction(new ZoomInAction(manager));
		getActionRegistry().registerAction(new ZoomOutAction(manager));
		
		zoomLevels = new double[] {0.25, 0.5, 0.75, 1.0, 1.5, 2.0, 2.5, 3.0, 4.0, 5.0, 10.0, 20.0};
	
		manager.setZoomLevels(zoomLevels);
		
		zoomContributions = new ArrayList<String>();
		zoomContributions.add(ZoomManager.FIT_ALL);
		zoomContributions.add(ZoomManager.FIT_HEIGHT);
		zoomContributions.add(ZoomManager.FIT_WIDTH);
		manager.setZoomLevelContributions(zoomContributions);
		
		
		// Keyboard shortcuts
		KeyHandler keyHandler = new KeyHandler();
		
		keyHandler.put(KeyStroke.getPressed(SWT.DEL, 127,0), getActionRegistry().getAction(ActionFactory.DELETE.getId()));
		
		keyHandler.put(KeyStroke.getPressed('+', SWT.KEYPAD_ADD, 0), getActionRegistry().getAction(GEFActionConstants.ZOOM_IN));
		
		keyHandler.put(KeyStroke.getPressed('-', SWT.KEYPAD_SUBTRACT, 0), getActionRegistry().getAction(GEFActionConstants.ZOOM_OUT));

		viewer.setProperty(MouseWheelHandler.KeyGenerator.getKey(SWT.NONE), MouseWheelZoomHandler.SINGLETON);
	
		viewer.setKeyHandler(keyHandler);
		
		// Context Menu
		ContextMenuProvider provider = new ApplicationContextMenuProvider(viewer, getActionRegistry());
		viewer.setContextMenu(provider);
		
		// grid
		viewer.setProperty(SnapToGrid.PROPERTY_GRID_ENABLED, true);
		//viewer.setProperty(SnapToGrid.PROPERTY_GRID_VISIBLE, true);
		
	}
	
	public Object getAdapter(Class type) {
		if (type == ZoomManager.class) {
			return ((ScalableRootEditPart)getGraphicalViewer().getRootEditPart()).getZoomManager();
		} 
		
		if (type == IContentOutlinePage.class) {
			return new OutlinePage();
		}
			return super.getAdapter(type);
		
	}
	
	@Override
	protected void initializeGraphicalViewer() {
		// load our own model object in the editor
		GraphicalViewer viewer = getGraphicalViewer();
		model = createWorkflow();
		viewer.setContents(model);
		
		// dnd

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}
	
	// [create an example] - Create an Object Model
	public Workflow createWorkflow() {
		//Temporary construction of a workflow
		Workflow myWorkflow = new Workflow();
		myWorkflow.setName("Example workflow");
		myWorkflow.setId("1");
		/* MOVE TO PALLETE

			WorkflowNode myNode = new WorkflowNode();
			myNode.setName("Get_Protein_FASTA");
			myNode.setLayout(new Rectangle(170,200,200,75));
			
				Port myFirstPort = new Port();
				myFirstPort.setName("Sequence");
				myFirstPort.setLayout(new Rectangle(-10,40, 100,18));
				myNode.addChild(myFirstPort);
				
				Port myFirstPort1 = new Port();
				myFirstPort1.setName("outputText");
				myFirstPort1.setIsOutput(true);
				myFirstPort1.setLayout(new Rectangle(100,40, 100,18));
				myNode.addChild(myFirstPort1);
			
			myWorkflow.addChild(myNode);
			
			WorkflowNode myOtherNode = new WorkflowNode();
			myOtherNode.setName("searchSimple");
			myOtherNode.setLayout(new Rectangle(500,140,200,130));
			
				Port myOtherPort = new Port();
				myOtherPort.setName("Database");
				myOtherPort.setLayout(new Rectangle(-10,40, 100,18));
				myOtherNode.addChild(myOtherPort);
				
				Port myOtherOtherPort = new Port();
				myOtherOtherPort.setName("Program");
				myOtherOtherPort.setLayout(new Rectangle(-10,70, 100,18));
				myOtherNode.addChild(myOtherOtherPort);
				
				Port myLazyOtherOtherPort = new Port();
				myLazyOtherOtherPort.setName("Query");
				myLazyOtherOtherPort.setLayout(new Rectangle(-10,100, 100,18));
				myOtherNode.addChild(myLazyOtherOtherPort);
				
				Port myOutputPort = new Port();
				myOutputPort.setIsOutput(true);
				myOutputPort.setName("searchSimple");
				myOutputPort.setLayout(new Rectangle(100,70, 100,18));
				myOtherNode.addChild(myOutputPort);
			
			myWorkflow.addChild(myOtherNode);
			*/
			Port myOtherPort1 = new Port();
			myOtherPort1.setName("Sequence: 1220173");
			myOtherPort1.setLayout(new Rectangle(0,500, 150,18));
			myWorkflow.addChild(myOtherPort1);
			
			Port myOtherPort2 = new Port();
			myOtherPort2.setName("Database: SWISS");
			myOtherPort2.setLayout(new Rectangle(170,500, 150,18));
			myWorkflow.addChild(myOtherPort2);
			
			Port myOtherPort3 = new Port();
			myOtherPort3.setName("Program: blastp");
			myOtherPort3.setLayout(new Rectangle(330,500, 150,18));
			myWorkflow.addChild(myOtherPort3);
			
			Port myOtherPort4 = new Port();
			myOtherPort4.setName("Results");
			myOtherPort4.setLayout(new Rectangle(500,500, 150,18));
			myWorkflow.addChild(myOtherPort4);
		
		return myWorkflow;
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
		
		// add connection
		 PaletteDrawer connectionElements = new PaletteDrawer("Connecting Elements"); 
	        root.add(connectionElements); 
	        
	        connectionElements.add(new ConnectionCreationToolEntry("Make connection","Create Connections",
	                new ConnectionCreationFactory(Connection.CONNECTION_PORT),
	                null,
	                null));
	        
	    // add WorkflowNodes
	    PaletteDrawer serviceElements = new PaletteDrawer("Services"); 
	    root.add(serviceElements);
	   // PaletteSeparator sep2 = new PaletteSeparator();
	    //serviceElements.add(sep2);
	    
	    
	    serviceElements.add(new CreationToolEntry("Get_Protein_FASTA", "Creates a WorkflowNode", new WorkflowElementCreationFactory(WorkflowNode.class,1), null, null));
	    root.setDefaultEntry(selectionToolEntry);
	    
	    
	    serviceElements.add(new CreationToolEntry("searchSimples", "Creates a WorkflowNode", new WorkflowElementCreationFactory(WorkflowNode.class,2), null, null));
	    root.setDefaultEntry(selectionToolEntry);
	   
	    
	    // dnd
	    
		return root;
		
	}
	
	public void createActions() {
		super.createActions();
		
		ActionRegistry registry = getActionRegistry();
		IAction action = new RenameAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());

		
		action = new CopyWorkflowElementAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
		action = new PasteWorkflowElementAction(this);
		registry.registerAction(action);
		getSelectionActions().add(action.getId());
		
	
	}
	
	// palette viewer drag and drop
	

}

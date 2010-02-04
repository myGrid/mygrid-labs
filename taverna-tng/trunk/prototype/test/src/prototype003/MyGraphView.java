package prototype003;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.GridLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import prototype003.handler.Run;
import prototype003.view.MyView;


public class MyGraphView extends ViewPart {
	public static final String ID = "prototype003.MyGraphView";
	private Graph graph;
	private int layout = 1;

	public void createPartControl(Composite parent) {
		
		// Graph will hold all other objects
		graph = new Graph(parent, SWT.NONE);
		
/*		graph.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.out.println(((Graph) e.widget).getSelection());
				// on clicking node
			
			}
		});
*/	
		graph.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				IHandlerService handlerService = (IHandlerService) getSite()
						.getService(IHandlerService.class);
				try {
					handlerService.executeCommand("prototype003.command.Run", null);
				
				} catch (Exception ex) {
					throw new RuntimeException("add.command not found");
				}

			}
		});

		
		// Now a few nodes
		Image image1 = Display.getDefault().getSystemImage(SWT.ICON_INFORMATION);
		Image image2 = Display.getDefault().getSystemImage(SWT.ICON_WARNING);
		
		GraphNode node1 = new GraphNode(graph, SWT.NONE, "Sequence", image1);
		GraphNode node2 = new GraphNode(graph, SWT.NONE, "Get_Protein_FASTA", image1);
		GraphNode node3 = new GraphNode(graph, SWT.NONE, "searchSimple", image2);
		GraphNode node4 = new GraphNode(graph, SWT.NONE, "simpleSearchResult", image1);
		GraphNode node5 = new GraphNode(graph, SWT.NONE, "program_value", image1);
		GraphNode node6 = new GraphNode(graph, SWT.NONE, "database_value", image1);
		
		// Sequence to Get_Protein_FASTA
		new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, node1,
				node2);
		
		// Get_Protein_FASTA to searchSimple
		new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, node2, node3);
		
		// program_value to searchSimple
		new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, node5, node3);
		
		// database_value to searchSimple
		new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, node6, node3);
		
		// searchSimple to searchSimpleResult
		new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, node3, node4);
		
		// Lets have a dotted graph connection
		//new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, node2, node3);
		// Standard connection
		//new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, node3, node1);
		// Change line color and line width
		//GraphConnection graphConnection = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED,
		//		node1, node4);
		//graphConnection.changeLineColor(parent.getDisplay().getSystemColor(
		//		SWT.COLOR_GRAY));
		
		
		// Also set a text
		//graphConnection.setText("Connection relationship");
		//graphConnection.setHighlightColor(parent.getDisplay().getSystemColor(
		//		SWT.COLOR_DARK_GRAY));
		//graphConnection.setLineWidth(2);
		//graphConnection.addListener(SWT.SELECTED, new Listener() {

		//	@Override
		//	public void handleEvent(Event event) {
				
		//		System.out.println("Selected");
		//	}

	//	});
		graph.setLayoutAlgorithm(new SpringLayoutAlgorithm(
		LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		
	}

	public void setLayoutManager() {
		switch (layout) {
		case 1:
			graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(
					LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layout++;
			break;
		case 2:
			graph.setLayoutAlgorithm(new SpringLayoutAlgorithm(
					LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layout++;
			break;
		case 3:
			graph.setLayoutAlgorithm(new GridLayoutAlgorithm(
					LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layout++;
			break;
		case 4:
			graph.setLayoutAlgorithm(new HorizontalTreeLayoutAlgorithm(
					LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layout++;
			break;
		case 5:
			graph.setLayoutAlgorithm(new RadialLayoutAlgorithm(
					LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
			layout = 1;
			break;
	
			
			
//			layout = new GridLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
//			layout = new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
//			layout = new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
			
//SpringLayoutAlgorithm
		}

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
	}
}
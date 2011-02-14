package uk.org.taverna.t3.workbench.ui.handlers;
import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CanvasEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentComponentCompartmentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;


public class CreateTestElements extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// MAKE 10 WORKFLOW INPUTS 
		// get the current selection from JFace
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		
		// usually first item but need to check if it's an instance of IGraphicalPart
		System.out.println(" edit part : " + structuredSelection.getFirstElement().toString());
		
		CanvasEditPart canvasEditPart = (CanvasEditPart) structuredSelection.getFirstElement();
		
		String canvasSemanticHint = CanvasVisualIDRegistry.getType(CanvasEditPart.VISUAL_ID);
	
		IElementType type = CanvasElementTypes.WorkflowInput_2001;
		
		ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(new CreateElementRequest(type)),
				Node.class,
				((IHintedType) type).getSemanticHint(), 
				canvasEditPart.getDiagramPreferencesHint());
		
		CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewDescriptor);
		
		CompoundCommand cmd = new CompoundCommand("Create 10 workflow inputs");
		
		for (int i = 0; i < 10; i++) {
			
			cmd.add(canvasEditPart.getCommand(req));
			
		}
		
			//org.eclipse.gef.commands.Command gefCommand = canvasEditPart.getCommand(req);
			//cmd.execute();
		
		canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
				
		// ADD A COMPONENT WITH A PROCESSOR INSIDE
		IElementType componentType = CanvasElementTypes.Component_2004;
		IElementType processorType = CanvasElementTypes.Processor_3001;
		
		ViewAndElementDescriptor componentViewDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(new CreateElementRequest(componentType)),
				Node.class,
				((IHintedType) componentType).getSemanticHint(), 
				canvasEditPart.getDiagramPreferencesHint());
				
		ViewAndElementDescriptor processorViewDescriptor = new ViewAndElementDescriptor(
				new CreateElementRequestAdapter(new CreateElementRequest(processorType)),
				Node.class,
				((IHintedType) processorType).getSemanticHint(), 
				canvasEditPart.getDiagramPreferencesHint());
						
		CreateViewAndElementRequest componentReq = new CreateViewAndElementRequest(componentViewDescriptor);
		CreateViewAndElementRequest processorReq = new CreateViewAndElementRequest(processorViewDescriptor);
		
		// make the component
		CompoundCommand cmd2 = new CompoundCommand("Create Components");
		cmd2.add(canvasEditPart.getCommand(componentReq));
		
		canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cmd2);
		
		// make the the processor
		CompoundCommand cmd3 = new CompoundCommand("Create processor");
		String compartemntsSemanticHint =  CanvasVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID);
		ComponentEditPart componentEditPart = (ComponentEditPart) canvasEditPart.getChildBySemanticHint(compartemntsSemanticHint);
		
			ComponentComponentCompartmentEditPart compartmentEditPart = (ComponentComponentCompartmentEditPart) componentEditPart.getChildBySemanticHint(CanvasVisualIDRegistry.getType(ComponentComponentCompartmentEditPart.VISUAL_ID));
			//compartmentEditPart.setSelected(1);
		
		cmd3.add(compartmentEditPart.getCommand(processorReq));
		compartmentEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(cmd3);
					
		// RENAME PROCESSOR JUST ADDED PROCESSOR
		Collection results = DiagramCommandStack.getReturnValues(cmd3);
		for (Object res: results) {
			if (res instanceof IAdaptable) {
				IAdaptable adapter = (IAdaptable) res;
				View view = (View) adapter.getAdapter(View.class);
				if (view != null) {
					Processor newMod = (Processor)view.getElement();
					SetRequest reqSet = new SetRequest(canvasEditPart.getEditingDomain(),
							newMod, CanvasPackage.eINSTANCE.getProcessor_Name(),
							"ModX");
					SetValueCommand operation = new SetValueCommand(reqSet);
					canvasEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(new 
							ICommandProxy(operation));
				}
			}
		}
		
		//gefCommand.execute();
		
		/*
		    String compartemntsSemanticHint = NetworkVisualIDRegistry.getType(tests.mindmap.network.diagram.edit.parts.Device_ModulesCompartmentEditPart.VISUAL_ID);
			Device_ModulesCompartmentEditPart modulesCompartment = (Device_ModulesCompartmentEditPart)selectedElement.getChildBySemanticHint(compartemntsSemanticHint);
			
			IElementType type = NetworkElementTypes.Module_3001;
			
			ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(
					new CreateElementRequestAdapter(new CreateElementRequest(type)),
					Node.class,
					((IHintedType) type).getSemanticHint(), 
					selectedElement.getDiagramPreferencesHint());
			
			CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewDescriptor);
			
			CompoundCommand cmd = new CompoundCommand("Create 10 modules");
			for (int i=0; i<10; i++) {
				cmd.add(modulesCompartment.getCommand(req));
			}
			selectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(cmd);
		 */
		
	return null;
	}

}
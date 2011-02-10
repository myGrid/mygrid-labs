package uk.org.taverna.t3.workbench.ui.handlers;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CanvasEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;


public class CreateTestElements extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		
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
		
		org.eclipse.gef.commands.Command gefCommand = canvasEditPart.getCommand(req);
		cmd.execute();
		//gefCommand.execute();
		
		/*
		 * String compartemntsSemanticHint = NetworkVisualIDRegistry.getType(tests.mindmap.network.diagram.edit.parts.Device_ModulesCompartmentEditPart.VISUAL_ID);
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
		 * 
		 * 
		 */
		
	return null;
	}

}

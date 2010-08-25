package uk.org.taverna.t3.workbench.canvas.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.parsers.MessageFormatParser;
import uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowVisualIDRegistry;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage;

/**
 * @generated
 */
public class WorkflowParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser componentInstanceName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getComponentInstanceName_5001Parser() {
		if (componentInstanceName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE
					.getComponentInstance_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentInstanceName_5001Parser = parser;
		}
		return componentInstanceName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser workflowInputName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getWorkflowInputName_5002Parser() {
		if (workflowInputName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			workflowInputName_5002Parser = parser;
		}
		return workflowInputName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser workflowOutputName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getWorkflowOutputName_5003Parser() {
		if (workflowOutputName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { WorkflowPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			workflowOutputName_5003Parser = parser;
		}
		return workflowOutputName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentInstanceNameEditPart.VISUAL_ID:
			return getComponentInstanceName_5001Parser();
		case WorkflowOutputNameEditPart.VISUAL_ID:
			return getWorkflowInputName_5002Parser();
		case WorkflowInputNameEditPart.VISUAL_ID:
			return getWorkflowOutputName_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WorkflowVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WorkflowVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WorkflowElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

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

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInputName2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutputName2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.parsers.MessageFormatParser;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;

/**
 * @generated
 */
public class CanvasParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser workflowInputName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getWorkflowInputName_5001Parser() {
		if (workflowInputName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			workflowInputName_5001Parser = parser;
		}
		return workflowInputName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser workflowOutputName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getWorkflowOutputName_5002Parser() {
		if (workflowOutputName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { CanvasPackage.eINSTANCE
					.getPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			workflowOutputName_5002Parser = parser;
		}
		return workflowOutputName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WorkflowInputNameEditPart.VISUAL_ID:
			return getWorkflowInputName_5001Parser();
		case WorkflowOutputNameEditPart.VISUAL_ID:
			return getWorkflowOutputName_5002Parser();
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
			return getParser(CanvasVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CanvasVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CanvasElementTypes.getElement(hint) == null) {
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

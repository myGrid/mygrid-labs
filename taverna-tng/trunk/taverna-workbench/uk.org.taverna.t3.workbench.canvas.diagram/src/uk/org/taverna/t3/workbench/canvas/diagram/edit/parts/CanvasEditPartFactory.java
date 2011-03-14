package uk.org.taverna.t3.workbench.canvas.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CanvasEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CanvasVisualIDRegistry.getVisualID(view)) {

			case CanvasEditPart.VISUAL_ID:
				return new CanvasEditPart(view);

			case ComponentEditPart.VISUAL_ID:
				return new ComponentEditPart(view);

			case WorkflowOutputEditPart.VISUAL_ID:
				return new WorkflowOutputEditPart(view);

			case WorkflowOutputNameEditPart.VISUAL_ID:
				return new WorkflowOutputNameEditPart(view);

			case WorkflowInputEditPart.VISUAL_ID:
				return new WorkflowInputEditPart(view);

			case WorkflowInputNameEditPart.VISUAL_ID:
				return new WorkflowInputNameEditPart(view);

			case Processor2EditPart.VISUAL_ID:
				return new Processor2EditPart(view);

			case ProcessorNameEditPart.VISUAL_ID:
				return new ProcessorNameEditPart(view);

			case ProcessorInputEditPart.VISUAL_ID:
				return new ProcessorInputEditPart(view);

			case ProcessorInputNameEditPart.VISUAL_ID:
				return new ProcessorInputNameEditPart(view);

			case ProcessorOutputEditPart.VISUAL_ID:
				return new ProcessorOutputEditPart(view);

			case ProcessorOutputNameEditPart.VISUAL_ID:
				return new ProcessorOutputNameEditPart(view);

			case ComponentInputEditPart.VISUAL_ID:
				return new ComponentInputEditPart(view);

			case ComponentOutputEditPart.VISUAL_ID:
				return new ComponentOutputEditPart(view);

			case ComponentComponentCompartmentEditPart.VISUAL_ID:
				return new ComponentComponentCompartmentEditPart(view);

			case SenderReceiversEditPart.VISUAL_ID:
				return new SenderReceiversEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}

package uk.org.taverna.t3.workbench.canvas.diagram.edit.parts;

import java.util.List;

import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.policies.Processor2CanonicalEditPolicy;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.policies.Processor2ItemSemanticEditPolicy;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class Processor2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Processor2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Processor2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new Processor2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (CanvasVisualIDRegistry.getVisualID(childView)) {
				case ProcessorInputEditPart.VISUAL_ID:
				case ProcessorOutputEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ProcessorFigure() {
			protected boolean useLocalCoordinates() {
				return true;
			}
		};
	}

	/**
	 * @generated
	 */
	public ProcessorFigure getPrimaryShape() {
		return (ProcessorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProcessorNameEditPart) {
			((ProcessorNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureProcessorNameFigure());
			return true;
		}
		if (childEditPart instanceof ProcessorInputEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			getBorderedFigure().getBorderItemContainer().add(
					((ProcessorInputEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof ProcessorOutputEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			getBorderedFigure().getBorderItemContainer().add(
					((ProcessorOutputEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProcessorNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ProcessorInputEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ProcessorInputEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ProcessorOutputEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((ProcessorOutputEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CanvasVisualIDRegistry
				.getType(ProcessorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ProcessorFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessorTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProcessorLabelFigure;

		/**
		 * @generated NOT
		 */
		public ProcessorFigure() {
			// this.setLayoutManager(new XYLayout());
			// StackLayout
			
			this.setLayoutManager(new XYLayout() {

				public void layout(IFigure figure) {

					Rectangle r = figure.getClientArea();
					List children = figure.getChildren();
					IFigure child;
					Dimension d;

					for (int i = 0; i < children.size(); i++) {

						child = (IFigure) children.get(i);
						d = child.getPreferredSize(r.width, r.height);
						d.width = Math.min(d.width, r.width);
						d.height = Math.min(d.height, r.height);
						Rectangle childRect = new Rectangle(r.x
								+ (r.width - d.width) / 2, r.y
								+ (r.height - d.height) / 2, d.width, d.height);
						child.setBounds(childRect);

					}

				}

			});
			
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProcessorNameFigure = new WrappingLabel();
			fFigureProcessorNameFigure.setText("");

			this.add(fFigureProcessorNameFigure);

			fFigureProcessorTypeFigure = new WrappingLabel();
			fFigureProcessorTypeFigure.setText("");

			this.add(fFigureProcessorTypeFigure);

			fFigureProcessorLabelFigure = new WrappingLabel();
			fFigureProcessorLabelFigure.setText("");

			this.add(fFigureProcessorLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessorNameFigure() {
			return fFigureProcessorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessorTypeFigure() {
			return fFigureProcessorTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProcessorLabelFigure() {
			return fFigureProcessorLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 20, 20, 20);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 162, 205, 90);

}

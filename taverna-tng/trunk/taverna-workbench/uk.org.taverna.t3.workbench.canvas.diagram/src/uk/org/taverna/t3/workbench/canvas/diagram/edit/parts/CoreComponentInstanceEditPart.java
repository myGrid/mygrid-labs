package uk.org.taverna.t3.workbench.canvas.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.policies.CoreComponentInstanceCanonicalEditPolicy;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.policies.CoreComponentInstanceItemSemanticEditPolicy;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry;

/**
 * @generated
 */
public class CoreComponentInstanceEditPart extends
		AbstractBorderedShapeEditPart {

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
	public CoreComponentInstanceEditPart(View view) {
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
				new CoreComponentInstanceItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new CoreComponentInstanceCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (CanvasVisualIDRegistry.getVisualID(childView)) {
				case ComponentInstanceInputEditPart.VISUAL_ID:
				case ComponentInstanceOutputEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new CoreComponentInstanceFigure();
	}

	/**
	 * @generated
	 */
	public CoreComponentInstanceFigure getPrimaryShape() {
		return (CoreComponentInstanceFigure) primaryShape;
	}

	/**
	 * @generated NOT
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
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
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
	public class CoreComponentInstanceFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCoreComponentInstanceCompartmentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentInstanceNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentInstanceFamilyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentInstanceActivityFigure;

		/**
		 * @generated
		 */
		public CoreComponentInstanceFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCoreComponentInstanceCompartmentFigure = new RectangleFigure();

			this.add(fFigureCoreComponentInstanceCompartmentFigure);

			fFigureComponentInstanceNameFigure = new WrappingLabel();
			fFigureComponentInstanceNameFigure.setText("name");

			this.add(fFigureComponentInstanceNameFigure);

			fFigureComponentInstanceFamilyFigure = new WrappingLabel();
			fFigureComponentInstanceFamilyFigure.setText("family");

			this.add(fFigureComponentInstanceFamilyFigure);

			fFigureComponentInstanceActivityFigure = new WrappingLabel();
			fFigureComponentInstanceActivityFigure.setText("activity");

			this.add(fFigureComponentInstanceActivityFigure);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCoreComponentInstanceCompartmentFigure() {
			return fFigureCoreComponentInstanceCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentInstanceNameFigure() {
			return fFigureComponentInstanceNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentInstanceFamilyFigure() {
			return fFigureComponentInstanceFamilyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentInstanceActivityFigure() {
			return fFigureComponentInstanceActivityFigure;
		}

	}

}

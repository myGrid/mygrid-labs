/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.DotProduct#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getDotProduct()
 * @model
 * @generated
 */
public interface DotProduct extends IterationStrategyTopNode {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getDotProduct_Nodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IterationStrategyNode> getNodes();

} // DotProduct

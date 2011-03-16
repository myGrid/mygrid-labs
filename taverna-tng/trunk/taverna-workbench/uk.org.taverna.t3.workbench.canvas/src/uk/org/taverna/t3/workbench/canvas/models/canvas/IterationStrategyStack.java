/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Strategy Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyStack#getStrategies <em>Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getIterationStrategyStack()
 * @model
 * @generated
 */
public interface IterationStrategyStack extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyTopNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getIterationStrategyStack_Strategies()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IterationStrategyTopNode> getStrategies();

} // IterationStrategyStack

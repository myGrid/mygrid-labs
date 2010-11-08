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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Node#getHelperComponents <em>Helper Components</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Node#getCoreComponents <em>Core Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Helper Components</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.canvas.HelperComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper Components</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getNode_HelperComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<HelperComponentInstance> getHelperComponents();

	/**
	 * Returns the value of the '<em><b>Core Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Components</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Components</em>' containment reference.
	 * @see #setCoreComponents(CoreComponentInstance)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getNode_CoreComponents()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CoreComponentInstance getCoreComponents();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Node#getCoreComponents <em>Core Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Components</em>' containment reference.
	 * @see #getCoreComponents()
	 * @generated
	 */
	void setCoreComponents(CoreComponentInstance value);

} // Node

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.canvas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas#getDataLinks <em>Data Links</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage#getCanvas()
 * @model
 * @generated
 */
public interface Canvas extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Links</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Links</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage#getCanvas_DataLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getDataLinks();

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' containment reference.
	 * @see #setWorkflow(Workflow)
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage#getCanvas_Workflow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas#getWorkflow <em>Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' containment reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

} // Canvas

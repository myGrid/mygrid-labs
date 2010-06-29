/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender#getReceivers <em>Receivers</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getSender()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Sender extends EObject {

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' reference.
	 * @see #setReceivers(Receiver)
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getSender_Receivers()
	 * @model
	 * @generated
	 */
	Receiver getReceivers();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender#getReceivers <em>Receivers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receivers</em>' reference.
	 * @see #getReceivers()
	 * @generated
	 */
	void setReceivers(Receiver value);
} // Sender

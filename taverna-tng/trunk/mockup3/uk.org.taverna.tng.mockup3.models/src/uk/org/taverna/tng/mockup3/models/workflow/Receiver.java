/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.Receiver#getSenders <em>Senders</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getReceiver()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Receiver extends EObject {
	/**
	 * Returns the value of the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senders</em>' reference.
	 * @see #setSenders(Sender)
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getReceiver_Senders()
	 * @model
	 * @generated
	 */
	Sender getSenders();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workflow.Receiver#getSenders <em>Senders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Senders</em>' reference.
	 * @see #getSenders()
	 * @generated
	 */
	void setSenders(Sender value);

} // Receiver

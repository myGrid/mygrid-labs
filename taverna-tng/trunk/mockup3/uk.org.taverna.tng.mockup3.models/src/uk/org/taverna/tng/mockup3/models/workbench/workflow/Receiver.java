/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.org.taverna.tng.mockup3.models.workbench.canvas.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver#getDataLinks <em>Data Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getReceiver()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Receiver extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Links</b></em>' reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Links</em>' reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getReceiver_DataLinks()
	 * @model
	 * @generated
	 */
	EList<Data> getDataLinks();

} // Receiver

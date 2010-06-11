/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.canvas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data#getSource <em>Source</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data#getDataLink <em>Data Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.canvas.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage#getData_Source()
	 * @model
	 * @generated
	 */
	EList<DataSource> getSource();

	/**
	 * Returns the value of the '<em><b>Data Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Link</em>' reference.
	 * @see #setDataLink(Receiver)
	 * @see uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage#getData_DataLink()
	 * @model
	 * @generated
	 */
	Receiver getDataLink();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.Data#getDataLink <em>Data Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Link</em>' reference.
	 * @see #getDataLink()
	 * @generated
	 */
	void setDataLink(Receiver value);

} // Data

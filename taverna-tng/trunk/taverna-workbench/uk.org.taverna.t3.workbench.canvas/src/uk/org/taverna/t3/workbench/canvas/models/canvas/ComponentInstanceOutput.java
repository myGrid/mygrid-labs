/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getComponentInstanceOutput()
 * @model
 * @generated
 */
public interface ComponentInstanceOutput extends Port, Sender {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(ComponentInstance)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getComponentInstanceOutput_EReference0()
	 * @model
	 * @generated
	 */
	ComponentInstance getEReference0();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(ComponentInstance value);

} // ComponentInstanceOutput

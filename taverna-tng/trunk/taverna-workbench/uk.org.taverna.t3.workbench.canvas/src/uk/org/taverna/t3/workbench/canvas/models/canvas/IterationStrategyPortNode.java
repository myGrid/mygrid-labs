/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Strategy Port Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode#getDesiredDepth <em>Desired Depth</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getIterationStrategyPortNode()
 * @model
 * @generated
 */
public interface IterationStrategyPortNode extends IterationStrategyNode {
	/**
	 * Returns the value of the '<em><b>Desired Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Depth</em>' attribute.
	 * @see #setDesiredDepth(int)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getIterationStrategyPortNode_DesiredDepth()
	 * @model
	 * @generated
	 */
	int getDesiredDepth();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode#getDesiredDepth <em>Desired Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Depth</em>' attribute.
	 * @see #getDesiredDepth()
	 * @generated
	 */
	void setDesiredDepth(int value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ProcessorInput)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getIterationStrategyPortNode_Port()
	 * @model required="true"
	 * @generated
	 */
	ProcessorInput getPort();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(ProcessorInput value);

} // IterationStrategyPortNode

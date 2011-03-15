/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput#getGranularDepth <em>Granular Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessorOutput()
 * @model
 * @generated
 */
public interface ProcessorOutput extends Sender, Port {

	/**
	 * Returns the value of the '<em><b>Granular Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Granular Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Granular Depth</em>' attribute.
	 * @see #setGranularDepth(int)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessorOutput_GranularDepth()
	 * @model
	 * @generated
	 */
	int getGranularDepth();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput#getGranularDepth <em>Granular Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granular Depth</em>' attribute.
	 * @see #getGranularDepth()
	 * @generated
	 */
	void setGranularDepth(int value);
} // ProcessorOutput

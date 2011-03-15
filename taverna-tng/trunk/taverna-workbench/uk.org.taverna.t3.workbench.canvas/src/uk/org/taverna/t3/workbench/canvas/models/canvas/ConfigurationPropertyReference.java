/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Property Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationPropertyReference()
 * @model
 * @generated
 */
public interface ConfigurationPropertyReference extends ConfigurationProperty {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationPropertyReference_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // ConfigurationPropertyReference

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Property Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationPropertyLiteral()
 * @model
 * @generated
 */
public interface ConfigurationPropertyLiteral extends ConfigurationProperty {
	/**
	 * Returns the value of the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Type</em>' attribute.
	 * @see #setFieldType(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationPropertyLiteral_FieldType()
	 * @model
	 * @generated
	 */
	String getFieldType();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral#getFieldType <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Type</em>' attribute.
	 * @see #getFieldType()
	 * @generated
	 */
	void setFieldType(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationPropertyLiteral_DataType()
	 * @model required="true"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationPropertyLiteral_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteralOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationPropertyLiteral_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationPropertyLiteralOption> getOptions();

} // ConfigurationPropertyLiteral

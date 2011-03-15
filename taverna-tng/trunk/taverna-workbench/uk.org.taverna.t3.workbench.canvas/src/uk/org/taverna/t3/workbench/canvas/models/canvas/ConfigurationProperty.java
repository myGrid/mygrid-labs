/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getValue <em>Value</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isFixed <em>Fixed</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isHidden <em>Hidden</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isConstrainedToOptions <em>Constrained To Options</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getOptions <em>Options</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getExamples <em>Examples</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty()
 * @model
 * @generated
 */
public interface ConfigurationProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Predicate()
	 * @model required="true"
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

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
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_FieldType()
	 * @model
	 * @generated
	 */
	String getFieldType();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getFieldType <em>Field Type</em>}' attribute.
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
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_DataType()
	 * @model required="true"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see #setFixed(boolean)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Fixed()
	 * @model
	 * @generated
	 */
	boolean isFixed();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #isFixed()
	 * @generated
	 */
	void setFixed(boolean value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Hidden()
	 * @model
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Constrained To Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained To Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained To Options</em>' attribute.
	 * @see #setConstrainedToOptions(boolean)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_ConstrainedToOptions()
	 * @model
	 * @generated
	 */
	boolean isConstrainedToOptions();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isConstrainedToOptions <em>Constrained To Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained To Options</em>' attribute.
	 * @see #isConstrainedToOptions()
	 * @generated
	 */
	void setConstrainedToOptions(boolean value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(ConfigurationPropertyOption)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Options()
	 * @model containment="true"
	 * @generated
	 */
	ConfigurationPropertyOption getOptions();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(ConfigurationPropertyOption value);

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' attribute list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getConfigurationProperty_Examples()
	 * @model
	 * @generated
	 */
	EList<String> getExamples();

} // ConfigurationProperty

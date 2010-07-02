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
 * A representation of the model object '<em><b>Component Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getComponentDefinitionId <em>Component Definition Id</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getDiscoveryUrl <em>Discovery Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentDefinitionReference()
 * @model
 * @generated
 */
public interface ComponentDefinitionReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Definition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Definition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Id</em>' attribute.
	 * @see #setComponentDefinitionId(String)
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentDefinitionReference_ComponentDefinitionId()
	 * @model
	 * @generated
	 */
	String getComponentDefinitionId();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getComponentDefinitionId <em>Component Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Id</em>' attribute.
	 * @see #getComponentDefinitionId()
	 * @generated
	 */
	void setComponentDefinitionId(String value);

	/**
	 * Returns the value of the '<em><b>Discovery Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovery Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovery Url</em>' attribute.
	 * @see #setDiscoveryUrl(String)
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentDefinitionReference_DiscoveryUrl()
	 * @model
	 * @generated
	 */
	String getDiscoveryUrl();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getDiscoveryUrl <em>Discovery Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovery Url</em>' attribute.
	 * @see #getDiscoveryUrl()
	 * @generated
	 */
	void setDiscoveryUrl(String value);

} // ComponentDefinitionReference

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getFamily <em>Family</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getActivityType <em>Activity Type</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstanceInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentInstance_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstanceInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstanceOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentInstance_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstanceOutput> getOutputs();

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
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentInstance_Family()
	 * @model
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Type</em>' attribute.
	 * @see #setActivityType(String)
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentInstance_ActivityType()
	 * @model
	 * @generated
	 */
	String getActivityType();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(String value);

	/**
	 * Returns the value of the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition</em>' reference.
	 * @see #setComponentDefinition(ComponentDefinitionReference)
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage#getComponentInstance_ComponentDefinition()
	 * @model
	 * @generated
	 */
	ComponentDefinitionReference getComponentDefinition();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getComponentDefinition <em>Component Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition</em>' reference.
	 * @see #getComponentDefinition()
	 * @generated
	 */
	void setComponentDefinition(ComponentDefinitionReference value);

} // ComponentInstance

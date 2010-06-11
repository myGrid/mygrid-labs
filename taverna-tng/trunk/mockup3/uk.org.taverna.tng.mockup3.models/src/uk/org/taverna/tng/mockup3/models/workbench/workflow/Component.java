/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getFamily <em>Family</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getActivityType <em>Activity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getComponent_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getComponent_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentOutput> getOutputs();

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
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getName <em>Name</em>}' attribute.
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
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getComponent_Family()
	 * @model
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getFamily <em>Family</em>}' attribute.
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
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getComponent_ActivityType()
	 * @model
	 * @generated
	 */
	String getActivityType();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getActivityType <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Type</em>' attribute.
	 * @see #getActivityType()
	 * @generated
	 */
	void setActivityType(String value);

} // Component

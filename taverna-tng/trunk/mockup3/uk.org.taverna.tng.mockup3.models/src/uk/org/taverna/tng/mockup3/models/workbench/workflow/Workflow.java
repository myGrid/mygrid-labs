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
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getComponents <em>Components</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getWorkflow_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getWorkflow_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getWorkflow_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowOutput> getOutputs();

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
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage#getWorkflow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Workflow

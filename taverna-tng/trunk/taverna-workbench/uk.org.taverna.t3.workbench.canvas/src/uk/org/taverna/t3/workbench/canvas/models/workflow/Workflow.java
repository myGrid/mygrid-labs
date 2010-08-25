/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.workflow;

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
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow#getComponents <em>Components</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.workflow.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage#getWorkflow_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getComponents();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage#getWorkflow_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage#getWorkflow_Outputs()
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
	 * @see uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage#getWorkflow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage#getWorkflow_ComponentDefinition()
	 * @model
	 * @generated
	 */
	ComponentDefinitionReference getComponentDefinition();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow#getComponentDefinition <em>Component Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition</em>' reference.
	 * @see #getComponentDefinition()
	 * @generated
	 */
	void setComponentDefinition(ComponentDefinitionReference value);

} // Workflow

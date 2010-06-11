/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uk.org.taverna/tng/mockup3/1.0/workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FAMILY = 3;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ACTIVITY_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 1;

	/**
	 * The feature id for the '<em><b>Data Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__DATA_LINKS = 0;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 2;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowInputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowInputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getWorkflowInput()
	 * @generated
	 */
	int WORKFLOW_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Data Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__DATA_LINKS = SENDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__NAME = SENDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__DEPTH = SENDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT_FEATURE_COUNT = SENDER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 4;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OUTPUTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 3;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowOutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowOutputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getWorkflowOutput()
	 * @generated
	 */
	int WORKFLOW_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Data Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__DATA_LINKS = RECEIVER__DATA_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__NAME = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__DEPTH = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.PortImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEPTH = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentInputImpl <em>Component Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentInputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getComponentInput()
	 * @generated
	 */
	int COMPONENT_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT__DEPTH = PORT__DEPTH;

	/**
	 * The feature id for the '<em><b>Data Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT__DATA_LINKS = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentOutputImpl <em>Component Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentOutputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getComponentOutput()
	 * @generated
	 */
	int COMPONENT_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT__DEPTH = PORT__DEPTH;

	/**
	 * The number of structural features of the '<em>Component Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getInputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getOutputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getFamily()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Family();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Component#getActivityType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ActivityType();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for the reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver#getDataLinks <em>Data Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Links</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver#getDataLinks()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_DataLinks();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowInput
	 * @generated
	 */
	EClass getWorkflowInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getComponents()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getInputs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getOutputs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowOutput
	 * @generated
	 */
	EClass getWorkflowOutput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput <em>Component Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Input</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput
	 * @generated
	 */
	EClass getComponentInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentOutput <em>Component Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Output</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentOutput
	 * @generated
	 */
	EClass getComponentOutput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Port#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Port#getDepth()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Depth();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INPUTS = eINSTANCE.getComponent_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTPUTS = eINSTANCE.getComponent_Outputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FAMILY = eINSTANCE.getComponent_Family();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ACTIVITY_TYPE = eINSTANCE.getComponent_ActivityType();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '<em><b>Data Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__DATA_LINKS = eINSTANCE.getReceiver_DataLinks();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowInputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowInputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getWorkflowInput()
		 * @generated
		 */
		EClass WORKFLOW_INPUT = eINSTANCE.getWorkflowInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__COMPONENTS = eINSTANCE.getWorkflow_Components();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__INPUTS = eINSTANCE.getWorkflow_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OUTPUTS = eINSTANCE.getWorkflow_Outputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowOutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowOutputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getWorkflowOutput()
		 * @generated
		 */
		EClass WORKFLOW_OUTPUT = eINSTANCE.getWorkflowOutput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentInputImpl <em>Component Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentInputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getComponentInput()
		 * @generated
		 */
		EClass COMPONENT_INPUT = eINSTANCE.getComponentInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentOutputImpl <em>Component Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentOutputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getComponentOutput()
		 * @generated
		 */
		EClass COMPONENT_OUTPUT = eINSTANCE.getComponentOutput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.PortImpl
		 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DEPTH = eINSTANCE.getPort_Depth();

	}

} //WorkflowPackage

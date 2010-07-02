/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workflow;

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
 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowFactory
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
	String eNS_URI = "http://workflow/1.0";

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
	WorkflowPackage eINSTANCE = uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__FAMILY = 3;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ACTIVITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_DEFINITION = 5;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.Receiver <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Receiver
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 1;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__SENDERS = 0;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.Sender <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Sender
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 2;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__RECEIVERS = 0;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowInputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowInputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getWorkflowInput()
	 * @generated
	 */
	int WORKFLOW_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__RECEIVERS = SENDER__RECEIVERS;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__SENDERS = SENDER_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getWorkflow()
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
	 * The feature id for the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__COMPONENT_DEFINITION = 4;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowOutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowOutputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getWorkflowOutput()
	 * @generated
	 */
	int WORKFLOW_OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__SENDERS = RECEIVER__SENDERS;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__RECEIVERS = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__NAME = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__DEPTH = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.PortImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getPort()
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
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceInputImpl <em>Component Instance Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceInputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentInstanceInput()
	 * @generated
	 */
	int COMPONENT_INSTANCE_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_INPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_INPUT__DEPTH = PORT__DEPTH;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_INPUT__SENDERS = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Instance Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_INPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceOutputImpl <em>Component Instance Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceOutputImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentInstanceOutput()
	 * @generated
	 */
	int COMPONENT_INSTANCE_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT__DEPTH = PORT__DEPTH;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT__RECEIVERS = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT__SENDERS = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Instance Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentDefinitionReferenceImpl <em>Component Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentDefinitionReferenceImpl
	 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentDefinitionReference()
	 * @generated
	 */
	int COMPONENT_DEFINITION_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Component Definition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID = 0;

	/**
	 * The feature id for the '<em><b>Discovery Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL = 1;

	/**
	 * The number of structural features of the '<em>Component Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEFINITION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getInputs()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getOutputs()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getFamily()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Family();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getActivityType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_ActivityType();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance#getComponentDefinition()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentDefinition();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.tng.mockup3.models.workflow.Receiver#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Senders</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Receiver#getSenders()
	 * @see #getReceiver()
	 * @generated
	 */
	EReference getReceiver_Senders();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.tng.mockup3.models.workflow.Sender#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receivers</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Sender#getReceivers()
	 * @see #getSender()
	 * @generated
	 */
	EReference getSender_Receivers();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.WorkflowInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowInput
	 * @generated
	 */
	EClass getWorkflowInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workflow.Workflow#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Workflow#getComponents()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workflow.Workflow#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Workflow#getInputs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.tng.mockup3.models.workflow.Workflow#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Workflow#getOutputs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.tng.mockup3.models.workflow.Workflow#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Workflow#getComponentDefinition()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ComponentDefinition();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.WorkflowOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.WorkflowOutput
	 * @generated
	 */
	EClass getWorkflowOutput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstanceInput <em>Component Instance Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Input</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstanceInput
	 * @generated
	 */
	EClass getComponentInstanceInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentInstanceOutput <em>Component Instance Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Output</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentInstanceOutput
	 * @generated
	 */
	EClass getComponentInstanceOutput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.Port#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.Port#getDepth()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Depth();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference <em>Component Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition Reference</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference
	 * @generated
	 */
	EClass getComponentDefinitionReference();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getComponentDefinitionId <em>Component Definition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Definition Id</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getComponentDefinitionId()
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	EAttribute getComponentDefinitionReference_ComponentDefinitionId();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getDiscoveryUrl <em>Discovery Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Url</em>'.
	 * @see uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference#getDiscoveryUrl()
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	EAttribute getComponentDefinitionReference_DiscoveryUrl();

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
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__INPUTS = eINSTANCE.getComponentInstance_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__OUTPUTS = eINSTANCE.getComponentInstance_Outputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__FAMILY = eINSTANCE.getComponentInstance_Family();

		/**
		 * The meta object literal for the '<em><b>Activity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__ACTIVITY_TYPE = eINSTANCE.getComponentInstance_ActivityType();

		/**
		 * The meta object literal for the '<em><b>Component Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_DEFINITION = eINSTANCE.getComponentInstance_ComponentDefinition();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.Receiver <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.Receiver
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '<em><b>Senders</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVER__SENDERS = eINSTANCE.getReceiver_Senders();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.Sender <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.Sender
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER__RECEIVERS = eINSTANCE.getSender_Receivers();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowInputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowInputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getWorkflowInput()
		 * @generated
		 */
		EClass WORKFLOW_INPUT = eINSTANCE.getWorkflowInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getWorkflow()
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
		 * The meta object literal for the '<em><b>Component Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__COMPONENT_DEFINITION = eINSTANCE.getWorkflow_ComponentDefinition();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowOutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowOutputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getWorkflowOutput()
		 * @generated
		 */
		EClass WORKFLOW_OUTPUT = eINSTANCE.getWorkflowOutput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceInputImpl <em>Component Instance Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceInputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentInstanceInput()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_INPUT = eINSTANCE.getComponentInstanceInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceOutputImpl <em>Component Instance Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceOutputImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentInstanceOutput()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_OUTPUT = eINSTANCE.getComponentInstanceOutput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.PortImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getPort()
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

		/**
		 * The meta object literal for the '{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentDefinitionReferenceImpl <em>Component Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentDefinitionReferenceImpl
		 * @see uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowPackageImpl#getComponentDefinitionReference()
		 * @generated
		 */
		EClass COMPONENT_DEFINITION_REFERENCE = eINSTANCE.getComponentDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Component Definition Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID = eINSTANCE.getComponentDefinitionReference_ComponentDefinitionId();

		/**
		 * The meta object literal for the '<em><b>Discovery Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL = eINSTANCE.getComponentDefinitionReference_DiscoveryUrl();

	}

} //WorkflowPackage

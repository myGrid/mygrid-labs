/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;

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
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory
 * @model kind="package"
 * @generated
 */
public interface CanvasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "canvas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.taverna.org.uk/2010/t3/workbench/canvas/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "canvas";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanvasPackage eINSTANCE = uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ACTIVITY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INPUTS = 4;

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
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 1;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Sender <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Sender
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 2;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
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
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowInputImpl <em>Workflow Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowInputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getWorkflowInput()
	 * @generated
	 */
	int WORKFLOW_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__RECEIVERS = SENDER__RECEIVERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__NAME = SENDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__DEPTH = SENDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT_FEATURE_COUNT = SENDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowOutputImpl <em>Workflow Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowOutputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getWorkflowOutput()
	 * @generated
	 */
	int WORKFLOW_OUTPUT = 4;

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
	 * The number of structural features of the '<em>Workflow Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.PortImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 7;

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
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceInputImpl <em>Component Instance Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceInputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInstanceInput()
	 * @generated
	 */
	int COMPONENT_INSTANCE_INPUT = 5;

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
	 * The number of structural features of the '<em>Component Instance Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_INPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceOutputImpl <em>Component Instance Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceOutputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInstanceOutput()
	 * @generated
	 */
	int COMPONENT_INSTANCE_OUTPUT = 6;

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
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT__RECEIVERS = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT__EREFERENCE0 = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Instance Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OUTPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentDefinitionReferenceImpl <em>Component Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentDefinitionReferenceImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentDefinitionReference()
	 * @generated
	 */
	int COMPONENT_DEFINITION_REFERENCE = 8;

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
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasImpl <em>Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 9;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__NODES = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__OUTPUTS = 2;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.NodeImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 10;

	/**
	 * The feature id for the '<em><b>Helper Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HELPER_COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Core Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CORE_COMPONENTS = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CoreComponentInstanceImpl <em>Core Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CoreComponentInstanceImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getCoreComponentInstance()
	 * @generated
	 */
	int CORE_COMPONENT_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPONENT_INSTANCE__FAMILY = COMPONENT_INSTANCE__FAMILY;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPONENT_INSTANCE__ACTIVITY_TYPE = COMPONENT_INSTANCE__ACTIVITY_TYPE;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPONENT_INSTANCE__OUTPUTS = COMPONENT_INSTANCE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPONENT_INSTANCE__INPUTS = COMPONENT_INSTANCE__INPUTS;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPONENT_INSTANCE__COMPONENT_DEFINITION = COMPONENT_INSTANCE__COMPONENT_DEFINITION;

	/**
	 * The number of structural features of the '<em>Core Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.HelperComponentInstanceImpl <em>Helper Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.HelperComponentInstanceImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getHelperComponentInstance()
	 * @generated
	 */
	int HELPER_COMPONENT_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_COMPONENT_INSTANCE__FAMILY = COMPONENT_INSTANCE__FAMILY;

	/**
	 * The feature id for the '<em><b>Activity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_COMPONENT_INSTANCE__ACTIVITY_TYPE = COMPONENT_INSTANCE__ACTIVITY_TYPE;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_COMPONENT_INSTANCE__OUTPUTS = COMPONENT_INSTANCE__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_COMPONENT_INSTANCE__INPUTS = COMPONENT_INSTANCE__INPUTS;

	/**
	 * The feature id for the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_COMPONENT_INSTANCE__COMPONENT_DEFINITION = COMPONENT_INSTANCE__COMPONENT_DEFINITION;

	/**
	 * The number of structural features of the '<em>Helper Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getFamily()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Family();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Type</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getActivityType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_ActivityType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getOutputs()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getInputs()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Inputs();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Definition</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance#getComponentDefinition()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentDefinition();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for the reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Sender#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receivers</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Sender#getReceivers()
	 * @see #getSender()
	 * @generated
	 */
	EReference getSender_Receivers();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput <em>Workflow Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Input</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput
	 * @generated
	 */
	EClass getWorkflowInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput <em>Workflow Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Output</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput
	 * @generated
	 */
	EClass getWorkflowOutput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceInput <em>Component Instance Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Input</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceInput
	 * @generated
	 */
	EClass getComponentInstanceInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput <em>Component Instance Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Output</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput
	 * @generated
	 */
	EClass getComponentInstanceOutput();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput#getEReference0()
	 * @see #getComponentInstanceOutput()
	 * @generated
	 */
	EReference getComponentInstanceOutput_EReference0();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Port#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Port#getDepth()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Depth();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference <em>Component Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Definition Reference</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference
	 * @generated
	 */
	EClass getComponentDefinitionReference();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference#getComponentDefinitionId <em>Component Definition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Definition Id</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference#getComponentDefinitionId()
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	EAttribute getComponentDefinitionReference_ComponentDefinitionId();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference#getDiscoveryUrl <em>Discovery Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discovery Url</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference#getDiscoveryUrl()
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	EAttribute getComponentDefinitionReference_DiscoveryUrl();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canvas</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas
	 * @generated
	 */
	EClass getCanvas();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getNodes()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getInputs()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getOutputs()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Outputs();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Node#getHelperComponents <em>Helper Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Components</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Node#getHelperComponents()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_HelperComponents();

	/**
	 * Returns the meta object for the containment reference '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Node#getCoreComponents <em>Core Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core Components</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Node#getCoreComponents()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_CoreComponents();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.CoreComponentInstance <em>Core Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Component Instance</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CoreComponentInstance
	 * @generated
	 */
	EClass getCoreComponentInstance();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.HelperComponentInstance <em>Helper Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Component Instance</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.HelperComponentInstance
	 * @generated
	 */
	EClass getHelperComponentInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CanvasFactory getCanvasFactory();

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
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

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
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__OUTPUTS = eINSTANCE.getComponentInstance_Outputs();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__INPUTS = eINSTANCE.getComponentInstance_Inputs();

		/**
		 * The meta object literal for the '<em><b>Component Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_DEFINITION = eINSTANCE.getComponentInstance_ComponentDefinition();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Sender <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Sender
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENDER__RECEIVERS = eINSTANCE.getSender_Receivers();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowInputImpl <em>Workflow Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowInputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getWorkflowInput()
		 * @generated
		 */
		EClass WORKFLOW_INPUT = eINSTANCE.getWorkflowInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowOutputImpl <em>Workflow Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowOutputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getWorkflowOutput()
		 * @generated
		 */
		EClass WORKFLOW_OUTPUT = eINSTANCE.getWorkflowOutput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceInputImpl <em>Component Instance Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceInputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInstanceInput()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_INPUT = eINSTANCE.getComponentInstanceInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceOutputImpl <em>Component Instance Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInstanceOutputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInstanceOutput()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_OUTPUT = eINSTANCE.getComponentInstanceOutput();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE_OUTPUT__EREFERENCE0 = eINSTANCE.getComponentInstanceOutput_EReference0();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.PortImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getPort()
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
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentDefinitionReferenceImpl <em>Component Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentDefinitionReferenceImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentDefinitionReference()
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

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasImpl <em>Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getCanvas()
		 * @generated
		 */
		EClass CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__NODES = eINSTANCE.getCanvas_Nodes();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__INPUTS = eINSTANCE.getCanvas_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__OUTPUTS = eINSTANCE.getCanvas_Outputs();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.NodeImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Helper Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HELPER_COMPONENTS = eINSTANCE.getNode_HelperComponents();

		/**
		 * The meta object literal for the '<em><b>Core Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CORE_COMPONENTS = eINSTANCE.getNode_CoreComponents();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CoreComponentInstanceImpl <em>Core Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CoreComponentInstanceImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getCoreComponentInstance()
		 * @generated
		 */
		EClass CORE_COMPONENT_INSTANCE = eINSTANCE.getCoreComponentInstance();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.HelperComponentInstanceImpl <em>Helper Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.HelperComponentInstanceImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getHelperComponentInstance()
		 * @generated
		 */
		EClass HELPER_COMPONENT_INSTANCE = eINSTANCE.getHelperComponentInstance();

	}

} //CanvasPackage

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
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 0;

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
	int SENDER = 1;

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
	int WORKFLOW_INPUT = 2;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__LABEL = SENDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT__DEPTH = SENDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_INPUT_FEATURE_COUNT = SENDER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowOutputImpl <em>Workflow Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.WorkflowOutputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getWorkflowOutput()
	 * @generated
	 */
	int WORKFLOW_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__NAME = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__LABEL = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT__DEPTH = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OUTPUT_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Port <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Port
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DEPTH = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentDefinitionReferenceImpl <em>Component Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentDefinitionReferenceImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentDefinitionReference()
	 * @generated
	 */
	int COMPONENT_DEFINITION_REFERENCE = 5;

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
	int CANVAS = 6;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS__COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANVAS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROCESSORS = 2;

	/**
	 * The feature id for the '<em><b>Component Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Component Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_INPUTS = 4;

	/**
	 * The feature id for the '<em><b>Original Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ORIGINAL_COMPONENT_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Configuration Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONFIGURATION_PROPERTIES = 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Processor Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROCESSOR_OUTPUTS = 1;

	/**
	 * The feature id for the '<em><b>Processor Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROCESSOR_INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Activitiy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__ACTIVITIY = 5;

	/**
	 * The feature id for the '<em><b>Configuration Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CONFIGURATION_PROPERTIES = 6;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorInputImpl <em>Processor Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorInputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getProcessorInput()
	 * @generated
	 */
	int PROCESSOR_INPUT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INPUT__NAME = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INPUT__LABEL = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INPUT__DEPTH = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Processor Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_INPUT_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl <em>Processor Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getProcessorOutput()
	 * @generated
	 */
	int PROCESSOR_OUTPUT = 10;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OUTPUT__RECEIVERS = SENDER__RECEIVERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OUTPUT__NAME = SENDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OUTPUT__LABEL = SENDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OUTPUT__DEPTH = SENDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Granular Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OUTPUT__GRANULAR_DEPTH = SENDER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Processor Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OUTPUT_FEATURE_COUNT = SENDER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInputImpl <em>Component Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInput()
	 * @generated
	 */
	int COMPONENT_INPUT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT__LABEL = PORT__LABEL;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT__DEPTH = PORT__DEPTH;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT__RECEIVERS = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentOutputImpl <em>Component Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentOutputImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentOutput()
	 * @generated
	 */
	int COMPONENT_OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT__LABEL = PORT__LABEL;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT__DEPTH = PORT__DEPTH;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT__RECEIVERS = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OUTPUT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl <em>Configuration Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getConfigurationProperty()
	 * @generated
	 */
	int CONFIGURATION_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__PREDICATE = 0;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__FIELD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__LABEL = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__VALUE = 6;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__FIXED = 7;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__HIDDEN = 8;

	/**
	 * The feature id for the '<em><b>Constrained To Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS = 9;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__OPTIONS = 10;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY__EXAMPLES = 11;

	/**
	 * The number of structural features of the '<em>Configuration Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyOptionImpl <em>Configuration Property Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyOptionImpl
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getConfigurationPropertyOption()
	 * @generated
	 */
	int CONFIGURATION_PROPERTY_OPTION = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_OPTION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Configuration Property Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_OPTION_FEATURE_COUNT = 2;

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
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Port#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Port#getLabel()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Label();

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
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas#getComponents()
	 * @see #getCanvas()
	 * @generated
	 */
	EReference getCanvas_Components();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getTitle()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Title();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getLabel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processors</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getProcessors()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Processors();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getComponentOutputs <em>Component Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Outputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getComponentOutputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getComponentInputs <em>Component Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Inputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getComponentInputs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentInputs();

	/**
	 * Returns the meta object for the reference '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getOriginalComponentDefinition <em>Original Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Component Definition</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getOriginalComponentDefinition()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OriginalComponentDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getConfigurationProperties <em>Configuration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Properties</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component#getConfigurationProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ConfigurationProperties();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getType()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getProcessorOutputs <em>Processor Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor Outputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getProcessorOutputs()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_ProcessorOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getProcessorInputs <em>Processor Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor Inputs</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getProcessorInputs()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_ProcessorInputs();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getLabel()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Label();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getActivitiy <em>Activitiy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activitiy</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getActivitiy()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Activitiy();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getConfigurationProperties <em>Configuration Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Properties</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getConfigurationProperties()
	 * @see #getProcessor()
	 * @generated
	 */
	EReference getProcessor_ConfigurationProperties();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput <em>Processor Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Input</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput
	 * @generated
	 */
	EClass getProcessorInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput <em>Processor Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor Output</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput
	 * @generated
	 */
	EClass getProcessorOutput();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput#getGranularDepth <em>Granular Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granular Depth</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput#getGranularDepth()
	 * @see #getProcessorOutput()
	 * @generated
	 */
	EAttribute getProcessorOutput_GranularDepth();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput <em>Component Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Input</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput
	 * @generated
	 */
	EClass getComponentInput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput <em>Component Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Output</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput
	 * @generated
	 */
	EClass getComponentOutput();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty <em>Configuration Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Property</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty
	 * @generated
	 */
	EClass getConfigurationProperty();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getPredicate()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Predicate();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Type</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getFieldType()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_FieldType();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDataType()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_DataType();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getName()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getLabel()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Label();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getDescription()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getValue()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isFixed()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Fixed();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isHidden()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isConstrainedToOptions <em>Constrained To Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrained To Options</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#isConstrainedToOptions()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_ConstrainedToOptions();

	/**
	 * Returns the meta object for the containment reference '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getOptions()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EReference getConfigurationProperty_Options();

	/**
	 * Returns the meta object for the attribute list '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Examples</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty#getExamples()
	 * @see #getConfigurationProperty()
	 * @generated
	 */
	EAttribute getConfigurationProperty_Examples();

	/**
	 * Returns the meta object for class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyOption <em>Configuration Property Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Property Option</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyOption
	 * @generated
	 */
	EClass getConfigurationPropertyOption();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyOption#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyOption#getLabel()
	 * @see #getConfigurationPropertyOption()
	 * @generated
	 */
	EAttribute getConfigurationPropertyOption_Label();

	/**
	 * Returns the meta object for the attribute '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyOption#getValue()
	 * @see #getConfigurationPropertyOption()
	 * @generated
	 */
	EAttribute getConfigurationPropertyOption_Value();

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
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Port <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Port
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
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__LABEL = eINSTANCE.getPort_Label();

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
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANVAS__COMPONENTS = eINSTANCE.getCanvas_Components();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TITLE = eINSTANCE.getComponent_Title();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__LABEL = eINSTANCE.getComponent_Label();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROCESSORS = eINSTANCE.getComponent_Processors();

		/**
		 * The meta object literal for the '<em><b>Component Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_OUTPUTS = eINSTANCE.getComponent_ComponentOutputs();

		/**
		 * The meta object literal for the '<em><b>Component Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_INPUTS = eINSTANCE.getComponent_ComponentInputs();

		/**
		 * The meta object literal for the '<em><b>Original Component Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ORIGINAL_COMPONENT_DEFINITION = eINSTANCE.getComponent_OriginalComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Configuration Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONFIGURATION_PROPERTIES = eINSTANCE.getComponent_ConfigurationProperties();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__TYPE = eINSTANCE.getProcessor_Type();

		/**
		 * The meta object literal for the '<em><b>Processor Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__PROCESSOR_OUTPUTS = eINSTANCE.getProcessor_ProcessorOutputs();

		/**
		 * The meta object literal for the '<em><b>Processor Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__PROCESSOR_INPUTS = eINSTANCE.getProcessor_ProcessorInputs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__LABEL = eINSTANCE.getProcessor_Label();

		/**
		 * The meta object literal for the '<em><b>Activitiy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__ACTIVITIY = eINSTANCE.getProcessor_Activitiy();

		/**
		 * The meta object literal for the '<em><b>Configuration Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSOR__CONFIGURATION_PROPERTIES = eINSTANCE.getProcessor_ConfigurationProperties();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorInputImpl <em>Processor Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorInputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getProcessorInput()
		 * @generated
		 */
		EClass PROCESSOR_INPUT = eINSTANCE.getProcessorInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl <em>Processor Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getProcessorOutput()
		 * @generated
		 */
		EClass PROCESSOR_OUTPUT = eINSTANCE.getProcessorOutput();

		/**
		 * The meta object literal for the '<em><b>Granular Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR_OUTPUT__GRANULAR_DEPTH = eINSTANCE.getProcessorOutput_GranularDepth();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInputImpl <em>Component Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentInputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentInput()
		 * @generated
		 */
		EClass COMPONENT_INPUT = eINSTANCE.getComponentInput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentOutputImpl <em>Component Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentOutputImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getComponentOutput()
		 * @generated
		 */
		EClass COMPONENT_OUTPUT = eINSTANCE.getComponentOutput();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl <em>Configuration Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getConfigurationProperty()
		 * @generated
		 */
		EClass CONFIGURATION_PROPERTY = eINSTANCE.getConfigurationProperty();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__PREDICATE = eINSTANCE.getConfigurationProperty_Predicate();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__FIELD_TYPE = eINSTANCE.getConfigurationProperty_FieldType();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__DATA_TYPE = eINSTANCE.getConfigurationProperty_DataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__NAME = eINSTANCE.getConfigurationProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__LABEL = eINSTANCE.getConfigurationProperty_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__DESCRIPTION = eINSTANCE.getConfigurationProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__VALUE = eINSTANCE.getConfigurationProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__FIXED = eINSTANCE.getConfigurationProperty_Fixed();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__HIDDEN = eINSTANCE.getConfigurationProperty_Hidden();

		/**
		 * The meta object literal for the '<em><b>Constrained To Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS = eINSTANCE.getConfigurationProperty_ConstrainedToOptions();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_PROPERTY__OPTIONS = eINSTANCE.getConfigurationProperty_Options();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY__EXAMPLES = eINSTANCE.getConfigurationProperty_Examples();

		/**
		 * The meta object literal for the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyOptionImpl <em>Configuration Property Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyOptionImpl
		 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasPackageImpl#getConfigurationPropertyOption()
		 * @generated
		 */
		EClass CONFIGURATION_PROPERTY_OPTION = eINSTANCE.getConfigurationPropertyOption();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY_OPTION__LABEL = eINSTANCE.getConfigurationPropertyOption_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PROPERTY_OPTION__VALUE = eINSTANCE.getConfigurationPropertyOption_Value();

	}

} //CanvasPackage

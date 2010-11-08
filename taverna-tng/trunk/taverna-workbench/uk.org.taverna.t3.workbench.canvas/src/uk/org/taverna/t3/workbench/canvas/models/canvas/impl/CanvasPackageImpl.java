/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CoreComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.HelperComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Node;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Port;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Sender;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasPackageImpl extends EPackageImpl implements CanvasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefinitionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canvasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperComponentInstanceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CanvasPackageImpl() {
		super(eNS_URI, CanvasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CanvasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CanvasPackage init() {
		if (isInited) return (CanvasPackage)EPackage.Registry.INSTANCE.getEPackage(CanvasPackage.eNS_URI);

		// Obtain or create and register package
		CanvasPackageImpl theCanvasPackage = (CanvasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CanvasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CanvasPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCanvasPackage.createPackageContents();

		// Initialize created meta-data
		theCanvasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCanvasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CanvasPackage.eNS_URI, theCanvasPackage);
		return theCanvasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_Name() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_Family() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_ActivityType() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Outputs() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Inputs() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_ComponentDefinition() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSender() {
		return senderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSender_Receivers() {
		return (EReference)senderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowInput() {
		return workflowInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowOutput() {
		return workflowOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstanceInput() {
		return componentInstanceInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstanceOutput() {
		return componentInstanceOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstanceOutput_EReference0() {
		return (EReference)componentInstanceOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Depth() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDefinitionReference() {
		return componentDefinitionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDefinitionReference_ComponentDefinitionId() {
		return (EAttribute)componentDefinitionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDefinitionReference_DiscoveryUrl() {
		return (EAttribute)componentDefinitionReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCanvas() {
		return canvasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvas_Nodes() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvas_Inputs() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvas_Outputs() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_HelperComponents() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_CoreComponents() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreComponentInstance() {
		return coreComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperComponentInstance() {
		return helperComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasFactory getCanvasFactory() {
		return (CanvasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__NAME);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__FAMILY);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__ACTIVITY_TYPE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__OUTPUTS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__INPUTS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT_DEFINITION);

		receiverEClass = createEClass(RECEIVER);

		senderEClass = createEClass(SENDER);
		createEReference(senderEClass, SENDER__RECEIVERS);

		workflowInputEClass = createEClass(WORKFLOW_INPUT);

		workflowOutputEClass = createEClass(WORKFLOW_OUTPUT);

		componentInstanceInputEClass = createEClass(COMPONENT_INSTANCE_INPUT);

		componentInstanceOutputEClass = createEClass(COMPONENT_INSTANCE_OUTPUT);
		createEReference(componentInstanceOutputEClass, COMPONENT_INSTANCE_OUTPUT__EREFERENCE0);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__DEPTH);

		componentDefinitionReferenceEClass = createEClass(COMPONENT_DEFINITION_REFERENCE);
		createEAttribute(componentDefinitionReferenceEClass, COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID);
		createEAttribute(componentDefinitionReferenceEClass, COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL);

		canvasEClass = createEClass(CANVAS);
		createEReference(canvasEClass, CANVAS__NODES);
		createEReference(canvasEClass, CANVAS__INPUTS);
		createEReference(canvasEClass, CANVAS__OUTPUTS);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__HELPER_COMPONENTS);
		createEReference(nodeEClass, NODE__CORE_COMPONENTS);

		coreComponentInstanceEClass = createEClass(CORE_COMPONENT_INSTANCE);

		helperComponentInstanceEClass = createEClass(HELPER_COMPONENT_INSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workflowInputEClass.getESuperTypes().add(this.getSender());
		workflowInputEClass.getESuperTypes().add(this.getPort());
		workflowOutputEClass.getESuperTypes().add(this.getReceiver());
		workflowOutputEClass.getESuperTypes().add(this.getPort());
		componentInstanceInputEClass.getESuperTypes().add(this.getPort());
		componentInstanceInputEClass.getESuperTypes().add(this.getReceiver());
		componentInstanceOutputEClass.getESuperTypes().add(this.getPort());
		componentInstanceOutputEClass.getESuperTypes().add(this.getSender());
		coreComponentInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		helperComponentInstanceEClass.getESuperTypes().add(this.getComponentInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_Family(), ecorePackage.getEString(), "family", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_ActivityType(), ecorePackage.getEString(), "activityType", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Outputs(), this.getComponentInstanceOutput(), null, "outputs", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Inputs(), this.getComponentInstanceInput(), null, "inputs", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_ComponentDefinition(), this.getComponentDefinitionReference(), null, "componentDefinition", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiverEClass, Receiver.class, "Receiver", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senderEClass, Sender.class, "Sender", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSender_Receivers(), this.getReceiver(), null, "receivers", null, 0, -1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowInputEClass, WorkflowInput.class, "WorkflowInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowOutputEClass, WorkflowOutput.class, "WorkflowOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInstanceInputEClass, ComponentInstanceInput.class, "ComponentInstanceInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInstanceOutputEClass, ComponentInstanceOutput.class, "ComponentInstanceOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstanceOutput_EReference0(), this.getComponentInstance(), null, "EReference0", null, 0, 1, ComponentInstanceOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Depth(), ecorePackage.getEInt(), "depth", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDefinitionReferenceEClass, ComponentDefinitionReference.class, "ComponentDefinitionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentDefinitionReference_ComponentDefinitionId(), ecorePackage.getEString(), "componentDefinitionId", null, 0, 1, ComponentDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDefinitionReference_DiscoveryUrl(), ecorePackage.getEString(), "discoveryUrl", null, 0, 1, ComponentDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvas_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvas_Inputs(), this.getWorkflowInput(), null, "inputs", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvas_Outputs(), this.getWorkflowOutput(), null, "outputs", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_HelperComponents(), this.getHelperComponentInstance(), null, "helperComponents", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_CoreComponents(), this.getCoreComponentInstance(), null, "coreComponents", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreComponentInstanceEClass, CoreComponentInstance.class, "CoreComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helperComponentInstanceEClass, HelperComponentInstance.class, "HelperComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CanvasPackageImpl

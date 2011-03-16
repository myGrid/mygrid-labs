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
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyComplex;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteralOption;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CrossProduct;
import uk.org.taverna.t3.workbench.canvas.models.canvas.DotProduct;
import uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyNode;
import uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode;
import uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyStack;
import uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyTopNode;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CoreComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.HelperComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Node;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Port;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
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
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyLiteralOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyComplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationStrategyStackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationStrategyTopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationStrategyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterationStrategyPortNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotProductEClass = null;

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
	public EAttribute getPort_Label() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Depth() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
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
	public EReference getCanvas_Inputs() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvas_Outputs() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCanvas_Components() {
		return (EReference)canvasEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Title() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Label() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Processors() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ComponentOutputs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ComponentInputs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OriginalComponentDefinition() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ConfigurationProperties() {
		return (EReference)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Type() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_ProcessorOutputs() {
		return (EReference)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_ProcessorInputs() {
		return (EReference)processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Name() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Label() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Activitiy() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_ConfigurationProperties() {
		return (EReference)processorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessor_IterationStrategyStack() {
		return (EReference)processorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorInput() {
		return processorInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessorOutput() {
		return processorOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessorOutput_GranularDepth() {
		return (EAttribute)processorOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInput() {
		return componentInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOutput() {
		return componentOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationProperty() {
		return configurationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Predicate() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Name() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Label() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Description() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Required() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Fixed() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Hidden() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_ConstrainedToOptions() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPropertyLiteralOption() {
		return configurationPropertyLiteralOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPropertyLiteralOption_Label() {
		return (EAttribute)configurationPropertyLiteralOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPropertyLiteralOption_Value() {
		return (EAttribute)configurationPropertyLiteralOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPropertyLiteral() {
		return configurationPropertyLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPropertyLiteral_FieldType() {
		return (EAttribute)configurationPropertyLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPropertyLiteral_DataType() {
		return (EAttribute)configurationPropertyLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPropertyLiteral_Value() {
		return (EAttribute)configurationPropertyLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationPropertyLiteral_Options() {
		return (EReference)configurationPropertyLiteralEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPropertyReference() {
		return configurationPropertyReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPropertyReference_Uri() {
		return (EAttribute)configurationPropertyReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPropertyComplex() {
		return configurationPropertyComplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationPropertyComplex_Properties() {
		return (EReference)configurationPropertyComplexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationStrategyStack() {
		return iterationStrategyStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterationStrategyStack_Strategies() {
		return (EReference)iterationStrategyStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationStrategyTopNode() {
		return iterationStrategyTopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationStrategyNode() {
		return iterationStrategyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterationStrategyPortNode() {
		return iterationStrategyPortNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIterationStrategyPortNode_DesiredDepth() {
		return (EAttribute)iterationStrategyPortNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterationStrategyPortNode_Port() {
		return (EReference)iterationStrategyPortNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossProduct() {
		return crossProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrossProduct_Nodes() {
		return (EReference)crossProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotProduct() {
		return dotProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotProduct_Nodes() {
		return (EReference)dotProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationProperty_Examples() {
		return (EAttribute)configurationPropertyEClass.getEStructuralFeatures().get(7);
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
		receiverEClass = createEClass(RECEIVER);

		senderEClass = createEClass(SENDER);
		createEReference(senderEClass, SENDER__RECEIVERS);

		workflowInputEClass = createEClass(WORKFLOW_INPUT);

		workflowOutputEClass = createEClass(WORKFLOW_OUTPUT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEAttribute(portEClass, PORT__LABEL);
		createEAttribute(portEClass, PORT__DEPTH);

		componentDefinitionReferenceEClass = createEClass(COMPONENT_DEFINITION_REFERENCE);
		createEAttribute(componentDefinitionReferenceEClass, COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID);
		createEAttribute(componentDefinitionReferenceEClass, COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL);

		canvasEClass = createEClass(CANVAS);
		createEReference(canvasEClass, CANVAS__INPUTS);
		createEReference(canvasEClass, CANVAS__OUTPUTS);
		createEReference(canvasEClass, CANVAS__COMPONENTS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__TITLE);
		createEAttribute(componentEClass, COMPONENT__LABEL);
		createEReference(componentEClass, COMPONENT__PROCESSORS);
		createEReference(componentEClass, COMPONENT__COMPONENT_OUTPUTS);
		createEReference(componentEClass, COMPONENT__COMPONENT_INPUTS);
		createEReference(componentEClass, COMPONENT__ORIGINAL_COMPONENT_DEFINITION);
		createEReference(componentEClass, COMPONENT__CONFIGURATION_PROPERTIES);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__TYPE);
		createEReference(processorEClass, PROCESSOR__PROCESSOR_OUTPUTS);
		createEReference(processorEClass, PROCESSOR__PROCESSOR_INPUTS);
		createEAttribute(processorEClass, PROCESSOR__NAME);
		createEAttribute(processorEClass, PROCESSOR__LABEL);
		createEAttribute(processorEClass, PROCESSOR__ACTIVITIY);
		createEReference(processorEClass, PROCESSOR__CONFIGURATION_PROPERTIES);
		createEReference(processorEClass, PROCESSOR__ITERATION_STRATEGY_STACK);

		processorInputEClass = createEClass(PROCESSOR_INPUT);

		processorOutputEClass = createEClass(PROCESSOR_OUTPUT);
		createEAttribute(processorOutputEClass, PROCESSOR_OUTPUT__GRANULAR_DEPTH);

		componentInputEClass = createEClass(COMPONENT_INPUT);

		componentOutputEClass = createEClass(COMPONENT_OUTPUT);

		configurationPropertyEClass = createEClass(CONFIGURATION_PROPERTY);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__PREDICATE);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__NAME);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__LABEL);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__DESCRIPTION);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__REQUIRED);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__FIXED);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__HIDDEN);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__EXAMPLES);
		createEAttribute(configurationPropertyEClass, CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS);

		configurationPropertyLiteralEClass = createEClass(CONFIGURATION_PROPERTY_LITERAL);
		createEAttribute(configurationPropertyLiteralEClass, CONFIGURATION_PROPERTY_LITERAL__FIELD_TYPE);
		createEAttribute(configurationPropertyLiteralEClass, CONFIGURATION_PROPERTY_LITERAL__DATA_TYPE);
		createEAttribute(configurationPropertyLiteralEClass, CONFIGURATION_PROPERTY_LITERAL__VALUE);
		createEReference(configurationPropertyLiteralEClass, CONFIGURATION_PROPERTY_LITERAL__OPTIONS);

		configurationPropertyLiteralOptionEClass = createEClass(CONFIGURATION_PROPERTY_LITERAL_OPTION);
		createEAttribute(configurationPropertyLiteralOptionEClass, CONFIGURATION_PROPERTY_LITERAL_OPTION__LABEL);
		createEAttribute(configurationPropertyLiteralOptionEClass, CONFIGURATION_PROPERTY_LITERAL_OPTION__VALUE);

		configurationPropertyReferenceEClass = createEClass(CONFIGURATION_PROPERTY_REFERENCE);
		createEAttribute(configurationPropertyReferenceEClass, CONFIGURATION_PROPERTY_REFERENCE__URI);

		configurationPropertyComplexEClass = createEClass(CONFIGURATION_PROPERTY_COMPLEX);
		createEReference(configurationPropertyComplexEClass, CONFIGURATION_PROPERTY_COMPLEX__PROPERTIES);

		iterationStrategyStackEClass = createEClass(ITERATION_STRATEGY_STACK);
		createEReference(iterationStrategyStackEClass, ITERATION_STRATEGY_STACK__STRATEGIES);

		iterationStrategyTopNodeEClass = createEClass(ITERATION_STRATEGY_TOP_NODE);

		iterationStrategyNodeEClass = createEClass(ITERATION_STRATEGY_NODE);

		iterationStrategyPortNodeEClass = createEClass(ITERATION_STRATEGY_PORT_NODE);
		createEAttribute(iterationStrategyPortNodeEClass, ITERATION_STRATEGY_PORT_NODE__DESIRED_DEPTH);
		createEReference(iterationStrategyPortNodeEClass, ITERATION_STRATEGY_PORT_NODE__PORT);

		crossProductEClass = createEClass(CROSS_PRODUCT);
		createEReference(crossProductEClass, CROSS_PRODUCT__NODES);

		dotProductEClass = createEClass(DOT_PRODUCT);
		createEReference(dotProductEClass, DOT_PRODUCT__NODES);
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
		processorInputEClass.getESuperTypes().add(this.getReceiver());
		processorInputEClass.getESuperTypes().add(this.getPort());
		processorOutputEClass.getESuperTypes().add(this.getSender());
		processorOutputEClass.getESuperTypes().add(this.getPort());
		componentInputEClass.getESuperTypes().add(this.getPort());
		componentInputEClass.getESuperTypes().add(this.getSender());
		componentInputEClass.getESuperTypes().add(this.getReceiver());
		componentOutputEClass.getESuperTypes().add(this.getPort());
		componentOutputEClass.getESuperTypes().add(this.getSender());
		componentOutputEClass.getESuperTypes().add(this.getReceiver());
		configurationPropertyLiteralEClass.getESuperTypes().add(this.getConfigurationProperty());
		configurationPropertyReferenceEClass.getESuperTypes().add(this.getConfigurationProperty());
		configurationPropertyComplexEClass.getESuperTypes().add(this.getConfigurationProperty());
		iterationStrategyTopNodeEClass.getESuperTypes().add(this.getIterationStrategyNode());
		iterationStrategyPortNodeEClass.getESuperTypes().add(this.getIterationStrategyNode());
		crossProductEClass.getESuperTypes().add(this.getIterationStrategyTopNode());
		dotProductEClass.getESuperTypes().add(this.getIterationStrategyTopNode());

		// Initialize classes and features; add operations and parameters
		initEClass(receiverEClass, Receiver.class, "Receiver", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senderEClass, Sender.class, "Sender", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSender_Receivers(), this.getReceiver(), null, "receivers", null, 0, -1, Sender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowInputEClass, WorkflowInput.class, "WorkflowInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowOutputEClass, WorkflowOutput.class, "WorkflowOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Label(), ecorePackage.getEString(), "label", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Depth(), ecorePackage.getEInt(), "depth", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDefinitionReferenceEClass, ComponentDefinitionReference.class, "ComponentDefinitionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentDefinitionReference_ComponentDefinitionId(), ecorePackage.getEString(), "componentDefinitionId", null, 0, 1, ComponentDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDefinitionReference_DiscoveryUrl(), ecorePackage.getEString(), "discoveryUrl", null, 0, 1, ComponentDefinitionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canvasEClass, Canvas.class, "Canvas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCanvas_Inputs(), this.getWorkflowInput(), null, "inputs", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvas_Outputs(), this.getWorkflowOutput(), null, "outputs", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCanvas_Components(), this.getComponent(), null, "components", null, 0, -1, Canvas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Title(), ecorePackage.getEString(), "title", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Label(), ecorePackage.getEString(), "label", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Processors(), this.getProcessor(), null, "processors", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ComponentOutputs(), this.getComponentOutput(), null, "componentOutputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ComponentInputs(), this.getComponentInput(), null, "componentInputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OriginalComponentDefinition(), this.getComponentDefinitionReference(), null, "originalComponentDefinition", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ConfigurationProperties(), this.getConfigurationProperty(), null, "configurationProperties", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(componentEClass, ecorePackage.getEBoolean(), "isCompound", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Type(), ecorePackage.getEString(), "type", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_ProcessorOutputs(), this.getProcessorOutput(), null, "processorOutputs", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_ProcessorInputs(), this.getProcessorInput(), null, "processorInputs", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Label(), ecorePackage.getEString(), "label", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Activitiy(), ecorePackage.getEString(), "activitiy", null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_ConfigurationProperties(), this.getConfigurationProperty(), null, "configurationProperties", null, 0, -1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessor_IterationStrategyStack(), this.getIterationStrategyStack(), null, "iterationStrategyStack", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorInputEClass, ProcessorInput.class, "ProcessorInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorOutputEClass, ProcessorOutput.class, "ProcessorOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessorOutput_GranularDepth(), ecorePackage.getEInt(), "granularDepth", null, 0, 1, ProcessorOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInputEClass, ComponentInput.class, "ComponentInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentOutputEClass, ComponentOutput.class, "ComponentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationPropertyEClass, ConfigurationProperty.class, "ConfigurationProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationProperty_Predicate(), ecorePackage.getEString(), "predicate", null, 1, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Label(), ecorePackage.getEString(), "label", null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Fixed(), ecorePackage.getEBoolean(), "fixed", null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_Examples(), ecorePackage.getEString(), "examples", null, 0, -1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationProperty_ConstrainedToOptions(), ecorePackage.getEBoolean(), "constrainedToOptions", null, 0, 1, ConfigurationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertyLiteralEClass, ConfigurationPropertyLiteral.class, "ConfigurationPropertyLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationPropertyLiteral_FieldType(), ecorePackage.getEString(), "fieldType", null, 0, 1, ConfigurationPropertyLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationPropertyLiteral_DataType(), ecorePackage.getEString(), "dataType", null, 1, 1, ConfigurationPropertyLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationPropertyLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConfigurationPropertyLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationPropertyLiteral_Options(), this.getConfigurationPropertyLiteralOption(), null, "options", null, 0, -1, ConfigurationPropertyLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertyLiteralOptionEClass, ConfigurationPropertyLiteralOption.class, "ConfigurationPropertyLiteralOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationPropertyLiteralOption_Label(), ecorePackage.getEString(), "label", null, 0, 1, ConfigurationPropertyLiteralOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationPropertyLiteralOption_Value(), ecorePackage.getEString(), "value", null, 1, 1, ConfigurationPropertyLiteralOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertyReferenceEClass, ConfigurationPropertyReference.class, "ConfigurationPropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationPropertyReference_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ConfigurationPropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPropertyComplexEClass, ConfigurationPropertyComplex.class, "ConfigurationPropertyComplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationPropertyComplex_Properties(), this.getConfigurationProperty(), null, "properties", null, 0, -1, ConfigurationPropertyComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterationStrategyStackEClass, IterationStrategyStack.class, "IterationStrategyStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIterationStrategyStack_Strategies(), this.getIterationStrategyTopNode(), null, "strategies", null, 1, -1, IterationStrategyStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iterationStrategyTopNodeEClass, IterationStrategyTopNode.class, "IterationStrategyTopNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationStrategyNodeEClass, IterationStrategyNode.class, "IterationStrategyNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iterationStrategyPortNodeEClass, IterationStrategyPortNode.class, "IterationStrategyPortNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIterationStrategyPortNode_DesiredDepth(), ecorePackage.getEInt(), "desiredDepth", null, 0, 1, IterationStrategyPortNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIterationStrategyPortNode_Port(), this.getProcessorInput(), null, "port", null, 1, 1, IterationStrategyPortNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossProductEClass, CrossProduct.class, "CrossProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrossProduct_Nodes(), this.getIterationStrategyNode(), null, "nodes", null, 1, -1, CrossProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotProductEClass, DotProduct.class, "DotProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDotProduct_Nodes(), this.getIterationStrategyNode(), null, "nodes", null, 1, -1, DotProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CanvasPackageImpl

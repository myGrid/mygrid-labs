/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.org.taverna.t3.workbench.canvas.models.canvas.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CanvasFactoryImpl extends EFactoryImpl implements CanvasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CanvasFactory init() {
		try {
			CanvasFactory theCanvasFactory = (CanvasFactory)EPackage.Registry.INSTANCE.getEFactory("http://ns.taverna.org.uk/2010/t3/workbench/canvas/1.0"); 
			if (theCanvasFactory != null) {
				return theCanvasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CanvasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CanvasPackage.WORKFLOW_INPUT: return createWorkflowInput();
			case CanvasPackage.WORKFLOW_OUTPUT: return createWorkflowOutput();
			case CanvasPackage.COMPONENT_DEFINITION_REFERENCE: return createComponentDefinitionReference();
			case CanvasPackage.CANVAS: return createCanvas();
			case CanvasPackage.COMPONENT: return createComponent();
			case CanvasPackage.PROCESSOR: return createProcessor();
			case CanvasPackage.PROCESSOR_INPUT: return createProcessorInput();
			case CanvasPackage.PROCESSOR_OUTPUT: return createProcessorOutput();
			case CanvasPackage.COMPONENT_INPUT: return createComponentInput();
			case CanvasPackage.COMPONENT_OUTPUT: return createComponentOutput();
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL: return createConfigurationPropertyLiteral();
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL_OPTION: return createConfigurationPropertyLiteralOption();
			case CanvasPackage.CONFIGURATION_PROPERTY_REFERENCE: return createConfigurationPropertyReference();
			case CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX: return createConfigurationPropertyComplex();
			case CanvasPackage.ITERATION_STRATEGY_STACK: return createIterationStrategyStack();
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE: return createIterationStrategyPortNode();
			case CanvasPackage.CROSS_PRODUCT: return createCrossProduct();
			case CanvasPackage.DOT_PRODUCT: return createDotProduct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowInput createWorkflowInput() {
		WorkflowInputImpl workflowInput = new WorkflowInputImpl();
		return workflowInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowOutput createWorkflowOutput() {
		WorkflowOutputImpl workflowOutput = new WorkflowOutputImpl();
		return workflowOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference createComponentDefinitionReference() {
		ComponentDefinitionReferenceImpl componentDefinitionReference = new ComponentDefinitionReferenceImpl();
		return componentDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas createCanvas() {
		CanvasImpl canvas = new CanvasImpl();
		return canvas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessor() {
		ProcessorImpl processor = new ProcessorImpl();
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorInput createProcessorInput() {
		ProcessorInputImpl processorInput = new ProcessorInputImpl();
		return processorInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorOutput createProcessorOutput() {
		ProcessorOutputImpl processorOutput = new ProcessorOutputImpl();
		return processorOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInput createComponentInput() {
		ComponentInputImpl componentInput = new ComponentInputImpl();
		return componentInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentOutput createComponentOutput() {
		ComponentOutputImpl componentOutput = new ComponentOutputImpl();
		return componentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPropertyLiteralOption createConfigurationPropertyLiteralOption() {
		ConfigurationPropertyLiteralOptionImpl configurationPropertyLiteralOption = new ConfigurationPropertyLiteralOptionImpl();
		return configurationPropertyLiteralOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPropertyLiteral createConfigurationPropertyLiteral() {
		ConfigurationPropertyLiteralImpl configurationPropertyLiteral = new ConfigurationPropertyLiteralImpl();
		return configurationPropertyLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPropertyReference createConfigurationPropertyReference() {
		ConfigurationPropertyReferenceImpl configurationPropertyReference = new ConfigurationPropertyReferenceImpl();
		return configurationPropertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPropertyComplex createConfigurationPropertyComplex() {
		ConfigurationPropertyComplexImpl configurationPropertyComplex = new ConfigurationPropertyComplexImpl();
		return configurationPropertyComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationStrategyStack createIterationStrategyStack() {
		IterationStrategyStackImpl iterationStrategyStack = new IterationStrategyStackImpl();
		return iterationStrategyStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterationStrategyPortNode createIterationStrategyPortNode() {
		IterationStrategyPortNodeImpl iterationStrategyPortNode = new IterationStrategyPortNodeImpl();
		return iterationStrategyPortNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossProduct createCrossProduct() {
		CrossProductImpl crossProduct = new CrossProductImpl();
		return crossProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotProduct createDotProduct() {
		DotProductImpl dotProduct = new DotProductImpl();
		return dotProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasPackage getCanvasPackage() {
		return (CanvasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CanvasPackage getPackage() {
		return CanvasPackage.eINSTANCE;
	}

} //CanvasFactoryImpl

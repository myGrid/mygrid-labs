/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.org.taverna.t3.workbench.canvas.models.canvas.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage
 * @generated
 */
public class CanvasSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CanvasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasSwitch() {
		if (modelPackage == null) {
			modelPackage = CanvasPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CanvasPackage.RECEIVER: {
				Receiver receiver = (Receiver)theEObject;
				T result = caseReceiver(receiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.SENDER: {
				Sender sender = (Sender)theEObject;
				T result = caseSender(sender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.WORKFLOW_INPUT: {
				WorkflowInput workflowInput = (WorkflowInput)theEObject;
				T result = caseWorkflowInput(workflowInput);
				if (result == null) result = caseSender(workflowInput);
				if (result == null) result = casePort(workflowInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.WORKFLOW_OUTPUT: {
				WorkflowOutput workflowOutput = (WorkflowOutput)theEObject;
				T result = caseWorkflowOutput(workflowOutput);
				if (result == null) result = caseReceiver(workflowOutput);
				if (result == null) result = casePort(workflowOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.COMPONENT_DEFINITION_REFERENCE: {
				ComponentDefinitionReference componentDefinitionReference = (ComponentDefinitionReference)theEObject;
				T result = caseComponentDefinitionReference(componentDefinitionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.CANVAS: {
				Canvas canvas = (Canvas)theEObject;
				T result = caseCanvas(canvas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.PROCESSOR: {
				Processor processor = (Processor)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.PROCESSOR_INPUT: {
				ProcessorInput processorInput = (ProcessorInput)theEObject;
				T result = caseProcessorInput(processorInput);
				if (result == null) result = caseReceiver(processorInput);
				if (result == null) result = casePort(processorInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.PROCESSOR_OUTPUT: {
				ProcessorOutput processorOutput = (ProcessorOutput)theEObject;
				T result = caseProcessorOutput(processorOutput);
				if (result == null) result = caseSender(processorOutput);
				if (result == null) result = casePort(processorOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.COMPONENT_INPUT: {
				ComponentInput componentInput = (ComponentInput)theEObject;
				T result = caseComponentInput(componentInput);
				if (result == null) result = casePort(componentInput);
				if (result == null) result = caseSender(componentInput);
				if (result == null) result = caseReceiver(componentInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.COMPONENT_OUTPUT: {
				ComponentOutput componentOutput = (ComponentOutput)theEObject;
				T result = caseComponentOutput(componentOutput);
				if (result == null) result = casePort(componentOutput);
				if (result == null) result = caseSender(componentOutput);
				if (result == null) result = caseReceiver(componentOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.CONFIGURATION_PROPERTY: {
				ConfigurationProperty configurationProperty = (ConfigurationProperty)theEObject;
				T result = caseConfigurationProperty(configurationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL: {
				ConfigurationPropertyLiteral configurationPropertyLiteral = (ConfigurationPropertyLiteral)theEObject;
				T result = caseConfigurationPropertyLiteral(configurationPropertyLiteral);
				if (result == null) result = caseConfigurationProperty(configurationPropertyLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL_OPTION: {
				ConfigurationPropertyLiteralOption configurationPropertyLiteralOption = (ConfigurationPropertyLiteralOption)theEObject;
				T result = caseConfigurationPropertyLiteralOption(configurationPropertyLiteralOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.CONFIGURATION_PROPERTY_REFERENCE: {
				ConfigurationPropertyReference configurationPropertyReference = (ConfigurationPropertyReference)theEObject;
				T result = caseConfigurationPropertyReference(configurationPropertyReference);
				if (result == null) result = caseConfigurationProperty(configurationPropertyReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX: {
				ConfigurationPropertyComplex configurationPropertyComplex = (ConfigurationPropertyComplex)theEObject;
				T result = caseConfigurationPropertyComplex(configurationPropertyComplex);
				if (result == null) result = caseConfigurationProperty(configurationPropertyComplex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.ITERATION_STRATEGY_STACK: {
				IterationStrategyStack iterationStrategyStack = (IterationStrategyStack)theEObject;
				T result = caseIterationStrategyStack(iterationStrategyStack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.ITERATION_STRATEGY_TOP_NODE: {
				IterationStrategyTopNode iterationStrategyTopNode = (IterationStrategyTopNode)theEObject;
				T result = caseIterationStrategyTopNode(iterationStrategyTopNode);
				if (result == null) result = caseIterationStrategyNode(iterationStrategyTopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.ITERATION_STRATEGY_NODE: {
				IterationStrategyNode iterationStrategyNode = (IterationStrategyNode)theEObject;
				T result = caseIterationStrategyNode(iterationStrategyNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE: {
				IterationStrategyPortNode iterationStrategyPortNode = (IterationStrategyPortNode)theEObject;
				T result = caseIterationStrategyPortNode(iterationStrategyPortNode);
				if (result == null) result = caseIterationStrategyNode(iterationStrategyPortNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.CROSS_PRODUCT: {
				CrossProduct crossProduct = (CrossProduct)theEObject;
				T result = caseCrossProduct(crossProduct);
				if (result == null) result = caseIterationStrategyTopNode(crossProduct);
				if (result == null) result = caseIterationStrategyNode(crossProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CanvasPackage.DOT_PRODUCT: {
				DotProduct dotProduct = (DotProduct)theEObject;
				T result = caseDotProduct(dotProduct);
				if (result == null) result = caseIterationStrategyTopNode(dotProduct);
				if (result == null) result = caseIterationStrategyNode(dotProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiver(Receiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSender(Sender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowInput(WorkflowInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowOutput(WorkflowOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinitionReference(ComponentDefinitionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Canvas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanvas(Canvas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessor(Processor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorInput(ProcessorInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessorOutput(ProcessorOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInput(ComponentInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOutput(ComponentOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationProperty(ConfigurationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Property Literal Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Property Literal Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPropertyLiteralOption(ConfigurationPropertyLiteralOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Property Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Property Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPropertyLiteral(ConfigurationPropertyLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Property Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPropertyReference(ConfigurationPropertyReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Property Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Property Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPropertyComplex(ConfigurationPropertyComplex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Strategy Stack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Strategy Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationStrategyStack(IterationStrategyStack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Strategy Top Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Strategy Top Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationStrategyTopNode(IterationStrategyTopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Strategy Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Strategy Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationStrategyNode(IterationStrategyNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Strategy Port Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Strategy Port Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterationStrategyPortNode(IterationStrategyPortNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrossProduct(CrossProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dot Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDotProduct(DotProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CanvasSwitch

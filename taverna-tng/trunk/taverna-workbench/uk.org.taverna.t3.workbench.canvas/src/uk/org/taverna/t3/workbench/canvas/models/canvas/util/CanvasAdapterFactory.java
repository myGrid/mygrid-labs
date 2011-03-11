/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.org.taverna.t3.workbench.canvas.models.canvas.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage
 * @generated
 */
public class CanvasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CanvasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanvasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CanvasPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasSwitch<Adapter> modelSwitch =
		new CanvasSwitch<Adapter>() {
			@Override
			public Adapter caseReceiver(Receiver object) {
				return createReceiverAdapter();
			}
			@Override
			public Adapter caseSender(Sender object) {
				return createSenderAdapter();
			}
			@Override
			public Adapter caseWorkflowInput(WorkflowInput object) {
				return createWorkflowInputAdapter();
			}
			@Override
			public Adapter caseWorkflowOutput(WorkflowOutput object) {
				return createWorkflowOutputAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseComponentDefinitionReference(ComponentDefinitionReference object) {
				return createComponentDefinitionReferenceAdapter();
			}
			@Override
			public Adapter caseCanvas(Canvas object) {
				return createCanvasAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseProcessorInput(ProcessorInput object) {
				return createProcessorInputAdapter();
			}
			@Override
			public Adapter caseProcessorOutput(ProcessorOutput object) {
				return createProcessorOutputAdapter();
			}
			@Override
			public Adapter caseComponentInput(ComponentInput object) {
				return createComponentInputAdapter();
			}
			@Override
			public Adapter caseComponentOutput(ComponentOutput object) {
				return createComponentOutputAdapter();
			}
			@Override
			public Adapter caseConfigurationProperty(ConfigurationProperty object) {
				return createConfigurationPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Sender
	 * @generated
	 */
	public Adapter createSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput <em>Workflow Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput
	 * @generated
	 */
	public Adapter createWorkflowInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput <em>Workflow Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput
	 * @generated
	 */
	public Adapter createWorkflowOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference <em>Component Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference
	 * @generated
	 */
	public Adapter createComponentDefinitionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas
	 * @generated
	 */
	public Adapter createCanvasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput <em>Processor Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput
	 * @generated
	 */
	public Adapter createProcessorInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput <em>Processor Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput
	 * @generated
	 */
	public Adapter createProcessorOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput <em>Component Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput
	 * @generated
	 */
	public Adapter createComponentInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput <em>Component Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput
	 * @generated
	 */
	public Adapter createComponentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty <em>Configuration Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty
	 * @generated
	 */
	public Adapter createConfigurationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CanvasAdapterFactory

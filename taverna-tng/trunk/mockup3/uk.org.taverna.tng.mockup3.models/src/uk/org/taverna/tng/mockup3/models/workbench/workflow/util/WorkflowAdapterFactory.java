/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage
 * @generated
 */
public class WorkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
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
	protected WorkflowSwitch<Adapter> modelSwitch =
		new WorkflowSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
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
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseWorkflowOutput(WorkflowOutput object) {
				return createWorkflowOutputAdapter();
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
			public Adapter casePort(Port object) {
				return createPortAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender
	 * @generated
	 */
	public Adapter createSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowInput
	 * @generated
	 */
	public Adapter createWorkflowInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowOutput
	 * @generated
	 */
	public Adapter createWorkflowOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput <em>Component Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput
	 * @generated
	 */
	public Adapter createComponentInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentOutput <em>Component Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentOutput
	 * @generated
	 */
	public Adapter createComponentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.org.taverna.tng.mockup3.models.workbench.workflow.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
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

} //WorkflowAdapterFactory

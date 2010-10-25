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
			case CanvasPackage.COMPONENT_INSTANCE_INPUT: return createComponentInstanceInput();
			case CanvasPackage.COMPONENT_INSTANCE_OUTPUT: return createComponentInstanceOutput();
			case CanvasPackage.COMPONENT_DEFINITION_REFERENCE: return createComponentDefinitionReference();
			case CanvasPackage.CANVAS: return createCanvas();
			case CanvasPackage.NODE: return createNode();
			case CanvasPackage.CORE_COMPONENT_INSTANCE: return createCoreComponentInstance();
			case CanvasPackage.HELPER_COMPONENT_INSTANCE: return createHelperComponentInstance();
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
	public ComponentInstanceInput createComponentInstanceInput() {
		ComponentInstanceInputImpl componentInstanceInput = new ComponentInstanceInputImpl();
		return componentInstanceInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceOutput createComponentInstanceOutput() {
		ComponentInstanceOutputImpl componentInstanceOutput = new ComponentInstanceOutputImpl();
		return componentInstanceOutput;
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
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreComponentInstance createCoreComponentInstance() {
		CoreComponentInstanceImpl coreComponentInstance = new CoreComponentInstanceImpl();
		return coreComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperComponentInstance createHelperComponentInstance() {
		HelperComponentInstanceImpl helperComponentInstance = new HelperComponentInstanceImpl();
		return helperComponentInstance;
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

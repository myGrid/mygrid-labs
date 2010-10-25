/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage
 * @generated
 */
public interface CanvasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CanvasFactory eINSTANCE = uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workflow Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Input</em>'.
	 * @generated
	 */
	WorkflowInput createWorkflowInput();

	/**
	 * Returns a new object of class '<em>Workflow Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Output</em>'.
	 * @generated
	 */
	WorkflowOutput createWorkflowOutput();

	/**
	 * Returns a new object of class '<em>Component Instance Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Input</em>'.
	 * @generated
	 */
	ComponentInstanceInput createComponentInstanceInput();

	/**
	 * Returns a new object of class '<em>Component Instance Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Output</em>'.
	 * @generated
	 */
	ComponentInstanceOutput createComponentInstanceOutput();

	/**
	 * Returns a new object of class '<em>Component Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Definition Reference</em>'.
	 * @generated
	 */
	ComponentDefinitionReference createComponentDefinitionReference();

	/**
	 * Returns a new object of class '<em>Canvas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Canvas</em>'.
	 * @generated
	 */
	Canvas createCanvas();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Core Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Component Instance</em>'.
	 * @generated
	 */
	CoreComponentInstance createCoreComponentInstance();

	/**
	 * Returns a new object of class '<em>Helper Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Helper Component Instance</em>'.
	 * @generated
	 */
	HelperComponentInstance createHelperComponentInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CanvasPackage getCanvasPackage();

} //CanvasFactory

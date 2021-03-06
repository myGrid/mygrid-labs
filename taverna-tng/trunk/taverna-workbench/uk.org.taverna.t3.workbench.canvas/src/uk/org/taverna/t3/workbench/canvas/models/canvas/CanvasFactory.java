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
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor</em>'.
	 * @generated
	 */
	Processor createProcessor();

	/**
	 * Returns a new object of class '<em>Processor Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Input</em>'.
	 * @generated
	 */
	ProcessorInput createProcessorInput();

	/**
	 * Returns a new object of class '<em>Processor Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processor Output</em>'.
	 * @generated
	 */
	ProcessorOutput createProcessorOutput();

	/**
	 * Returns a new object of class '<em>Component Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Input</em>'.
	 * @generated
	 */
	ComponentInput createComponentInput();

	/**
	 * Returns a new object of class '<em>Component Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Output</em>'.
	 * @generated
	 */
	ComponentOutput createComponentOutput();

	/**
	 * Returns a new object of class '<em>Configuration Property Literal Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Property Literal Option</em>'.
	 * @generated
	 */
	ConfigurationPropertyLiteralOption createConfigurationPropertyLiteralOption();

	/**
	 * Returns a new object of class '<em>Configuration Property Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Property Literal</em>'.
	 * @generated
	 */
	ConfigurationPropertyLiteral createConfigurationPropertyLiteral();

	/**
	 * Returns a new object of class '<em>Configuration Property Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Property Reference</em>'.
	 * @generated
	 */
	ConfigurationPropertyReference createConfigurationPropertyReference();

	/**
	 * Returns a new object of class '<em>Configuration Property Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Property Complex</em>'.
	 * @generated
	 */
	ConfigurationPropertyComplex createConfigurationPropertyComplex();

	/**
	 * Returns a new object of class '<em>Iteration Strategy Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iteration Strategy Stack</em>'.
	 * @generated
	 */
	IterationStrategyStack createIterationStrategyStack();

	/**
	 * Returns a new object of class '<em>Iteration Strategy Port Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iteration Strategy Port Node</em>'.
	 * @generated
	 */
	IterationStrategyPortNode createIterationStrategyPortNode();

	/**
	 * Returns a new object of class '<em>Cross Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Product</em>'.
	 * @generated
	 */
	CrossProduct createCrossProduct();

	/**
	 * Returns a new object of class '<em>Dot Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot Product</em>'.
	 * @generated
	 */
	DotProduct createDotProduct();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CanvasPackage getCanvasPackage();

} //CanvasFactory

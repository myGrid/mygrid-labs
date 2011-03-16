/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getType <em>Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getProcessorOutputs <em>Processor Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getProcessorInputs <em>Processor Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getActivitiy <em>Activitiy</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getConfigurationProperties <em>Configuration Properties</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getIterationStrategyStack <em>Iteration Strategy Stack</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Processor Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Outputs</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_ProcessorOutputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessorOutput> getProcessorOutputs();

	/**
	 * Returns the value of the '<em><b>Processor Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Inputs</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_ProcessorInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessorInput> getProcessorInputs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Activitiy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activitiy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitiy</em>' attribute.
	 * @see #setActivitiy(String)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_Activitiy()
	 * @model
	 * @generated
	 */
	String getActivitiy();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getActivitiy <em>Activitiy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitiy</em>' attribute.
	 * @see #getActivitiy()
	 * @generated
	 */
	void setActivitiy(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Properties</b></em>' containment reference list.
	 * The list contents are of type {@link uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Properties</em>' containment reference list.
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_ConfigurationProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationProperty> getConfigurationProperties();

	/**
	 * Returns the value of the '<em><b>Iteration Strategy Stack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration Strategy Stack</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration Strategy Stack</em>' containment reference.
	 * @see #setIterationStrategyStack(IterationStrategyStack)
	 * @see uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage#getProcessor_IterationStrategyStack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IterationStrategyStack getIterationStrategyStack();

	/**
	 * Sets the value of the '{@link uk.org.taverna.t3.workbench.canvas.models.canvas.Processor#getIterationStrategyStack <em>Iteration Strategy Stack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration Strategy Stack</em>' containment reference.
	 * @see #getIterationStrategyStack()
	 * @generated
	 */
	void setIterationStrategyStack(IterationStrategyStack value);

} // Processor

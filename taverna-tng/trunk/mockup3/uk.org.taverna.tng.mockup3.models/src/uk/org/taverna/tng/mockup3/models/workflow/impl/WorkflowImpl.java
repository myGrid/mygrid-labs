/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.org.taverna.tng.mockup3.models.workflow.ComponentDefinitionReference;
import uk.org.taverna.tng.mockup3.models.workflow.ComponentInstance;
import uk.org.taverna.tng.mockup3.models.workflow.Workflow;
import uk.org.taverna.tng.mockup3.models.workflow.WorkflowInput;
import uk.org.taverna.tng.mockup3.models.workflow.WorkflowOutput;
import uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.impl.WorkflowImpl#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends EObjectImpl implements Workflow {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> components;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowInput> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowOutput> outputs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentDefinition() <em>Component Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionReference componentDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, WorkflowPackage.WORKFLOW__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<WorkflowInput>(WorkflowInput.class, this, WorkflowPackage.WORKFLOW__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<WorkflowOutput>(WorkflowOutput.class, this, WorkflowPackage.WORKFLOW__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference getComponentDefinition() {
		if (componentDefinition != null && componentDefinition.eIsProxy()) {
			InternalEObject oldComponentDefinition = (InternalEObject)componentDefinition;
			componentDefinition = (ComponentDefinitionReference)eResolveProxy(oldComponentDefinition);
			if (componentDefinition != oldComponentDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW__COMPONENT_DEFINITION, oldComponentDefinition, componentDefinition));
			}
		}
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference basicGetComponentDefinition() {
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentDefinition(ComponentDefinitionReference newComponentDefinition) {
		ComponentDefinitionReference oldComponentDefinition = componentDefinition;
		componentDefinition = newComponentDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW__COMPONENT_DEFINITION, oldComponentDefinition, componentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__COMPONENTS:
				return getComponents();
			case WorkflowPackage.WORKFLOW__INPUTS:
				return getInputs();
			case WorkflowPackage.WORKFLOW__OUTPUTS:
				return getOutputs();
			case WorkflowPackage.WORKFLOW__NAME:
				return getName();
			case WorkflowPackage.WORKFLOW__COMPONENT_DEFINITION:
				if (resolve) return getComponentDefinition();
				return basicGetComponentDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case WorkflowPackage.WORKFLOW__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends WorkflowInput>)newValue);
				return;
			case WorkflowPackage.WORKFLOW__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends WorkflowOutput>)newValue);
				return;
			case WorkflowPackage.WORKFLOW__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinitionReference)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__COMPONENTS:
				getComponents().clear();
				return;
			case WorkflowPackage.WORKFLOW__INPUTS:
				getInputs().clear();
				return;
			case WorkflowPackage.WORKFLOW__OUTPUTS:
				getOutputs().clear();
				return;
			case WorkflowPackage.WORKFLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinitionReference)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__COMPONENTS:
				return components != null && !components.isEmpty();
			case WorkflowPackage.WORKFLOW__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case WorkflowPackage.WORKFLOW__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case WorkflowPackage.WORKFLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.WORKFLOW__COMPONENT_DEFINITION:
				return componentDefinition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl

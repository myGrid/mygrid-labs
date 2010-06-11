/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow.impl;

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

import uk.org.taverna.tng.mockup3.models.workbench.workflow.Component;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentOutput;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentImpl#getActivityType <em>Activity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EObjectImpl implements Component {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInput> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentOutput> outputs;

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
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivityType() <em>Activity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityType()
	 * @generated
	 * @ordered
	 */
	protected String activityType = ACTIVITY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<ComponentInput>(ComponentInput.class, this, WorkflowPackage.COMPONENT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<ComponentOutput>(ComponentOutput.class, this, WorkflowPackage.COMPONENT__OUTPUTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivityType() {
		return activityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityType(String newActivityType) {
		String oldActivityType = activityType;
		activityType = newActivityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT__ACTIVITY_TYPE, oldActivityType, activityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.COMPONENT__OUTPUTS:
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
			case WorkflowPackage.COMPONENT__INPUTS:
				return getInputs();
			case WorkflowPackage.COMPONENT__OUTPUTS:
				return getOutputs();
			case WorkflowPackage.COMPONENT__NAME:
				return getName();
			case WorkflowPackage.COMPONENT__FAMILY:
				return getFamily();
			case WorkflowPackage.COMPONENT__ACTIVITY_TYPE:
				return getActivityType();
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
			case WorkflowPackage.COMPONENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ComponentInput>)newValue);
				return;
			case WorkflowPackage.COMPONENT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ComponentOutput>)newValue);
				return;
			case WorkflowPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.COMPONENT__FAMILY:
				setFamily((String)newValue);
				return;
			case WorkflowPackage.COMPONENT__ACTIVITY_TYPE:
				setActivityType((String)newValue);
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
			case WorkflowPackage.COMPONENT__INPUTS:
				getInputs().clear();
				return;
			case WorkflowPackage.COMPONENT__OUTPUTS:
				getOutputs().clear();
				return;
			case WorkflowPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.COMPONENT__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case WorkflowPackage.COMPONENT__ACTIVITY_TYPE:
				setActivityType(ACTIVITY_TYPE_EDEFAULT);
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
			case WorkflowPackage.COMPONENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case WorkflowPackage.COMPONENT__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case WorkflowPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.COMPONENT__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case WorkflowPackage.COMPONENT__ACTIVITY_TYPE:
				return ACTIVITY_TYPE_EDEFAULT == null ? activityType != null : !ACTIVITY_TYPE_EDEFAULT.equals(activityType);
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
		result.append(", family: ");
		result.append(family);
		result.append(", activityType: ");
		result.append(activityType);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl

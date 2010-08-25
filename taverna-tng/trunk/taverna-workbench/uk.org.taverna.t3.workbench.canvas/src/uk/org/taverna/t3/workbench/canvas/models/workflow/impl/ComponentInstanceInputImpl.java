/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.org.taverna.t3.workbench.canvas.models.workflow.ComponentInstanceInput;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Receiver;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Sender;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.impl.ComponentInstanceInputImpl#getSenders <em>Senders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceInputImpl extends PortImpl implements ComponentInstanceInput {
	/**
	 * The cached value of the '{@link #getSenders() <em>Senders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenders()
	 * @generated
	 * @ordered
	 */
	protected Sender senders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPONENT_INSTANCE_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sender getSenders() {
		if (senders != null && senders.eIsProxy()) {
			InternalEObject oldSenders = (InternalEObject)senders;
			senders = (Sender)eResolveProxy(oldSenders);
			if (senders != oldSenders) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS, oldSenders, senders));
			}
		}
		return senders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sender basicGetSenders() {
		return senders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenders(Sender newSenders) {
		Sender oldSenders = senders;
		senders = newSenders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS, oldSenders, senders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS:
				if (resolve) return getSenders();
				return basicGetSenders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS:
				setSenders((Sender)newValue);
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
			case WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS:
				setSenders((Sender)null);
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
			case WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS:
				return senders != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Receiver.class) {
			switch (derivedFeatureID) {
				case WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS: return WorkflowPackage.RECEIVER__SENDERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Receiver.class) {
			switch (baseFeatureID) {
				case WorkflowPackage.RECEIVER__SENDERS: return WorkflowPackage.COMPONENT_INSTANCE_INPUT__SENDERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentInstanceInputImpl

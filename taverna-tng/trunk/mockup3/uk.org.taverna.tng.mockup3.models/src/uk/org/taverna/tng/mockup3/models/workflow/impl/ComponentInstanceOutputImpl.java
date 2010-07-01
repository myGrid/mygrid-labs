/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.org.taverna.tng.mockup3.models.workflow.ComponentInstanceOutput;
import uk.org.taverna.tng.mockup3.models.workflow.Receiver;
import uk.org.taverna.tng.mockup3.models.workflow.Sender;
import uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceOutputImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workflow.impl.ComponentInstanceOutputImpl#getSenders <em>Senders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceOutputImpl extends PortImpl implements ComponentInstanceOutput {
	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected Receiver receivers;

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
	protected ComponentInstanceOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPONENT_INSTANCE_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver getReceivers() {
		if (receivers != null && receivers.eIsProxy()) {
			InternalEObject oldReceivers = (InternalEObject)receivers;
			receivers = (Receiver)eResolveProxy(oldReceivers);
			if (receivers != oldReceivers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS, oldReceivers, receivers));
			}
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver basicGetReceivers() {
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivers(Receiver newReceivers) {
		Receiver oldReceivers = receivers;
		receivers = newReceivers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS, oldReceivers, receivers));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS, oldSenders, senders));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS, oldSenders, senders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS:
				if (resolve) return getReceivers();
				return basicGetReceivers();
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS:
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
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS:
				setReceivers((Receiver)newValue);
				return;
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS:
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
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS:
				setReceivers((Receiver)null);
				return;
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS:
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
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS:
				return receivers != null;
			case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS:
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
		if (baseClass == Sender.class) {
			switch (derivedFeatureID) {
				case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS: return WorkflowPackage.SENDER__RECEIVERS;
				default: return -1;
			}
		}
		if (baseClass == Receiver.class) {
			switch (derivedFeatureID) {
				case WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS: return WorkflowPackage.RECEIVER__SENDERS;
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
		if (baseClass == Sender.class) {
			switch (baseFeatureID) {
				case WorkflowPackage.SENDER__RECEIVERS: return WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__RECEIVERS;
				default: return -1;
			}
		}
		if (baseClass == Receiver.class) {
			switch (baseFeatureID) {
				case WorkflowPackage.RECEIVER__SENDERS: return WorkflowPackage.COMPONENT_INSTANCE_OUTPUT__SENDERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentInstanceOutputImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentOutput;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentOutputImpl#getReceivers <em>Receivers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentOutputImpl extends PortImpl implements ComponentOutput {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPONENT_OUTPUT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS, oldReceivers, receivers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS, oldReceivers, receivers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS:
				if (resolve) return getReceivers();
				return basicGetReceivers();
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
			case WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS:
				setReceivers((Receiver)newValue);
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
			case WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS:
				setReceivers((Receiver)null);
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
			case WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS:
				return receivers != null;
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
				case WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS: return WorkflowPackage.SENDER__RECEIVERS;
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
				case WorkflowPackage.SENDER__RECEIVERS: return WorkflowPackage.COMPONENT_OUTPUT__RECEIVERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentOutputImpl

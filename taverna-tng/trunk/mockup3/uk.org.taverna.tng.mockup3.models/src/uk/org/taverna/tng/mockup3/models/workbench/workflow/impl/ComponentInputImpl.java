/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.org.taverna.tng.mockup3.models.workbench.canvas.Data;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentInputImpl#getDataLinks <em>Data Links</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentInputImpl#getSenders <em>Senders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInputImpl extends PortImpl implements ComponentInput {
	/**
	 * The cached value of the '{@link #getDataLinks() <em>Data Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> dataLinks;

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
	protected ComponentInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPONENT_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getDataLinks() {
		if (dataLinks == null) {
			dataLinks = new EObjectResolvingEList<Data>(Data.class, this, WorkflowPackage.COMPONENT_INPUT__DATA_LINKS);
		}
		return dataLinks;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.COMPONENT_INPUT__SENDERS, oldSenders, senders));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT_INPUT__SENDERS, oldSenders, senders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				return getDataLinks();
			case WorkflowPackage.COMPONENT_INPUT__SENDERS:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				getDataLinks().clear();
				getDataLinks().addAll((Collection<? extends Data>)newValue);
				return;
			case WorkflowPackage.COMPONENT_INPUT__SENDERS:
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
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				getDataLinks().clear();
				return;
			case WorkflowPackage.COMPONENT_INPUT__SENDERS:
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
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				return dataLinks != null && !dataLinks.isEmpty();
			case WorkflowPackage.COMPONENT_INPUT__SENDERS:
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
				case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS: return WorkflowPackage.RECEIVER__DATA_LINKS;
				case WorkflowPackage.COMPONENT_INPUT__SENDERS: return WorkflowPackage.RECEIVER__SENDERS;
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
				case WorkflowPackage.RECEIVER__DATA_LINKS: return WorkflowPackage.COMPONENT_INPUT__DATA_LINKS;
				case WorkflowPackage.RECEIVER__SENDERS: return WorkflowPackage.COMPONENT_INPUT__SENDERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentInputImpl

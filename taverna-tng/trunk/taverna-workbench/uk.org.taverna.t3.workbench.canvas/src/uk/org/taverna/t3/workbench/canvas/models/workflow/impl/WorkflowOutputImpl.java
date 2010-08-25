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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.org.taverna.t3.workbench.canvas.models.workflow.Port;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Receiver;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Sender;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowOutput;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.impl.WorkflowOutputImpl#getSenders <em>Senders</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.impl.WorkflowOutputImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.impl.WorkflowOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.impl.WorkflowOutputImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowOutputImpl extends EObjectImpl implements WorkflowOutput {
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
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected Receiver receivers;

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
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_OUTPUT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_OUTPUT__SENDERS, oldSenders, senders));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_OUTPUT__SENDERS, oldSenders, senders));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS, oldReceivers, receivers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS, oldReceivers, receivers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_OUTPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_OUTPUT__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW_OUTPUT__SENDERS:
				if (resolve) return getSenders();
				return basicGetSenders();
			case WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS:
				if (resolve) return getReceivers();
				return basicGetReceivers();
			case WorkflowPackage.WORKFLOW_OUTPUT__NAME:
				return getName();
			case WorkflowPackage.WORKFLOW_OUTPUT__DEPTH:
				return getDepth();
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
			case WorkflowPackage.WORKFLOW_OUTPUT__SENDERS:
				setSenders((Sender)newValue);
				return;
			case WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS:
				setReceivers((Receiver)newValue);
				return;
			case WorkflowPackage.WORKFLOW_OUTPUT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.WORKFLOW_OUTPUT__DEPTH:
				setDepth((Integer)newValue);
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
			case WorkflowPackage.WORKFLOW_OUTPUT__SENDERS:
				setSenders((Sender)null);
				return;
			case WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS:
				setReceivers((Receiver)null);
				return;
			case WorkflowPackage.WORKFLOW_OUTPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.WORKFLOW_OUTPUT__DEPTH:
				setDepth(DEPTH_EDEFAULT);
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
			case WorkflowPackage.WORKFLOW_OUTPUT__SENDERS:
				return senders != null;
			case WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS:
				return receivers != null;
			case WorkflowPackage.WORKFLOW_OUTPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.WORKFLOW_OUTPUT__DEPTH:
				return depth != DEPTH_EDEFAULT;
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
				case WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS: return WorkflowPackage.SENDER__RECEIVERS;
				default: return -1;
			}
		}
		if (baseClass == Port.class) {
			switch (derivedFeatureID) {
				case WorkflowPackage.WORKFLOW_OUTPUT__NAME: return WorkflowPackage.PORT__NAME;
				case WorkflowPackage.WORKFLOW_OUTPUT__DEPTH: return WorkflowPackage.PORT__DEPTH;
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
				case WorkflowPackage.SENDER__RECEIVERS: return WorkflowPackage.WORKFLOW_OUTPUT__RECEIVERS;
				default: return -1;
			}
		}
		if (baseClass == Port.class) {
			switch (baseFeatureID) {
				case WorkflowPackage.PORT__NAME: return WorkflowPackage.WORKFLOW_OUTPUT__NAME;
				case WorkflowPackage.PORT__DEPTH: return WorkflowPackage.WORKFLOW_OUTPUT__DEPTH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //WorkflowOutputImpl

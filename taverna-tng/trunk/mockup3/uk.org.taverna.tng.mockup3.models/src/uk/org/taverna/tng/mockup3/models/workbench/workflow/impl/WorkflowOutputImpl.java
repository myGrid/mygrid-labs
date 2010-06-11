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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.org.taverna.tng.mockup3.models.workbench.canvas.Data;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.Port;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.Sender;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowOutput;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowOutputImpl#getDataLinks <em>Data Links</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.WorkflowOutputImpl#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowOutputImpl extends EObjectImpl implements WorkflowOutput {
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
	public EList<Data> getDataLinks() {
		if (dataLinks == null) {
			dataLinks = new EObjectResolvingEList<Data>(Data.class, this, WorkflowPackage.WORKFLOW_OUTPUT__DATA_LINKS);
		}
		return dataLinks;
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
			case WorkflowPackage.WORKFLOW_OUTPUT__DATA_LINKS:
				return getDataLinks();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW_OUTPUT__DATA_LINKS:
				getDataLinks().clear();
				getDataLinks().addAll((Collection<? extends Data>)newValue);
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
			case WorkflowPackage.WORKFLOW_OUTPUT__DATA_LINKS:
				getDataLinks().clear();
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
			case WorkflowPackage.WORKFLOW_OUTPUT__DATA_LINKS:
				return dataLinks != null && !dataLinks.isEmpty();
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

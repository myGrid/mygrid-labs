/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CoreComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.HelperComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.NodeImpl#getHelperComponents <em>Helper Components</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.NodeImpl#getCoreComponents <em>Core Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getHelperComponents() <em>Helper Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelperComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<HelperComponentInstance> helperComponents;

	/**
	 * The cached value of the '{@link #getCoreComponents() <em>Core Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreComponents()
	 * @generated
	 * @ordered
	 */
	protected CoreComponentInstance coreComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HelperComponentInstance> getHelperComponents() {
		if (helperComponents == null) {
			helperComponents = new EObjectContainmentEList<HelperComponentInstance>(HelperComponentInstance.class, this, CanvasPackage.NODE__HELPER_COMPONENTS);
		}
		return helperComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreComponentInstance getCoreComponents() {
		return coreComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreComponents(CoreComponentInstance newCoreComponents, NotificationChain msgs) {
		CoreComponentInstance oldCoreComponents = coreComponents;
		coreComponents = newCoreComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanvasPackage.NODE__CORE_COMPONENTS, oldCoreComponents, newCoreComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreComponents(CoreComponentInstance newCoreComponents) {
		if (newCoreComponents != coreComponents) {
			NotificationChain msgs = null;
			if (coreComponents != null)
				msgs = ((InternalEObject)coreComponents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanvasPackage.NODE__CORE_COMPONENTS, null, msgs);
			if (newCoreComponents != null)
				msgs = ((InternalEObject)newCoreComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanvasPackage.NODE__CORE_COMPONENTS, null, msgs);
			msgs = basicSetCoreComponents(newCoreComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.NODE__CORE_COMPONENTS, newCoreComponents, newCoreComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.NODE__HELPER_COMPONENTS:
				return ((InternalEList<?>)getHelperComponents()).basicRemove(otherEnd, msgs);
			case CanvasPackage.NODE__CORE_COMPONENTS:
				return basicSetCoreComponents(null, msgs);
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
			case CanvasPackage.NODE__HELPER_COMPONENTS:
				return getHelperComponents();
			case CanvasPackage.NODE__CORE_COMPONENTS:
				return getCoreComponents();
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
			case CanvasPackage.NODE__HELPER_COMPONENTS:
				getHelperComponents().clear();
				getHelperComponents().addAll((Collection<? extends HelperComponentInstance>)newValue);
				return;
			case CanvasPackage.NODE__CORE_COMPONENTS:
				setCoreComponents((CoreComponentInstance)newValue);
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
			case CanvasPackage.NODE__HELPER_COMPONENTS:
				getHelperComponents().clear();
				return;
			case CanvasPackage.NODE__CORE_COMPONENTS:
				setCoreComponents((CoreComponentInstance)null);
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
			case CanvasPackage.NODE__HELPER_COMPONENTS:
				return helperComponents != null && !helperComponents.isEmpty();
			case CanvasPackage.NODE__CORE_COMPONENTS:
				return coreComponents != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl

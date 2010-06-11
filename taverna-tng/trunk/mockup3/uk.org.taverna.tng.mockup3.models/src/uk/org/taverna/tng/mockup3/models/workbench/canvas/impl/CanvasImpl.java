/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.canvas.impl;

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

import uk.org.taverna.tng.mockup3.models.workbench.canvas.Canvas;
import uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage;
import uk.org.taverna.tng.mockup3.models.workbench.canvas.Data;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.Workflow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasImpl#getDataLinks <em>Data Links</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.CanvasImpl#getWorkflow <em>Workflow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasImpl extends EObjectImpl implements Canvas {
	/**
	 * The cached value of the '{@link #getDataLinks() <em>Data Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> dataLinks;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow workflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getDataLinks() {
		if (dataLinks == null) {
			dataLinks = new EObjectContainmentEList<Data>(Data.class, this, CanvasPackage.CANVAS__DATA_LINKS);
		}
		return dataLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getWorkflow() {
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflow(Workflow newWorkflow, NotificationChain msgs) {
		Workflow oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CanvasPackage.CANVAS__WORKFLOW, oldWorkflow, newWorkflow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow(Workflow newWorkflow) {
		if (newWorkflow != workflow) {
			NotificationChain msgs = null;
			if (workflow != null)
				msgs = ((InternalEObject)workflow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CanvasPackage.CANVAS__WORKFLOW, null, msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject)newWorkflow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CanvasPackage.CANVAS__WORKFLOW, null, msgs);
			msgs = basicSetWorkflow(newWorkflow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CANVAS__WORKFLOW, newWorkflow, newWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.CANVAS__DATA_LINKS:
				return ((InternalEList<?>)getDataLinks()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS__WORKFLOW:
				return basicSetWorkflow(null, msgs);
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
			case CanvasPackage.CANVAS__DATA_LINKS:
				return getDataLinks();
			case CanvasPackage.CANVAS__WORKFLOW:
				return getWorkflow();
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
			case CanvasPackage.CANVAS__DATA_LINKS:
				getDataLinks().clear();
				getDataLinks().addAll((Collection<? extends Data>)newValue);
				return;
			case CanvasPackage.CANVAS__WORKFLOW:
				setWorkflow((Workflow)newValue);
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
			case CanvasPackage.CANVAS__DATA_LINKS:
				getDataLinks().clear();
				return;
			case CanvasPackage.CANVAS__WORKFLOW:
				setWorkflow((Workflow)null);
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
			case CanvasPackage.CANVAS__DATA_LINKS:
				return dataLinks != null && !dataLinks.isEmpty();
			case CanvasPackage.CANVAS__WORKFLOW:
				return workflow != null;
		}
		return super.eIsSet(featureID);
	}

} //CanvasImpl

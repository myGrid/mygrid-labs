/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.canvas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.org.taverna.tng.mockup3.models.workbench.canvas.CanvasPackage;
import uk.org.taverna.tng.mockup3.models.workbench.canvas.Data;
import uk.org.taverna.tng.mockup3.models.workbench.canvas.DataSource;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.canvas.impl.DataImpl#getDataLink <em>Data Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends EObjectImpl implements Data {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> source;

	/**
	 * The cached value of the '{@link #getDataLink() <em>Data Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLink()
	 * @generated
	 * @ordered
	 */
	protected Receiver dataLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSource> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<DataSource>(DataSource.class, this, CanvasPackage.DATA__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver getDataLink() {
		if (dataLink != null && dataLink.eIsProxy()) {
			InternalEObject oldDataLink = (InternalEObject)dataLink;
			dataLink = (Receiver)eResolveProxy(oldDataLink);
			if (dataLink != oldDataLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanvasPackage.DATA__DATA_LINK, oldDataLink, dataLink));
			}
		}
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver basicGetDataLink() {
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLink(Receiver newDataLink) {
		Receiver oldDataLink = dataLink;
		dataLink = newDataLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.DATA__DATA_LINK, oldDataLink, dataLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanvasPackage.DATA__SOURCE:
				return getSource();
			case CanvasPackage.DATA__DATA_LINK:
				if (resolve) return getDataLink();
				return basicGetDataLink();
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
			case CanvasPackage.DATA__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends DataSource>)newValue);
				return;
			case CanvasPackage.DATA__DATA_LINK:
				setDataLink((Receiver)newValue);
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
			case CanvasPackage.DATA__SOURCE:
				getSource().clear();
				return;
			case CanvasPackage.DATA__DATA_LINK:
				setDataLink((Receiver)null);
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
			case CanvasPackage.DATA__SOURCE:
				return source != null && !source.isEmpty();
			case CanvasPackage.DATA__DATA_LINK:
				return dataLink != null;
		}
		return super.eIsSet(featureID);
	}

} //DataImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyComplex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Property Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyComplexImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationPropertyComplexImpl extends ConfigurationPropertyImpl implements ConfigurationPropertyComplex {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertyComplexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.CONFIGURATION_PROPERTY_COMPLEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ConfigurationProperty>(ConfigurationProperty.class, this, CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX__PROPERTIES:
				return getProperties();
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
			case CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends ConfigurationProperty>)newValue);
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
			case CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX__PROPERTIES:
				getProperties().clear();
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
			case CanvasPackage.CONFIGURATION_PROPERTY_COMPLEX__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationPropertyComplexImpl

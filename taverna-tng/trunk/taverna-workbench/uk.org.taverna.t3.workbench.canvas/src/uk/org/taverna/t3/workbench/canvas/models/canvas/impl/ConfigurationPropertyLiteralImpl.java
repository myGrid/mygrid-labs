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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteralOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Property Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyLiteralImpl#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyLiteralImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyLiteralImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyLiteralImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationPropertyLiteralImpl extends ConfigurationPropertyImpl implements ConfigurationPropertyLiteral {
	/**
	 * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldType()
	 * @generated
	 * @ordered
	 */
	protected String fieldType = FIELD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationPropertyLiteralOption> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertyLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.CONFIGURATION_PROPERTY_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldType(String newFieldType) {
		String oldFieldType = fieldType;
		fieldType = newFieldType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__FIELD_TYPE, oldFieldType, fieldType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationPropertyLiteralOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<ConfigurationPropertyLiteralOption>(ConfigurationPropertyLiteralOption.class, this, CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__FIELD_TYPE:
				return getFieldType();
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__DATA_TYPE:
				return getDataType();
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__VALUE:
				return getValue();
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__OPTIONS:
				return getOptions();
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
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__FIELD_TYPE:
				setFieldType((String)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__VALUE:
				setValue((String)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ConfigurationPropertyLiteralOption>)newValue);
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
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__FIELD_TYPE:
				setFieldType(FIELD_TYPE_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__OPTIONS:
				getOptions().clear();
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
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__FIELD_TYPE:
				return FIELD_TYPE_EDEFAULT == null ? fieldType != null : !FIELD_TYPE_EDEFAULT.equals(fieldType);
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case CanvasPackage.CONFIGURATION_PROPERTY_LITERAL__OPTIONS:
				return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (fieldType: ");
		result.append(fieldType);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ConfigurationPropertyLiteralImpl

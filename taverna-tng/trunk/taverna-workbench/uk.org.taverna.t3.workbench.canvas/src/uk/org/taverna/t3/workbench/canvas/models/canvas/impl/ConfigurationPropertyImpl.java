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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#isFixed <em>Fixed</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ConfigurationPropertyImpl#isConstrainedToOptions <em>Constrained To Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConfigurationPropertyImpl extends EObjectImpl implements ConfigurationProperty {
	/**
	 * The default value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected String predicate = PREDICATE_EDEFAULT;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected boolean fixed = FIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<String> examples;

	/**
	 * The default value of the '{@link #isConstrainedToOptions() <em>Constrained To Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrainedToOptions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINED_TO_OPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstrainedToOptions() <em>Constrained To Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrainedToOptions()
	 * @generated
	 * @ordered
	 */
	protected boolean constrainedToOptions = CONSTRAINED_TO_OPTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.CONFIGURATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(String newPredicate) {
		String oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__PREDICATE, oldPredicate, predicate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixed() {
		return fixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixed(boolean newFixed) {
		boolean oldFixed = fixed;
		fixed = newFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__FIXED, oldFixed, fixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstrainedToOptions() {
		return constrainedToOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedToOptions(boolean newConstrainedToOptions) {
		boolean oldConstrainedToOptions = constrainedToOptions;
		constrainedToOptions = newConstrainedToOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS, oldConstrainedToOptions, constrainedToOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExamples() {
		if (examples == null) {
			examples = new EDataTypeUniqueEList<String>(String.class, this, CanvasPackage.CONFIGURATION_PROPERTY__EXAMPLES);
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanvasPackage.CONFIGURATION_PROPERTY__PREDICATE:
				return getPredicate();
			case CanvasPackage.CONFIGURATION_PROPERTY__NAME:
				return getName();
			case CanvasPackage.CONFIGURATION_PROPERTY__LABEL:
				return getLabel();
			case CanvasPackage.CONFIGURATION_PROPERTY__DESCRIPTION:
				return getDescription();
			case CanvasPackage.CONFIGURATION_PROPERTY__REQUIRED:
				return isRequired();
			case CanvasPackage.CONFIGURATION_PROPERTY__FIXED:
				return isFixed();
			case CanvasPackage.CONFIGURATION_PROPERTY__HIDDEN:
				return isHidden();
			case CanvasPackage.CONFIGURATION_PROPERTY__EXAMPLES:
				return getExamples();
			case CanvasPackage.CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS:
				return isConstrainedToOptions();
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
			case CanvasPackage.CONFIGURATION_PROPERTY__PREDICATE:
				setPredicate((String)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__LABEL:
				setLabel((String)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__FIXED:
				setFixed((Boolean)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends String>)newValue);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS:
				setConstrainedToOptions((Boolean)newValue);
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
			case CanvasPackage.CONFIGURATION_PROPERTY__PREDICATE:
				setPredicate(PREDICATE_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__FIXED:
				setFixed(FIXED_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__EXAMPLES:
				getExamples().clear();
				return;
			case CanvasPackage.CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS:
				setConstrainedToOptions(CONSTRAINED_TO_OPTIONS_EDEFAULT);
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
			case CanvasPackage.CONFIGURATION_PROPERTY__PREDICATE:
				return PREDICATE_EDEFAULT == null ? predicate != null : !PREDICATE_EDEFAULT.equals(predicate);
			case CanvasPackage.CONFIGURATION_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanvasPackage.CONFIGURATION_PROPERTY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CanvasPackage.CONFIGURATION_PROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CanvasPackage.CONFIGURATION_PROPERTY__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CanvasPackage.CONFIGURATION_PROPERTY__FIXED:
				return fixed != FIXED_EDEFAULT;
			case CanvasPackage.CONFIGURATION_PROPERTY__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
			case CanvasPackage.CONFIGURATION_PROPERTY__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case CanvasPackage.CONFIGURATION_PROPERTY__CONSTRAINED_TO_OPTIONS:
				return constrainedToOptions != CONSTRAINED_TO_OPTIONS_EDEFAULT;
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
		result.append(" (predicate: ");
		result.append(predicate);
		result.append(", name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(", required: ");
		result.append(required);
		result.append(", fixed: ");
		result.append(fixed);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(", examples: ");
		result.append(examples);
		result.append(", constrainedToOptions: ");
		result.append(constrainedToOptions);
		result.append(')');
		return result.toString();
	}

} //ConfigurationPropertyImpl

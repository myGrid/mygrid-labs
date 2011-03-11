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

import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl#getProcessorOutputs <em>Processor Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl#getProcessorInputs <em>Processor Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl#getActivitiy <em>Activitiy</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorImpl#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends EObjectImpl implements Processor {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessorOutputs() <em>Processor Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorOutput> processorOutputs;

	/**
	 * The cached value of the '{@link #getProcessorInputs() <em>Processor Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorInput> processorInputs;

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
	 * The default value of the '{@link #getActivitiy() <em>Activitiy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitiy()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITIY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivitiy() <em>Activitiy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitiy()
	 * @generated
	 * @ordered
	 */
	protected String activitiy = ACTIVITIY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurationProperties() <em>Configuration Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationProperty> configurationProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessorOutput> getProcessorOutputs() {
		if (processorOutputs == null) {
			processorOutputs = new EObjectContainmentEList<ProcessorOutput>(ProcessorOutput.class, this, CanvasPackage.PROCESSOR__PROCESSOR_OUTPUTS);
		}
		return processorOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessorInput> getProcessorInputs() {
		if (processorInputs == null) {
			processorInputs = new EObjectContainmentEList<ProcessorInput>(ProcessorInput.class, this, CanvasPackage.PROCESSOR__PROCESSOR_INPUTS);
		}
		return processorInputs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivitiy() {
		return activitiy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitiy(String newActivitiy) {
		String oldActivitiy = activitiy;
		activitiy = newActivitiy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR__ACTIVITIY, oldActivitiy, activitiy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationProperty> getConfigurationProperties() {
		if (configurationProperties == null) {
			configurationProperties = new EObjectContainmentEList<ConfigurationProperty>(ConfigurationProperty.class, this, CanvasPackage.PROCESSOR__CONFIGURATION_PROPERTIES);
		}
		return configurationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.PROCESSOR__PROCESSOR_OUTPUTS:
				return ((InternalEList<?>)getProcessorOutputs()).basicRemove(otherEnd, msgs);
			case CanvasPackage.PROCESSOR__PROCESSOR_INPUTS:
				return ((InternalEList<?>)getProcessorInputs()).basicRemove(otherEnd, msgs);
			case CanvasPackage.PROCESSOR__CONFIGURATION_PROPERTIES:
				return ((InternalEList<?>)getConfigurationProperties()).basicRemove(otherEnd, msgs);
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
			case CanvasPackage.PROCESSOR__TYPE:
				return getType();
			case CanvasPackage.PROCESSOR__PROCESSOR_OUTPUTS:
				return getProcessorOutputs();
			case CanvasPackage.PROCESSOR__PROCESSOR_INPUTS:
				return getProcessorInputs();
			case CanvasPackage.PROCESSOR__NAME:
				return getName();
			case CanvasPackage.PROCESSOR__LABEL:
				return getLabel();
			case CanvasPackage.PROCESSOR__ACTIVITIY:
				return getActivitiy();
			case CanvasPackage.PROCESSOR__CONFIGURATION_PROPERTIES:
				return getConfigurationProperties();
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
			case CanvasPackage.PROCESSOR__TYPE:
				setType((String)newValue);
				return;
			case CanvasPackage.PROCESSOR__PROCESSOR_OUTPUTS:
				getProcessorOutputs().clear();
				getProcessorOutputs().addAll((Collection<? extends ProcessorOutput>)newValue);
				return;
			case CanvasPackage.PROCESSOR__PROCESSOR_INPUTS:
				getProcessorInputs().clear();
				getProcessorInputs().addAll((Collection<? extends ProcessorInput>)newValue);
				return;
			case CanvasPackage.PROCESSOR__NAME:
				setName((String)newValue);
				return;
			case CanvasPackage.PROCESSOR__LABEL:
				setLabel((String)newValue);
				return;
			case CanvasPackage.PROCESSOR__ACTIVITIY:
				setActivitiy((String)newValue);
				return;
			case CanvasPackage.PROCESSOR__CONFIGURATION_PROPERTIES:
				getConfigurationProperties().clear();
				getConfigurationProperties().addAll((Collection<? extends ConfigurationProperty>)newValue);
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
			case CanvasPackage.PROCESSOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CanvasPackage.PROCESSOR__PROCESSOR_OUTPUTS:
				getProcessorOutputs().clear();
				return;
			case CanvasPackage.PROCESSOR__PROCESSOR_INPUTS:
				getProcessorInputs().clear();
				return;
			case CanvasPackage.PROCESSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanvasPackage.PROCESSOR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CanvasPackage.PROCESSOR__ACTIVITIY:
				setActivitiy(ACTIVITIY_EDEFAULT);
				return;
			case CanvasPackage.PROCESSOR__CONFIGURATION_PROPERTIES:
				getConfigurationProperties().clear();
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
			case CanvasPackage.PROCESSOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CanvasPackage.PROCESSOR__PROCESSOR_OUTPUTS:
				return processorOutputs != null && !processorOutputs.isEmpty();
			case CanvasPackage.PROCESSOR__PROCESSOR_INPUTS:
				return processorInputs != null && !processorInputs.isEmpty();
			case CanvasPackage.PROCESSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanvasPackage.PROCESSOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CanvasPackage.PROCESSOR__ACTIVITIY:
				return ACTIVITIY_EDEFAULT == null ? activitiy != null : !ACTIVITIY_EDEFAULT.equals(activitiy);
			case CanvasPackage.PROCESSOR__CONFIGURATION_PROPERTIES:
				return configurationProperties != null && !configurationProperties.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(", activitiy: ");
		result.append(activitiy);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl

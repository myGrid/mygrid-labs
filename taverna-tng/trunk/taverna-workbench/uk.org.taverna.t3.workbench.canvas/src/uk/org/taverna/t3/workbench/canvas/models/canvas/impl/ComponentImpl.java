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
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl#getComponentOutputs <em>Component Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl#getComponentInputs <em>Component Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl#getOriginalComponentDefinition <em>Original Component Definition</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ComponentImpl#getConfigurationProperties <em>Configuration Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EObjectImpl implements Component {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getComponentOutputs() <em>Component Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentOutput> componentOutputs;

	/**
	 * The cached value of the '{@link #getComponentInputs() <em>Component Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInput> componentInputs;

	/**
	 * The cached value of the '{@link #getOriginalComponentDefinition() <em>Original Component Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinitionReference originalComponentDefinition;

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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.COMPONENT__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.COMPONENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentEList<Processor>(Processor.class, this, CanvasPackage.COMPONENT__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentOutput> getComponentOutputs() {
		if (componentOutputs == null) {
			componentOutputs = new EObjectContainmentEList<ComponentOutput>(ComponentOutput.class, this, CanvasPackage.COMPONENT__COMPONENT_OUTPUTS);
		}
		return componentOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInput> getComponentInputs() {
		if (componentInputs == null) {
			componentInputs = new EObjectContainmentEList<ComponentInput>(ComponentInput.class, this, CanvasPackage.COMPONENT__COMPONENT_INPUTS);
		}
		return componentInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference getOriginalComponentDefinition() {
		if (originalComponentDefinition != null && originalComponentDefinition.eIsProxy()) {
			InternalEObject oldOriginalComponentDefinition = (InternalEObject)originalComponentDefinition;
			originalComponentDefinition = (ComponentDefinitionReference)eResolveProxy(oldOriginalComponentDefinition);
			if (originalComponentDefinition != oldOriginalComponentDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanvasPackage.COMPONENT__ORIGINAL_COMPONENT_DEFINITION, oldOriginalComponentDefinition, originalComponentDefinition));
			}
		}
		return originalComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionReference basicGetOriginalComponentDefinition() {
		return originalComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalComponentDefinition(ComponentDefinitionReference newOriginalComponentDefinition) {
		ComponentDefinitionReference oldOriginalComponentDefinition = originalComponentDefinition;
		originalComponentDefinition = newOriginalComponentDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.COMPONENT__ORIGINAL_COMPONENT_DEFINITION, oldOriginalComponentDefinition, originalComponentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationProperty> getConfigurationProperties() {
		if (configurationProperties == null) {
			configurationProperties = new EObjectContainmentEList<ConfigurationProperty>(ConfigurationProperty.class, this, CanvasPackage.COMPONENT__CONFIGURATION_PROPERTIES);
		}
		return configurationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompound() {
		return getProcessors().size() > 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.COMPONENT__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
			case CanvasPackage.COMPONENT__COMPONENT_OUTPUTS:
				return ((InternalEList<?>)getComponentOutputs()).basicRemove(otherEnd, msgs);
			case CanvasPackage.COMPONENT__COMPONENT_INPUTS:
				return ((InternalEList<?>)getComponentInputs()).basicRemove(otherEnd, msgs);
			case CanvasPackage.COMPONENT__CONFIGURATION_PROPERTIES:
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
			case CanvasPackage.COMPONENT__TITLE:
				return getTitle();
			case CanvasPackage.COMPONENT__LABEL:
				return getLabel();
			case CanvasPackage.COMPONENT__PROCESSORS:
				return getProcessors();
			case CanvasPackage.COMPONENT__COMPONENT_OUTPUTS:
				return getComponentOutputs();
			case CanvasPackage.COMPONENT__COMPONENT_INPUTS:
				return getComponentInputs();
			case CanvasPackage.COMPONENT__ORIGINAL_COMPONENT_DEFINITION:
				if (resolve) return getOriginalComponentDefinition();
				return basicGetOriginalComponentDefinition();
			case CanvasPackage.COMPONENT__CONFIGURATION_PROPERTIES:
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
			case CanvasPackage.COMPONENT__TITLE:
				setTitle((String)newValue);
				return;
			case CanvasPackage.COMPONENT__LABEL:
				setLabel((String)newValue);
				return;
			case CanvasPackage.COMPONENT__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
				return;
			case CanvasPackage.COMPONENT__COMPONENT_OUTPUTS:
				getComponentOutputs().clear();
				getComponentOutputs().addAll((Collection<? extends ComponentOutput>)newValue);
				return;
			case CanvasPackage.COMPONENT__COMPONENT_INPUTS:
				getComponentInputs().clear();
				getComponentInputs().addAll((Collection<? extends ComponentInput>)newValue);
				return;
			case CanvasPackage.COMPONENT__ORIGINAL_COMPONENT_DEFINITION:
				setOriginalComponentDefinition((ComponentDefinitionReference)newValue);
				return;
			case CanvasPackage.COMPONENT__CONFIGURATION_PROPERTIES:
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
			case CanvasPackage.COMPONENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CanvasPackage.COMPONENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CanvasPackage.COMPONENT__PROCESSORS:
				getProcessors().clear();
				return;
			case CanvasPackage.COMPONENT__COMPONENT_OUTPUTS:
				getComponentOutputs().clear();
				return;
			case CanvasPackage.COMPONENT__COMPONENT_INPUTS:
				getComponentInputs().clear();
				return;
			case CanvasPackage.COMPONENT__ORIGINAL_COMPONENT_DEFINITION:
				setOriginalComponentDefinition((ComponentDefinitionReference)null);
				return;
			case CanvasPackage.COMPONENT__CONFIGURATION_PROPERTIES:
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
			case CanvasPackage.COMPONENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CanvasPackage.COMPONENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CanvasPackage.COMPONENT__PROCESSORS:
				return processors != null && !processors.isEmpty();
			case CanvasPackage.COMPONENT__COMPONENT_OUTPUTS:
				return componentOutputs != null && !componentOutputs.isEmpty();
			case CanvasPackage.COMPONENT__COMPONENT_INPUTS:
				return componentInputs != null && !componentInputs.isEmpty();
			case CanvasPackage.COMPONENT__ORIGINAL_COMPONENT_DEFINITION:
				return originalComponentDefinition != null;
			case CanvasPackage.COMPONENT__CONFIGURATION_PROPERTIES:
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
		result.append(" (title: ");
		result.append(title);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl

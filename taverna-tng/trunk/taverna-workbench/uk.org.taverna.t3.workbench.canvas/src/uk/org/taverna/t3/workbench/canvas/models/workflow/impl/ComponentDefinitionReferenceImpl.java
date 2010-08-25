/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uk.org.taverna.t3.workbench.canvas.models.workflow.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.impl.ComponentDefinitionReferenceImpl#getComponentDefinitionId <em>Component Definition Id</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.workflow.impl.ComponentDefinitionReferenceImpl#getDiscoveryUrl <em>Discovery Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentDefinitionReferenceImpl extends EObjectImpl implements ComponentDefinitionReference {
	/**
	 * The default value of the '{@link #getComponentDefinitionId() <em>Component Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_DEFINITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentDefinitionId() <em>Component Definition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinitionId()
	 * @generated
	 * @ordered
	 */
	protected String componentDefinitionId = COMPONENT_DEFINITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscoveryUrl() <em>Discovery Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCOVERY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscoveryUrl() <em>Discovery Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveryUrl()
	 * @generated
	 * @ordered
	 */
	protected String discoveryUrl = DISCOVERY_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDefinitionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPONENT_DEFINITION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentDefinitionId() {
		return componentDefinitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentDefinitionId(String newComponentDefinitionId) {
		String oldComponentDefinitionId = componentDefinitionId;
		componentDefinitionId = newComponentDefinitionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID, oldComponentDefinitionId, componentDefinitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscoveryUrl() {
		return discoveryUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveryUrl(String newDiscoveryUrl) {
		String oldDiscoveryUrl = discoveryUrl;
		discoveryUrl = newDiscoveryUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL, oldDiscoveryUrl, discoveryUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID:
				return getComponentDefinitionId();
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL:
				return getDiscoveryUrl();
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
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID:
				setComponentDefinitionId((String)newValue);
				return;
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL:
				setDiscoveryUrl((String)newValue);
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
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID:
				setComponentDefinitionId(COMPONENT_DEFINITION_ID_EDEFAULT);
				return;
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL:
				setDiscoveryUrl(DISCOVERY_URL_EDEFAULT);
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
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__COMPONENT_DEFINITION_ID:
				return COMPONENT_DEFINITION_ID_EDEFAULT == null ? componentDefinitionId != null : !COMPONENT_DEFINITION_ID_EDEFAULT.equals(componentDefinitionId);
			case WorkflowPackage.COMPONENT_DEFINITION_REFERENCE__DISCOVERY_URL:
				return DISCOVERY_URL_EDEFAULT == null ? discoveryUrl != null : !DISCOVERY_URL_EDEFAULT.equals(discoveryUrl);
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
		result.append(" (componentDefinitionId: ");
		result.append(componentDefinitionId);
		result.append(", discoveryUrl: ");
		result.append(discoveryUrl);
		result.append(')');
		return result.toString();
	}

} //ComponentDefinitionReferenceImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.tng.mockup3.models.workbench.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.org.taverna.tng.mockup3.models.workbench.canvas.Data;

import uk.org.taverna.tng.mockup3.models.workbench.workflow.ComponentInput;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.Receiver;
import uk.org.taverna.tng.mockup3.models.workbench.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.tng.mockup3.models.workbench.workflow.impl.ComponentInputImpl#getDataLinks <em>Data Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInputImpl extends PortImpl implements ComponentInput {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPONENT_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getDataLinks() {
		if (dataLinks == null) {
			dataLinks = new EObjectResolvingEList<Data>(Data.class, this, WorkflowPackage.COMPONENT_INPUT__DATA_LINKS);
		}
		return dataLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				return getDataLinks();
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
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				getDataLinks().clear();
				getDataLinks().addAll((Collection<? extends Data>)newValue);
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
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				getDataLinks().clear();
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
			case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS:
				return dataLinks != null && !dataLinks.isEmpty();
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
		if (baseClass == Receiver.class) {
			switch (derivedFeatureID) {
				case WorkflowPackage.COMPONENT_INPUT__DATA_LINKS: return WorkflowPackage.RECEIVER__DATA_LINKS;
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
		if (baseClass == Receiver.class) {
			switch (baseFeatureID) {
				case WorkflowPackage.RECEIVER__DATA_LINKS: return WorkflowPackage.COMPONENT_INPUT__DATA_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ComponentInputImpl

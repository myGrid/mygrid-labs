/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Port;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.ProcessorOutputImpl#getGranularDepth <em>Granular Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorOutputImpl extends EObjectImpl implements ProcessorOutput {
	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Receiver> receivers;

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
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGranularDepth() <em>Granular Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int GRANULAR_DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGranularDepth() <em>Granular Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGranularDepth()
	 * @generated
	 * @ordered
	 */
	protected int granularDepth = GRANULAR_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.PROCESSOR_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receiver> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectResolvingEList<Receiver>(Receiver.class, this, CanvasPackage.PROCESSOR_OUTPUT__RECEIVERS);
		}
		return receivers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR_OUTPUT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR_OUTPUT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR_OUTPUT__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGranularDepth() {
		return granularDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGranularDepth(int newGranularDepth) {
		int oldGranularDepth = granularDepth;
		granularDepth = newGranularDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.PROCESSOR_OUTPUT__GRANULAR_DEPTH, oldGranularDepth, granularDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanvasPackage.PROCESSOR_OUTPUT__RECEIVERS:
				return getReceivers();
			case CanvasPackage.PROCESSOR_OUTPUT__NAME:
				return getName();
			case CanvasPackage.PROCESSOR_OUTPUT__LABEL:
				return getLabel();
			case CanvasPackage.PROCESSOR_OUTPUT__DEPTH:
				return getDepth();
			case CanvasPackage.PROCESSOR_OUTPUT__GRANULAR_DEPTH:
				return getGranularDepth();
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
			case CanvasPackage.PROCESSOR_OUTPUT__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends Receiver>)newValue);
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__NAME:
				setName((String)newValue);
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__LABEL:
				setLabel((String)newValue);
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__DEPTH:
				setDepth((Integer)newValue);
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__GRANULAR_DEPTH:
				setGranularDepth((Integer)newValue);
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
			case CanvasPackage.PROCESSOR_OUTPUT__RECEIVERS:
				getReceivers().clear();
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case CanvasPackage.PROCESSOR_OUTPUT__GRANULAR_DEPTH:
				setGranularDepth(GRANULAR_DEPTH_EDEFAULT);
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
			case CanvasPackage.PROCESSOR_OUTPUT__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
			case CanvasPackage.PROCESSOR_OUTPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CanvasPackage.PROCESSOR_OUTPUT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CanvasPackage.PROCESSOR_OUTPUT__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case CanvasPackage.PROCESSOR_OUTPUT__GRANULAR_DEPTH:
				return granularDepth != GRANULAR_DEPTH_EDEFAULT;
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
		if (baseClass == Port.class) {
			switch (derivedFeatureID) {
				case CanvasPackage.PROCESSOR_OUTPUT__NAME: return CanvasPackage.PORT__NAME;
				case CanvasPackage.PROCESSOR_OUTPUT__LABEL: return CanvasPackage.PORT__LABEL;
				case CanvasPackage.PROCESSOR_OUTPUT__DEPTH: return CanvasPackage.PORT__DEPTH;
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
		if (baseClass == Port.class) {
			switch (baseFeatureID) {
				case CanvasPackage.PORT__NAME: return CanvasPackage.PROCESSOR_OUTPUT__NAME;
				case CanvasPackage.PORT__LABEL: return CanvasPackage.PROCESSOR_OUTPUT__LABEL;
				case CanvasPackage.PORT__DEPTH: return CanvasPackage.PROCESSOR_OUTPUT__DEPTH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(", depth: ");
		result.append(depth);
		result.append(", granularDepth: ");
		result.append(granularDepth);
		result.append(')');
		return result.toString();
	}

} //ProcessorOutputImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.org.taverna.t3.workbench.canvas.models.canvas.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Strategy Port Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.IterationStrategyPortNodeImpl#getDesiredDepth <em>Desired Depth</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.IterationStrategyPortNodeImpl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterationStrategyPortNodeImpl extends IterationStrategyNodeImpl implements IterationStrategyPortNode {
	/**
	 * The default value of the '{@link #getDesiredDepth() <em>Desired Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DESIRED_DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDesiredDepth() <em>Desired Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredDepth()
	 * @generated
	 * @ordered
	 */
	protected int desiredDepth = DESIRED_DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected ProcessorInput port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterationStrategyPortNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.ITERATION_STRATEGY_PORT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDesiredDepth() {
		return desiredDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesiredDepth(int newDesiredDepth) {
		int oldDesiredDepth = desiredDepth;
		desiredDepth = newDesiredDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.ITERATION_STRATEGY_PORT_NODE__DESIRED_DEPTH, oldDesiredDepth, desiredDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorInput getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (ProcessorInput)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CanvasPackage.ITERATION_STRATEGY_PORT_NODE__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorInput basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(ProcessorInput newPort) {
		ProcessorInput oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CanvasPackage.ITERATION_STRATEGY_PORT_NODE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__DESIRED_DEPTH:
				return getDesiredDepth();
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__PORT:
				if (resolve) return getPort();
				return basicGetPort();
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
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__DESIRED_DEPTH:
				setDesiredDepth((Integer)newValue);
				return;
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__PORT:
				setPort((ProcessorInput)newValue);
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
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__DESIRED_DEPTH:
				setDesiredDepth(DESIRED_DEPTH_EDEFAULT);
				return;
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__PORT:
				setPort((ProcessorInput)null);
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
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__DESIRED_DEPTH:
				return desiredDepth != DESIRED_DEPTH_EDEFAULT;
			case CanvasPackage.ITERATION_STRATEGY_PORT_NODE__PORT:
				return port != null;
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
		result.append(" (desiredDepth: ");
		result.append(desiredDepth);
		result.append(')');
		return result.toString();
	}

} //IterationStrategyPortNodeImpl

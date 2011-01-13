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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Node;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canvas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.org.taverna.t3.workbench.canvas.models.canvas.impl.CanvasImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CanvasImpl extends EObjectImpl implements Canvas {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowInput> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowOutput> outputs;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanvasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CanvasPackage.Literals.CANVAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<WorkflowInput>(WorkflowInput.class, this, CanvasPackage.CANVAS__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowOutput> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<WorkflowOutput>(WorkflowOutput.class, this, CanvasPackage.CANVAS__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, CanvasPackage.CANVAS__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CanvasPackage.CANVAS__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case CanvasPackage.CANVAS__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case CanvasPackage.CANVAS__INPUTS:
				return getInputs();
			case CanvasPackage.CANVAS__OUTPUTS:
				return getOutputs();
			case CanvasPackage.CANVAS__COMPONENTS:
				return getComponents();
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
			case CanvasPackage.CANVAS__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends WorkflowInput>)newValue);
				return;
			case CanvasPackage.CANVAS__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends WorkflowOutput>)newValue);
				return;
			case CanvasPackage.CANVAS__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
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
			case CanvasPackage.CANVAS__INPUTS:
				getInputs().clear();
				return;
			case CanvasPackage.CANVAS__OUTPUTS:
				getOutputs().clear();
				return;
			case CanvasPackage.CANVAS__COMPONENTS:
				getComponents().clear();
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
			case CanvasPackage.CANVAS__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CanvasPackage.CANVAS__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case CanvasPackage.CANVAS__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CanvasImpl

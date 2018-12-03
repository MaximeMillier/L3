/**
 */
package tpNoteActivity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpNoteActivity.ControlFlow;
import tpNoteActivity.Etirement;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.EtirementImpl#getControlflow <em>Controlflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtirementImpl extends MinimalEObjectImpl.Container implements Etirement {
	/**
	 * The cached value of the '{@link #getControlflow() <em>Controlflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlflow()
	 * @generated
	 * @ordered
	 */
	protected ControlFlow controlflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.ETIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow getControlflow() {
		if (controlflow != null && controlflow.eIsProxy()) {
			InternalEObject oldControlflow = (InternalEObject) controlflow;
			controlflow = (ControlFlow) eResolveProxy(oldControlflow);
			if (controlflow != oldControlflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TpNoteActivityPackage.ETIREMENT__CONTROLFLOW, oldControlflow, controlflow));
			}
		}
		return controlflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow basicGetControlflow() {
		return controlflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlflow(ControlFlow newControlflow) {
		ControlFlow oldControlflow = controlflow;
		controlflow = newControlflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.ETIREMENT__CONTROLFLOW,
					oldControlflow, controlflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TpNoteActivityPackage.ETIREMENT__CONTROLFLOW:
			if (resolve)
				return getControlflow();
			return basicGetControlflow();
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
		case TpNoteActivityPackage.ETIREMENT__CONTROLFLOW:
			setControlflow((ControlFlow) newValue);
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
		case TpNoteActivityPackage.ETIREMENT__CONTROLFLOW:
			setControlflow((ControlFlow) null);
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
		case TpNoteActivityPackage.ETIREMENT__CONTROLFLOW:
			return controlflow != null;
		}
		return super.eIsSet(featureID);
	}

} //EtirementImpl

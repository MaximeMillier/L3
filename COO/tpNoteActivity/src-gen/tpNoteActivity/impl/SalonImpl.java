/**
 */
package tpNoteActivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tpNoteActivity.Boire;
import tpNoteActivity.ControlFlow;
import tpNoteActivity.Salon;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.SalonImpl#getBoire <em>Boire</em>}</li>
 *   <li>{@link tpNoteActivity.impl.SalonImpl#getControlflow <em>Controlflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalonImpl extends MinimalEObjectImpl.Container implements Salon {
	/**
	 * The cached value of the '{@link #getBoire() <em>Boire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoire()
	 * @generated
	 * @ordered
	 */
	protected EList<Boire> boire;

	/**
	 * The cached value of the '{@link #getControlflow() <em>Controlflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlflow()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlow> controlflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.SALON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boire> getBoire() {
		if (boire == null) {
			boire = new EObjectContainmentEList<Boire>(Boire.class, this, TpNoteActivityPackage.SALON__BOIRE);
		}
		return boire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlow> getControlflow() {
		if (controlflow == null) {
			controlflow = new EObjectContainmentEList<ControlFlow>(ControlFlow.class, this,
					TpNoteActivityPackage.SALON__CONTROLFLOW);
		}
		return controlflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNoteActivityPackage.SALON__BOIRE:
			return ((InternalEList<?>) getBoire()).basicRemove(otherEnd, msgs);
		case TpNoteActivityPackage.SALON__CONTROLFLOW:
			return ((InternalEList<?>) getControlflow()).basicRemove(otherEnd, msgs);
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
		case TpNoteActivityPackage.SALON__BOIRE:
			return getBoire();
		case TpNoteActivityPackage.SALON__CONTROLFLOW:
			return getControlflow();
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
		case TpNoteActivityPackage.SALON__BOIRE:
			getBoire().clear();
			getBoire().addAll((Collection<? extends Boire>) newValue);
			return;
		case TpNoteActivityPackage.SALON__CONTROLFLOW:
			getControlflow().clear();
			getControlflow().addAll((Collection<? extends ControlFlow>) newValue);
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
		case TpNoteActivityPackage.SALON__BOIRE:
			getBoire().clear();
			return;
		case TpNoteActivityPackage.SALON__CONTROLFLOW:
			getControlflow().clear();
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
		case TpNoteActivityPackage.SALON__BOIRE:
			return boire != null && !boire.isEmpty();
		case TpNoteActivityPackage.SALON__CONTROLFLOW:
			return controlflow != null && !controlflow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SalonImpl

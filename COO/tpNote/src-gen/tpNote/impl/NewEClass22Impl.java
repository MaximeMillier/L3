/**
 */
package tpNote.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tpNote.NewEClass22;
import tpNote.TpNotePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New EClass22</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNote.impl.NewEClass22Impl#getMetastate <em>Metastate</em>}</li>
 *   <li>{@link tpNote.impl.NewEClass22Impl#getState <em>State</em>}</li>
 *   <li>{@link tpNote.impl.NewEClass22Impl#getState2 <em>State2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewEClass22Impl extends MinimalEObjectImpl.Container implements NewEClass22 {
	/**
	 * The cached value of the '{@link #getMetastate() <em>Metastate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetastate()
	 * @generated
	 * @ordered
	 */
	protected EList<metaState> metastate;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<state> state;

	/**
	 * The cached value of the '{@link #getState2() <em>State2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState2()
	 * @generated
	 * @ordered
	 */
	protected EList<state> state2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewEClass22Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNotePackage.Literals.NEW_ECLASS22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<metaState> getMetastate() {
		if (metastate == null) {
			metastate = new EObjectContainmentEList<metaState>(metaState.class, this,
					TpNotePackage.NEW_ECLASS22__METASTATE);
		}
		return metastate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<state> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<state>(state.class, this, TpNotePackage.NEW_ECLASS22__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<state> getState2() {
		if (state2 == null) {
			state2 = new EObjectContainmentEList<state>(state.class, this, TpNotePackage.NEW_ECLASS22__STATE2);
		}
		return state2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNotePackage.NEW_ECLASS22__METASTATE:
			return ((InternalEList<?>) getMetastate()).basicRemove(otherEnd, msgs);
		case TpNotePackage.NEW_ECLASS22__STATE:
			return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
		case TpNotePackage.NEW_ECLASS22__STATE2:
			return ((InternalEList<?>) getState2()).basicRemove(otherEnd, msgs);
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
		case TpNotePackage.NEW_ECLASS22__METASTATE:
			return getMetastate();
		case TpNotePackage.NEW_ECLASS22__STATE:
			return getState();
		case TpNotePackage.NEW_ECLASS22__STATE2:
			return getState2();
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
		case TpNotePackage.NEW_ECLASS22__METASTATE:
			getMetastate().clear();
			getMetastate().addAll((Collection<? extends metaState>) newValue);
			return;
		case TpNotePackage.NEW_ECLASS22__STATE:
			getState().clear();
			getState().addAll((Collection<? extends state>) newValue);
			return;
		case TpNotePackage.NEW_ECLASS22__STATE2:
			getState2().clear();
			getState2().addAll((Collection<? extends state>) newValue);
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
		case TpNotePackage.NEW_ECLASS22__METASTATE:
			getMetastate().clear();
			return;
		case TpNotePackage.NEW_ECLASS22__STATE:
			getState().clear();
			return;
		case TpNotePackage.NEW_ECLASS22__STATE2:
			getState2().clear();
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
		case TpNotePackage.NEW_ECLASS22__METASTATE:
			return metastate != null && !metastate.isEmpty();
		case TpNotePackage.NEW_ECLASS22__STATE:
			return state != null && !state.isEmpty();
		case TpNotePackage.NEW_ECLASS22__STATE2:
			return state2 != null && !state2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NewEClass22Impl

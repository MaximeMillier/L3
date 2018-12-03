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

import tpNoteActivity.Cuisine;
import tpNoteActivity.PrepareLard;
import tpNoteActivity.PrepareOmelette;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cuisine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.CuisineImpl#getPrepareomelette <em>Prepareomelette</em>}</li>
 *   <li>{@link tpNoteActivity.impl.CuisineImpl#getPreparelard <em>Preparelard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CuisineImpl extends MinimalEObjectImpl.Container implements Cuisine {
	/**
	 * The cached value of the '{@link #getPrepareomelette() <em>Prepareomelette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrepareomelette()
	 * @generated
	 * @ordered
	 */
	protected EList<PrepareOmelette> prepareomelette;

	/**
	 * The cached value of the '{@link #getPreparelard() <em>Preparelard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparelard()
	 * @generated
	 * @ordered
	 */
	protected EList<PrepareLard> preparelard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CuisineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.CUISINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrepareOmelette> getPrepareomelette() {
		if (prepareomelette == null) {
			prepareomelette = new EObjectContainmentEList<PrepareOmelette>(PrepareOmelette.class, this,
					TpNoteActivityPackage.CUISINE__PREPAREOMELETTE);
		}
		return prepareomelette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrepareLard> getPreparelard() {
		if (preparelard == null) {
			preparelard = new EObjectContainmentEList<PrepareLard>(PrepareLard.class, this,
					TpNoteActivityPackage.CUISINE__PREPARELARD);
		}
		return preparelard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNoteActivityPackage.CUISINE__PREPAREOMELETTE:
			return ((InternalEList<?>) getPrepareomelette()).basicRemove(otherEnd, msgs);
		case TpNoteActivityPackage.CUISINE__PREPARELARD:
			return ((InternalEList<?>) getPreparelard()).basicRemove(otherEnd, msgs);
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
		case TpNoteActivityPackage.CUISINE__PREPAREOMELETTE:
			return getPrepareomelette();
		case TpNoteActivityPackage.CUISINE__PREPARELARD:
			return getPreparelard();
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
		case TpNoteActivityPackage.CUISINE__PREPAREOMELETTE:
			getPrepareomelette().clear();
			getPrepareomelette().addAll((Collection<? extends PrepareOmelette>) newValue);
			return;
		case TpNoteActivityPackage.CUISINE__PREPARELARD:
			getPreparelard().clear();
			getPreparelard().addAll((Collection<? extends PrepareLard>) newValue);
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
		case TpNoteActivityPackage.CUISINE__PREPAREOMELETTE:
			getPrepareomelette().clear();
			return;
		case TpNoteActivityPackage.CUISINE__PREPARELARD:
			getPreparelard().clear();
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
		case TpNoteActivityPackage.CUISINE__PREPAREOMELETTE:
			return prepareomelette != null && !prepareomelette.isEmpty();
		case TpNoteActivityPackage.CUISINE__PREPARELARD:
			return preparelard != null && !preparelard.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CuisineImpl

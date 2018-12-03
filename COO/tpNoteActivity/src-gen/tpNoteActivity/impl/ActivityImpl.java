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

import tpNoteActivity.Activity;
import tpNoteActivity.Chambre;
import tpNoteActivity.Cuisine;
import tpNoteActivity.SalleDeBain;
import tpNoteActivity.Salon;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.ActivityImpl#getChambre <em>Chambre</em>}</li>
 *   <li>{@link tpNoteActivity.impl.ActivityImpl#getSalledebain <em>Salledebain</em>}</li>
 *   <li>{@link tpNoteActivity.impl.ActivityImpl#getCuisine <em>Cuisine</em>}</li>
 *   <li>{@link tpNoteActivity.impl.ActivityImpl#getSalon <em>Salon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The cached value of the '{@link #getChambre() <em>Chambre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChambre()
	 * @generated
	 * @ordered
	 */
	protected EList<Chambre> chambre;

	/**
	 * The cached value of the '{@link #getSalledebain() <em>Salledebain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalledebain()
	 * @generated
	 * @ordered
	 */
	protected EList<SalleDeBain> salledebain;

	/**
	 * The cached value of the '{@link #getCuisine() <em>Cuisine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCuisine()
	 * @generated
	 * @ordered
	 */
	protected EList<Cuisine> cuisine;

	/**
	 * The cached value of the '{@link #getSalon() <em>Salon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalon()
	 * @generated
	 * @ordered
	 */
	protected EList<Salon> salon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chambre> getChambre() {
		if (chambre == null) {
			chambre = new EObjectContainmentEList<Chambre>(Chambre.class, this,
					TpNoteActivityPackage.ACTIVITY__CHAMBRE);
		}
		return chambre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SalleDeBain> getSalledebain() {
		if (salledebain == null) {
			salledebain = new EObjectContainmentEList<SalleDeBain>(SalleDeBain.class, this,
					TpNoteActivityPackage.ACTIVITY__SALLEDEBAIN);
		}
		return salledebain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cuisine> getCuisine() {
		if (cuisine == null) {
			cuisine = new EObjectContainmentEList<Cuisine>(Cuisine.class, this,
					TpNoteActivityPackage.ACTIVITY__CUISINE);
		}
		return cuisine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Salon> getSalon() {
		if (salon == null) {
			salon = new EObjectContainmentEList<Salon>(Salon.class, this, TpNoteActivityPackage.ACTIVITY__SALON);
		}
		return salon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNoteActivityPackage.ACTIVITY__CHAMBRE:
			return ((InternalEList<?>) getChambre()).basicRemove(otherEnd, msgs);
		case TpNoteActivityPackage.ACTIVITY__SALLEDEBAIN:
			return ((InternalEList<?>) getSalledebain()).basicRemove(otherEnd, msgs);
		case TpNoteActivityPackage.ACTIVITY__CUISINE:
			return ((InternalEList<?>) getCuisine()).basicRemove(otherEnd, msgs);
		case TpNoteActivityPackage.ACTIVITY__SALON:
			return ((InternalEList<?>) getSalon()).basicRemove(otherEnd, msgs);
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
		case TpNoteActivityPackage.ACTIVITY__CHAMBRE:
			return getChambre();
		case TpNoteActivityPackage.ACTIVITY__SALLEDEBAIN:
			return getSalledebain();
		case TpNoteActivityPackage.ACTIVITY__CUISINE:
			return getCuisine();
		case TpNoteActivityPackage.ACTIVITY__SALON:
			return getSalon();
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
		case TpNoteActivityPackage.ACTIVITY__CHAMBRE:
			getChambre().clear();
			getChambre().addAll((Collection<? extends Chambre>) newValue);
			return;
		case TpNoteActivityPackage.ACTIVITY__SALLEDEBAIN:
			getSalledebain().clear();
			getSalledebain().addAll((Collection<? extends SalleDeBain>) newValue);
			return;
		case TpNoteActivityPackage.ACTIVITY__CUISINE:
			getCuisine().clear();
			getCuisine().addAll((Collection<? extends Cuisine>) newValue);
			return;
		case TpNoteActivityPackage.ACTIVITY__SALON:
			getSalon().clear();
			getSalon().addAll((Collection<? extends Salon>) newValue);
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
		case TpNoteActivityPackage.ACTIVITY__CHAMBRE:
			getChambre().clear();
			return;
		case TpNoteActivityPackage.ACTIVITY__SALLEDEBAIN:
			getSalledebain().clear();
			return;
		case TpNoteActivityPackage.ACTIVITY__CUISINE:
			getCuisine().clear();
			return;
		case TpNoteActivityPackage.ACTIVITY__SALON:
			getSalon().clear();
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
		case TpNoteActivityPackage.ACTIVITY__CHAMBRE:
			return chambre != null && !chambre.isEmpty();
		case TpNoteActivityPackage.ACTIVITY__SALLEDEBAIN:
			return salledebain != null && !salledebain.isEmpty();
		case TpNoteActivityPackage.ACTIVITY__CUISINE:
			return cuisine != null && !cuisine.isEmpty();
		case TpNoteActivityPackage.ACTIVITY__SALON:
			return salon != null && !salon.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl

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

import tpNoteActivity.Chambre;
import tpNoteActivity.Dort;
import tpNoteActivity.SeReveille;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chambre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.ChambreImpl#getDort <em>Dort</em>}</li>
 *   <li>{@link tpNoteActivity.impl.ChambreImpl#getSereveille <em>Sereveille</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChambreImpl extends MinimalEObjectImpl.Container implements Chambre {
	/**
	 * The cached value of the '{@link #getDort() <em>Dort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDort()
	 * @generated
	 * @ordered
	 */
	protected EList<Dort> dort;

	/**
	 * The cached value of the '{@link #getSereveille() <em>Sereveille</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSereveille()
	 * @generated
	 * @ordered
	 */
	protected EList<SeReveille> sereveille;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChambreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.CHAMBRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dort> getDort() {
		if (dort == null) {
			dort = new EObjectContainmentEList<Dort>(Dort.class, this, TpNoteActivityPackage.CHAMBRE__DORT);
		}
		return dort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SeReveille> getSereveille() {
		if (sereveille == null) {
			sereveille = new EObjectContainmentEList<SeReveille>(SeReveille.class, this,
					TpNoteActivityPackage.CHAMBRE__SEREVEILLE);
		}
		return sereveille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNoteActivityPackage.CHAMBRE__DORT:
			return ((InternalEList<?>) getDort()).basicRemove(otherEnd, msgs);
		case TpNoteActivityPackage.CHAMBRE__SEREVEILLE:
			return ((InternalEList<?>) getSereveille()).basicRemove(otherEnd, msgs);
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
		case TpNoteActivityPackage.CHAMBRE__DORT:
			return getDort();
		case TpNoteActivityPackage.CHAMBRE__SEREVEILLE:
			return getSereveille();
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
		case TpNoteActivityPackage.CHAMBRE__DORT:
			getDort().clear();
			getDort().addAll((Collection<? extends Dort>) newValue);
			return;
		case TpNoteActivityPackage.CHAMBRE__SEREVEILLE:
			getSereveille().clear();
			getSereveille().addAll((Collection<? extends SeReveille>) newValue);
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
		case TpNoteActivityPackage.CHAMBRE__DORT:
			getDort().clear();
			return;
		case TpNoteActivityPackage.CHAMBRE__SEREVEILLE:
			getSereveille().clear();
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
		case TpNoteActivityPackage.CHAMBRE__DORT:
			return dort != null && !dort.isEmpty();
		case TpNoteActivityPackage.CHAMBRE__SEREVEILLE:
			return sereveille != null && !sereveille.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChambreImpl

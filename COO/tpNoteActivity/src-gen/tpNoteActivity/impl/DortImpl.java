/**
 */
package tpNoteActivity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpNoteActivity.Dort;
import tpNoteActivity.SeReveille;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.DortImpl#getSereveille <em>Sereveille</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DortImpl extends MinimalEObjectImpl.Container implements Dort {
	/**
	 * The cached value of the '{@link #getSereveille() <em>Sereveille</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSereveille()
	 * @generated
	 * @ordered
	 */
	protected SeReveille sereveille;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.DORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeReveille getSereveille() {
		if (sereveille != null && sereveille.eIsProxy()) {
			InternalEObject oldSereveille = (InternalEObject) sereveille;
			sereveille = (SeReveille) eResolveProxy(oldSereveille);
			if (sereveille != oldSereveille) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpNoteActivityPackage.DORT__SEREVEILLE,
							oldSereveille, sereveille));
			}
		}
		return sereveille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeReveille basicGetSereveille() {
		return sereveille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSereveille(SeReveille newSereveille, NotificationChain msgs) {
		SeReveille oldSereveille = sereveille;
		sereveille = newSereveille;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TpNoteActivityPackage.DORT__SEREVEILLE, oldSereveille, newSereveille);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSereveille(SeReveille newSereveille) {
		if (newSereveille != sereveille) {
			NotificationChain msgs = null;
			if (sereveille != null)
				msgs = ((InternalEObject) sereveille).eInverseRemove(this, TpNoteActivityPackage.SE_REVEILLE__DORT,
						SeReveille.class, msgs);
			if (newSereveille != null)
				msgs = ((InternalEObject) newSereveille).eInverseAdd(this, TpNoteActivityPackage.SE_REVEILLE__DORT,
						SeReveille.class, msgs);
			msgs = basicSetSereveille(newSereveille, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.DORT__SEREVEILLE, newSereveille,
					newSereveille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNoteActivityPackage.DORT__SEREVEILLE:
			if (sereveille != null)
				msgs = ((InternalEObject) sereveille).eInverseRemove(this, TpNoteActivityPackage.SE_REVEILLE__DORT,
						SeReveille.class, msgs);
			return basicSetSereveille((SeReveille) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNoteActivityPackage.DORT__SEREVEILLE:
			return basicSetSereveille(null, msgs);
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
		case TpNoteActivityPackage.DORT__SEREVEILLE:
			if (resolve)
				return getSereveille();
			return basicGetSereveille();
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
		case TpNoteActivityPackage.DORT__SEREVEILLE:
			setSereveille((SeReveille) newValue);
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
		case TpNoteActivityPackage.DORT__SEREVEILLE:
			setSereveille((SeReveille) null);
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
		case TpNoteActivityPackage.DORT__SEREVEILLE:
			return sereveille != null;
		}
		return super.eIsSet(featureID);
	}

} //DortImpl

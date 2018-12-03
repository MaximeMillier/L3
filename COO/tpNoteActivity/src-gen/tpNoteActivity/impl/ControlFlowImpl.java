/**
 */
package tpNoteActivity.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tpNoteActivity.BrosseLesDents;
import tpNoteActivity.ControlFlow;
import tpNoteActivity.PrendreBus;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.ControlFlowImpl#isHeureDepart <em>Heure Depart</em>}</li>
 *   <li>{@link tpNoteActivity.impl.ControlFlowImpl#getBrosselesdents <em>Brosselesdents</em>}</li>
 *   <li>{@link tpNoteActivity.impl.ControlFlowImpl#getPrendrebus <em>Prendrebus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlowImpl extends MinimalEObjectImpl.Container implements ControlFlow {
	/**
	 * The default value of the '{@link #isHeureDepart() <em>Heure Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeureDepart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEURE_DEPART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeureDepart() <em>Heure Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeureDepart()
	 * @generated
	 * @ordered
	 */
	protected boolean heureDepart = HEURE_DEPART_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBrosselesdents() <em>Brosselesdents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrosselesdents()
	 * @generated
	 * @ordered
	 */
	protected BrosseLesDents brosselesdents;

	/**
	 * The cached value of the '{@link #getPrendrebus() <em>Prendrebus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrendrebus()
	 * @generated
	 * @ordered
	 */
	protected PrendreBus prendrebus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.CONTROL_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHeureDepart() {
		return heureDepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDepart(boolean newHeureDepart) {
		boolean oldHeureDepart = heureDepart;
		heureDepart = newHeureDepart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.CONTROL_FLOW__HEURE_DEPART,
					oldHeureDepart, heureDepart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrosseLesDents getBrosselesdents() {
		if (brosselesdents != null && brosselesdents.eIsProxy()) {
			InternalEObject oldBrosselesdents = (InternalEObject) brosselesdents;
			brosselesdents = (BrosseLesDents) eResolveProxy(oldBrosselesdents);
			if (brosselesdents != oldBrosselesdents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TpNoteActivityPackage.CONTROL_FLOW__BROSSELESDENTS, oldBrosselesdents, brosselesdents));
			}
		}
		return brosselesdents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrosseLesDents basicGetBrosselesdents() {
		return brosselesdents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrosselesdents(BrosseLesDents newBrosselesdents) {
		BrosseLesDents oldBrosselesdents = brosselesdents;
		brosselesdents = newBrosselesdents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.CONTROL_FLOW__BROSSELESDENTS,
					oldBrosselesdents, brosselesdents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrendreBus getPrendrebus() {
		if (prendrebus != null && prendrebus.eIsProxy()) {
			InternalEObject oldPrendrebus = (InternalEObject) prendrebus;
			prendrebus = (PrendreBus) eResolveProxy(oldPrendrebus);
			if (prendrebus != oldPrendrebus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TpNoteActivityPackage.CONTROL_FLOW__PRENDREBUS, oldPrendrebus, prendrebus));
			}
		}
		return prendrebus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrendreBus basicGetPrendrebus() {
		return prendrebus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrendrebus(PrendreBus newPrendrebus) {
		PrendreBus oldPrendrebus = prendrebus;
		prendrebus = newPrendrebus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.CONTROL_FLOW__PRENDREBUS,
					oldPrendrebus, prendrebus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> DiminutionTimer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TpNoteActivityPackage.CONTROL_FLOW__HEURE_DEPART:
			return isHeureDepart();
		case TpNoteActivityPackage.CONTROL_FLOW__BROSSELESDENTS:
			if (resolve)
				return getBrosselesdents();
			return basicGetBrosselesdents();
		case TpNoteActivityPackage.CONTROL_FLOW__PRENDREBUS:
			if (resolve)
				return getPrendrebus();
			return basicGetPrendrebus();
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
		case TpNoteActivityPackage.CONTROL_FLOW__HEURE_DEPART:
			setHeureDepart((Boolean) newValue);
			return;
		case TpNoteActivityPackage.CONTROL_FLOW__BROSSELESDENTS:
			setBrosselesdents((BrosseLesDents) newValue);
			return;
		case TpNoteActivityPackage.CONTROL_FLOW__PRENDREBUS:
			setPrendrebus((PrendreBus) newValue);
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
		case TpNoteActivityPackage.CONTROL_FLOW__HEURE_DEPART:
			setHeureDepart(HEURE_DEPART_EDEFAULT);
			return;
		case TpNoteActivityPackage.CONTROL_FLOW__BROSSELESDENTS:
			setBrosselesdents((BrosseLesDents) null);
			return;
		case TpNoteActivityPackage.CONTROL_FLOW__PRENDREBUS:
			setPrendrebus((PrendreBus) null);
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
		case TpNoteActivityPackage.CONTROL_FLOW__HEURE_DEPART:
			return heureDepart != HEURE_DEPART_EDEFAULT;
		case TpNoteActivityPackage.CONTROL_FLOW__BROSSELESDENTS:
			return brosselesdents != null;
		case TpNoteActivityPackage.CONTROL_FLOW__PRENDREBUS:
			return prendrebus != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TpNoteActivityPackage.CONTROL_FLOW___DIMINUTION_TIMER:
			return DiminutionTimer();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (HeureDepart: ");
		result.append(heureDepart);
		result.append(')');
		return result.toString();
	}

} //ControlFlowImpl

/**
 */
package tpNote.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tpNote.EventSignal;
import tpNote.SignalEvent;
import tpNote.TpNotePackage;
import tpNote.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNote.impl.TriggerImpl#getSignalevent <em>Signalevent</em>}</li>
 *   <li>{@link tpNote.impl.TriggerImpl#getEventsignal <em>Eventsignal</em>}</li>
 *   <li>{@link tpNote.impl.TriggerImpl#isTick <em>Tick</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The cached value of the '{@link #getSignalevent() <em>Signalevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalevent()
	 * @generated
	 * @ordered
	 */
	protected SignalEvent signalevent;

	/**
	 * The cached value of the '{@link #getEventsignal() <em>Eventsignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventsignal()
	 * @generated
	 * @ordered
	 */
	protected EventSignal eventsignal;

	/**
	 * The default value of the '{@link #isTick() <em>Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTick()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TICK_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isTick() <em>Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTick()
	 * @generated
	 * @ordered
	 */
	protected boolean tick = TICK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNotePackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEvent getSignalevent() {
		if (signalevent != null && signalevent.eIsProxy()) {
			InternalEObject oldSignalevent = (InternalEObject) signalevent;
			signalevent = (SignalEvent) eResolveProxy(oldSignalevent);
			if (signalevent != oldSignalevent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpNotePackage.TRIGGER__SIGNALEVENT,
							oldSignalevent, signalevent));
			}
		}
		return signalevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEvent basicGetSignalevent() {
		return signalevent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalevent(SignalEvent newSignalevent) {
		SignalEvent oldSignalevent = signalevent;
		signalevent = newSignalevent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.TRIGGER__SIGNALEVENT, oldSignalevent,
					signalevent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSignal getEventsignal() {
		if (eventsignal != null && eventsignal.eIsProxy()) {
			InternalEObject oldEventsignal = (InternalEObject) eventsignal;
			eventsignal = (EventSignal) eResolveProxy(oldEventsignal);
			if (eventsignal != oldEventsignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpNotePackage.TRIGGER__EVENTSIGNAL,
							oldEventsignal, eventsignal));
			}
		}
		return eventsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSignal basicGetEventsignal() {
		return eventsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventsignal(EventSignal newEventsignal) {
		EventSignal oldEventsignal = eventsignal;
		eventsignal = newEventsignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.TRIGGER__EVENTSIGNAL, oldEventsignal,
					eventsignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTick() {
		return tick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTick(boolean newTick) {
		boolean oldTick = tick;
		tick = newTick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.TRIGGER__TICK, oldTick, tick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TpNotePackage.TRIGGER__SIGNALEVENT:
			if (resolve)
				return getSignalevent();
			return basicGetSignalevent();
		case TpNotePackage.TRIGGER__EVENTSIGNAL:
			if (resolve)
				return getEventsignal();
			return basicGetEventsignal();
		case TpNotePackage.TRIGGER__TICK:
			return isTick();
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
		case TpNotePackage.TRIGGER__SIGNALEVENT:
			setSignalevent((SignalEvent) newValue);
			return;
		case TpNotePackage.TRIGGER__EVENTSIGNAL:
			setEventsignal((EventSignal) newValue);
			return;
		case TpNotePackage.TRIGGER__TICK:
			setTick((Boolean) newValue);
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
		case TpNotePackage.TRIGGER__SIGNALEVENT:
			setSignalevent((SignalEvent) null);
			return;
		case TpNotePackage.TRIGGER__EVENTSIGNAL:
			setEventsignal((EventSignal) null);
			return;
		case TpNotePackage.TRIGGER__TICK:
			setTick(TICK_EDEFAULT);
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
		case TpNotePackage.TRIGGER__SIGNALEVENT:
			return signalevent != null;
		case TpNotePackage.TRIGGER__EVENTSIGNAL:
			return eventsignal != null;
		case TpNotePackage.TRIGGER__TICK:
			return tick != TICK_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tick: ");
		result.append(tick);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl

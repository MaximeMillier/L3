/**
 */
package tpNoteActivity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tpNoteActivity.ControlFlow;
import tpNoteActivity.Dort;
import tpNoteActivity.SeReveille;
import tpNoteActivity.TpNoteActivityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Se Reveille</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.impl.SeReveilleImpl#isWeekend <em>Weekend</em>}</li>
 *   <li>{@link tpNoteActivity.impl.SeReveilleImpl#getDort <em>Dort</em>}</li>
 *   <li>{@link tpNoteActivity.impl.SeReveilleImpl#getTimer <em>Timer</em>}</li>
 *   <li>{@link tpNoteActivity.impl.SeReveilleImpl#getControlflow <em>Controlflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeReveilleImpl extends MinimalEObjectImpl.Container implements SeReveille {
	/**
	 * The default value of the '{@link #isWeekend() <em>Weekend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeekend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEEKEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeekend() <em>Weekend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeekend()
	 * @generated
	 * @ordered
	 */
	protected boolean weekend = WEEKEND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDort() <em>Dort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDort()
	 * @generated
	 * @ordered
	 */
	protected Dort dort;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> timer;

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
	protected SeReveilleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNoteActivityPackage.Literals.SE_REVEILLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWeekend() {
		return weekend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekend(boolean newWeekend) {
		boolean oldWeekend = weekend;
		weekend = newWeekend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.SE_REVEILLE__WEEKEND,
					oldWeekend, weekend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dort getDort() {
		if (dort != null && dort.eIsProxy()) {
			InternalEObject oldDort = (InternalEObject) dort;
			dort = (Dort) eResolveProxy(oldDort);
			if (dort != oldDort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpNoteActivityPackage.SE_REVEILLE__DORT,
							oldDort, dort));
			}
		}
		return dort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dort basicGetDort() {
		return dort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDort(Dort newDort, NotificationChain msgs) {
		Dort oldDort = dort;
		dort = newDort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TpNoteActivityPackage.SE_REVEILLE__DORT, oldDort, newDort);
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
	public void setDort(Dort newDort) {
		if (newDort != dort) {
			NotificationChain msgs = null;
			if (dort != null)
				msgs = ((InternalEObject) dort).eInverseRemove(this, TpNoteActivityPackage.DORT__SEREVEILLE, Dort.class,
						msgs);
			if (newDort != null)
				msgs = ((InternalEObject) newDort).eInverseAdd(this, TpNoteActivityPackage.DORT__SEREVEILLE, Dort.class,
						msgs);
			msgs = basicSetDort(newDort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.SE_REVEILLE__DORT, newDort,
					newDort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTimer() {
		if (timer == null) {
			timer = new EDataTypeUniqueEList<Integer>(Integer.class, this, TpNoteActivityPackage.SE_REVEILLE__TIMER);
		}
		return timer;
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
							TpNoteActivityPackage.SE_REVEILLE__CONTROLFLOW, oldControlflow, controlflow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TpNoteActivityPackage.SE_REVEILLE__CONTROLFLOW,
					oldControlflow, controlflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNoteActivityPackage.SE_REVEILLE__DORT:
			if (dort != null)
				msgs = ((InternalEObject) dort).eInverseRemove(this, TpNoteActivityPackage.DORT__SEREVEILLE, Dort.class,
						msgs);
			return basicSetDort((Dort) otherEnd, msgs);
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
		case TpNoteActivityPackage.SE_REVEILLE__DORT:
			return basicSetDort(null, msgs);
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
		case TpNoteActivityPackage.SE_REVEILLE__WEEKEND:
			return isWeekend();
		case TpNoteActivityPackage.SE_REVEILLE__DORT:
			if (resolve)
				return getDort();
			return basicGetDort();
		case TpNoteActivityPackage.SE_REVEILLE__TIMER:
			return getTimer();
		case TpNoteActivityPackage.SE_REVEILLE__CONTROLFLOW:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TpNoteActivityPackage.SE_REVEILLE__WEEKEND:
			setWeekend((Boolean) newValue);
			return;
		case TpNoteActivityPackage.SE_REVEILLE__DORT:
			setDort((Dort) newValue);
			return;
		case TpNoteActivityPackage.SE_REVEILLE__TIMER:
			getTimer().clear();
			getTimer().addAll((Collection<? extends Integer>) newValue);
			return;
		case TpNoteActivityPackage.SE_REVEILLE__CONTROLFLOW:
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
		case TpNoteActivityPackage.SE_REVEILLE__WEEKEND:
			setWeekend(WEEKEND_EDEFAULT);
			return;
		case TpNoteActivityPackage.SE_REVEILLE__DORT:
			setDort((Dort) null);
			return;
		case TpNoteActivityPackage.SE_REVEILLE__TIMER:
			getTimer().clear();
			return;
		case TpNoteActivityPackage.SE_REVEILLE__CONTROLFLOW:
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
		case TpNoteActivityPackage.SE_REVEILLE__WEEKEND:
			return weekend != WEEKEND_EDEFAULT;
		case TpNoteActivityPackage.SE_REVEILLE__DORT:
			return dort != null;
		case TpNoteActivityPackage.SE_REVEILLE__TIMER:
			return timer != null && !timer.isEmpty();
		case TpNoteActivityPackage.SE_REVEILLE__CONTROLFLOW:
			return controlflow != null;
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
		result.append(" (weekend: ");
		result.append(weekend);
		result.append(", timer: ");
		result.append(timer);
		result.append(')');
		return result.toString();
	}

} //SeReveilleImpl

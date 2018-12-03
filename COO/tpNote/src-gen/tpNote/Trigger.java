/**
 */
package tpNote;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.Trigger#getSignalevent <em>Signalevent</em>}</li>
 *   <li>{@link tpNote.Trigger#getEventsignal <em>Eventsignal</em>}</li>
 *   <li>{@link tpNote.Trigger#isTick <em>Tick</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Signalevent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signalevent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signalevent</em>' reference.
	 * @see #setSignalevent(SignalEvent)
	 * @see tpNote.TpNotePackage#getTrigger_Signalevent()
	 * @model
	 * @generated
	 */
	SignalEvent getSignalevent();

	/**
	 * Sets the value of the '{@link tpNote.Trigger#getSignalevent <em>Signalevent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalevent</em>' reference.
	 * @see #getSignalevent()
	 * @generated
	 */
	void setSignalevent(SignalEvent value);

	/**
	 * Returns the value of the '<em><b>Eventsignal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventsignal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventsignal</em>' reference.
	 * @see #setEventsignal(EventSignal)
	 * @see tpNote.TpNotePackage#getTrigger_Eventsignal()
	 * @model
	 * @generated
	 */
	EventSignal getEventsignal();

	/**
	 * Sets the value of the '{@link tpNote.Trigger#getEventsignal <em>Eventsignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventsignal</em>' reference.
	 * @see #getEventsignal()
	 * @generated
	 */
	void setEventsignal(EventSignal value);

	/**
	 * Returns the value of the '<em><b>Tick</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick</em>' attribute.
	 * @see #setTick(boolean)
	 * @see tpNote.TpNotePackage#getTrigger_Tick()
	 * @model default="true"
	 * @generated
	 */
	boolean isTick();

	/**
	 * Sets the value of the '{@link tpNote.Trigger#isTick <em>Tick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick</em>' attribute.
	 * @see #isTick()
	 * @generated
	 */
	void setTick(boolean value);

} // Trigger

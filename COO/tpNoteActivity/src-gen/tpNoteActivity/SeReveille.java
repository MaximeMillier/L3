/**
 */
package tpNoteActivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Se Reveille</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.SeReveille#isWeekend <em>Weekend</em>}</li>
 *   <li>{@link tpNoteActivity.SeReveille#getDort <em>Dort</em>}</li>
 *   <li>{@link tpNoteActivity.SeReveille#getTimer <em>Timer</em>}</li>
 *   <li>{@link tpNoteActivity.SeReveille#getControlflow <em>Controlflow</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getSeReveille()
 * @model
 * @generated
 */
public interface SeReveille extends EObject {
	/**
	 * Returns the value of the '<em><b>Weekend</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weekend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekend</em>' attribute.
	 * @see #setWeekend(boolean)
	 * @see tpNoteActivity.TpNoteActivityPackage#getSeReveille_Weekend()
	 * @model default="false"
	 * @generated
	 */
	boolean isWeekend();

	/**
	 * Sets the value of the '{@link tpNoteActivity.SeReveille#isWeekend <em>Weekend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekend</em>' attribute.
	 * @see #isWeekend()
	 * @generated
	 */
	void setWeekend(boolean value);

	/**
	 * Returns the value of the '<em><b>Dort</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tpNoteActivity.Dort#getSereveille <em>Sereveille</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dort</em>' reference.
	 * @see #setDort(Dort)
	 * @see tpNoteActivity.TpNoteActivityPackage#getSeReveille_Dort()
	 * @see tpNoteActivity.Dort#getSereveille
	 * @model opposite="sereveille"
	 * @generated
	 */
	Dort getDort();

	/**
	 * Sets the value of the '{@link tpNoteActivity.SeReveille#getDort <em>Dort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dort</em>' reference.
	 * @see #getDort()
	 * @generated
	 */
	void setDort(Dort value);

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getSeReveille_Timer()
	 * @model upper="60"
	 * @generated
	 */
	EList<Integer> getTimer();

	/**
	 * Returns the value of the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlflow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlflow</em>' reference.
	 * @see #setControlflow(ControlFlow)
	 * @see tpNoteActivity.TpNoteActivityPackage#getSeReveille_Controlflow()
	 * @model
	 * @generated
	 */
	ControlFlow getControlflow();

	/**
	 * Sets the value of the '{@link tpNoteActivity.SeReveille#getControlflow <em>Controlflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlflow</em>' reference.
	 * @see #getControlflow()
	 * @generated
	 */
	void setControlflow(ControlFlow value);

} // SeReveille

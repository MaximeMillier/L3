/**
 */
package tpNote;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.StateMachine#getNeweclass22 <em>Neweclass22</em>}</li>
 *   <li>{@link tpNote.StateMachine#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Neweclass22</b></em>' containment reference list.
	 * The list contents are of type {@link tpNote.NewEClass22}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neweclass22</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neweclass22</em>' containment reference list.
	 * @see tpNote.TpNotePackage#getStateMachine_Neweclass22()
	 * @model containment="true"
	 * @generated
	 */
	EList<NewEClass22> getNeweclass22();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"state"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tpNote.TpNotePackage#getStateMachine_Name()
	 * @model default="state"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tpNote.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StateMachine

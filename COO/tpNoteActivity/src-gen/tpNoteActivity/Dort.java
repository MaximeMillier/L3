/**
 */
package tpNoteActivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.Dort#getSereveille <em>Sereveille</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getDort()
 * @model
 * @generated
 */
public interface Dort extends EObject {
	/**
	 * Returns the value of the '<em><b>Sereveille</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tpNoteActivity.SeReveille#getDort <em>Dort</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sereveille</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sereveille</em>' reference.
	 * @see #setSereveille(SeReveille)
	 * @see tpNoteActivity.TpNoteActivityPackage#getDort_Sereveille()
	 * @see tpNoteActivity.SeReveille#getDort
	 * @model opposite="dort"
	 * @generated
	 */
	SeReveille getSereveille();

	/**
	 * Sets the value of the '{@link tpNoteActivity.Dort#getSereveille <em>Sereveille</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sereveille</em>' reference.
	 * @see #getSereveille()
	 * @generated
	 */
	void setSereveille(SeReveille value);

} // Dort

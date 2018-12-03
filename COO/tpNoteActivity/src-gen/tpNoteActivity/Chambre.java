/**
 */
package tpNoteActivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chambre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.Chambre#getDort <em>Dort</em>}</li>
 *   <li>{@link tpNoteActivity.Chambre#getSereveille <em>Sereveille</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getChambre()
 * @model
 * @generated
 */
public interface Chambre extends EObject {
	/**
	 * Returns the value of the '<em><b>Dort</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.Dort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dort</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getChambre_Dort()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dort> getDort();

	/**
	 * Returns the value of the '<em><b>Sereveille</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.SeReveille}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sereveille</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sereveille</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getChambre_Sereveille()
	 * @model containment="true"
	 * @generated
	 */
	EList<SeReveille> getSereveille();

} // Chambre

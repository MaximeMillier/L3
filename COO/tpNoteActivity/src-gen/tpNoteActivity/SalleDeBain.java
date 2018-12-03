/**
 */
package tpNoteActivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salle De Bain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.SalleDeBain#getDouche <em>Douche</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getSalleDeBain()
 * @model
 * @generated
 */
public interface SalleDeBain extends EObject {
	/**
	 * Returns the value of the '<em><b>Douche</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.Douche}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Douche</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Douche</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getSalleDeBain_Douche()
	 * @model containment="true"
	 * @generated
	 */
	EList<Douche> getDouche();

} // SalleDeBain

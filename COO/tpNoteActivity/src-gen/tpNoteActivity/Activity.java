/**
 */
package tpNoteActivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.Activity#getChambre <em>Chambre</em>}</li>
 *   <li>{@link tpNoteActivity.Activity#getSalledebain <em>Salledebain</em>}</li>
 *   <li>{@link tpNoteActivity.Activity#getCuisine <em>Cuisine</em>}</li>
 *   <li>{@link tpNoteActivity.Activity#getSalon <em>Salon</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Chambre</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.Chambre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chambre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chambre</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getActivity_Chambre()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chambre> getChambre();

	/**
	 * Returns the value of the '<em><b>Salledebain</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.SalleDeBain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salledebain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salledebain</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getActivity_Salledebain()
	 * @model containment="true"
	 * @generated
	 */
	EList<SalleDeBain> getSalledebain();

	/**
	 * Returns the value of the '<em><b>Cuisine</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.Cuisine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cuisine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuisine</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getActivity_Cuisine()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cuisine> getCuisine();

	/**
	 * Returns the value of the '<em><b>Salon</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.Salon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salon</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getActivity_Salon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Salon> getSalon();

} // Activity

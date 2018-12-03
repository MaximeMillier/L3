/**
 */
package tpNoteActivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.Salon#getBoire <em>Boire</em>}</li>
 *   <li>{@link tpNoteActivity.Salon#getControlflow <em>Controlflow</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getSalon()
 * @model
 * @generated
 */
public interface Salon extends EObject {
	/**
	 * Returns the value of the '<em><b>Boire</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.Boire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boire</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getSalon_Boire()
	 * @model containment="true"
	 * @generated
	 */
	EList<Boire> getBoire();

	/**
	 * Returns the value of the '<em><b>Controlflow</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.ControlFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlflow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlflow</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getSalon_Controlflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlFlow> getControlflow();

} // Salon

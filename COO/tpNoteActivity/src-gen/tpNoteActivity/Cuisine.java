/**
 */
package tpNoteActivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cuisine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.Cuisine#getPrepareomelette <em>Prepareomelette</em>}</li>
 *   <li>{@link tpNoteActivity.Cuisine#getPreparelard <em>Preparelard</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getCuisine()
 * @model
 * @generated
 */
public interface Cuisine extends EObject {
	/**
	 * Returns the value of the '<em><b>Prepareomelette</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.PrepareOmelette}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prepareomelette</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepareomelette</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getCuisine_Prepareomelette()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrepareOmelette> getPrepareomelette();

	/**
	 * Returns the value of the '<em><b>Preparelard</b></em>' containment reference list.
	 * The list contents are of type {@link tpNoteActivity.PrepareLard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preparelard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preparelard</em>' containment reference list.
	 * @see tpNoteActivity.TpNoteActivityPackage#getCuisine_Preparelard()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrepareLard> getPreparelard();

} // Cuisine

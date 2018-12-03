/**
 */
package tpNoteActivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brosse Les Dents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.BrosseLesDents#getControlflow <em>Controlflow</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getBrosseLesDents()
 * @model
 * @generated
 */
public interface BrosseLesDents extends EObject {
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
	 * @see tpNoteActivity.TpNoteActivityPackage#getBrosseLesDents_Controlflow()
	 * @model
	 * @generated
	 */
	ControlFlow getControlflow();

	/**
	 * Sets the value of the '{@link tpNoteActivity.BrosseLesDents#getControlflow <em>Controlflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlflow</em>' reference.
	 * @see #getControlflow()
	 * @generated
	 */
	void setControlflow(ControlFlow value);

} // BrosseLesDents

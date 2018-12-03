/**
 */
package tpNoteActivity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>preparer Assiete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.preparerAssiete#getControlflow <em>Controlflow</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getpreparerAssiete()
 * @model
 * @generated
 */
public interface preparerAssiete extends EObject {
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
	 * @see tpNoteActivity.TpNoteActivityPackage#getpreparerAssiete_Controlflow()
	 * @model
	 * @generated
	 */
	ControlFlow getControlflow();

	/**
	 * Sets the value of the '{@link tpNoteActivity.preparerAssiete#getControlflow <em>Controlflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlflow</em>' reference.
	 * @see #getControlflow()
	 * @generated
	 */
	void setControlflow(ControlFlow value);

} // preparerAssiete

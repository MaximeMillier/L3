/**
 */
package tpNote;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New EClass22</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.NewEClass22#getMetastate <em>Metastate</em>}</li>
 *   <li>{@link tpNote.NewEClass22#getState <em>State</em>}</li>
 *   <li>{@link tpNote.NewEClass22#getState2 <em>State2</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getNewEClass22()
 * @model
 * @generated
 */
public interface NewEClass22 extends EObject {
	/**
	 * Returns the value of the '<em><b>Metastate</b></em>' containment reference list.
	 * The list contents are of type {@link metaState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metastate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metastate</em>' containment reference list.
	 * @see tpNote.TpNotePackage#getNewEClass22_Metastate()
	 * @model type="tpNote.MetaState" containment="true"
	 * @generated
	 */
	EList<metaState> getMetastate();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link state}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see tpNote.TpNotePackage#getNewEClass22_State()
	 * @model type="tpNote.State" containment="true"
	 * @generated
	 */
	EList<state> getState();

	/**
	 * Returns the value of the '<em><b>State2</b></em>' containment reference list.
	 * The list contents are of type {@link state}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State2</em>' containment reference list.
	 * @see tpNote.TpNotePackage#getNewEClass22_State2()
	 * @model type="tpNote.State2" containment="true"
	 * @generated
	 */
	EList<state> getState2();

} // NewEClass22

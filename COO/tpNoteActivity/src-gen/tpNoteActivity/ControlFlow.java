/**
 */
package tpNoteActivity;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}</li>
 *   <li>{@link tpNoteActivity.ControlFlow#getBrosselesdents <em>Brosselesdents</em>}</li>
 *   <li>{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}</li>
 * </ul>
 *
 * @see tpNoteActivity.TpNoteActivityPackage#getControlFlow()
 * @model
 * @generated
 */
public interface ControlFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Heure Depart</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Depart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Depart</em>' attribute.
	 * @see #setHeureDepart(boolean)
	 * @see tpNoteActivity.TpNoteActivityPackage#getControlFlow_HeureDepart()
	 * @model default="false"
	 * @generated
	 */
	boolean isHeureDepart();

	/**
	 * Sets the value of the '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Depart</em>' attribute.
	 * @see #isHeureDepart()
	 * @generated
	 */
	void setHeureDepart(boolean value);

	/**
	 * Returns the value of the '<em><b>Brosselesdents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brosselesdents</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brosselesdents</em>' reference.
	 * @see #setBrosselesdents(BrosseLesDents)
	 * @see tpNoteActivity.TpNoteActivityPackage#getControlFlow_Brosselesdents()
	 * @model
	 * @generated
	 */
	BrosseLesDents getBrosselesdents();

	/**
	 * Sets the value of the '{@link tpNoteActivity.ControlFlow#getBrosselesdents <em>Brosselesdents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brosselesdents</em>' reference.
	 * @see #getBrosselesdents()
	 * @generated
	 */
	void setBrosselesdents(BrosseLesDents value);

	/**
	 * Returns the value of the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prendrebus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prendrebus</em>' reference.
	 * @see #setPrendrebus(PrendreBus)
	 * @see tpNoteActivity.TpNoteActivityPackage#getControlFlow_Prendrebus()
	 * @model
	 * @generated
	 */
	PrendreBus getPrendrebus();

	/**
	 * Sets the value of the '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prendrebus</em>' reference.
	 * @see #getPrendrebus()
	 * @generated
	 */
	void setPrendrebus(PrendreBus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model lower="16" upper="44"
	 * @generated
	 */
	EList<Integer> DiminutionTimer();

} // ControlFlow

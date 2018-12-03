/**
 */
package tpNoteActivity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tpNoteActivity.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tpNoteActivity.TpNoteActivityPackage
 * @generated
 */
public class TpNoteActivitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TpNoteActivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteActivitySwitch() {
		if (modelPackage == null) {
			modelPackage = TpNoteActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case TpNoteActivityPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CHAMBRE: {
			Chambre chambre = (Chambre) theEObject;
			T result = caseChambre(chambre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.SALLE_DE_BAIN: {
			SalleDeBain salleDeBain = (SalleDeBain) theEObject;
			T result = caseSalleDeBain(salleDeBain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CUISINE: {
			Cuisine cuisine = (Cuisine) theEObject;
			T result = caseCuisine(cuisine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.SALON: {
			Salon salon = (Salon) theEObject;
			T result = caseSalon(salon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.DORT: {
			Dort dort = (Dort) theEObject;
			T result = caseDort(dort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.SE_REVEILLE: {
			SeReveille seReveille = (SeReveille) theEObject;
			T result = caseSeReveille(seReveille);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseTpNoteActivity_ControlFlow(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow_1(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.DOUCHE: {
			Douche douche = (Douche) theEObject;
			T result = caseDouche(douche);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow_2(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.PREPARE_OMELETTE: {
			PrepareOmelette prepareOmelette = (PrepareOmelette) theEObject;
			T result = casePrepareOmelette(prepareOmelette);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.PREPARE_LARD: {
			PrepareLard prepareLard = (PrepareLard) theEObject;
			T result = casePrepareLard(prepareLard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.BOIRE: {
			Boire boire = (Boire) theEObject;
			T result = caseBoire(boire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow_3(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow_4(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow_5(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.ETIREMENT: {
			Etirement etirement = (Etirement) theEObject;
			T result = caseEtirement(etirement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.PREPARER_ASSIETE: {
			preparerAssiete preparerAssiete = (preparerAssiete) theEObject;
			T result = casepreparerAssiete(preparerAssiete);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.RECITER_PROGRAMME: {
			ReciterProgramme reciterProgramme = (ReciterProgramme) theEObject;
			T result = caseReciterProgramme(reciterProgramme);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.PROFITE: {
			Profite profite = (Profite) theEObject;
			T result = caseProfite(profite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.CONTROL_FLOW: {
			ControlFlow controlFlow = (ControlFlow) theEObject;
			T result = caseControlFlow_6(controlFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.BROSSE_LES_DENTS: {
			BrosseLesDents brosseLesDents = (BrosseLesDents) theEObject;
			T result = caseBrosseLesDents(brosseLesDents);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case TpNoteActivityPackage.PRENDRE_BUS: {
			PrendreBus prendreBus = (PrendreBus) theEObject;
			T result = casePrendreBus(prendreBus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chambre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chambre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChambre(Chambre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salle De Bain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salle De Bain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalleDeBain(SalleDeBain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cuisine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cuisine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuisine(Cuisine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalon(Salon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDort(Dort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Se Reveille</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Se Reveille</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeReveille(SeReveille object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTpNoteActivity_ControlFlow(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_1(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Douche</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Douche</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDouche(Douche object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_2(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prepare Omelette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prepare Omelette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrepareOmelette(PrepareOmelette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prepare Lard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prepare Lard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrepareLard(PrepareLard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoire(Boire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_3(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_4(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_5(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtirement(Etirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>preparer Assiete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>preparer Assiete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepreparerAssiete(preparerAssiete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reciter Programme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reciter Programme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReciterProgramme(ReciterProgramme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfite(Profite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlFlow_6(ControlFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brosse Les Dents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brosse Les Dents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrosseLesDents(BrosseLesDents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prendre Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prendre Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrendreBus(PrendreBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TpNoteActivitySwitch

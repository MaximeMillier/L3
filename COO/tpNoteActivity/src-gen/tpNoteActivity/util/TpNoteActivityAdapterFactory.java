/**
 */
package tpNoteActivity.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tpNoteActivity.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tpNoteActivity.TpNoteActivityPackage
 * @generated
 */
public class TpNoteActivityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TpNoteActivityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteActivityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TpNoteActivityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TpNoteActivitySwitch<Adapter> modelSwitch = new TpNoteActivitySwitch<Adapter>() {
		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseChambre(Chambre object) {
			return createChambreAdapter();
		}

		@Override
		public Adapter caseSalleDeBain(SalleDeBain object) {
			return createSalleDeBainAdapter();
		}

		@Override
		public Adapter caseCuisine(Cuisine object) {
			return createCuisineAdapter();
		}

		@Override
		public Adapter caseSalon(Salon object) {
			return createSalonAdapter();
		}

		@Override
		public Adapter caseDort(Dort object) {
			return createDortAdapter();
		}

		@Override
		public Adapter caseSeReveille(SeReveille object) {
			return createSeReveilleAdapter();
		}

		@Override
		public Adapter caseControlFlow(ControlFlow object) {
			return createControlFlowAdapter();
		}

		@Override
		public Adapter caseTpNoteActivity_ControlFlow(ControlFlow object) {
			return createTpNoteActivity_ControlFlowAdapter();
		}

		@Override
		public Adapter caseControlFlow_1(ControlFlow object) {
			return createControlFlow_1Adapter();
		}

		@Override
		public Adapter caseDouche(Douche object) {
			return createDoucheAdapter();
		}

		@Override
		public Adapter caseControlFlow_2(ControlFlow object) {
			return createControlFlow_2Adapter();
		}

		@Override
		public Adapter casePrepareOmelette(PrepareOmelette object) {
			return createPrepareOmeletteAdapter();
		}

		@Override
		public Adapter casePrepareLard(PrepareLard object) {
			return createPrepareLardAdapter();
		}

		@Override
		public Adapter caseBoire(Boire object) {
			return createBoireAdapter();
		}

		@Override
		public Adapter caseControlFlow_3(ControlFlow object) {
			return createControlFlow_3Adapter();
		}

		@Override
		public Adapter caseControlFlow_4(ControlFlow object) {
			return createControlFlow_4Adapter();
		}

		@Override
		public Adapter caseControlFlow_5(ControlFlow object) {
			return createControlFlow_5Adapter();
		}

		@Override
		public Adapter caseEtirement(Etirement object) {
			return createEtirementAdapter();
		}

		@Override
		public Adapter casepreparerAssiete(preparerAssiete object) {
			return createpreparerAssieteAdapter();
		}

		@Override
		public Adapter caseReciterProgramme(ReciterProgramme object) {
			return createReciterProgrammeAdapter();
		}

		@Override
		public Adapter caseProfite(Profite object) {
			return createProfiteAdapter();
		}

		@Override
		public Adapter caseControlFlow_6(ControlFlow object) {
			return createControlFlow_6Adapter();
		}

		@Override
		public Adapter caseBrosseLesDents(BrosseLesDents object) {
			return createBrosseLesDentsAdapter();
		}

		@Override
		public Adapter casePrendreBus(PrendreBus object) {
			return createPrendreBusAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Chambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Chambre
	 * @generated
	 */
	public Adapter createChambreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.SalleDeBain <em>Salle De Bain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.SalleDeBain
	 * @generated
	 */
	public Adapter createSalleDeBainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Cuisine <em>Cuisine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Cuisine
	 * @generated
	 */
	public Adapter createCuisineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Salon <em>Salon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Salon
	 * @generated
	 */
	public Adapter createSalonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Dort <em>Dort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Dort
	 * @generated
	 */
	public Adapter createDortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.SeReveille <em>Se Reveille</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.SeReveille
	 * @generated
	 */
	public Adapter createSeReveilleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createTpNoteActivity_ControlFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlow_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Douche <em>Douche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Douche
	 * @generated
	 */
	public Adapter createDoucheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlow_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.PrepareOmelette <em>Prepare Omelette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.PrepareOmelette
	 * @generated
	 */
	public Adapter createPrepareOmeletteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.PrepareLard <em>Prepare Lard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.PrepareLard
	 * @generated
	 */
	public Adapter createPrepareLardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Boire <em>Boire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Boire
	 * @generated
	 */
	public Adapter createBoireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlow_3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlow_4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlow_5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Etirement <em>Etirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Etirement
	 * @generated
	 */
	public Adapter createEtirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.preparerAssiete <em>preparer Assiete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.preparerAssiete
	 * @generated
	 */
	public Adapter createpreparerAssieteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ReciterProgramme <em>Reciter Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ReciterProgramme
	 * @generated
	 */
	public Adapter createReciterProgrammeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.Profite <em>Profite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.Profite
	 * @generated
	 */
	public Adapter createProfiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	public Adapter createControlFlow_6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.BrosseLesDents <em>Brosse Les Dents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.BrosseLesDents
	 * @generated
	 */
	public Adapter createBrosseLesDentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNoteActivity.PrendreBus <em>Prendre Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNoteActivity.PrendreBus
	 * @generated
	 */
	public Adapter createPrendreBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TpNoteActivityAdapterFactory

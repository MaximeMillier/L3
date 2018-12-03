/**
 */
package tpNoteActivity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tpNoteActivity.Activity;
import tpNoteActivity.Boire;
import tpNoteActivity.BrosseLesDents;
import tpNoteActivity.Chambre;
import tpNoteActivity.ControlFlow;
import tpNoteActivity.Cuisine;
import tpNoteActivity.Dort;
import tpNoteActivity.Douche;
import tpNoteActivity.Etirement;
import tpNoteActivity.PrendreBus;
import tpNoteActivity.PrepareLard;
import tpNoteActivity.PrepareOmelette;
import tpNoteActivity.Profite;
import tpNoteActivity.ReciterProgramme;
import tpNoteActivity.SalleDeBain;
import tpNoteActivity.Salon;
import tpNoteActivity.SeReveille;
import tpNoteActivity.TpNoteActivityFactory;
import tpNoteActivity.TpNoteActivityPackage;
import tpNoteActivity.preparerAssiete;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TpNoteActivityPackageImpl extends EPackageImpl implements TpNoteActivityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chambreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salleDeBainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuisineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seReveilleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doucheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prepareOmeletteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prepareLardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparerAssieteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reciterProgrammeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brosseLesDentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prendreBusEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tpNoteActivity.TpNoteActivityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TpNoteActivityPackageImpl() {
		super(eNS_URI, TpNoteActivityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TpNoteActivityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TpNoteActivityPackage init() {
		if (isInited)
			return (TpNoteActivityPackage) EPackage.Registry.INSTANCE.getEPackage(TpNoteActivityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTpNoteActivityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TpNoteActivityPackageImpl theTpNoteActivityPackage = registeredTpNoteActivityPackage instanceof TpNoteActivityPackageImpl
				? (TpNoteActivityPackageImpl) registeredTpNoteActivityPackage
				: new TpNoteActivityPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTpNoteActivityPackage.createPackageContents();

		// Initialize created meta-data
		theTpNoteActivityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTpNoteActivityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TpNoteActivityPackage.eNS_URI, theTpNoteActivityPackage);
		return theTpNoteActivityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Chambre() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Salledebain() {
		return (EReference) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Cuisine() {
		return (EReference) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Salon() {
		return (EReference) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChambre() {
		return chambreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChambre_Dort() {
		return (EReference) chambreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChambre_Sereveille() {
		return (EReference) chambreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalleDeBain() {
		return salleDeBainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalleDeBain_Douche() {
		return (EReference) salleDeBainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuisine() {
		return cuisineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuisine_Prepareomelette() {
		return (EReference) cuisineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCuisine_Preparelard() {
		return (EReference) cuisineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalon() {
		return salonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalon_Boire() {
		return (EReference) salonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalon_Controlflow() {
		return (EReference) salonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDort() {
		return dortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDort_Sereveille() {
		return (EReference) dortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeReveille() {
		return seReveilleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeReveille_Weekend() {
		return (EAttribute) seReveilleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeReveille_Dort() {
		return (EReference) seReveilleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeReveille_Timer() {
		return (EAttribute) seReveilleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeReveille_Controlflow() {
		return (EReference) seReveilleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Douche() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlFlow__DiminutionTimer() {
		return controlFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Boire() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlFlow__DiminutionTimer() {
		return controlFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prepareomelette() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Preparelard() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlFlow__DiminutionTimer() {
		return controlFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouche() {
		return doucheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDouche_Controlflow() {
		return (EReference) doucheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Etirement() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrepareOmelette() {
		return prepareOmeletteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrepareOmelette_Controlflow() {
		return (EReference) prepareOmeletteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrepareLard() {
		return prepareLardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrepareLard_Controlflow() {
		return (EReference) prepareLardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoire() {
		return boireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoire_Controlflow() {
		return (EReference) boireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlFlow__DiminutionTimer() {
		return controlFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Neweclass22() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlFlow__DiminutionTimer() {
		return controlFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Preparerassiete() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Reciterprogramme() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtirement() {
		return etirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtirement_Controlflow() {
		return (EReference) etirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpreparerAssiete() {
		return preparerAssieteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpreparerAssiete_Controlflow() {
		return (EReference) preparerAssieteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReciterProgramme() {
		return reciterProgrammeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReciterProgramme_Controlflow() {
		return (EReference) reciterProgrammeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfite() {
		return profiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfite_Controlflow() {
		return (EReference) profiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlFlow_HeureDepart() {
		return (EAttribute) controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Brosselesdents() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Prendrebus() {
		return (EReference) controlFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlFlow__DiminutionTimer() {
		return controlFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrosseLesDents() {
		return brosseLesDentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrosseLesDents_Controlflow() {
		return (EReference) brosseLesDentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrendreBus() {
		return prendreBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteActivityFactory getTpNoteActivityFactory() {
		return (TpNoteActivityFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__CHAMBRE);
		createEReference(activityEClass, ACTIVITY__SALLEDEBAIN);
		createEReference(activityEClass, ACTIVITY__CUISINE);
		createEReference(activityEClass, ACTIVITY__SALON);

		chambreEClass = createEClass(CHAMBRE);
		createEReference(chambreEClass, CHAMBRE__DORT);
		createEReference(chambreEClass, CHAMBRE__SEREVEILLE);

		salleDeBainEClass = createEClass(SALLE_DE_BAIN);
		createEReference(salleDeBainEClass, SALLE_DE_BAIN__DOUCHE);

		cuisineEClass = createEClass(CUISINE);
		createEReference(cuisineEClass, CUISINE__PREPAREOMELETTE);
		createEReference(cuisineEClass, CUISINE__PREPARELARD);

		salonEClass = createEClass(SALON);
		createEReference(salonEClass, SALON__BOIRE);
		createEReference(salonEClass, SALON__CONTROLFLOW);

		dortEClass = createEClass(DORT);
		createEReference(dortEClass, DORT__SEREVEILLE);

		seReveilleEClass = createEClass(SE_REVEILLE);
		createEAttribute(seReveilleEClass, SE_REVEILLE__WEEKEND);
		createEReference(seReveilleEClass, SE_REVEILLE__DORT);
		createEAttribute(seReveilleEClass, SE_REVEILLE__TIMER);
		createEReference(seReveilleEClass, SE_REVEILLE__CONTROLFLOW);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEReference(controlFlowEClass, CONTROL_FLOW__DOUCHE);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);
		createEOperation(controlFlowEClass, CONTROL_FLOW___DIMINUTION_TIMER);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__BOIRE);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);
		createEOperation(controlFlowEClass, CONTROL_FLOW___DIMINUTION_TIMER);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__PREPAREOMELETTE);
		createEReference(controlFlowEClass, CONTROL_FLOW__PREPARELARD);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);
		createEOperation(controlFlowEClass, CONTROL_FLOW___DIMINUTION_TIMER);

		doucheEClass = createEClass(DOUCHE);
		createEReference(doucheEClass, DOUCHE__CONTROLFLOW);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__ETIREMENT);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);

		prepareOmeletteEClass = createEClass(PREPARE_OMELETTE);
		createEReference(prepareOmeletteEClass, PREPARE_OMELETTE__CONTROLFLOW);

		prepareLardEClass = createEClass(PREPARE_LARD);
		createEReference(prepareLardEClass, PREPARE_LARD__CONTROLFLOW);

		boireEClass = createEClass(BOIRE);
		createEReference(boireEClass, BOIRE__CONTROLFLOW);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);
		createEOperation(controlFlowEClass, CONTROL_FLOW___DIMINUTION_TIMER);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__NEWECLASS22);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);
		createEOperation(controlFlowEClass, CONTROL_FLOW___DIMINUTION_TIMER);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__PREPARERASSIETE);
		createEReference(controlFlowEClass, CONTROL_FLOW__RECITERPROGRAMME);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);

		etirementEClass = createEClass(ETIREMENT);
		createEReference(etirementEClass, ETIREMENT__CONTROLFLOW);

		preparerAssieteEClass = createEClass(PREPARER_ASSIETE);
		createEReference(preparerAssieteEClass, PREPARER_ASSIETE__CONTROLFLOW);

		reciterProgrammeEClass = createEClass(RECITER_PROGRAMME);
		createEReference(reciterProgrammeEClass, RECITER_PROGRAMME__CONTROLFLOW);

		profiteEClass = createEClass(PROFITE);
		createEReference(profiteEClass, PROFITE__CONTROLFLOW);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEAttribute(controlFlowEClass, CONTROL_FLOW__HEURE_DEPART);
		createEReference(controlFlowEClass, CONTROL_FLOW__BROSSELESDENTS);
		createEReference(controlFlowEClass, CONTROL_FLOW__PRENDREBUS);
		createEOperation(controlFlowEClass, CONTROL_FLOW___DIMINUTION_TIMER);

		brosseLesDentsEClass = createEClass(BROSSE_LES_DENTS);
		createEReference(brosseLesDentsEClass, BROSSE_LES_DENTS__CONTROLFLOW);

		prendreBusEClass = createEClass(PRENDRE_BUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Chambre(), this.getChambre(), null, "chambre", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Salledebain(), this.getSalleDeBain(), null, "salledebain", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Cuisine(), this.getCuisine(), null, "cuisine", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Salon(), this.getSalon(), null, "salon", null, 0, -1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(chambreEClass, Chambre.class, "Chambre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChambre_Dort(), this.getDort(), null, "dort", null, 0, -1, Chambre.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getChambre_Sereveille(), this.getSeReveille(), null, "sereveille", null, 0, -1, Chambre.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salleDeBainEClass, SalleDeBain.class, "SalleDeBain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalleDeBain_Douche(), this.getDouche(), null, "douche", null, 0, -1, SalleDeBain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cuisineEClass, Cuisine.class, "Cuisine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCuisine_Prepareomelette(), this.getPrepareOmelette(), null, "prepareomelette", null, 0, -1,
				Cuisine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCuisine_Preparelard(), this.getPrepareLard(), null, "preparelard", null, 0, -1, Cuisine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salonEClass, Salon.class, "Salon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalon_Boire(), this.getBoire(), null, "boire", null, 0, -1, Salon.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSalon_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, -1, Salon.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dortEClass, Dort.class, "Dort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDort_Sereveille(), this.getSeReveille(), this.getSeReveille_Dort(), "sereveille", null, 0, 1,
				Dort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seReveilleEClass, SeReveille.class, "SeReveille", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeReveille_Weekend(), ecorePackage.getEBoolean(), "weekend", "false", 0, 1, SeReveille.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeReveille_Dort(), this.getDort(), this.getDort_Sereveille(), "dort", null, 0, 1,
				SeReveille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeReveille_Timer(), ecorePackage.getEInt(), "timer", null, 0, 60, SeReveille.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeReveille_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1,
				SeReveille.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlow_Douche(), this.getDouche(), null, "Douche", null, 0, 1, ControlFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getControlFlow__DiminutionTimer(), ecorePackage.getEInt(), "DiminutionTimer", 0, 60, IS_UNIQUE,
				IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Boire(), this.getBoire(), null, "boire", null, 0, 1, ControlFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getControlFlow__DiminutionTimer(), ecorePackage.getEInt(), "DiminutionTimer", 13, 47, IS_UNIQUE,
				IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prepareomelette(), this.getPrepareOmelette(), null, "prepareomelette", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Preparelard(), this.getPrepareLard(), null, "preparelard", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getControlFlow__DiminutionTimer(), ecorePackage.getEInt(), "DiminutionTimer", 5, 55, IS_UNIQUE,
				IS_ORDERED);

		initEClass(doucheEClass, Douche.class, "Douche", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDouche_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1, Douche.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Etirement(), this.getEtirement(), null, "etirement", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prepareOmeletteEClass, PrepareOmelette.class, "PrepareOmelette", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrepareOmelette_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1,
				PrepareOmelette.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prepareLardEClass, PrepareLard.class, "PrepareLard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrepareLard_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1,
				PrepareLard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boireEClass, Boire.class, "Boire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoire_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1, Boire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getControlFlow__DiminutionTimer(), ecorePackage.getEInt(), "DiminutionTimer", 19, 41, IS_UNIQUE,
				IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Neweclass22(), this.getProfite(), null, "neweclass22", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getControlFlow__DiminutionTimer(), ecorePackage.getEInt(), "DiminutionTimer", 14, 46, IS_UNIQUE,
				IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Preparerassiete(), this.getpreparerAssiete(), null, "preparerassiete", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Reciterprogramme(), this.getReciterProgramme(), null, "reciterprogramme", null, 0,
				1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etirementEClass, Etirement.class, "Etirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtirement_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1,
				Etirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preparerAssieteEClass, preparerAssiete.class, "preparerAssiete", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getpreparerAssiete_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1,
				preparerAssiete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reciterProgrammeEClass, ReciterProgramme.class, "ReciterProgramme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReciterProgramme_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1,
				ReciterProgramme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profiteEClass, Profite.class, "Profite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfite_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1, Profite.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlFlow_HeureDepart(), ecorePackage.getEBoolean(), "HeureDepart", "false", 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Brosselesdents(), this.getBrosseLesDents(), null, "brosselesdents", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlFlow_Prendrebus(), this.getPrendreBus(), null, "prendrebus", null, 0, 1,
				ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getControlFlow__DiminutionTimer(), ecorePackage.getEInt(), "DiminutionTimer", 16, 44, IS_UNIQUE,
				IS_ORDERED);

		initEClass(brosseLesDentsEClass, BrosseLesDents.class, "BrosseLesDents", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrosseLesDents_Controlflow(), this.getControlFlow(), null, "controlflow", null, 0, 1,
				BrosseLesDents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prendreBusEClass, PrendreBus.class, "PrendreBus", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TpNoteActivityPackageImpl

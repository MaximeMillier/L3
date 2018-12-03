/**
 */
package tpNoteActivity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tpNoteActivity.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TpNoteActivityFactoryImpl extends EFactoryImpl implements TpNoteActivityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TpNoteActivityFactory init() {
		try {
			TpNoteActivityFactory theTpNoteActivityFactory = (TpNoteActivityFactory) EPackage.Registry.INSTANCE
					.getEFactory(TpNoteActivityPackage.eNS_URI);
			if (theTpNoteActivityFactory != null) {
				return theTpNoteActivityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TpNoteActivityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteActivityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TpNoteActivityPackage.ACTIVITY:
			return createActivity();
		case TpNoteActivityPackage.CHAMBRE:
			return createChambre();
		case TpNoteActivityPackage.SALLE_DE_BAIN:
			return createSalleDeBain();
		case TpNoteActivityPackage.CUISINE:
			return createCuisine();
		case TpNoteActivityPackage.SALON:
			return createSalon();
		case TpNoteActivityPackage.DORT:
			return createDort();
		case TpNoteActivityPackage.SE_REVEILLE:
			return createSeReveille();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.DOUCHE:
			return createDouche();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.PREPARE_OMELETTE:
			return createPrepareOmelette();
		case TpNoteActivityPackage.PREPARE_LARD:
			return createPrepareLard();
		case TpNoteActivityPackage.BOIRE:
			return createBoire();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.ETIREMENT:
			return createEtirement();
		case TpNoteActivityPackage.PREPARER_ASSIETE:
			return createpreparerAssiete();
		case TpNoteActivityPackage.RECITER_PROGRAMME:
			return createReciterProgramme();
		case TpNoteActivityPackage.PROFITE:
			return createProfite();
		case TpNoteActivityPackage.CONTROL_FLOW:
			return createControlFlow();
		case TpNoteActivityPackage.BROSSE_LES_DENTS:
			return createBrosseLesDents();
		case TpNoteActivityPackage.PRENDRE_BUS:
			return createPrendreBus();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chambre createChambre() {
		ChambreImpl chambre = new ChambreImpl();
		return chambre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalleDeBain createSalleDeBain() {
		SalleDeBainImpl salleDeBain = new SalleDeBainImpl();
		return salleDeBain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cuisine createCuisine() {
		CuisineImpl cuisine = new CuisineImpl();
		return cuisine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salon createSalon() {
		SalonImpl salon = new SalonImpl();
		return salon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dort createDort() {
		DortImpl dort = new DortImpl();
		return dort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeReveille createSeReveille() {
		SeReveilleImpl seReveille = new SeReveilleImpl();
		return seReveille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Douche createDouche() {
		DoucheImpl douche = new DoucheImpl();
		return douche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrepareOmelette createPrepareOmelette() {
		PrepareOmeletteImpl prepareOmelette = new PrepareOmeletteImpl();
		return prepareOmelette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrepareLard createPrepareLard() {
		PrepareLardImpl prepareLard = new PrepareLardImpl();
		return prepareLard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boire createBoire() {
		BoireImpl boire = new BoireImpl();
		return boire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etirement createEtirement() {
		EtirementImpl etirement = new EtirementImpl();
		return etirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public preparerAssiete createpreparerAssiete() {
		preparerAssieteImpl preparerAssiete = new preparerAssieteImpl();
		return preparerAssiete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReciterProgramme createReciterProgramme() {
		ReciterProgrammeImpl reciterProgramme = new ReciterProgrammeImpl();
		return reciterProgramme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profite createProfite() {
		ProfiteImpl profite = new ProfiteImpl();
		return profite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrosseLesDents createBrosseLesDents() {
		BrosseLesDentsImpl brosseLesDents = new BrosseLesDentsImpl();
		return brosseLesDents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrendreBus createPrendreBus() {
		PrendreBusImpl prendreBus = new PrendreBusImpl();
		return prendreBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteActivityPackage getTpNoteActivityPackage() {
		return (TpNoteActivityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TpNoteActivityPackage getPackage() {
		return TpNoteActivityPackage.eINSTANCE;
	}

} //TpNoteActivityFactoryImpl

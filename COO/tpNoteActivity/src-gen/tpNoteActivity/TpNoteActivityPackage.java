/**
 */
package tpNoteActivity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tpNoteActivity.TpNoteActivityFactory
 * @model kind="package"
 * @generated
 */
public interface TpNoteActivityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tpNoteActivity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tpNoteActivity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tpNoteActivity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TpNoteActivityPackage eINSTANCE = tpNoteActivity.impl.TpNoteActivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ActivityImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Chambre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CHAMBRE = 0;

	/**
	 * The feature id for the '<em><b>Salledebain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SALLEDEBAIN = 1;

	/**
	 * The feature id for the '<em><b>Cuisine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CUISINE = 2;

	/**
	 * The feature id for the '<em><b>Salon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SALON = 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ChambreImpl <em>Chambre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ChambreImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getChambre()
	 * @generated
	 */
	int CHAMBRE = 1;

	/**
	 * The feature id for the '<em><b>Dort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE__DORT = 0;

	/**
	 * The feature id for the '<em><b>Sereveille</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE__SEREVEILLE = 1;

	/**
	 * The number of structural features of the '<em>Chambre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Chambre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMBRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.SalleDeBainImpl <em>Salle De Bain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.SalleDeBainImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getSalleDeBain()
	 * @generated
	 */
	int SALLE_DE_BAIN = 2;

	/**
	 * The feature id for the '<em><b>Douche</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE_DE_BAIN__DOUCHE = 0;

	/**
	 * The number of structural features of the '<em>Salle De Bain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE_DE_BAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Salle De Bain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE_DE_BAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.CuisineImpl <em>Cuisine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.CuisineImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getCuisine()
	 * @generated
	 */
	int CUISINE = 3;

	/**
	 * The feature id for the '<em><b>Prepareomelette</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINE__PREPAREOMELETTE = 0;

	/**
	 * The feature id for the '<em><b>Preparelard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINE__PREPARELARD = 1;

	/**
	 * The number of structural features of the '<em>Cuisine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cuisine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUISINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.SalonImpl <em>Salon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.SalonImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getSalon()
	 * @generated
	 */
	int SALON = 4;

	/**
	 * The feature id for the '<em><b>Boire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALON__BOIRE = 0;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALON__CONTROLFLOW = 1;

	/**
	 * The number of structural features of the '<em>Salon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Salon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.DortImpl <em>Dort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.DortImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getDort()
	 * @generated
	 */
	int DORT = 5;

	/**
	 * The feature id for the '<em><b>Sereveille</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORT__SEREVEILLE = 0;

	/**
	 * The number of structural features of the '<em>Dort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.SeReveilleImpl <em>Se Reveille</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.SeReveilleImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getSeReveille()
	 * @generated
	 */
	int SE_REVEILLE = 6;

	/**
	 * The feature id for the '<em><b>Weekend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_REVEILLE__WEEKEND = 0;

	/**
	 * The feature id for the '<em><b>Dort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_REVEILLE__DORT = 1;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_REVEILLE__TIMER = 2;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_REVEILLE__CONTROLFLOW = 3;

	/**
	 * The number of structural features of the '<em>Se Reveille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_REVEILLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Se Reveille</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SE_REVEILLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Douche</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__DOUCHE = 0;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 1;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 2;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Diminution Timer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___DIMINUTION_TIMER = 0;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 0;

	/**
	 * The feature id for the '<em><b>Boire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__BOIRE = 1;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 2;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Diminution Timer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___DIMINUTION_TIMER = 0;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 9;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 0;

	/**
	 * The feature id for the '<em><b>Prepareomelette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PREPAREOMELETTE = 1;

	/**
	 * The feature id for the '<em><b>Preparelard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PREPARELARD = 2;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 3;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Diminution Timer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___DIMINUTION_TIMER = 0;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.DoucheImpl <em>Douche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.DoucheImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getDouche()
	 * @generated
	 */
	int DOUCHE = 10;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUCHE__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Douche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUCHE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Douche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUCHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 0;

	/**
	 * The feature id for the '<em><b>Etirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__ETIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 2;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.PrepareOmeletteImpl <em>Prepare Omelette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.PrepareOmeletteImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getPrepareOmelette()
	 * @generated
	 */
	int PREPARE_OMELETTE = 12;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_OMELETTE__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Prepare Omelette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_OMELETTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prepare Omelette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_OMELETTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.PrepareLardImpl <em>Prepare Lard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.PrepareLardImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getPrepareLard()
	 * @generated
	 */
	int PREPARE_LARD = 13;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_LARD__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Prepare Lard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_LARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prepare Lard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARE_LARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.BoireImpl <em>Boire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.BoireImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getBoire()
	 * @generated
	 */
	int BOIRE = 14;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOIRE__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Boire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOIRE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 15;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 0;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 1;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Diminution Timer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___DIMINUTION_TIMER = 0;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 16;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 0;

	/**
	 * The feature id for the '<em><b>Neweclass22</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NEWECLASS22 = 1;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 2;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Diminution Timer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___DIMINUTION_TIMER = 0;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 17;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 0;

	/**
	 * The feature id for the '<em><b>Preparerassiete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PREPARERASSIETE = 1;

	/**
	 * The feature id for the '<em><b>Reciterprogramme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__RECITERPROGRAMME = 2;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 3;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.EtirementImpl <em>Etirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.EtirementImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getEtirement()
	 * @generated
	 */
	int ETIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIREMENT__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Etirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Etirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.preparerAssieteImpl <em>preparer Assiete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.preparerAssieteImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getpreparerAssiete()
	 * @generated
	 */
	int PREPARER_ASSIETE = 19;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARER_ASSIETE__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>preparer Assiete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARER_ASSIETE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>preparer Assiete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARER_ASSIETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ReciterProgrammeImpl <em>Reciter Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ReciterProgrammeImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getReciterProgramme()
	 * @generated
	 */
	int RECITER_PROGRAMME = 20;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITER_PROGRAMME__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Reciter Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITER_PROGRAMME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reciter Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECITER_PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ProfiteImpl <em>Profite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ProfiteImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getProfite()
	 * @generated
	 */
	int PROFITE = 21;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFITE__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Profite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFITE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Profite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.ControlFlowImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 22;

	/**
	 * The feature id for the '<em><b>Heure Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__HEURE_DEPART = 0;

	/**
	 * The feature id for the '<em><b>Brosselesdents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__BROSSELESDENTS = 1;

	/**
	 * The feature id for the '<em><b>Prendrebus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PRENDREBUS = 2;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Diminution Timer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW___DIMINUTION_TIMER = 0;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.BrosseLesDentsImpl <em>Brosse Les Dents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.BrosseLesDentsImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getBrosseLesDents()
	 * @generated
	 */
	int BROSSE_LES_DENTS = 23;

	/**
	 * The feature id for the '<em><b>Controlflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROSSE_LES_DENTS__CONTROLFLOW = 0;

	/**
	 * The number of structural features of the '<em>Brosse Les Dents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROSSE_LES_DENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Brosse Les Dents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROSSE_LES_DENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNoteActivity.impl.PrendreBusImpl <em>Prendre Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNoteActivity.impl.PrendreBusImpl
	 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getPrendreBus()
	 * @generated
	 */
	int PRENDRE_BUS = 24;

	/**
	 * The number of structural features of the '<em>Prendre Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRENDRE_BUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Prendre Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRENDRE_BUS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see tpNoteActivity.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Activity#getChambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chambre</em>'.
	 * @see tpNoteActivity.Activity#getChambre()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Chambre();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Activity#getSalledebain <em>Salledebain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salledebain</em>'.
	 * @see tpNoteActivity.Activity#getSalledebain()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Salledebain();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Activity#getCuisine <em>Cuisine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cuisine</em>'.
	 * @see tpNoteActivity.Activity#getCuisine()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Cuisine();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Activity#getSalon <em>Salon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salon</em>'.
	 * @see tpNoteActivity.Activity#getSalon()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Salon();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Chambre <em>Chambre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chambre</em>'.
	 * @see tpNoteActivity.Chambre
	 * @generated
	 */
	EClass getChambre();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Chambre#getDort <em>Dort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dort</em>'.
	 * @see tpNoteActivity.Chambre#getDort()
	 * @see #getChambre()
	 * @generated
	 */
	EReference getChambre_Dort();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Chambre#getSereveille <em>Sereveille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sereveille</em>'.
	 * @see tpNoteActivity.Chambre#getSereveille()
	 * @see #getChambre()
	 * @generated
	 */
	EReference getChambre_Sereveille();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.SalleDeBain <em>Salle De Bain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salle De Bain</em>'.
	 * @see tpNoteActivity.SalleDeBain
	 * @generated
	 */
	EClass getSalleDeBain();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.SalleDeBain#getDouche <em>Douche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Douche</em>'.
	 * @see tpNoteActivity.SalleDeBain#getDouche()
	 * @see #getSalleDeBain()
	 * @generated
	 */
	EReference getSalleDeBain_Douche();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Cuisine <em>Cuisine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuisine</em>'.
	 * @see tpNoteActivity.Cuisine
	 * @generated
	 */
	EClass getCuisine();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Cuisine#getPrepareomelette <em>Prepareomelette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prepareomelette</em>'.
	 * @see tpNoteActivity.Cuisine#getPrepareomelette()
	 * @see #getCuisine()
	 * @generated
	 */
	EReference getCuisine_Prepareomelette();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Cuisine#getPreparelard <em>Preparelard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preparelard</em>'.
	 * @see tpNoteActivity.Cuisine#getPreparelard()
	 * @see #getCuisine()
	 * @generated
	 */
	EReference getCuisine_Preparelard();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Salon <em>Salon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salon</em>'.
	 * @see tpNoteActivity.Salon
	 * @generated
	 */
	EClass getSalon();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Salon#getBoire <em>Boire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boire</em>'.
	 * @see tpNoteActivity.Salon#getBoire()
	 * @see #getSalon()
	 * @generated
	 */
	EReference getSalon_Boire();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNoteActivity.Salon#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlflow</em>'.
	 * @see tpNoteActivity.Salon#getControlflow()
	 * @see #getSalon()
	 * @generated
	 */
	EReference getSalon_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Dort <em>Dort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dort</em>'.
	 * @see tpNoteActivity.Dort
	 * @generated
	 */
	EClass getDort();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.Dort#getSereveille <em>Sereveille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sereveille</em>'.
	 * @see tpNoteActivity.Dort#getSereveille()
	 * @see #getDort()
	 * @generated
	 */
	EReference getDort_Sereveille();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.SeReveille <em>Se Reveille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Se Reveille</em>'.
	 * @see tpNoteActivity.SeReveille
	 * @generated
	 */
	EClass getSeReveille();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.SeReveille#isWeekend <em>Weekend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weekend</em>'.
	 * @see tpNoteActivity.SeReveille#isWeekend()
	 * @see #getSeReveille()
	 * @generated
	 */
	EAttribute getSeReveille_Weekend();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.SeReveille#getDort <em>Dort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dort</em>'.
	 * @see tpNoteActivity.SeReveille#getDort()
	 * @see #getSeReveille()
	 * @generated
	 */
	EReference getSeReveille_Dort();

	/**
	 * Returns the meta object for the attribute list '{@link tpNoteActivity.SeReveille#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Timer</em>'.
	 * @see tpNoteActivity.SeReveille#getTimer()
	 * @see #getSeReveille()
	 * @generated
	 */
	EAttribute getSeReveille_Timer();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.SeReveille#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.SeReveille#getControlflow()
	 * @see #getSeReveille()
	 * @generated
	 */
	EReference getSeReveille_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getDouche <em>Douche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Douche</em>'.
	 * @see tpNoteActivity.ControlFlow#getDouche()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Douche();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for the '{@link tpNoteActivity.ControlFlow#DiminutionTimer() <em>Diminution Timer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diminution Timer</em>' operation.
	 * @see tpNoteActivity.ControlFlow#DiminutionTimer()
	 * @generated
	 */
	EOperation getControlFlow__DiminutionTimer();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getBoire <em>Boire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Boire</em>'.
	 * @see tpNoteActivity.ControlFlow#getBoire()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Boire();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for the '{@link tpNoteActivity.ControlFlow#DiminutionTimer() <em>Diminution Timer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diminution Timer</em>' operation.
	 * @see tpNoteActivity.ControlFlow#DiminutionTimer()
	 * @generated
	 */
	EOperation getControlFlow__DiminutionTimer();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrepareomelette <em>Prepareomelette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prepareomelette</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrepareomelette()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prepareomelette();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPreparelard <em>Preparelard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preparelard</em>'.
	 * @see tpNoteActivity.ControlFlow#getPreparelard()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Preparelard();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for the '{@link tpNoteActivity.ControlFlow#DiminutionTimer() <em>Diminution Timer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diminution Timer</em>' operation.
	 * @see tpNoteActivity.ControlFlow#DiminutionTimer()
	 * @generated
	 */
	EOperation getControlFlow__DiminutionTimer();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Douche <em>Douche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Douche</em>'.
	 * @see tpNoteActivity.Douche
	 * @generated
	 */
	EClass getDouche();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.Douche#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.Douche#getControlflow()
	 * @see #getDouche()
	 * @generated
	 */
	EReference getDouche_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getEtirement <em>Etirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Etirement</em>'.
	 * @see tpNoteActivity.ControlFlow#getEtirement()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Etirement();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.PrepareOmelette <em>Prepare Omelette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepare Omelette</em>'.
	 * @see tpNoteActivity.PrepareOmelette
	 * @generated
	 */
	EClass getPrepareOmelette();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.PrepareOmelette#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.PrepareOmelette#getControlflow()
	 * @see #getPrepareOmelette()
	 * @generated
	 */
	EReference getPrepareOmelette_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.PrepareLard <em>Prepare Lard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepare Lard</em>'.
	 * @see tpNoteActivity.PrepareLard
	 * @generated
	 */
	EClass getPrepareLard();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.PrepareLard#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.PrepareLard#getControlflow()
	 * @see #getPrepareLard()
	 * @generated
	 */
	EReference getPrepareLard_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Boire <em>Boire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boire</em>'.
	 * @see tpNoteActivity.Boire
	 * @generated
	 */
	EClass getBoire();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.Boire#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.Boire#getControlflow()
	 * @see #getBoire()
	 * @generated
	 */
	EReference getBoire_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for the '{@link tpNoteActivity.ControlFlow#DiminutionTimer() <em>Diminution Timer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diminution Timer</em>' operation.
	 * @see tpNoteActivity.ControlFlow#DiminutionTimer()
	 * @generated
	 */
	EOperation getControlFlow__DiminutionTimer();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getNeweclass22 <em>Neweclass22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neweclass22</em>'.
	 * @see tpNoteActivity.ControlFlow#getNeweclass22()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Neweclass22();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for the '{@link tpNoteActivity.ControlFlow#DiminutionTimer() <em>Diminution Timer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diminution Timer</em>' operation.
	 * @see tpNoteActivity.ControlFlow#DiminutionTimer()
	 * @generated
	 */
	EOperation getControlFlow__DiminutionTimer();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPreparerassiete <em>Preparerassiete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preparerassiete</em>'.
	 * @see tpNoteActivity.ControlFlow#getPreparerassiete()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Preparerassiete();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getReciterprogramme <em>Reciterprogramme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reciterprogramme</em>'.
	 * @see tpNoteActivity.ControlFlow#getReciterprogramme()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Reciterprogramme();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Etirement <em>Etirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etirement</em>'.
	 * @see tpNoteActivity.Etirement
	 * @generated
	 */
	EClass getEtirement();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.Etirement#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.Etirement#getControlflow()
	 * @see #getEtirement()
	 * @generated
	 */
	EReference getEtirement_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.preparerAssiete <em>preparer Assiete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>preparer Assiete</em>'.
	 * @see tpNoteActivity.preparerAssiete
	 * @generated
	 */
	EClass getpreparerAssiete();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.preparerAssiete#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.preparerAssiete#getControlflow()
	 * @see #getpreparerAssiete()
	 * @generated
	 */
	EReference getpreparerAssiete_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ReciterProgramme <em>Reciter Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reciter Programme</em>'.
	 * @see tpNoteActivity.ReciterProgramme
	 * @generated
	 */
	EClass getReciterProgramme();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ReciterProgramme#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.ReciterProgramme#getControlflow()
	 * @see #getReciterProgramme()
	 * @generated
	 */
	EReference getReciterProgramme_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.Profite <em>Profite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profite</em>'.
	 * @see tpNoteActivity.Profite
	 * @generated
	 */
	EClass getProfite();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.Profite#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.Profite#getControlflow()
	 * @see #getProfite()
	 * @generated
	 */
	EReference getProfite_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see tpNoteActivity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the attribute '{@link tpNoteActivity.ControlFlow#isHeureDepart <em>Heure Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Depart</em>'.
	 * @see tpNoteActivity.ControlFlow#isHeureDepart()
	 * @see #getControlFlow()
	 * @generated
	 */
	EAttribute getControlFlow_HeureDepart();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getBrosselesdents <em>Brosselesdents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Brosselesdents</em>'.
	 * @see tpNoteActivity.ControlFlow#getBrosselesdents()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Brosselesdents();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.ControlFlow#getPrendrebus <em>Prendrebus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prendrebus</em>'.
	 * @see tpNoteActivity.ControlFlow#getPrendrebus()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Prendrebus();

	/**
	 * Returns the meta object for the '{@link tpNoteActivity.ControlFlow#DiminutionTimer() <em>Diminution Timer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diminution Timer</em>' operation.
	 * @see tpNoteActivity.ControlFlow#DiminutionTimer()
	 * @generated
	 */
	EOperation getControlFlow__DiminutionTimer();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.BrosseLesDents <em>Brosse Les Dents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brosse Les Dents</em>'.
	 * @see tpNoteActivity.BrosseLesDents
	 * @generated
	 */
	EClass getBrosseLesDents();

	/**
	 * Returns the meta object for the reference '{@link tpNoteActivity.BrosseLesDents#getControlflow <em>Controlflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlflow</em>'.
	 * @see tpNoteActivity.BrosseLesDents#getControlflow()
	 * @see #getBrosseLesDents()
	 * @generated
	 */
	EReference getBrosseLesDents_Controlflow();

	/**
	 * Returns the meta object for class '{@link tpNoteActivity.PrendreBus <em>Prendre Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prendre Bus</em>'.
	 * @see tpNoteActivity.PrendreBus
	 * @generated
	 */
	EClass getPrendreBus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TpNoteActivityFactory getTpNoteActivityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ActivityImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Chambre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CHAMBRE = eINSTANCE.getActivity_Chambre();

		/**
		 * The meta object literal for the '<em><b>Salledebain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SALLEDEBAIN = eINSTANCE.getActivity_Salledebain();

		/**
		 * The meta object literal for the '<em><b>Cuisine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CUISINE = eINSTANCE.getActivity_Cuisine();

		/**
		 * The meta object literal for the '<em><b>Salon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SALON = eINSTANCE.getActivity_Salon();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ChambreImpl <em>Chambre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ChambreImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getChambre()
		 * @generated
		 */
		EClass CHAMBRE = eINSTANCE.getChambre();

		/**
		 * The meta object literal for the '<em><b>Dort</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMBRE__DORT = eINSTANCE.getChambre_Dort();

		/**
		 * The meta object literal for the '<em><b>Sereveille</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMBRE__SEREVEILLE = eINSTANCE.getChambre_Sereveille();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.SalleDeBainImpl <em>Salle De Bain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.SalleDeBainImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getSalleDeBain()
		 * @generated
		 */
		EClass SALLE_DE_BAIN = eINSTANCE.getSalleDeBain();

		/**
		 * The meta object literal for the '<em><b>Douche</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALLE_DE_BAIN__DOUCHE = eINSTANCE.getSalleDeBain_Douche();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.CuisineImpl <em>Cuisine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.CuisineImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getCuisine()
		 * @generated
		 */
		EClass CUISINE = eINSTANCE.getCuisine();

		/**
		 * The meta object literal for the '<em><b>Prepareomelette</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUISINE__PREPAREOMELETTE = eINSTANCE.getCuisine_Prepareomelette();

		/**
		 * The meta object literal for the '<em><b>Preparelard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUISINE__PREPARELARD = eINSTANCE.getCuisine_Preparelard();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.SalonImpl <em>Salon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.SalonImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getSalon()
		 * @generated
		 */
		EClass SALON = eINSTANCE.getSalon();

		/**
		 * The meta object literal for the '<em><b>Boire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALON__BOIRE = eINSTANCE.getSalon_Boire();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALON__CONTROLFLOW = eINSTANCE.getSalon_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.DortImpl <em>Dort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.DortImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getDort()
		 * @generated
		 */
		EClass DORT = eINSTANCE.getDort();

		/**
		 * The meta object literal for the '<em><b>Sereveille</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DORT__SEREVEILLE = eINSTANCE.getDort_Sereveille();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.SeReveilleImpl <em>Se Reveille</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.SeReveilleImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getSeReveille()
		 * @generated
		 */
		EClass SE_REVEILLE = eINSTANCE.getSeReveille();

		/**
		 * The meta object literal for the '<em><b>Weekend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_REVEILLE__WEEKEND = eINSTANCE.getSeReveille_Weekend();

		/**
		 * The meta object literal for the '<em><b>Dort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_REVEILLE__DORT = eINSTANCE.getSeReveille_Dort();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SE_REVEILLE__TIMER = eINSTANCE.getSeReveille_Timer();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SE_REVEILLE__CONTROLFLOW = eINSTANCE.getSeReveille_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Douche</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__DOUCHE = eINSTANCE.getControlFlow_Douche();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '<em><b>Diminution Timer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_FLOW___DIMINUTION_TIMER = eINSTANCE.getControlFlow__DiminutionTimer();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Boire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__BOIRE = eINSTANCE.getControlFlow_Boire();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '<em><b>Diminution Timer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_FLOW___DIMINUTION_TIMER = eINSTANCE.getControlFlow__DiminutionTimer();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Prepareomelette</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PREPAREOMELETTE = eINSTANCE.getControlFlow_Prepareomelette();

		/**
		 * The meta object literal for the '<em><b>Preparelard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PREPARELARD = eINSTANCE.getControlFlow_Preparelard();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '<em><b>Diminution Timer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_FLOW___DIMINUTION_TIMER = eINSTANCE.getControlFlow__DiminutionTimer();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.DoucheImpl <em>Douche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.DoucheImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getDouche()
		 * @generated
		 */
		EClass DOUCHE = eINSTANCE.getDouche();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOUCHE__CONTROLFLOW = eINSTANCE.getDouche_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Etirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__ETIREMENT = eINSTANCE.getControlFlow_Etirement();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.PrepareOmeletteImpl <em>Prepare Omelette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.PrepareOmeletteImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getPrepareOmelette()
		 * @generated
		 */
		EClass PREPARE_OMELETTE = eINSTANCE.getPrepareOmelette();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARE_OMELETTE__CONTROLFLOW = eINSTANCE.getPrepareOmelette_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.PrepareLardImpl <em>Prepare Lard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.PrepareLardImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getPrepareLard()
		 * @generated
		 */
		EClass PREPARE_LARD = eINSTANCE.getPrepareLard();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARE_LARD__CONTROLFLOW = eINSTANCE.getPrepareLard_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.BoireImpl <em>Boire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.BoireImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getBoire()
		 * @generated
		 */
		EClass BOIRE = eINSTANCE.getBoire();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOIRE__CONTROLFLOW = eINSTANCE.getBoire_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '<em><b>Diminution Timer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_FLOW___DIMINUTION_TIMER = eINSTANCE.getControlFlow__DiminutionTimer();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Neweclass22</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__NEWECLASS22 = eINSTANCE.getControlFlow_Neweclass22();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '<em><b>Diminution Timer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_FLOW___DIMINUTION_TIMER = eINSTANCE.getControlFlow__DiminutionTimer();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Preparerassiete</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PREPARERASSIETE = eINSTANCE.getControlFlow_Preparerassiete();

		/**
		 * The meta object literal for the '<em><b>Reciterprogramme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__RECITERPROGRAMME = eINSTANCE.getControlFlow_Reciterprogramme();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.EtirementImpl <em>Etirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.EtirementImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getEtirement()
		 * @generated
		 */
		EClass ETIREMENT = eINSTANCE.getEtirement();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETIREMENT__CONTROLFLOW = eINSTANCE.getEtirement_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.preparerAssieteImpl <em>preparer Assiete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.preparerAssieteImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getpreparerAssiete()
		 * @generated
		 */
		EClass PREPARER_ASSIETE = eINSTANCE.getpreparerAssiete();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARER_ASSIETE__CONTROLFLOW = eINSTANCE.getpreparerAssiete_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ReciterProgrammeImpl <em>Reciter Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ReciterProgrammeImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getReciterProgramme()
		 * @generated
		 */
		EClass RECITER_PROGRAMME = eINSTANCE.getReciterProgramme();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECITER_PROGRAMME__CONTROLFLOW = eINSTANCE.getReciterProgramme_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ProfiteImpl <em>Profite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ProfiteImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getProfite()
		 * @generated
		 */
		EClass PROFITE = eINSTANCE.getProfite();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFITE__CONTROLFLOW = eINSTANCE.getProfite_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.ControlFlowImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Heure Depart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW__HEURE_DEPART = eINSTANCE.getControlFlow_HeureDepart();

		/**
		 * The meta object literal for the '<em><b>Brosselesdents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__BROSSELESDENTS = eINSTANCE.getControlFlow_Brosselesdents();

		/**
		 * The meta object literal for the '<em><b>Prendrebus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__PRENDREBUS = eINSTANCE.getControlFlow_Prendrebus();

		/**
		 * The meta object literal for the '<em><b>Diminution Timer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROL_FLOW___DIMINUTION_TIMER = eINSTANCE.getControlFlow__DiminutionTimer();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.BrosseLesDentsImpl <em>Brosse Les Dents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.BrosseLesDentsImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getBrosseLesDents()
		 * @generated
		 */
		EClass BROSSE_LES_DENTS = eINSTANCE.getBrosseLesDents();

		/**
		 * The meta object literal for the '<em><b>Controlflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROSSE_LES_DENTS__CONTROLFLOW = eINSTANCE.getBrosseLesDents_Controlflow();

		/**
		 * The meta object literal for the '{@link tpNoteActivity.impl.PrendreBusImpl <em>Prendre Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNoteActivity.impl.PrendreBusImpl
		 * @see tpNoteActivity.impl.TpNoteActivityPackageImpl#getPrendreBus()
		 * @generated
		 */
		EClass PRENDRE_BUS = eINSTANCE.getPrendreBus();

	}

} //TpNoteActivityPackage

/**
 */
package tpNote.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tpNote.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tpNote.TpNotePackage
 * @generated
 */
public class TpNoteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TpNotePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TpNotePackage.eINSTANCE;
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
	protected TpNoteSwitch<Adapter> modelSwitch = new TpNoteSwitch<Adapter>() {
		@Override
		public Adapter caseTransition(transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseTpNote_Transition(transition object) {
			return createTpNote_TransitionAdapter();
		}

		@Override
		public Adapter caseTransition_1(transition object) {
			return createTransition_1Adapter();
		}

		@Override
		public Adapter caseTransition_2(transition object) {
			return createTransition_2Adapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseTpNote_Trigger(Trigger object) {
			return createTpNote_TriggerAdapter();
		}

		@Override
		public Adapter caseSignalEvent(SignalEvent object) {
			return createSignalEventAdapter();
		}

		@Override
		public Adapter caseTpNote_SignalEvent(SignalEvent object) {
			return createTpNote_SignalEventAdapter();
		}

		@Override
		public Adapter caseSignalEvent_1(SignalEvent object) {
			return createSignalEvent_1Adapter();
		}

		@Override
		public Adapter caseEventSignal(EventSignal object) {
			return createEventSignalAdapter();
		}

		@Override
		public Adapter caseSignalEvent_2(SignalEvent object) {
			return createSignalEvent_2Adapter();
		}

		@Override
		public Adapter caseSignal(Signal object) {
			return createSignalAdapter();
		}

		@Override
		public Adapter caseTpNote_Signal(Signal object) {
			return createTpNote_SignalAdapter();
		}

		@Override
		public Adapter caseSignal_1(Signal object) {
			return createSignal_1Adapter();
		}

		@Override
		public Adapter caseSignal_2(Signal object) {
			return createSignal_2Adapter();
		}

		@Override
		public Adapter caseSignal_3(Signal object) {
			return createSignal_3Adapter();
		}

		@Override
		public Adapter caseTrigger_1(Trigger object) {
			return createTrigger_1Adapter();
		}

		@Override
		public Adapter caseMetaState(metaState object) {
			return createMetaStateAdapter();
		}

		@Override
		public Adapter caseState(state object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseState2(state object) {
			return createState2Adapter();
		}

		@Override
		public Adapter caseStateMachine(StateMachine object) {
			return createStateMachineAdapter();
		}

		@Override
		public Adapter caseNewEClass22(NewEClass22 object) {
			return createNewEClass22Adapter();
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
	 * Creates a new adapter for an object of class '{@link transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transition
	 * @generated
	 */
	public Adapter createTpNote_TransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transition
	 * @generated
	 */
	public Adapter createTransition_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transition
	 * @generated
	 */
	public Adapter createTransition_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Trigger
	 * @generated
	 */
	public Adapter createTpNote_TriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.SignalEvent
	 * @generated
	 */
	public Adapter createSignalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.SignalEvent
	 * @generated
	 */
	public Adapter createTpNote_SignalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.SignalEvent
	 * @generated
	 */
	public Adapter createSignalEvent_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.EventSignal <em>Event Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.EventSignal
	 * @generated
	 */
	public Adapter createEventSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.SignalEvent <em>Signal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.SignalEvent
	 * @generated
	 */
	public Adapter createSignalEvent_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Signal
	 * @generated
	 */
	public Adapter createTpNote_SignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Signal
	 * @generated
	 */
	public Adapter createSignal_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Signal
	 * @generated
	 */
	public Adapter createSignal_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Signal
	 * @generated
	 */
	public Adapter createSignal_3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.Trigger
	 * @generated
	 */
	public Adapter createTrigger_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaState <em>Meta State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaState
	 * @generated
	 */
	public Adapter createMetaStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link state <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see state
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link state <em>State2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see state
	 * @generated
	 */
	public Adapter createState2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tpNote.NewEClass22 <em>New EClass22</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tpNote.NewEClass22
	 * @generated
	 */
	public Adapter createNewEClass22Adapter() {
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

} //TpNoteAdapterFactory

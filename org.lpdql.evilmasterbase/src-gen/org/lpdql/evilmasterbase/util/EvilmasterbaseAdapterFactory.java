/**
 */
package org.lpdql.evilmasterbase.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.lpdql.evilmasterbase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage
 * @generated
 */
public class EvilmasterbaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvilmasterbasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvilmasterbaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EvilmasterbasePackage.eINSTANCE;
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
	protected EvilmasterbaseSwitch<Adapter> modelSwitch = new EvilmasterbaseSwitch<Adapter>() {
		@Override
		public Adapter caseRepere(Repere object) {
			return createRepereAdapter();
		}

		@Override
		public Adapter caseSalle(Salle object) {
			return createSalleAdapter();
		}

		@Override
		public Adapter caseEscouade(Escouade object) {
			return createEscouadeAdapter();
		}

		@Override
		public Adapter caseBureau(Bureau object) {
			return createBureauAdapter();
		}

		@Override
		public Adapter casePorte(Porte object) {
			return createPorteAdapter();
		}

		@Override
		public Adapter casePiege(Piege object) {
			return createPiegeAdapter();
		}

		@Override
		public Adapter caseEntree(Entree object) {
			return createEntreeAdapter();
		}

		@Override
		public Adapter casePricedElement(PricedElement object) {
			return createPricedElementAdapter();
		}

		@Override
		public Adapter caseDescribedElement(DescribedElement object) {
			return createDescribedElementAdapter();
		}

		@Override
		public Adapter caseCouloir(Couloir object) {
			return createCouloirAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Repere <em>Repere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Repere
	 * @generated
	 */
	public Adapter createRepereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Salle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Salle
	 * @generated
	 */
	public Adapter createSalleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Escouade <em>Escouade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Escouade
	 * @generated
	 */
	public Adapter createEscouadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Bureau <em>Bureau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Bureau
	 * @generated
	 */
	public Adapter createBureauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Porte
	 * @generated
	 */
	public Adapter createPorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Piege <em>Piege</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Piege
	 * @generated
	 */
	public Adapter createPiegeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Entree
	 * @generated
	 */
	public Adapter createEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.PricedElement <em>Priced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.PricedElement
	 * @generated
	 */
	public Adapter createPricedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.DescribedElement
	 * @generated
	 */
	public Adapter createDescribedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lpdql.evilmasterbase.Couloir <em>Couloir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lpdql.evilmasterbase.Couloir
	 * @generated
	 */
	public Adapter createCouloirAdapter() {
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

} //EvilmasterbaseAdapterFactory

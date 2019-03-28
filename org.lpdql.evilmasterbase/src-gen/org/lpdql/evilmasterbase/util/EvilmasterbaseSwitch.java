/**
 */
package org.lpdql.evilmasterbase.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lpdql.evilmasterbase.*;

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
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage
 * @generated
 */
public class EvilmasterbaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EvilmasterbasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvilmasterbaseSwitch() {
		if (modelPackage == null) {
			modelPackage = EvilmasterbasePackage.eINSTANCE;
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
		case EvilmasterbasePackage.REPERE: {
			Repere repere = (Repere) theEObject;
			T result = caseRepere(repere);
			if (result == null)
				result = caseDescribedElement(repere);
			if (result == null)
				result = casePricedElement(repere);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.SALLE: {
			Salle salle = (Salle) theEObject;
			T result = caseSalle(salle);
			if (result == null)
				result = caseDescribedElement(salle);
			if (result == null)
				result = casePricedElement(salle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.SBIRE: {
			Sbire sbire = (Sbire) theEObject;
			T result = caseSbire(sbire);
			if (result == null)
				result = casePricedElement(sbire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.BUREAU: {
			Bureau bureau = (Bureau) theEObject;
			T result = caseBureau(bureau);
			if (result == null)
				result = caseSalle(bureau);
			if (result == null)
				result = caseDescribedElement(bureau);
			if (result == null)
				result = casePricedElement(bureau);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.PORTE: {
			Porte porte = (Porte) theEObject;
			T result = casePorte(porte);
			if (result == null)
				result = casePricedElement(porte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.PIEGE: {
			Piege piege = (Piege) theEObject;
			T result = casePiege(piege);
			if (result == null)
				result = casePricedElement(piege);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.ENTREE: {
			Entree entree = (Entree) theEObject;
			T result = caseEntree(entree);
			if (result == null)
				result = caseSalle(entree);
			if (result == null)
				result = caseDescribedElement(entree);
			if (result == null)
				result = casePricedElement(entree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.PRICED_ELEMENT: {
			PricedElement pricedElement = (PricedElement) theEObject;
			T result = casePricedElement(pricedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EvilmasterbasePackage.DESCRIBED_ELEMENT: {
			DescribedElement describedElement = (DescribedElement) theEObject;
			T result = caseDescribedElement(describedElement);
			if (result == null)
				result = casePricedElement(describedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepere(Repere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalle(Salle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sbire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sbire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbire(Sbire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bureau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bureau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBureau(Bureau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorte(Porte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piege</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piege</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiege(Piege object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntree(Entree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priced Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priced Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePricedElement(PricedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedElement(DescribedElement object) {
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

} //EvilmasterbaseSwitch

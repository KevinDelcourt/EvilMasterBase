/**
 */
package org.lpdql.evilmasterbase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage
 * @generated
 */
public interface EvilmasterbaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvilmasterbaseFactory eINSTANCE = org.lpdql.evilmasterbase.impl.EvilmasterbaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Repere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repere</em>'.
	 * @generated
	 */
	Repere createRepere();

	/**
	 * Returns a new object of class '<em>Salle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salle</em>'.
	 * @generated
	 */
	Salle createSalle();

	/**
	 * Returns a new object of class '<em>Escouade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Escouade</em>'.
	 * @generated
	 */
	Escouade createEscouade();

	/**
	 * Returns a new object of class '<em>Bureau</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bureau</em>'.
	 * @generated
	 */
	Bureau createBureau();

	/**
	 * Returns a new object of class '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte</em>'.
	 * @generated
	 */
	Porte createPorte();

	/**
	 * Returns a new object of class '<em>Piege</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piege</em>'.
	 * @generated
	 */
	Piege createPiege();

	/**
	 * Returns a new object of class '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entree</em>'.
	 * @generated
	 */
	Entree createEntree();

	/**
	 * Returns a new object of class '<em>Couloir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Couloir</em>'.
	 * @generated
	 */
	Couloir createCouloir();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvilmasterbasePackage getEvilmasterbasePackage();

} //EvilmasterbaseFactory

/**
 */
package org.lpdql.evilmasterbase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.lpdql.evilmasterbase.EvilmasterbaseFactory
 * @model kind="package"
 * @generated
 */
public interface EvilmasterbasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evilmasterbase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lpdql.org/evilmasterbase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evilmasterbase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvilmasterbasePackage eINSTANCE = org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.PricedElement <em>Priced Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.PricedElement
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getPricedElement()
	 * @generated
	 */
	int PRICED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICED_ELEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICED_ELEMENT__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Priced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Priced Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.DescribedElement <em>Described Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.DescribedElement
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getDescribedElement()
	 * @generated
	 */
	int DESCRIBED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__NOM = PRICED_ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__PRICE = PRICED_ELEMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__DESCRIPTION = PRICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_FEATURE_COUNT = PRICED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_OPERATION_COUNT = PRICED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.impl.RepereImpl <em>Repere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.impl.RepereImpl
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getRepere()
	 * @generated
	 */
	int REPERE = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__NOM = DESCRIBED_ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__PRICE = DESCRIBED_ELEMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Salle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__SALLE = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bureau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__BUREAU = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Porte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__PORTE = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__ENTREE = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Localisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE__LOCALISATION = DESCRIBED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Repere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPERE_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.impl.SalleImpl <em>Salle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.impl.SalleImpl
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getSalle()
	 * @generated
	 */
	int SALLE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE__NOM = DESCRIBED_ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE__PRICE = DESCRIBED_ELEMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sbire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE__SBIRE = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Piege</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE__PIEGE = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Salle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Salle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALLE_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.impl.SbireImpl <em>Sbire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.impl.SbireImpl
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getSbire()
	 * @generated
	 */
	int SBIRE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBIRE__NOM = PRICED_ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBIRE__PRICE = PRICED_ELEMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Arme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBIRE__ARME = PRICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sbire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBIRE_FEATURE_COUNT = PRICED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sbire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBIRE_OPERATION_COUNT = PRICED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.impl.BureauImpl <em>Bureau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.impl.BureauImpl
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getBureau()
	 * @generated
	 */
	int BUREAU = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUREAU__NOM = SALLE__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUREAU__PRICE = SALLE__PRICE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUREAU__DESCRIPTION = SALLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sbire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUREAU__SBIRE = SALLE__SBIRE;

	/**
	 * The feature id for the '<em><b>Piege</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUREAU__PIEGE = SALLE__PIEGE;

	/**
	 * The number of structural features of the '<em>Bureau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUREAU_FEATURE_COUNT = SALLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bureau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUREAU_OPERATION_COUNT = SALLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.impl.PorteImpl <em>Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.impl.PorteImpl
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getPorte()
	 * @generated
	 */
	int PORTE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NOM = PRICED_ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__PRICE = PRICED_ELEMENT__PRICE;

	/**
	 * The feature id for the '<em><b>Salle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__SALLE = PRICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_FEATURE_COUNT = PRICED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OPERATION_COUNT = PRICED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.impl.PiegeImpl <em>Piege</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.impl.PiegeImpl
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getPiege()
	 * @generated
	 */
	int PIEGE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIEGE__NOM = PRICED_ELEMENT__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIEGE__PRICE = PRICED_ELEMENT__PRICE;

	/**
	 * The number of structural features of the '<em>Piege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIEGE_FEATURE_COUNT = PRICED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Piege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIEGE_OPERATION_COUNT = PRICED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lpdql.evilmasterbase.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lpdql.evilmasterbase.impl.EntreeImpl
	 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__NOM = SALLE__NOM;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__PRICE = SALLE__PRICE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__DESCRIPTION = SALLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sbire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SBIRE = SALLE__SBIRE;

	/**
	 * The feature id for the '<em><b>Piege</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__PIEGE = SALLE__PIEGE;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = SALLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = SALLE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.Repere <em>Repere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repere</em>'.
	 * @see org.lpdql.evilmasterbase.Repere
	 * @generated
	 */
	EClass getRepere();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.evilmasterbase.Repere#getSalle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Salle</em>'.
	 * @see org.lpdql.evilmasterbase.Repere#getSalle()
	 * @see #getRepere()
	 * @generated
	 */
	EReference getRepere_Salle();

	/**
	 * Returns the meta object for the containment reference '{@link org.lpdql.evilmasterbase.Repere#getBureau <em>Bureau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bureau</em>'.
	 * @see org.lpdql.evilmasterbase.Repere#getBureau()
	 * @see #getRepere()
	 * @generated
	 */
	EReference getRepere_Bureau();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.evilmasterbase.Repere#getPorte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Porte</em>'.
	 * @see org.lpdql.evilmasterbase.Repere#getPorte()
	 * @see #getRepere()
	 * @generated
	 */
	EReference getRepere_Porte();

	/**
	 * Returns the meta object for the containment reference '{@link org.lpdql.evilmasterbase.Repere#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entree</em>'.
	 * @see org.lpdql.evilmasterbase.Repere#getEntree()
	 * @see #getRepere()
	 * @generated
	 */
	EReference getRepere_Entree();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.evilmasterbase.Repere#getLocalisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Localisation</em>'.
	 * @see org.lpdql.evilmasterbase.Repere#getLocalisation()
	 * @see #getRepere()
	 * @generated
	 */
	EAttribute getRepere_Localisation();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.Salle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salle</em>'.
	 * @see org.lpdql.evilmasterbase.Salle
	 * @generated
	 */
	EClass getSalle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.evilmasterbase.Salle#getSbire <em>Sbire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sbire</em>'.
	 * @see org.lpdql.evilmasterbase.Salle#getSbire()
	 * @see #getSalle()
	 * @generated
	 */
	EReference getSalle_Sbire();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lpdql.evilmasterbase.Salle#getPiege <em>Piege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Piege</em>'.
	 * @see org.lpdql.evilmasterbase.Salle#getPiege()
	 * @see #getSalle()
	 * @generated
	 */
	EReference getSalle_Piege();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.Sbire <em>Sbire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sbire</em>'.
	 * @see org.lpdql.evilmasterbase.Sbire
	 * @generated
	 */
	EClass getSbire();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.evilmasterbase.Sbire#getArme <em>Arme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arme</em>'.
	 * @see org.lpdql.evilmasterbase.Sbire#getArme()
	 * @see #getSbire()
	 * @generated
	 */
	EAttribute getSbire_Arme();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.Bureau <em>Bureau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bureau</em>'.
	 * @see org.lpdql.evilmasterbase.Bureau
	 * @generated
	 */
	EClass getBureau();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte</em>'.
	 * @see org.lpdql.evilmasterbase.Porte
	 * @generated
	 */
	EClass getPorte();

	/**
	 * Returns the meta object for the reference list '{@link org.lpdql.evilmasterbase.Porte#getSalle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Salle</em>'.
	 * @see org.lpdql.evilmasterbase.Porte#getSalle()
	 * @see #getPorte()
	 * @generated
	 */
	EReference getPorte_Salle();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.Piege <em>Piege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piege</em>'.
	 * @see org.lpdql.evilmasterbase.Piege
	 * @generated
	 */
	EClass getPiege();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see org.lpdql.evilmasterbase.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.PricedElement <em>Priced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priced Element</em>'.
	 * @see org.lpdql.evilmasterbase.PricedElement
	 * @generated
	 */
	EClass getPricedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.evilmasterbase.PricedElement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see org.lpdql.evilmasterbase.PricedElement#getNom()
	 * @see #getPricedElement()
	 * @generated
	 */
	EAttribute getPricedElement_Nom();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.evilmasterbase.PricedElement#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.lpdql.evilmasterbase.PricedElement#getPrice()
	 * @see #getPricedElement()
	 * @generated
	 */
	EAttribute getPricedElement_Price();

	/**
	 * Returns the meta object for class '{@link org.lpdql.evilmasterbase.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Element</em>'.
	 * @see org.lpdql.evilmasterbase.DescribedElement
	 * @generated
	 */
	EClass getDescribedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.lpdql.evilmasterbase.DescribedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.lpdql.evilmasterbase.DescribedElement#getDescription()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvilmasterbaseFactory getEvilmasterbaseFactory();

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
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.impl.RepereImpl <em>Repere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.impl.RepereImpl
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getRepere()
		 * @generated
		 */
		EClass REPERE = eINSTANCE.getRepere();

		/**
		 * The meta object literal for the '<em><b>Salle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPERE__SALLE = eINSTANCE.getRepere_Salle();

		/**
		 * The meta object literal for the '<em><b>Bureau</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPERE__BUREAU = eINSTANCE.getRepere_Bureau();

		/**
		 * The meta object literal for the '<em><b>Porte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPERE__PORTE = eINSTANCE.getRepere_Porte();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPERE__ENTREE = eINSTANCE.getRepere_Entree();

		/**
		 * The meta object literal for the '<em><b>Localisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPERE__LOCALISATION = eINSTANCE.getRepere_Localisation();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.impl.SalleImpl <em>Salle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.impl.SalleImpl
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getSalle()
		 * @generated
		 */
		EClass SALLE = eINSTANCE.getSalle();

		/**
		 * The meta object literal for the '<em><b>Sbire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALLE__SBIRE = eINSTANCE.getSalle_Sbire();

		/**
		 * The meta object literal for the '<em><b>Piege</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALLE__PIEGE = eINSTANCE.getSalle_Piege();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.impl.SbireImpl <em>Sbire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.impl.SbireImpl
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getSbire()
		 * @generated
		 */
		EClass SBIRE = eINSTANCE.getSbire();

		/**
		 * The meta object literal for the '<em><b>Arme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SBIRE__ARME = eINSTANCE.getSbire_Arme();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.impl.BureauImpl <em>Bureau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.impl.BureauImpl
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getBureau()
		 * @generated
		 */
		EClass BUREAU = eINSTANCE.getBureau();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.impl.PorteImpl <em>Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.impl.PorteImpl
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getPorte()
		 * @generated
		 */
		EClass PORTE = eINSTANCE.getPorte();

		/**
		 * The meta object literal for the '<em><b>Salle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTE__SALLE = eINSTANCE.getPorte_Salle();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.impl.PiegeImpl <em>Piege</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.impl.PiegeImpl
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getPiege()
		 * @generated
		 */
		EClass PIEGE = eINSTANCE.getPiege();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.impl.EntreeImpl
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.PricedElement <em>Priced Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.PricedElement
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getPricedElement()
		 * @generated
		 */
		EClass PRICED_ELEMENT = eINSTANCE.getPricedElement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICED_ELEMENT__NOM = eINSTANCE.getPricedElement_Nom();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICED_ELEMENT__PRICE = eINSTANCE.getPricedElement_Price();

		/**
		 * The meta object literal for the '{@link org.lpdql.evilmasterbase.DescribedElement <em>Described Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lpdql.evilmasterbase.DescribedElement
		 * @see org.lpdql.evilmasterbase.impl.EvilmasterbasePackageImpl#getDescribedElement()
		 * @generated
		 */
		EClass DESCRIBED_ELEMENT = eINSTANCE.getDescribedElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__DESCRIPTION = eINSTANCE.getDescribedElement_Description();

	}

} //EvilmasterbasePackage

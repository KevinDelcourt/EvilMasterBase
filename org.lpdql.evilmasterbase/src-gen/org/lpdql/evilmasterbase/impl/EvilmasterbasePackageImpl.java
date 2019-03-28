/**
 */
package org.lpdql.evilmasterbase.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.lpdql.evilmasterbase.Bureau;
import org.lpdql.evilmasterbase.Couloir;
import org.lpdql.evilmasterbase.DescribedElement;
import org.lpdql.evilmasterbase.Entree;
import org.lpdql.evilmasterbase.Escouade;
import org.lpdql.evilmasterbase.EvilmasterbaseFactory;
import org.lpdql.evilmasterbase.EvilmasterbasePackage;
import org.lpdql.evilmasterbase.Piege;
import org.lpdql.evilmasterbase.Porte;
import org.lpdql.evilmasterbase.PricedElement;
import org.lpdql.evilmasterbase.Repere;
import org.lpdql.evilmasterbase.Salle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvilmasterbasePackageImpl extends EPackageImpl implements EvilmasterbasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escouadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bureauEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piegeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couloirEClass = null;

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
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvilmasterbasePackageImpl() {
		super(eNS_URI, EvilmasterbaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvilmasterbasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvilmasterbasePackage init() {
		if (isInited)
			return (EvilmasterbasePackage) EPackage.Registry.INSTANCE.getEPackage(EvilmasterbasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEvilmasterbasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EvilmasterbasePackageImpl theEvilmasterbasePackage = registeredEvilmasterbasePackage instanceof EvilmasterbasePackageImpl
				? (EvilmasterbasePackageImpl) registeredEvilmasterbasePackage
				: new EvilmasterbasePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEvilmasterbasePackage.createPackageContents();

		// Initialize created meta-data
		theEvilmasterbasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvilmasterbasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvilmasterbasePackage.eNS_URI, theEvilmasterbasePackage);
		return theEvilmasterbasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepere() {
		return repereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepere_Salle() {
		return (EReference) repereEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepere_Porte() {
		return (EReference) repereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepere_Localisation() {
		return (EAttribute) repereEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalle() {
		return salleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalle_Sbire() {
		return (EReference) salleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSalle_Piege() {
		return (EReference) salleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscouade() {
		return escouadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEscouade_Arme() {
		return (EAttribute) escouadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEscouade_Nombre() {
		return (EAttribute) escouadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBureau() {
		return bureauEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorte() {
		return porteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPorte_Salle1() {
		return (EReference) porteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPorte_Salle2() {
		return (EReference) porteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiege() {
		return piegeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPricedElement() {
		return pricedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricedElement_Nom() {
		return (EAttribute) pricedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricedElement_Price() {
		return (EAttribute) pricedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribedElement() {
		return describedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribedElement_Description() {
		return (EAttribute) describedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCouloir() {
		return couloirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvilmasterbaseFactory getEvilmasterbaseFactory() {
		return (EvilmasterbaseFactory) getEFactoryInstance();
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
		repereEClass = createEClass(REPERE);
		createEReference(repereEClass, REPERE__PORTE);
		createEAttribute(repereEClass, REPERE__LOCALISATION);
		createEReference(repereEClass, REPERE__SALLE);

		salleEClass = createEClass(SALLE);
		createEReference(salleEClass, SALLE__SBIRE);
		createEReference(salleEClass, SALLE__PIEGE);

		escouadeEClass = createEClass(ESCOUADE);
		createEAttribute(escouadeEClass, ESCOUADE__ARME);
		createEAttribute(escouadeEClass, ESCOUADE__NOMBRE);

		bureauEClass = createEClass(BUREAU);

		porteEClass = createEClass(PORTE);
		createEReference(porteEClass, PORTE__SALLE1);
		createEReference(porteEClass, PORTE__SALLE2);

		piegeEClass = createEClass(PIEGE);

		entreeEClass = createEClass(ENTREE);

		pricedElementEClass = createEClass(PRICED_ELEMENT);
		createEAttribute(pricedElementEClass, PRICED_ELEMENT__NOM);
		createEAttribute(pricedElementEClass, PRICED_ELEMENT__PRICE);

		describedElementEClass = createEClass(DESCRIBED_ELEMENT);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__DESCRIPTION);

		couloirEClass = createEClass(COULOIR);
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
		repereEClass.getESuperTypes().add(this.getDescribedElement());
		salleEClass.getESuperTypes().add(this.getDescribedElement());
		escouadeEClass.getESuperTypes().add(this.getPricedElement());
		bureauEClass.getESuperTypes().add(this.getSalle());
		porteEClass.getESuperTypes().add(this.getPricedElement());
		piegeEClass.getESuperTypes().add(this.getPricedElement());
		entreeEClass.getESuperTypes().add(this.getSalle());
		describedElementEClass.getESuperTypes().add(this.getPricedElement());
		couloirEClass.getESuperTypes().add(this.getSalle());

		// Initialize classes, features, and operations; add parameters
		initEClass(repereEClass, Repere.class, "Repere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepere_Porte(), this.getPorte(), null, "porte", null, 0, -1, Repere.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepere_Localisation(), ecorePackage.getEString(), "localisation", null, 0, 1, Repere.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepere_Salle(), this.getSalle(), null, "salle", null, 0, -1, Repere.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(salleEClass, Salle.class, "Salle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSalle_Sbire(), this.getEscouade(), null, "sbire", null, 0, -1, Salle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSalle_Piege(), this.getPiege(), null, "piege", null, 0, -1, Salle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(escouadeEClass, Escouade.class, "Escouade", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEscouade_Arme(), ecorePackage.getEString(), "arme", null, 0, 1, Escouade.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEscouade_Nombre(), ecorePackage.getEInt(), "nombre", null, 0, 1, Escouade.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bureauEClass, Bureau.class, "Bureau", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(porteEClass, Porte.class, "Porte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPorte_Salle1(), this.getSalle(), null, "salle1", null, 1, 1, Porte.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPorte_Salle2(), this.getSalle(), null, "salle2", null, 1, 1, Porte.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(piegeEClass, Piege.class, "Piege", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pricedElementEClass, PricedElement.class, "PricedElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPricedElement_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, PricedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPricedElement_Price(), ecorePackage.getEInt(), "price", null, 0, 1, PricedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedElementEClass, DescribedElement.class, "DescribedElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(couloirEClass, Couloir.class, "Couloir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EvilmasterbasePackageImpl

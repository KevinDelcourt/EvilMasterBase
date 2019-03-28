/**
 */
package org.lpdql.evilmasterbase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lpdql.evilmasterbase.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvilmasterbaseFactoryImpl extends EFactoryImpl implements EvilmasterbaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvilmasterbaseFactory init() {
		try {
			EvilmasterbaseFactory theEvilmasterbaseFactory = (EvilmasterbaseFactory) EPackage.Registry.INSTANCE
					.getEFactory(EvilmasterbasePackage.eNS_URI);
			if (theEvilmasterbaseFactory != null) {
				return theEvilmasterbaseFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvilmasterbaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvilmasterbaseFactoryImpl() {
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
		case EvilmasterbasePackage.REPERE:
			return createRepere();
		case EvilmasterbasePackage.SALLE:
			return createSalle();
		case EvilmasterbasePackage.ESCOUADE:
			return createEscouade();
		case EvilmasterbasePackage.BUREAU:
			return createBureau();
		case EvilmasterbasePackage.PORTE:
			return createPorte();
		case EvilmasterbasePackage.PIEGE:
			return createPiege();
		case EvilmasterbasePackage.ENTREE:
			return createEntree();
		case EvilmasterbasePackage.COULOIR:
			return createCouloir();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repere createRepere() {
		RepereImpl repere = new RepereImpl();
		return repere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salle createSalle() {
		SalleImpl salle = new SalleImpl();
		return salle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escouade createEscouade() {
		EscouadeImpl escouade = new EscouadeImpl();
		return escouade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bureau createBureau() {
		BureauImpl bureau = new BureauImpl();
		return bureau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte createPorte() {
		PorteImpl porte = new PorteImpl();
		return porte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Piege createPiege() {
		PiegeImpl piege = new PiegeImpl();
		return piege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree createEntree() {
		EntreeImpl entree = new EntreeImpl();
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Couloir createCouloir() {
		CouloirImpl couloir = new CouloirImpl();
		return couloir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvilmasterbasePackage getEvilmasterbasePackage() {
		return (EvilmasterbasePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvilmasterbasePackage getPackage() {
		return EvilmasterbasePackage.eINSTANCE;
	}

} //EvilmasterbaseFactoryImpl

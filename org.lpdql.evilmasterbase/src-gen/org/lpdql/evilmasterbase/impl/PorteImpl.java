/**
 */
package org.lpdql.evilmasterbase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lpdql.evilmasterbase.EvilmasterbasePackage;
import org.lpdql.evilmasterbase.Porte;
import org.lpdql.evilmasterbase.Salle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PorteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PorteImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PorteImpl#getSalle1 <em>Salle1</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PorteImpl#getSalle2 <em>Salle2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PorteImpl extends MinimalEObjectImpl.Container implements Porte {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSalle1() <em>Salle1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle1()
	 * @generated
	 * @ordered
	 */
	protected Salle salle1;

	/**
	 * The cached value of the '{@link #getSalle2() <em>Salle2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle2()
	 * @generated
	 * @ordered
	 */
	protected Salle salle2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PorteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvilmasterbasePackage.Literals.PORTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PORTE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PORTE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salle getSalle1() {
		if (salle1 != null && salle1.eIsProxy()) {
			InternalEObject oldSalle1 = (InternalEObject) salle1;
			salle1 = (Salle) eResolveProxy(oldSalle1);
			if (salle1 != oldSalle1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvilmasterbasePackage.PORTE__SALLE1,
							oldSalle1, salle1));
			}
		}
		return salle1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salle basicGetSalle1() {
		return salle1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalle1(Salle newSalle1) {
		Salle oldSalle1 = salle1;
		salle1 = newSalle1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PORTE__SALLE1, oldSalle1,
					salle1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salle getSalle2() {
		if (salle2 != null && salle2.eIsProxy()) {
			InternalEObject oldSalle2 = (InternalEObject) salle2;
			salle2 = (Salle) eResolveProxy(oldSalle2);
			if (salle2 != oldSalle2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EvilmasterbasePackage.PORTE__SALLE2,
							oldSalle2, salle2));
			}
		}
		return salle2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Salle basicGetSalle2() {
		return salle2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalle2(Salle newSalle2) {
		Salle oldSalle2 = salle2;
		salle2 = newSalle2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PORTE__SALLE2, oldSalle2,
					salle2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EvilmasterbasePackage.PORTE__NOM:
			return getNom();
		case EvilmasterbasePackage.PORTE__PRICE:
			return getPrice();
		case EvilmasterbasePackage.PORTE__SALLE1:
			if (resolve)
				return getSalle1();
			return basicGetSalle1();
		case EvilmasterbasePackage.PORTE__SALLE2:
			if (resolve)
				return getSalle2();
			return basicGetSalle2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EvilmasterbasePackage.PORTE__NOM:
			setNom((String) newValue);
			return;
		case EvilmasterbasePackage.PORTE__PRICE:
			setPrice((Integer) newValue);
			return;
		case EvilmasterbasePackage.PORTE__SALLE1:
			setSalle1((Salle) newValue);
			return;
		case EvilmasterbasePackage.PORTE__SALLE2:
			setSalle2((Salle) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EvilmasterbasePackage.PORTE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case EvilmasterbasePackage.PORTE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EvilmasterbasePackage.PORTE__SALLE1:
			setSalle1((Salle) null);
			return;
		case EvilmasterbasePackage.PORTE__SALLE2:
			setSalle2((Salle) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EvilmasterbasePackage.PORTE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case EvilmasterbasePackage.PORTE__PRICE:
			return price != PRICE_EDEFAULT;
		case EvilmasterbasePackage.PORTE__SALLE1:
			return salle1 != null;
		case EvilmasterbasePackage.PORTE__SALLE2:
			return salle2 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //PorteImpl

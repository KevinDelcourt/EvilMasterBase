/**
 */
package org.lpdql.evilmasterbase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lpdql.evilmasterbase.Escouade;
import org.lpdql.evilmasterbase.EvilmasterbasePackage;
import org.lpdql.evilmasterbase.Piege;
import org.lpdql.evilmasterbase.Salle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getSbire <em>Sbire</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.SalleImpl#getPiege <em>Piege</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalleImpl extends MinimalEObjectImpl.Container implements Salle {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSbire() <em>Sbire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSbire()
	 * @generated
	 * @ordered
	 */
	protected EList<Escouade> sbire;

	/**
	 * The cached value of the '{@link #getPiege() <em>Piege</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiege()
	 * @generated
	 * @ordered
	 */
	protected EList<Piege> piege;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvilmasterbasePackage.Literals.SALLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.SALLE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.SALLE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.SALLE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Escouade> getSbire() {
		if (sbire == null) {
			sbire = new EObjectContainmentEList<Escouade>(Escouade.class, this, EvilmasterbasePackage.SALLE__SBIRE);
		}
		return sbire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Piege> getPiege() {
		if (piege == null) {
			piege = new EObjectContainmentEList<Piege>(Piege.class, this, EvilmasterbasePackage.SALLE__PIEGE);
		}
		return piege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EvilmasterbasePackage.SALLE__SBIRE:
			return ((InternalEList<?>) getSbire()).basicRemove(otherEnd, msgs);
		case EvilmasterbasePackage.SALLE__PIEGE:
			return ((InternalEList<?>) getPiege()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EvilmasterbasePackage.SALLE__NOM:
			return getNom();
		case EvilmasterbasePackage.SALLE__PRICE:
			return getPrice();
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			return getDescription();
		case EvilmasterbasePackage.SALLE__SBIRE:
			return getSbire();
		case EvilmasterbasePackage.SALLE__PIEGE:
			return getPiege();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EvilmasterbasePackage.SALLE__NOM:
			setNom((String) newValue);
			return;
		case EvilmasterbasePackage.SALLE__PRICE:
			setPrice((Integer) newValue);
			return;
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EvilmasterbasePackage.SALLE__SBIRE:
			getSbire().clear();
			getSbire().addAll((Collection<? extends Escouade>) newValue);
			return;
		case EvilmasterbasePackage.SALLE__PIEGE:
			getPiege().clear();
			getPiege().addAll((Collection<? extends Piege>) newValue);
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
		case EvilmasterbasePackage.SALLE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case EvilmasterbasePackage.SALLE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EvilmasterbasePackage.SALLE__SBIRE:
			getSbire().clear();
			return;
		case EvilmasterbasePackage.SALLE__PIEGE:
			getPiege().clear();
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
		case EvilmasterbasePackage.SALLE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case EvilmasterbasePackage.SALLE__PRICE:
			return price != PRICE_EDEFAULT;
		case EvilmasterbasePackage.SALLE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EvilmasterbasePackage.SALLE__SBIRE:
			return sbire != null && !sbire.isEmpty();
		case EvilmasterbasePackage.SALLE__PIEGE:
			return piege != null && !piege.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SalleImpl

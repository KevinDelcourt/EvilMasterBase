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

import org.lpdql.evilmasterbase.Bureau;
import org.lpdql.evilmasterbase.Entree;
import org.lpdql.evilmasterbase.EvilmasterbasePackage;
import org.lpdql.evilmasterbase.Porte;
import org.lpdql.evilmasterbase.Repere;
import org.lpdql.evilmasterbase.Salle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getSalle <em>Salle</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getBureau <em>Bureau</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getPorte <em>Porte</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getLocalisation <em>Localisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepereImpl extends MinimalEObjectImpl.Container implements Repere {
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
	 * The cached value of the '{@link #getSalle() <em>Salle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected EList<Salle> salle;

	/**
	 * The cached value of the '{@link #getBureau() <em>Bureau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBureau()
	 * @generated
	 * @ordered
	 */
	protected Bureau bureau;

	/**
	 * The cached value of the '{@link #getPorte() <em>Porte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorte()
	 * @generated
	 * @ordered
	 */
	protected EList<Porte> porte;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected Entree entree;

	/**
	 * The default value of the '{@link #getLocalisation() <em>Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalisation() <em>Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisation()
	 * @generated
	 * @ordered
	 */
	protected String localisation = LOCALISATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvilmasterbasePackage.Literals.REPERE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.REPERE__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.REPERE__PRICE, oldPrice,
					price));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.REPERE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Salle> getSalle() {
		if (salle == null) {
			salle = new EObjectContainmentEList<Salle>(Salle.class, this, EvilmasterbasePackage.REPERE__SALLE);
		}
		return salle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bureau getBureau() {
		return bureau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBureau(Bureau newBureau, NotificationChain msgs) {
		Bureau oldBureau = bureau;
		bureau = newBureau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EvilmasterbasePackage.REPERE__BUREAU, oldBureau, newBureau);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBureau(Bureau newBureau) {
		if (newBureau != bureau) {
			NotificationChain msgs = null;
			if (bureau != null)
				msgs = ((InternalEObject) bureau).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EvilmasterbasePackage.REPERE__BUREAU, null, msgs);
			if (newBureau != null)
				msgs = ((InternalEObject) newBureau).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EvilmasterbasePackage.REPERE__BUREAU, null, msgs);
			msgs = basicSetBureau(newBureau, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.REPERE__BUREAU, newBureau,
					newBureau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Porte> getPorte() {
		if (porte == null) {
			porte = new EObjectContainmentEList<Porte>(Porte.class, this, EvilmasterbasePackage.REPERE__PORTE);
		}
		return porte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entree getEntree() {
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntree(Entree newEntree, NotificationChain msgs) {
		Entree oldEntree = entree;
		entree = newEntree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EvilmasterbasePackage.REPERE__ENTREE, oldEntree, newEntree);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntree(Entree newEntree) {
		if (newEntree != entree) {
			NotificationChain msgs = null;
			if (entree != null)
				msgs = ((InternalEObject) entree).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EvilmasterbasePackage.REPERE__ENTREE, null, msgs);
			if (newEntree != null)
				msgs = ((InternalEObject) newEntree).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EvilmasterbasePackage.REPERE__ENTREE, null, msgs);
			msgs = basicSetEntree(newEntree, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.REPERE__ENTREE, newEntree,
					newEntree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalisation() {
		return localisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalisation(String newLocalisation) {
		String oldLocalisation = localisation;
		localisation = newLocalisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.REPERE__LOCALISATION,
					oldLocalisation, localisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EvilmasterbasePackage.REPERE__SALLE:
			return ((InternalEList<?>) getSalle()).basicRemove(otherEnd, msgs);
		case EvilmasterbasePackage.REPERE__BUREAU:
			return basicSetBureau(null, msgs);
		case EvilmasterbasePackage.REPERE__PORTE:
			return ((InternalEList<?>) getPorte()).basicRemove(otherEnd, msgs);
		case EvilmasterbasePackage.REPERE__ENTREE:
			return basicSetEntree(null, msgs);
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
		case EvilmasterbasePackage.REPERE__NOM:
			return getNom();
		case EvilmasterbasePackage.REPERE__PRICE:
			return getPrice();
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			return getDescription();
		case EvilmasterbasePackage.REPERE__SALLE:
			return getSalle();
		case EvilmasterbasePackage.REPERE__BUREAU:
			return getBureau();
		case EvilmasterbasePackage.REPERE__PORTE:
			return getPorte();
		case EvilmasterbasePackage.REPERE__ENTREE:
			return getEntree();
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			return getLocalisation();
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
		case EvilmasterbasePackage.REPERE__NOM:
			setNom((String) newValue);
			return;
		case EvilmasterbasePackage.REPERE__PRICE:
			setPrice((Integer) newValue);
			return;
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EvilmasterbasePackage.REPERE__SALLE:
			getSalle().clear();
			getSalle().addAll((Collection<? extends Salle>) newValue);
			return;
		case EvilmasterbasePackage.REPERE__BUREAU:
			setBureau((Bureau) newValue);
			return;
		case EvilmasterbasePackage.REPERE__PORTE:
			getPorte().clear();
			getPorte().addAll((Collection<? extends Porte>) newValue);
			return;
		case EvilmasterbasePackage.REPERE__ENTREE:
			setEntree((Entree) newValue);
			return;
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			setLocalisation((String) newValue);
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
		case EvilmasterbasePackage.REPERE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case EvilmasterbasePackage.REPERE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EvilmasterbasePackage.REPERE__SALLE:
			getSalle().clear();
			return;
		case EvilmasterbasePackage.REPERE__BUREAU:
			setBureau((Bureau) null);
			return;
		case EvilmasterbasePackage.REPERE__PORTE:
			getPorte().clear();
			return;
		case EvilmasterbasePackage.REPERE__ENTREE:
			setEntree((Entree) null);
			return;
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			setLocalisation(LOCALISATION_EDEFAULT);
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
		case EvilmasterbasePackage.REPERE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case EvilmasterbasePackage.REPERE__PRICE:
			return price != PRICE_EDEFAULT;
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EvilmasterbasePackage.REPERE__SALLE:
			return salle != null && !salle.isEmpty();
		case EvilmasterbasePackage.REPERE__BUREAU:
			return bureau != null;
		case EvilmasterbasePackage.REPERE__PORTE:
			return porte != null && !porte.isEmpty();
		case EvilmasterbasePackage.REPERE__ENTREE:
			return entree != null;
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			return LOCALISATION_EDEFAULT == null ? localisation != null : !LOCALISATION_EDEFAULT.equals(localisation);
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
		result.append(", localisation: ");
		result.append(localisation);
		result.append(')');
		return result.toString();
	}

} //RepereImpl

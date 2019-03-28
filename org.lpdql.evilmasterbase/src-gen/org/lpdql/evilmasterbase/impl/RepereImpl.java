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
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getPorte <em>Porte</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getLocalisation <em>Localisation</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.RepereImpl#getSalle <em>Salle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepereImpl extends MinimalEObjectImpl.Container implements Repere {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getPorte() <em>Porte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorte()
	 * @generated
	 * @ordered
	 */
	protected EList<Porte> porte;

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
	 * The cached value of the '{@link #getSalle() <em>Salle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected EList<Salle> salle;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.REPERE__NAME, oldName, name));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EvilmasterbasePackage.REPERE__PORTE:
			return ((InternalEList<?>) getPorte()).basicRemove(otherEnd, msgs);
		case EvilmasterbasePackage.REPERE__SALLE:
			return ((InternalEList<?>) getSalle()).basicRemove(otherEnd, msgs);
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
		case EvilmasterbasePackage.REPERE__NAME:
			return getName();
		case EvilmasterbasePackage.REPERE__PRICE:
			return getPrice();
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			return getDescription();
		case EvilmasterbasePackage.REPERE__PORTE:
			return getPorte();
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			return getLocalisation();
		case EvilmasterbasePackage.REPERE__SALLE:
			return getSalle();
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
		case EvilmasterbasePackage.REPERE__NAME:
			setName((String) newValue);
			return;
		case EvilmasterbasePackage.REPERE__PRICE:
			setPrice((Integer) newValue);
			return;
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EvilmasterbasePackage.REPERE__PORTE:
			getPorte().clear();
			getPorte().addAll((Collection<? extends Porte>) newValue);
			return;
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			setLocalisation((String) newValue);
			return;
		case EvilmasterbasePackage.REPERE__SALLE:
			getSalle().clear();
			getSalle().addAll((Collection<? extends Salle>) newValue);
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
		case EvilmasterbasePackage.REPERE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EvilmasterbasePackage.REPERE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EvilmasterbasePackage.REPERE__PORTE:
			getPorte().clear();
			return;
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			setLocalisation(LOCALISATION_EDEFAULT);
			return;
		case EvilmasterbasePackage.REPERE__SALLE:
			getSalle().clear();
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
		case EvilmasterbasePackage.REPERE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EvilmasterbasePackage.REPERE__PRICE:
			return price != PRICE_EDEFAULT;
		case EvilmasterbasePackage.REPERE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EvilmasterbasePackage.REPERE__PORTE:
			return porte != null && !porte.isEmpty();
		case EvilmasterbasePackage.REPERE__LOCALISATION:
			return LOCALISATION_EDEFAULT == null ? localisation != null : !LOCALISATION_EDEFAULT.equals(localisation);
		case EvilmasterbasePackage.REPERE__SALLE:
			return salle != null && !salle.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
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

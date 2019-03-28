/**
 */
package org.lpdql.evilmasterbase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lpdql.evilmasterbase.EvilmasterbasePackage;
import org.lpdql.evilmasterbase.Piege;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piege</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PiegeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PiegeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PiegeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.impl.PiegeImpl#getDangerosité <em>Dangerosité</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PiegeImpl extends MinimalEObjectImpl.Container implements Piege {
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
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDangerosité() <em>Dangerosité</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDangerosité()
	 * @generated
	 * @ordered
	 */
	protected static final int DANGEROSITÉ_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDangerosité() <em>Dangerosité</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDangerosité()
	 * @generated
	 * @ordered
	 */
	protected int dangerosité = DANGEROSITÉ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PiegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvilmasterbasePackage.Literals.PIEGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PIEGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PIEGE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PIEGE__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDangerosité() {
		return dangerosité;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDangerosité(int newDangerosité) {
		int oldDangerosité = dangerosité;
		dangerosité = newDangerosité;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvilmasterbasePackage.PIEGE__DANGEROSITÉ,
					oldDangerosité, dangerosité));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EvilmasterbasePackage.PIEGE__NAME:
			return getName();
		case EvilmasterbasePackage.PIEGE__PRICE:
			return getPrice();
		case EvilmasterbasePackage.PIEGE__POSITION:
			return getPosition();
		case EvilmasterbasePackage.PIEGE__DANGEROSITÉ:
			return getDangerosité();
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
		case EvilmasterbasePackage.PIEGE__NAME:
			setName((String) newValue);
			return;
		case EvilmasterbasePackage.PIEGE__PRICE:
			setPrice((Integer) newValue);
			return;
		case EvilmasterbasePackage.PIEGE__POSITION:
			setPosition((String) newValue);
			return;
		case EvilmasterbasePackage.PIEGE__DANGEROSITÉ:
			setDangerosité((Integer) newValue);
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
		case EvilmasterbasePackage.PIEGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EvilmasterbasePackage.PIEGE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case EvilmasterbasePackage.PIEGE__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case EvilmasterbasePackage.PIEGE__DANGEROSITÉ:
			setDangerosité(DANGEROSITÉ_EDEFAULT);
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
		case EvilmasterbasePackage.PIEGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EvilmasterbasePackage.PIEGE__PRICE:
			return price != PRICE_EDEFAULT;
		case EvilmasterbasePackage.PIEGE__POSITION:
			return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
		case EvilmasterbasePackage.PIEGE__DANGEROSITÉ:
			return dangerosité != DANGEROSITÉ_EDEFAULT;
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
		result.append(", position: ");
		result.append(position);
		result.append(", dangerosité: ");
		result.append(dangerosité);
		result.append(')');
		return result.toString();
	}

} //PiegeImpl

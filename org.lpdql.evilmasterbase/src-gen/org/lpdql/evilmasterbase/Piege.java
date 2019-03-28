/**
 */
package org.lpdql.evilmasterbase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piege</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.Piege#getPosition <em>Position</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.Piege#getDangerosité <em>Dangerosité</em>}</li>
 * </ul>
 *
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPiege()
 * @model
 * @generated
 */
public interface Piege extends PricedElement {

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPiege_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Piege#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Dangerosité</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dangerosité</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dangerosité</em>' attribute.
	 * @see #setDangerosité(int)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPiege_Dangerosité()
	 * @model
	 * @generated
	 */
	int getDangerosité();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Piege#getDangerosité <em>Dangerosité</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dangerosité</em>' attribute.
	 * @see #getDangerosité()
	 * @generated
	 */
	void setDangerosité(int value);
} // Piege

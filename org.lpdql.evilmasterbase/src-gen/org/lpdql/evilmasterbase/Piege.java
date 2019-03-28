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
 *   <li>{@link org.lpdql.evilmasterbase.Piege#getDangerosite <em>Dangerosite</em>}</li>
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
	 * Returns the value of the '<em><b>Dangerosite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dangerosite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dangerosite</em>' attribute.
	 * @see #setDangerosite(int)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPiege_Dangerosite()
	 * @model
	 * @generated
	 */
	int getDangerosite();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Piege#getDangerosite <em>Dangerosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dangerosite</em>' attribute.
	 * @see #getDangerosite()
	 * @generated
	 */
	void setDangerosite(int value);
} // Piege

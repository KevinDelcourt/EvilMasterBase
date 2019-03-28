/**
 */
package org.lpdql.evilmasterbase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Porte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.Porte#getSalle1 <em>Salle1</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.Porte#getSalle2 <em>Salle2</em>}</li>
 * </ul>
 *
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPorte()
 * @model
 * @generated
 */
public interface Porte extends PricedElement {
	/**
	 * Returns the value of the '<em><b>Salle1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salle1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle1</em>' reference.
	 * @see #setSalle1(Salle)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPorte_Salle1()
	 * @model required="true"
	 * @generated
	 */
	Salle getSalle1();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Porte#getSalle1 <em>Salle1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle1</em>' reference.
	 * @see #getSalle1()
	 * @generated
	 */
	void setSalle1(Salle value);

	/**
	 * Returns the value of the '<em><b>Salle2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salle2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle2</em>' reference.
	 * @see #setSalle2(Salle)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPorte_Salle2()
	 * @model required="true"
	 * @generated
	 */
	Salle getSalle2();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Porte#getSalle2 <em>Salle2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle2</em>' reference.
	 * @see #getSalle2()
	 * @generated
	 */
	void setSalle2(Salle value);

} // Porte

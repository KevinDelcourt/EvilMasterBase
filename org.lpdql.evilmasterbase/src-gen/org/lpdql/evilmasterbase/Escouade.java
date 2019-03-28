/**
 */
package org.lpdql.evilmasterbase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escouade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.Escouade#getArme <em>Arme</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.Escouade#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getEscouade()
 * @model
 * @generated
 */
public interface Escouade extends PricedElement {
	/**
	 * Returns the value of the '<em><b>Arme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arme</em>' attribute.
	 * @see #setArme(String)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getEscouade_Arme()
	 * @model
	 * @generated
	 */
	String getArme();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Escouade#getArme <em>Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arme</em>' attribute.
	 * @see #getArme()
	 * @generated
	 */
	void setArme(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(int)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getEscouade_Nombre()
	 * @model
	 * @generated
	 */
	int getNombre();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Escouade#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(int value);

} // Escouade

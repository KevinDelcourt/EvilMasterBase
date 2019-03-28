/**
 */
package org.lpdql.evilmasterbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.Salle#getEscouade <em>Escouade</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.Salle#getPiege <em>Piege</em>}</li>
 * </ul>
 *
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getSalle()
 * @model
 * @generated
 */
public interface Salle extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Escouade</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.evilmasterbase.Escouade}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escouade</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escouade</em>' containment reference list.
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getSalle_Escouade()
	 * @model containment="true"
	 * @generated
	 */
	EList<Escouade> getEscouade();

	/**
	 * Returns the value of the '<em><b>Piege</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.evilmasterbase.Piege}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piege</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piege</em>' containment reference list.
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getSalle_Piege()
	 * @model containment="true"
	 * @generated
	 */
	EList<Piege> getPiege();

} // Salle

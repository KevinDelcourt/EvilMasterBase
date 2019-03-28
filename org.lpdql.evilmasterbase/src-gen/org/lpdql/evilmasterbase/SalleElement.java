/**
 */
package org.lpdql.evilmasterbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salle Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.SalleElement#getSbire <em>Sbire</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.SalleElement#getPiege <em>Piege</em>}</li>
 * </ul>
 *
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getSalleElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SalleElement extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Sbire</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.evilmasterbase.Sbire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sbire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbire</em>' containment reference list.
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getSalleElement_Sbire()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sbire> getSbire();

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
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getSalleElement_Piege()
	 * @model containment="true"
	 * @generated
	 */
	EList<Piege> getPiege();

} // SalleElement

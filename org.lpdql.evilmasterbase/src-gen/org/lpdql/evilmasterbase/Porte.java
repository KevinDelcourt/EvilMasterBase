/**
 */
package org.lpdql.evilmasterbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Porte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.Porte#getSalle <em>Salle</em>}</li>
 * </ul>
 *
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPorte()
 * @model
 * @generated
 */
public interface Porte extends PricedElement {
	/**
	 * Returns the value of the '<em><b>Salle</b></em>' reference list.
	 * The list contents are of type {@link org.lpdql.evilmasterbase.Salle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle</em>' reference list.
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getPorte_Salle()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Salle> getSalle();

} // Porte

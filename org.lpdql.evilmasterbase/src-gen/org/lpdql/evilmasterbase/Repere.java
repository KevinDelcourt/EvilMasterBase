/**
 */
package org.lpdql.evilmasterbase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.lpdql.evilmasterbase.Repere#getPorte <em>Porte</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.Repere#getLocalisation <em>Localisation</em>}</li>
 *   <li>{@link org.lpdql.evilmasterbase.Repere#getSalle <em>Salle</em>}</li>
 * </ul>
 *
 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getRepere()
 * @model
 * @generated
 */
public interface Repere extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Porte</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.evilmasterbase.Porte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porte</em>' containment reference list.
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getRepere_Porte()
	 * @model containment="true"
	 * @generated
	 */
	EList<Porte> getPorte();

	/**
	 * Returns the value of the '<em><b>Localisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localisation</em>' attribute.
	 * @see #setLocalisation(String)
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getRepere_Localisation()
	 * @model
	 * @generated
	 */
	String getLocalisation();

	/**
	 * Sets the value of the '{@link org.lpdql.evilmasterbase.Repere#getLocalisation <em>Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localisation</em>' attribute.
	 * @see #getLocalisation()
	 * @generated
	 */
	void setLocalisation(String value);

	/**
	 * Returns the value of the '<em><b>Salle</b></em>' containment reference list.
	 * The list contents are of type {@link org.lpdql.evilmasterbase.Salle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle</em>' containment reference list.
	 * @see org.lpdql.evilmasterbase.EvilmasterbasePackage#getRepere_Salle()
	 * @model containment="true"
	 * @generated
	 */
	EList<Salle> getSalle();

} // Repere

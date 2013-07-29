/**
 */
package de.example.gui.GUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displayed Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.DisplayedPage#getName <em>Name</em>}</li>
 *   <li>{@link de.example.gui.GUI.DisplayedPage#getAppbar <em>Appbar</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getDisplayedPage()
 * @model abstract="true"
 * @generated
 */
public interface DisplayedPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.example.gui.GUI.GuiPackage#getDisplayedPage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.DisplayedPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Appbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appbar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appbar</em>' containment reference.
	 * @see #setAppbar(AppBar)
	 * @see de.example.gui.GUI.GuiPackage#getDisplayedPage_Appbar()
	 * @model containment="true"
	 * @generated
	 */
	AppBar getAppbar();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.DisplayedPage#getAppbar <em>Appbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appbar</em>' containment reference.
	 * @see #getAppbar()
	 * @generated
	 */
	void setAppbar(AppBar value);

} // DisplayedPage

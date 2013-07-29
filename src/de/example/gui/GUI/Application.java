/**
 */
package de.example.gui.GUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.Application#getName <em>Name</em>}</li>
 *   <li>{@link de.example.gui.GUI.Application#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link de.example.gui.GUI.Application#getWindow <em>Window</em>}</li>
 *   <li>{@link de.example.gui.GUI.Application#getStartPage <em>Start Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @see de.example.gui.GUI.GuiPackage#getApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see de.example.gui.GUI.GuiPackage#getApplication_Namespace()
	 * @model required="true"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.Application#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference list.
	 * The list contents are of type {@link de.example.gui.GUI.DisplayedPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference list.
	 * @see de.example.gui.GUI.GuiPackage#getApplication_Window()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DisplayedPage> getWindow();

	/**
	 * Returns the value of the '<em><b>Start Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Page</em>' reference.
	 * @see #setStartPage(DisplayedPage)
	 * @see de.example.gui.GUI.GuiPackage#getApplication_StartPage()
	 * @model required="true"
	 * @generated
	 */
	DisplayedPage getStartPage();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.Application#getStartPage <em>Start Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Page</em>' reference.
	 * @see #getStartPage()
	 * @generated
	 */
	void setStartPage(DisplayedPage value);

} // Application

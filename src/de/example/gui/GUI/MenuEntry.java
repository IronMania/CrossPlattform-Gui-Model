/**
 */
package de.example.gui.GUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * menu entry über events
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.MenuEntry#getMenuentry <em>Menuentry</em>}</li>
 *   <li>{@link de.example.gui.GUI.MenuEntry#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getMenuEntry()
 * @model
 * @generated
 */
public interface MenuEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Menuentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menuentry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menuentry</em>' reference.
	 * @see #setMenuentry(DisplayedPage)
	 * @see de.example.gui.GUI.GuiPackage#getMenuEntry_Menuentry()
	 * @model required="true"
	 * @generated
	 */
	DisplayedPage getMenuentry();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.MenuEntry#getMenuentry <em>Menuentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menuentry</em>' reference.
	 * @see #getMenuentry()
	 * @generated
	 */
	void setMenuentry(DisplayedPage value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see de.example.gui.GUI.GuiPackage#getMenuEntry_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.MenuEntry#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

} // MenuEntry

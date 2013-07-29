/**
 */
package de.example.gui.GUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.AppBar#getAppbarentry <em>Appbarentry</em>}</li>
 *   <li>{@link de.example.gui.GUI.AppBar#getOptionsEntry <em>Options Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getAppBar()
 * @model
 * @generated
 */
public interface AppBar extends EObject {
	/**
	 * Returns the value of the '<em><b>Appbarentry</b></em>' containment reference list.
	 * The list contents are of type {@link de.example.gui.GUI.ActionEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appbarentry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appbarentry</em>' containment reference list.
	 * @see de.example.gui.GUI.GuiPackage#getAppBar_Appbarentry()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionEntry> getAppbarentry();

	/**
	 * Returns the value of the '<em><b>Options Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.example.gui.GUI.OptionsEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options Entry</em>' containment reference list.
	 * @see de.example.gui.GUI.GuiPackage#getAppBar_OptionsEntry()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionsEntry> getOptionsEntry();

} // AppBar

/**
 */
package de.example.gui.GUI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.TabBar#getTabpages <em>Tabpages</em>}</li>
 *   <li>{@link de.example.gui.GUI.TabBar#getWp7Type <em>Wp7 Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getTabBar()
 * @model
 * @generated
 */
public interface TabBar extends DisplayedPage {
	/**
	 * Returns the value of the '<em><b>Tabpages</b></em>' containment reference list.
	 * The list contents are of type {@link de.example.gui.GUI.TabPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabpages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabpages</em>' containment reference list.
	 * @see de.example.gui.GUI.GuiPackage#getTabBar_Tabpages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TabPage> getTabpages();

	/**
	 * Returns the value of the '<em><b>Wp7 Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.example.gui.GUI.Wp7TabType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wp7 Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wp7 Type</em>' attribute.
	 * @see de.example.gui.GUI.Wp7TabType
	 * @see #setWp7Type(Wp7TabType)
	 * @see de.example.gui.GUI.GuiPackage#getTabBar_Wp7Type()
	 * @model
	 * @generated
	 */
	Wp7TabType getWp7Type();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.TabBar#getWp7Type <em>Wp7 Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wp7 Type</em>' attribute.
	 * @see de.example.gui.GUI.Wp7TabType
	 * @see #getWp7Type()
	 * @generated
	 */
	void setWp7Type(Wp7TabType value);

} // TabBar

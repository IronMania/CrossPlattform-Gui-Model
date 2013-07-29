/**
 */
package de.example.gui.GUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.Page#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.example.gui.GUI.Page#getToolbar <em>Toolbar</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends DisplayedPage {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(LayoutManager)
	 * @see de.example.gui.GUI.GuiPackage#getPage_Layout()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LayoutManager getLayout();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.Page#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(LayoutManager value);

	/**
	 * Returns the value of the '<em><b>Toolbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toolbar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolbar</em>' containment reference.
	 * @see #setToolbar(ToolBar)
	 * @see de.example.gui.GUI.GuiPackage#getPage_Toolbar()
	 * @model containment="true"
	 * @generated
	 */
	ToolBar getToolbar();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.Page#getToolbar <em>Toolbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolbar</em>' containment reference.
	 * @see #getToolbar()
	 * @generated
	 */
	void setToolbar(ToolBar value);

} // Page

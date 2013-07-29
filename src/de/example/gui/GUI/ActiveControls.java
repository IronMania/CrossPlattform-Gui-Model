/**
 */
package de.example.gui.GUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Controls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.ActiveControls#getClickEvent <em>Click Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getActiveControls()
 * @model abstract="true"
 * @generated
 */
public interface ActiveControls extends Controls {
	/**
	 * Returns the value of the '<em><b>Click Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Click Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Click Event</em>' containment reference.
	 * @see #setClickEvent(Event)
	 * @see de.example.gui.GUI.GuiPackage#getActiveControls_ClickEvent()
	 * @model containment="true"
	 * @generated
	 */
	Event getClickEvent();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.ActiveControls#getClickEvent <em>Click Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Click Event</em>' containment reference.
	 * @see #getClickEvent()
	 * @generated
	 */
	void setClickEvent(Event value);

} // ActiveControls

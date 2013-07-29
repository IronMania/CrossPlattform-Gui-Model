/**
 */
package de.example.gui.GUI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.example.gui.GUI.Image#getDefaultImage <em>Default Image</em>}</li>
 *   <li>{@link de.example.gui.GUI.Image#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.example.gui.GUI.GuiPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends Controls {
	/**
	 * Returns the value of the '<em><b>Default Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Image</em>' attribute.
	 * @see #setDefaultImage(String)
	 * @see de.example.gui.GUI.GuiPackage#getImage_DefaultImage()
	 * @model
	 * @generated
	 */
	String getDefaultImage();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.Image#getDefaultImage <em>Default Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Image</em>' attribute.
	 * @see #getDefaultImage()
	 * @generated
	 */
	void setDefaultImage(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.example.gui.GUI.GuiPackage#getImage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.example.gui.GUI.Image#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Image

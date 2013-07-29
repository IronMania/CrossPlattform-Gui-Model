/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.DisplayedPage;
import de.example.gui.GUI.GuiPackage;
import de.example.gui.GUI.MenuEntry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.MenuEntryImpl#getMenuentry <em>Menuentry</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.MenuEntryImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuEntryImpl extends EObjectImpl implements MenuEntry {
	/**
	 * The cached value of the '{@link #getMenuentry() <em>Menuentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenuentry()
	 * @generated
	 * @ordered
	 */
	protected DisplayedPage menuentry;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayedPage getMenuentry() {
		if (menuentry != null && menuentry.eIsProxy()) {
			InternalEObject oldMenuentry = (InternalEObject)menuentry;
			menuentry = (DisplayedPage)eResolveProxy(oldMenuentry);
			if (menuentry != oldMenuentry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.MENU_ENTRY__MENUENTRY, oldMenuentry, menuentry));
			}
		}
		return menuentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayedPage basicGetMenuentry() {
		return menuentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenuentry(DisplayedPage newMenuentry) {
		DisplayedPage oldMenuentry = menuentry;
		menuentry = newMenuentry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MENU_ENTRY__MENUENTRY, oldMenuentry, menuentry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.MENU_ENTRY__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.MENU_ENTRY__MENUENTRY:
				if (resolve) return getMenuentry();
				return basicGetMenuentry();
			case GuiPackage.MENU_ENTRY__ICON:
				return getIcon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuiPackage.MENU_ENTRY__MENUENTRY:
				setMenuentry((DisplayedPage)newValue);
				return;
			case GuiPackage.MENU_ENTRY__ICON:
				setIcon((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GuiPackage.MENU_ENTRY__MENUENTRY:
				setMenuentry((DisplayedPage)null);
				return;
			case GuiPackage.MENU_ENTRY__ICON:
				setIcon(ICON_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GuiPackage.MENU_ENTRY__MENUENTRY:
				return menuentry != null;
			case GuiPackage.MENU_ENTRY__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (icon: ");
		result.append(icon);
		result.append(')');
		return result.toString();
	}

} //MenuEntryImpl

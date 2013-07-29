/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.AppBar;
import de.example.gui.GUI.DisplayedPage;
import de.example.gui.GUI.GuiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Displayed Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.DisplayedPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.DisplayedPageImpl#getAppbar <em>Appbar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DisplayedPageImpl extends EObjectImpl implements DisplayedPage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppbar() <em>Appbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppbar()
	 * @generated
	 * @ordered
	 */
	protected AppBar appbar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayedPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.DISPLAYED_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.DISPLAYED_PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppBar getAppbar() {
		return appbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppbar(AppBar newAppbar, NotificationChain msgs) {
		AppBar oldAppbar = appbar;
		appbar = newAppbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.DISPLAYED_PAGE__APPBAR, oldAppbar, newAppbar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppbar(AppBar newAppbar) {
		if (newAppbar != appbar) {
			NotificationChain msgs = null;
			if (appbar != null)
				msgs = ((InternalEObject)appbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.DISPLAYED_PAGE__APPBAR, null, msgs);
			if (newAppbar != null)
				msgs = ((InternalEObject)newAppbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.DISPLAYED_PAGE__APPBAR, null, msgs);
			msgs = basicSetAppbar(newAppbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.DISPLAYED_PAGE__APPBAR, newAppbar, newAppbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.DISPLAYED_PAGE__APPBAR:
				return basicSetAppbar(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.DISPLAYED_PAGE__NAME:
				return getName();
			case GuiPackage.DISPLAYED_PAGE__APPBAR:
				return getAppbar();
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
			case GuiPackage.DISPLAYED_PAGE__NAME:
				setName((String)newValue);
				return;
			case GuiPackage.DISPLAYED_PAGE__APPBAR:
				setAppbar((AppBar)newValue);
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
			case GuiPackage.DISPLAYED_PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuiPackage.DISPLAYED_PAGE__APPBAR:
				setAppbar((AppBar)null);
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
			case GuiPackage.DISPLAYED_PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuiPackage.DISPLAYED_PAGE__APPBAR:
				return appbar != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DisplayedPageImpl

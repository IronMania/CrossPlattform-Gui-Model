/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.ChangePage;
import de.example.gui.GUI.DisplayedPage;
import de.example.gui.GUI.GuiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.ChangePageImpl#getChangeDisplayedPage <em>Change Displayed Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangePageImpl extends TappedImpl implements ChangePage {
	/**
	 * The cached value of the '{@link #getChangeDisplayedPage() <em>Change Displayed Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDisplayedPage()
	 * @generated
	 * @ordered
	 */
	protected DisplayedPage changeDisplayedPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.CHANGE_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayedPage getChangeDisplayedPage() {
		if (changeDisplayedPage != null && changeDisplayedPage.eIsProxy()) {
			InternalEObject oldChangeDisplayedPage = (InternalEObject)changeDisplayedPage;
			changeDisplayedPage = (DisplayedPage)eResolveProxy(oldChangeDisplayedPage);
			if (changeDisplayedPage != oldChangeDisplayedPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.CHANGE_PAGE__CHANGE_DISPLAYED_PAGE, oldChangeDisplayedPage, changeDisplayedPage));
			}
		}
		return changeDisplayedPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayedPage basicGetChangeDisplayedPage() {
		return changeDisplayedPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDisplayedPage(DisplayedPage newChangeDisplayedPage) {
		DisplayedPage oldChangeDisplayedPage = changeDisplayedPage;
		changeDisplayedPage = newChangeDisplayedPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.CHANGE_PAGE__CHANGE_DISPLAYED_PAGE, oldChangeDisplayedPage, changeDisplayedPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuiPackage.CHANGE_PAGE__CHANGE_DISPLAYED_PAGE:
				if (resolve) return getChangeDisplayedPage();
				return basicGetChangeDisplayedPage();
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
			case GuiPackage.CHANGE_PAGE__CHANGE_DISPLAYED_PAGE:
				setChangeDisplayedPage((DisplayedPage)newValue);
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
			case GuiPackage.CHANGE_PAGE__CHANGE_DISPLAYED_PAGE:
				setChangeDisplayedPage((DisplayedPage)null);
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
			case GuiPackage.CHANGE_PAGE__CHANGE_DISPLAYED_PAGE:
				return changeDisplayedPage != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangePageImpl

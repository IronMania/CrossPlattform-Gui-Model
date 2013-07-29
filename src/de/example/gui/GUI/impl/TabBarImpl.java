/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.GuiPackage;
import de.example.gui.GUI.TabBar;
import de.example.gui.GUI.TabPage;
import de.example.gui.GUI.Wp7TabType;
import de.example.gui.GUI.wp7TabType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.TabBarImpl#getTabpages <em>Tabpages</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.TabBarImpl#getWp7Type <em>Wp7 Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabBarImpl extends DisplayedPageImpl implements TabBar {
	/**
	 * The cached value of the '{@link #getTabpages() <em>Tabpages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabpages()
	 * @generated
	 * @ordered
	 */
	protected EList<TabPage> tabpages;

	/**
	 * The default value of the '{@link #getWp7Type() <em>Wp7 Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWp7Type()
	 * @generated
	 * @ordered
	 */
	protected static final Wp7TabType WP7_TYPE_EDEFAULT = Wp7TabType.NONE;

	/**
	 * The cached value of the '{@link #getWp7Type() <em>Wp7 Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWp7Type()
	 * @generated
	 * @ordered
	 */
	protected Wp7TabType wp7Type = WP7_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.TAB_BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TabPage> getTabpages() {
		if (tabpages == null) {
			tabpages = new EObjectContainmentEList<TabPage>(TabPage.class, this, GuiPackage.TAB_BAR__TABPAGES);
		}
		return tabpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wp7TabType getWp7Type() {
		return wp7Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWp7Type(Wp7TabType newWp7Type) {
		Wp7TabType oldWp7Type = wp7Type;
		wp7Type = newWp7Type == null ? WP7_TYPE_EDEFAULT : newWp7Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.TAB_BAR__WP7_TYPE, oldWp7Type, wp7Type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.TAB_BAR__TABPAGES:
				return ((InternalEList<?>)getTabpages()).basicRemove(otherEnd, msgs);
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
			case GuiPackage.TAB_BAR__TABPAGES:
				return getTabpages();
			case GuiPackage.TAB_BAR__WP7_TYPE:
				return getWp7Type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GuiPackage.TAB_BAR__TABPAGES:
				getTabpages().clear();
				getTabpages().addAll((Collection<? extends TabPage>)newValue);
				return;
			case GuiPackage.TAB_BAR__WP7_TYPE:
				setWp7Type((Wp7TabType)newValue);
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
			case GuiPackage.TAB_BAR__TABPAGES:
				getTabpages().clear();
				return;
			case GuiPackage.TAB_BAR__WP7_TYPE:
				setWp7Type(WP7_TYPE_EDEFAULT);
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
			case GuiPackage.TAB_BAR__TABPAGES:
				return tabpages != null && !tabpages.isEmpty();
			case GuiPackage.TAB_BAR__WP7_TYPE:
				return wp7Type != WP7_TYPE_EDEFAULT;
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
		result.append(" (wp7Type: ");
		result.append(wp7Type);
		result.append(')');
		return result.toString();
	}

} //TabBarImpl

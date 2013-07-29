/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.ActionEntry;
import de.example.gui.GUI.AppBar;
import de.example.gui.GUI.GuiPackage;
import de.example.gui.GUI.OptionsEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.AppBarImpl#getAppbarentry <em>Appbarentry</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.AppBarImpl#getOptionsEntry <em>Options Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppBarImpl extends EObjectImpl implements AppBar {
	/**
	 * The cached value of the '{@link #getAppbarentry() <em>Appbarentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppbarentry()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionEntry> appbarentry;

	/**
	 * The cached value of the '{@link #getOptionsEntry() <em>Options Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionsEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionsEntry> optionsEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.APP_BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionEntry> getAppbarentry() {
		if (appbarentry == null) {
			appbarentry = new EObjectContainmentEList<ActionEntry>(ActionEntry.class, this, GuiPackage.APP_BAR__APPBARENTRY);
		}
		return appbarentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionsEntry> getOptionsEntry() {
		if (optionsEntry == null) {
			optionsEntry = new EObjectContainmentEList<OptionsEntry>(OptionsEntry.class, this, GuiPackage.APP_BAR__OPTIONS_ENTRY);
		}
		return optionsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.APP_BAR__APPBARENTRY:
				return ((InternalEList<?>)getAppbarentry()).basicRemove(otherEnd, msgs);
			case GuiPackage.APP_BAR__OPTIONS_ENTRY:
				return ((InternalEList<?>)getOptionsEntry()).basicRemove(otherEnd, msgs);
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
			case GuiPackage.APP_BAR__APPBARENTRY:
				return getAppbarentry();
			case GuiPackage.APP_BAR__OPTIONS_ENTRY:
				return getOptionsEntry();
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
			case GuiPackage.APP_BAR__APPBARENTRY:
				getAppbarentry().clear();
				getAppbarentry().addAll((Collection<? extends ActionEntry>)newValue);
				return;
			case GuiPackage.APP_BAR__OPTIONS_ENTRY:
				getOptionsEntry().clear();
				getOptionsEntry().addAll((Collection<? extends OptionsEntry>)newValue);
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
			case GuiPackage.APP_BAR__APPBARENTRY:
				getAppbarentry().clear();
				return;
			case GuiPackage.APP_BAR__OPTIONS_ENTRY:
				getOptionsEntry().clear();
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
			case GuiPackage.APP_BAR__APPBARENTRY:
				return appbarentry != null && !appbarentry.isEmpty();
			case GuiPackage.APP_BAR__OPTIONS_ENTRY:
				return optionsEntry != null && !optionsEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppBarImpl

/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.GuiPackage;
import de.example.gui.GUI.LayoutManager;
import de.example.gui.GUI.Page;
import de.example.gui.GUI.ToolBar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.PageImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.PageImpl#getToolbar <em>Toolbar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends DisplayedPageImpl implements Page {
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected LayoutManager layout;

	/**
	 * The cached value of the '{@link #getToolbar() <em>Toolbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolbar()
	 * @generated
	 * @ordered
	 */
	protected ToolBar toolbar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutManager getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(LayoutManager newLayout, NotificationChain msgs) {
		LayoutManager oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.PAGE__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(LayoutManager newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.PAGE__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.PAGE__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.PAGE__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolBar getToolbar() {
		return toolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolbar(ToolBar newToolbar, NotificationChain msgs) {
		ToolBar oldToolbar = toolbar;
		toolbar = newToolbar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.PAGE__TOOLBAR, oldToolbar, newToolbar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolbar(ToolBar newToolbar) {
		if (newToolbar != toolbar) {
			NotificationChain msgs = null;
			if (toolbar != null)
				msgs = ((InternalEObject)toolbar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.PAGE__TOOLBAR, null, msgs);
			if (newToolbar != null)
				msgs = ((InternalEObject)newToolbar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.PAGE__TOOLBAR, null, msgs);
			msgs = basicSetToolbar(newToolbar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.PAGE__TOOLBAR, newToolbar, newToolbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.PAGE__LAYOUT:
				return basicSetLayout(null, msgs);
			case GuiPackage.PAGE__TOOLBAR:
				return basicSetToolbar(null, msgs);
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
			case GuiPackage.PAGE__LAYOUT:
				return getLayout();
			case GuiPackage.PAGE__TOOLBAR:
				return getToolbar();
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
			case GuiPackage.PAGE__LAYOUT:
				setLayout((LayoutManager)newValue);
				return;
			case GuiPackage.PAGE__TOOLBAR:
				setToolbar((ToolBar)newValue);
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
			case GuiPackage.PAGE__LAYOUT:
				setLayout((LayoutManager)null);
				return;
			case GuiPackage.PAGE__TOOLBAR:
				setToolbar((ToolBar)null);
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
			case GuiPackage.PAGE__LAYOUT:
				return layout != null;
			case GuiPackage.PAGE__TOOLBAR:
				return toolbar != null;
		}
		return super.eIsSet(featureID);
	}

} //PageImpl

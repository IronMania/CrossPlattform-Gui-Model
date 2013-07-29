/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.AppBarEntry;
import de.example.gui.GUI.GuiPackage;
import de.example.gui.GUI.Tapped;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Bar Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.AppBarEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.AppBarEntryImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.AppBarEntryImpl#getClickEvent <em>Click Event</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.AppBarEntryImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AppBarEntryImpl extends EObjectImpl implements AppBarEntry {
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
	 * The cached value of the '{@link #getClickEvent() <em>Click Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClickEvent()
	 * @generated
	 * @ordered
	 */
	protected Tapped clickEvent;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppBarEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.APP_BAR_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.APP_BAR_ENTRY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.APP_BAR_ENTRY__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tapped getClickEvent() {
		return clickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClickEvent(Tapped newClickEvent, NotificationChain msgs) {
		Tapped oldClickEvent = clickEvent;
		clickEvent = newClickEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.APP_BAR_ENTRY__CLICK_EVENT, oldClickEvent, newClickEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClickEvent(Tapped newClickEvent) {
		if (newClickEvent != clickEvent) {
			NotificationChain msgs = null;
			if (clickEvent != null)
				msgs = ((InternalEObject)clickEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.APP_BAR_ENTRY__CLICK_EVENT, null, msgs);
			if (newClickEvent != null)
				msgs = ((InternalEObject)newClickEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.APP_BAR_ENTRY__CLICK_EVENT, null, msgs);
			msgs = basicSetClickEvent(newClickEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.APP_BAR_ENTRY__CLICK_EVENT, newClickEvent, newClickEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.APP_BAR_ENTRY__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.APP_BAR_ENTRY__CLICK_EVENT:
				return basicSetClickEvent(null, msgs);
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
			case GuiPackage.APP_BAR_ENTRY__NAME:
				return getName();
			case GuiPackage.APP_BAR_ENTRY__ICON:
				return getIcon();
			case GuiPackage.APP_BAR_ENTRY__CLICK_EVENT:
				return getClickEvent();
			case GuiPackage.APP_BAR_ENTRY__TEXT:
				return getText();
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
			case GuiPackage.APP_BAR_ENTRY__NAME:
				setName((String)newValue);
				return;
			case GuiPackage.APP_BAR_ENTRY__ICON:
				setIcon((String)newValue);
				return;
			case GuiPackage.APP_BAR_ENTRY__CLICK_EVENT:
				setClickEvent((Tapped)newValue);
				return;
			case GuiPackage.APP_BAR_ENTRY__TEXT:
				setText((String)newValue);
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
			case GuiPackage.APP_BAR_ENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuiPackage.APP_BAR_ENTRY__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case GuiPackage.APP_BAR_ENTRY__CLICK_EVENT:
				setClickEvent((Tapped)null);
				return;
			case GuiPackage.APP_BAR_ENTRY__TEXT:
				setText(TEXT_EDEFAULT);
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
			case GuiPackage.APP_BAR_ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuiPackage.APP_BAR_ENTRY__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case GuiPackage.APP_BAR_ENTRY__CLICK_EVENT:
				return clickEvent != null;
			case GuiPackage.APP_BAR_ENTRY__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
		result.append(", icon: ");
		result.append(icon);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //AppBarEntryImpl

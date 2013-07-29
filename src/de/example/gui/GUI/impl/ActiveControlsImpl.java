/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.ActiveControls;
import de.example.gui.GUI.Event;
import de.example.gui.GUI.GuiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Controls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.ActiveControlsImpl#getClickEvent <em>Click Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ActiveControlsImpl extends ControlsImpl implements ActiveControls {
	/**
	 * The cached value of the '{@link #getClickEvent() <em>Click Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClickEvent()
	 * @generated
	 * @ordered
	 */
	protected Event clickEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveControlsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.ACTIVE_CONTROLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getClickEvent() {
		return clickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClickEvent(Event newClickEvent, NotificationChain msgs) {
		Event oldClickEvent = clickEvent;
		clickEvent = newClickEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT, oldClickEvent, newClickEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClickEvent(Event newClickEvent) {
		if (newClickEvent != clickEvent) {
			NotificationChain msgs = null;
			if (clickEvent != null)
				msgs = ((InternalEObject)clickEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT, null, msgs);
			if (newClickEvent != null)
				msgs = ((InternalEObject)newClickEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT, null, msgs);
			msgs = basicSetClickEvent(newClickEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT, newClickEvent, newClickEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT:
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
			case GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT:
				return getClickEvent();
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
			case GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT:
				setClickEvent((Event)newValue);
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
			case GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT:
				setClickEvent((Event)null);
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
			case GuiPackage.ACTIVE_CONTROLS__CLICK_EVENT:
				return clickEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //ActiveControlsImpl

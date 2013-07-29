/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.Application;
import de.example.gui.GUI.DisplayedPage;
import de.example.gui.GUI.GuiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.example.gui.GUI.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.ApplicationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.ApplicationImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link de.example.gui.GUI.impl.ApplicationImpl#getStartPage <em>Start Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplayedPage> window;

	/**
	 * The cached value of the '{@link #getStartPage() <em>Start Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPage()
	 * @generated
	 * @ordered
	 */
	protected DisplayedPage startPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuiPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.APPLICATION__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplayedPage> getWindow() {
		if (window == null) {
			window = new EObjectContainmentEList<DisplayedPage>(DisplayedPage.class, this, GuiPackage.APPLICATION__WINDOW);
		}
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayedPage getStartPage() {
		if (startPage != null && startPage.eIsProxy()) {
			InternalEObject oldStartPage = (InternalEObject)startPage;
			startPage = (DisplayedPage)eResolveProxy(oldStartPage);
			if (startPage != oldStartPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiPackage.APPLICATION__START_PAGE, oldStartPage, startPage));
			}
		}
		return startPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayedPage basicGetStartPage() {
		return startPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPage(DisplayedPage newStartPage) {
		DisplayedPage oldStartPage = startPage;
		startPage = newStartPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuiPackage.APPLICATION__START_PAGE, oldStartPage, startPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GuiPackage.APPLICATION__WINDOW:
				return ((InternalEList<?>)getWindow()).basicRemove(otherEnd, msgs);
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
			case GuiPackage.APPLICATION__NAME:
				return getName();
			case GuiPackage.APPLICATION__NAMESPACE:
				return getNamespace();
			case GuiPackage.APPLICATION__WINDOW:
				return getWindow();
			case GuiPackage.APPLICATION__START_PAGE:
				if (resolve) return getStartPage();
				return basicGetStartPage();
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
			case GuiPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case GuiPackage.APPLICATION__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case GuiPackage.APPLICATION__WINDOW:
				getWindow().clear();
				getWindow().addAll((Collection<? extends DisplayedPage>)newValue);
				return;
			case GuiPackage.APPLICATION__START_PAGE:
				setStartPage((DisplayedPage)newValue);
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
			case GuiPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GuiPackage.APPLICATION__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case GuiPackage.APPLICATION__WINDOW:
				getWindow().clear();
				return;
			case GuiPackage.APPLICATION__START_PAGE:
				setStartPage((DisplayedPage)null);
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
			case GuiPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GuiPackage.APPLICATION__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case GuiPackage.APPLICATION__WINDOW:
				return window != null && !window.isEmpty();
			case GuiPackage.APPLICATION__START_PAGE:
				return startPage != null;
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl

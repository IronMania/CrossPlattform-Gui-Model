/**
 */
package de.example.gui.GUI.util;

import de.example.gui.GUI.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.example.gui.GUI.GuiPackage
 * @generated
 */
public class GuiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiSwitch() {
		if (modelPackage == null) {
			modelPackage = GuiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GuiPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.PAGE_CONTENT: {
				PageContent pageContent = (PageContent)theEObject;
				T result = casePageContent(pageContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LAYOUT_MANAGER: {
				LayoutManager layoutManager = (LayoutManager)theEObject;
				T result = caseLayoutManager(layoutManager);
				if (result == null) result = caseElement(layoutManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.HORIZONTAL: {
				Horizontal horizontal = (Horizontal)theEObject;
				T result = caseHorizontal(horizontal);
				if (result == null) result = caseLayoutManager(horizontal);
				if (result == null) result = caseElement(horizontal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.VERTICAL: {
				Vertical vertical = (Vertical)theEObject;
				T result = caseVertical(vertical);
				if (result == null) result = caseLayoutManager(vertical);
				if (result == null) result = caseElement(vertical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CONTROLS: {
				Controls controls = (Controls)theEObject;
				T result = caseControls(controls);
				if (result == null) result = caseElement(controls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseControls(label);
				if (result == null) result = caseElement(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.INPUT_TEXT: {
				InputText inputText = (InputText)theEObject;
				T result = caseInputText(inputText);
				if (result == null) result = caseActiveControls(inputText);
				if (result == null) result = caseControls(inputText);
				if (result == null) result = caseElement(inputText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseActiveControls(button);
				if (result == null) result = caseControls(button);
				if (result == null) result = caseElement(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseDisplayedPage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TAB_BAR: {
				TabBar tabBar = (TabBar)theEObject;
				T result = caseTabBar(tabBar);
				if (result == null) result = caseDisplayedPage(tabBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TAB_PAGE: {
				TabPage tabPage = (TabPage)theEObject;
				T result = caseTabPage(tabPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.DISPLAYED_PAGE: {
				DisplayedPage displayedPage = (DisplayedPage)theEObject;
				T result = caseDisplayedPage(displayedPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ACTIVE_CONTROLS: {
				ActiveControls activeControls = (ActiveControls)theEObject;
				T result = caseActiveControls(activeControls);
				if (result == null) result = caseControls(activeControls);
				if (result == null) result = caseElement(activeControls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseControls(image);
				if (result == null) result = caseElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.APP_BAR: {
				AppBar appBar = (AppBar)theEObject;
				T result = caseAppBar(appBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.APP_BAR_ENTRY: {
				AppBarEntry appBarEntry = (AppBarEntry)theEObject;
				T result = caseAppBarEntry(appBarEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.MENU_ENTRY: {
				MenuEntry menuEntry = (MenuEntry)theEObject;
				T result = caseMenuEntry(menuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TAPPED: {
				Tapped tapped = (Tapped)theEObject;
				T result = caseTapped(tapped);
				if (result == null) result = caseEvent(tapped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TEXT_CHANGED: {
				TextChanged textChanged = (TextChanged)theEObject;
				T result = caseTextChanged(textChanged);
				if (result == null) result = caseEvent(textChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.CHANGE_PAGE: {
				ChangePage changePage = (ChangePage)theEObject;
				T result = caseChangePage(changePage);
				if (result == null) result = caseTapped(changePage);
				if (result == null) result = caseEvent(changePage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.TOOL_BAR: {
				ToolBar toolBar = (ToolBar)theEObject;
				T result = caseToolBar(toolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.GRID: {
				Grid grid = (Grid)theEObject;
				T result = caseGrid(grid);
				if (result == null) result = caseLayoutManager(grid);
				if (result == null) result = caseElement(grid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.ACTION_ENTRY: {
				ActionEntry actionEntry = (ActionEntry)theEObject;
				T result = caseActionEntry(actionEntry);
				if (result == null) result = caseAppBarEntry(actionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GuiPackage.OPTIONS_ENTRY: {
				OptionsEntry optionsEntry = (OptionsEntry)theEObject;
				T result = caseOptionsEntry(optionsEntry);
				if (result == null) result = caseAppBarEntry(optionsEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageContent(PageContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayoutManager(LayoutManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontal(Horizontal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertical(Vertical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControls(Controls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputText(InputText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabBar(TabBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabPage(TabPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displayed Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displayed Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayedPage(DisplayedPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Controls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Controls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveControls(ActiveControls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppBar(AppBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Bar Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Bar Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppBarEntry(AppBarEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuEntry(MenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tapped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tapped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTapped(Tapped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextChanged(TextChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangePage(ChangePage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolBar(ToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrid(Grid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEntry(ActionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionsEntry(OptionsEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GuiSwitch

/**
 */
package de.example.gui.GUI.impl;

import de.example.gui.GUI.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuiFactoryImpl extends EFactoryImpl implements GuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GuiFactory init() {
		try {
			GuiFactory theGuiFactory = (GuiFactory)EPackage.Registry.INSTANCE.getEFactory("http://GUI/1.0"); 
			if (theGuiFactory != null) {
				return theGuiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GuiPackage.APPLICATION: return createApplication();
			case GuiPackage.HORIZONTAL: return createHorizontal();
			case GuiPackage.VERTICAL: return createVertical();
			case GuiPackage.LABEL: return createLabel();
			case GuiPackage.INPUT_TEXT: return createInputText();
			case GuiPackage.BUTTON: return createButton();
			case GuiPackage.PAGE: return createPage();
			case GuiPackage.ELEMENT: return createElement();
			case GuiPackage.TAB_BAR: return createTabBar();
			case GuiPackage.TAB_PAGE: return createTabPage();
			case GuiPackage.IMAGE: return createImage();
			case GuiPackage.APP_BAR: return createAppBar();
			case GuiPackage.MENU_ENTRY: return createMenuEntry();
			case GuiPackage.TAPPED: return createTapped();
			case GuiPackage.TEXT_CHANGED: return createTextChanged();
			case GuiPackage.CHANGE_PAGE: return createChangePage();
			case GuiPackage.TOOL_BAR: return createToolBar();
			case GuiPackage.GRID: return createGrid();
			case GuiPackage.ACTION_ENTRY: return createActionEntry();
			case GuiPackage.OPTIONS_ENTRY: return createOptionsEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GuiPackage.EVENT_TYPE:
				return createeventTypeFromString(eDataType, initialValue);
			case GuiPackage.WP7_TAB_TYPE:
				return createWp7TabTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GuiPackage.EVENT_TYPE:
				return converteventTypeToString(eDataType, instanceValue);
			case GuiPackage.WP7_TAB_TYPE:
				return convertWp7TabTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Horizontal createHorizontal() {
		HorizontalImpl horizontal = new HorizontalImpl();
		return horizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertical createVertical() {
		VerticalImpl vertical = new VerticalImpl();
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputText createInputText() {
		InputTextImpl inputText = new InputTextImpl();
		return inputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabBar createTabBar() {
		TabBarImpl tabBar = new TabBarImpl();
		return tabBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabPage createTabPage() {
		TabPageImpl tabPage = new TabPageImpl();
		return tabPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppBar createAppBar() {
		AppBarImpl appBar = new AppBarImpl();
		return appBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuEntry createMenuEntry() {
		MenuEntryImpl menuEntry = new MenuEntryImpl();
		return menuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tapped createTapped() {
		TappedImpl tapped = new TappedImpl();
		return tapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextChanged createTextChanged() {
		TextChangedImpl textChanged = new TextChangedImpl();
		return textChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePage createChangePage() {
		ChangePageImpl changePage = new ChangePageImpl();
		return changePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolBar createToolBar() {
		ToolBarImpl toolBar = new ToolBarImpl();
		return toolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEntry createActionEntry() {
		ActionEntryImpl actionEntry = new ActionEntryImpl();
		return actionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsEntry createOptionsEntry() {
		OptionsEntryImpl optionsEntry = new OptionsEntryImpl();
		return optionsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eventType createeventTypeFromString(EDataType eDataType, String initialValue) {
		eventType result = eventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converteventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wp7TabType createWp7TabTypeFromString(EDataType eDataType, String initialValue) {
		Wp7TabType result = Wp7TabType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWp7TabTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiPackage getGuiPackage() {
		return (GuiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GuiPackage getPackage() {
		return GuiPackage.eINSTANCE;
	}

} //GuiFactoryImpl

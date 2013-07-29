/**
 */
package de.example.gui.GUI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.example.gui.GUI.GuiFactory
 * @model kind="package"
 * @generated
 */
public interface GuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GUI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://GUI/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuiPackage eINSTANCE = de.example.gui.GUI.impl.GuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ApplicationImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Window</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__WINDOW = 2;

	/**
	 * The feature id for the '<em><b>Start Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__START_PAGE = 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.PageContentImpl <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.PageContentImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getPageContent()
	 * @generated
	 */
	int PAGE_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ElementImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.LayoutManagerImpl <em>Layout Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.LayoutManagerImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getLayoutManager()
	 * @generated
	 */
	int LAYOUT_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_MANAGER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_MANAGER__ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layout Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_MANAGER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.HorizontalImpl <em>Horizontal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.HorizontalImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getHorizontal()
	 * @generated
	 */
	int HORIZONTAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__NAME = LAYOUT_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL__ELEMENTS = LAYOUT_MANAGER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Horizontal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_FEATURE_COUNT = LAYOUT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.VerticalImpl <em>Vertical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.VerticalImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getVertical()
	 * @generated
	 */
	int VERTICAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__NAME = LAYOUT_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL__ELEMENTS = LAYOUT_MANAGER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FEATURE_COUNT = LAYOUT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ControlsImpl <em>Controls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ControlsImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getControls()
	 * @generated
	 */
	int CONTROLS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLS_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.LabelImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = CONTROLS__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = CONTROLS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = CONTROLS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ActiveControlsImpl <em>Active Controls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ActiveControlsImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getActiveControls()
	 * @generated
	 */
	int ACTIVE_CONTROLS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTROLS__NAME = CONTROLS__NAME;

	/**
	 * The feature id for the '<em><b>Click Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTROLS__CLICK_EVENT = CONTROLS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Controls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_CONTROLS_FEATURE_COUNT = CONTROLS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.InputTextImpl <em>Input Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.InputTextImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getInputText()
	 * @generated
	 */
	int INPUT_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__NAME = ACTIVE_CONTROLS__NAME;

	/**
	 * The feature id for the '<em><b>Click Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__CLICK_EVENT = ACTIVE_CONTROLS__CLICK_EVENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__TEXT = ACTIVE_CONTROLS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT__EDITABLE = ACTIVE_CONTROLS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXT_FEATURE_COUNT = ACTIVE_CONTROLS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ButtonImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = ACTIVE_CONTROLS__NAME;

	/**
	 * The feature id for the '<em><b>Click Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CLICK_EVENT = ACTIVE_CONTROLS__CLICK_EVENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = ACTIVE_CONTROLS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = ACTIVE_CONTROLS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.DisplayedPageImpl <em>Displayed Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.DisplayedPageImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getDisplayedPage()
	 * @generated
	 */
	int DISPLAYED_PAGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYED_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Appbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYED_PAGE__APPBAR = 1;

	/**
	 * The number of structural features of the '<em>Displayed Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAYED_PAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.PageImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = DISPLAYED_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Appbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__APPBAR = DISPLAYED_PAGE__APPBAR;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LAYOUT = DISPLAYED_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Toolbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOLBAR = DISPLAYED_PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = DISPLAYED_PAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.TabBarImpl <em>Tab Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.TabBarImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTabBar()
	 * @generated
	 */
	int TAB_BAR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_BAR__NAME = DISPLAYED_PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Appbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_BAR__APPBAR = DISPLAYED_PAGE__APPBAR;

	/**
	 * The feature id for the '<em><b>Tabpages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_BAR__TABPAGES = DISPLAYED_PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wp7 Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_BAR__WP7_TYPE = DISPLAYED_PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tab Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_BAR_FEATURE_COUNT = DISPLAYED_PAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.TabPageImpl <em>Tab Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.TabPageImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTabPage()
	 * @generated
	 */
	int TAB_PAGE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__ICON = 1;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__PAGE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Tab Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_PAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ImageImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = CONTROLS__NAME;

	/**
	 * The feature id for the '<em><b>Default Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DEFAULT_IMAGE = CONTROLS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DESCRIPTION = CONTROLS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = CONTROLS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.AppBarImpl <em>App Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.AppBarImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getAppBar()
	 * @generated
	 */
	int APP_BAR = 16;

	/**
	 * The feature id for the '<em><b>Appbarentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR__APPBARENTRY = 0;

	/**
	 * The feature id for the '<em><b>Options Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR__OPTIONS_ENTRY = 1;

	/**
	 * The number of structural features of the '<em>App Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.AppBarEntryImpl <em>App Bar Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.AppBarEntryImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getAppBarEntry()
	 * @generated
	 */
	int APP_BAR_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR_ENTRY__ICON = 1;

	/**
	 * The feature id for the '<em><b>Click Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR_ENTRY__CLICK_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR_ENTRY__TEXT = 3;

	/**
	 * The number of structural features of the '<em>App Bar Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BAR_ENTRY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.MenuEntryImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getMenuEntry()
	 * @generated
	 */
	int MENU_ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Menuentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__MENUENTRY = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY__ICON = 1;

	/**
	 * The number of structural features of the '<em>Menu Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.EventImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 19;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.TappedImpl <em>Tapped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.TappedImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTapped()
	 * @generated
	 */
	int TAPPED = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPED__NAME = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPED_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.TextChangedImpl <em>Text Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.TextChangedImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTextChanged()
	 * @generated
	 */
	int TEXT_CHANGED = 21;

	/**
	 * The number of structural features of the '<em>Text Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CHANGED_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ChangePageImpl <em>Change Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ChangePageImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getChangePage()
	 * @generated
	 */
	int CHANGE_PAGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PAGE__NAME = TAPPED__NAME;

	/**
	 * The feature id for the '<em><b>Change Displayed Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PAGE__CHANGE_DISPLAYED_PAGE = TAPPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PAGE_FEATURE_COUNT = TAPPED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ToolBarImpl <em>Tool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ToolBarImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getToolBar()
	 * @generated
	 */
	int TOOL_BAR = 23;

	/**
	 * The number of structural features of the '<em>Tool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_BAR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.GridImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NAME = LAYOUT_MANAGER__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ELEMENTS = LAYOUT_MANAGER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ROWS = LAYOUT_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__COLUMNS = LAYOUT_MANAGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = LAYOUT_MANAGER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.ActionEntryImpl <em>Action Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.ActionEntryImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getActionEntry()
	 * @generated
	 */
	int ACTION_ENTRY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY__NAME = APP_BAR_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY__ICON = APP_BAR_ENTRY__ICON;

	/**
	 * The feature id for the '<em><b>Click Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY__CLICK_EVENT = APP_BAR_ENTRY__CLICK_EVENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY__TEXT = APP_BAR_ENTRY__TEXT;

	/**
	 * The number of structural features of the '<em>Action Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY_FEATURE_COUNT = APP_BAR_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.impl.OptionsEntryImpl <em>Options Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.impl.OptionsEntryImpl
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getOptionsEntry()
	 * @generated
	 */
	int OPTIONS_ENTRY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ENTRY__NAME = APP_BAR_ENTRY__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ENTRY__ICON = APP_BAR_ENTRY__ICON;

	/**
	 * The feature id for the '<em><b>Click Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ENTRY__CLICK_EVENT = APP_BAR_ENTRY__CLICK_EVENT;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ENTRY__TEXT = APP_BAR_ENTRY__TEXT;

	/**
	 * The number of structural features of the '<em>Options Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ENTRY_FEATURE_COUNT = APP_BAR_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.eventType <em>event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.eventType
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#geteventType()
	 * @generated
	 */
	int EVENT_TYPE = 27;

	/**
	 * The meta object id for the '{@link de.example.gui.GUI.Wp7TabType <em>Wp7 Tab Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.example.gui.GUI.Wp7TabType
	 * @see de.example.gui.GUI.impl.GuiPackageImpl#getWp7TabType()
	 * @generated
	 */
	int WP7_TAB_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see de.example.gui.GUI.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.example.gui.GUI.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Application#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see de.example.gui.GUI.Application#getNamespace()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Namespace();

	/**
	 * Returns the meta object for the containment reference list '{@link de.example.gui.GUI.Application#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Window</em>'.
	 * @see de.example.gui.GUI.Application#getWindow()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Window();

	/**
	 * Returns the meta object for the reference '{@link de.example.gui.GUI.Application#getStartPage <em>Start Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Page</em>'.
	 * @see de.example.gui.GUI.Application#getStartPage()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_StartPage();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see de.example.gui.GUI.PageContent
	 * @generated
	 */
	EClass getPageContent();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.LayoutManager <em>Layout Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout Manager</em>'.
	 * @see de.example.gui.GUI.LayoutManager
	 * @generated
	 */
	EClass getLayoutManager();

	/**
	 * Returns the meta object for the containment reference list '{@link de.example.gui.GUI.LayoutManager#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.example.gui.GUI.LayoutManager#getElements()
	 * @see #getLayoutManager()
	 * @generated
	 */
	EReference getLayoutManager_Elements();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Horizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal</em>'.
	 * @see de.example.gui.GUI.Horizontal
	 * @generated
	 */
	EClass getHorizontal();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Vertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical</em>'.
	 * @see de.example.gui.GUI.Vertical
	 * @generated
	 */
	EClass getVertical();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Controls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controls</em>'.
	 * @see de.example.gui.GUI.Controls
	 * @generated
	 */
	EClass getControls();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.example.gui.GUI.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.example.gui.GUI.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.InputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Text</em>'.
	 * @see de.example.gui.GUI.InputText
	 * @generated
	 */
	EClass getInputText();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.InputText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.example.gui.GUI.InputText#getText()
	 * @see #getInputText()
	 * @generated
	 */
	EAttribute getInputText_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.InputText#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see de.example.gui.GUI.InputText#isEditable()
	 * @see #getInputText()
	 * @generated
	 */
	EAttribute getInputText_Editable();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see de.example.gui.GUI.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.example.gui.GUI.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see de.example.gui.GUI.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference '{@link de.example.gui.GUI.Page#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see de.example.gui.GUI.Page#getLayout()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Layout();

	/**
	 * Returns the meta object for the containment reference '{@link de.example.gui.GUI.Page#getToolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toolbar</em>'.
	 * @see de.example.gui.GUI.Page#getToolbar()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Toolbar();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.example.gui.GUI.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.example.gui.GUI.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.TabBar <em>Tab Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Bar</em>'.
	 * @see de.example.gui.GUI.TabBar
	 * @generated
	 */
	EClass getTabBar();

	/**
	 * Returns the meta object for the containment reference list '{@link de.example.gui.GUI.TabBar#getTabpages <em>Tabpages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabpages</em>'.
	 * @see de.example.gui.GUI.TabBar#getTabpages()
	 * @see #getTabBar()
	 * @generated
	 */
	EReference getTabBar_Tabpages();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.TabBar#getWp7Type <em>Wp7 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wp7 Type</em>'.
	 * @see de.example.gui.GUI.TabBar#getWp7Type()
	 * @see #getTabBar()
	 * @generated
	 */
	EAttribute getTabBar_Wp7Type();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.TabPage <em>Tab Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab Page</em>'.
	 * @see de.example.gui.GUI.TabPage
	 * @generated
	 */
	EClass getTabPage();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.TabPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.example.gui.GUI.TabPage#getName()
	 * @see #getTabPage()
	 * @generated
	 */
	EAttribute getTabPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.TabPage#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.example.gui.GUI.TabPage#getIcon()
	 * @see #getTabPage()
	 * @generated
	 */
	EAttribute getTabPage_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link de.example.gui.GUI.TabPage#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page</em>'.
	 * @see de.example.gui.GUI.TabPage#getPage()
	 * @see #getTabPage()
	 * @generated
	 */
	EReference getTabPage_Page();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.TabPage#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.example.gui.GUI.TabPage#getTitle()
	 * @see #getTabPage()
	 * @generated
	 */
	EAttribute getTabPage_Title();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.DisplayedPage <em>Displayed Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Displayed Page</em>'.
	 * @see de.example.gui.GUI.DisplayedPage
	 * @generated
	 */
	EClass getDisplayedPage();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.DisplayedPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.example.gui.GUI.DisplayedPage#getName()
	 * @see #getDisplayedPage()
	 * @generated
	 */
	EAttribute getDisplayedPage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.example.gui.GUI.DisplayedPage#getAppbar <em>Appbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appbar</em>'.
	 * @see de.example.gui.GUI.DisplayedPage#getAppbar()
	 * @see #getDisplayedPage()
	 * @generated
	 */
	EReference getDisplayedPage_Appbar();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.ActiveControls <em>Active Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Controls</em>'.
	 * @see de.example.gui.GUI.ActiveControls
	 * @generated
	 */
	EClass getActiveControls();

	/**
	 * Returns the meta object for the containment reference '{@link de.example.gui.GUI.ActiveControls#getClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Click Event</em>'.
	 * @see de.example.gui.GUI.ActiveControls#getClickEvent()
	 * @see #getActiveControls()
	 * @generated
	 */
	EReference getActiveControls_ClickEvent();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see de.example.gui.GUI.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Image#getDefaultImage <em>Default Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Image</em>'.
	 * @see de.example.gui.GUI.Image#getDefaultImage()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_DefaultImage();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Image#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.example.gui.GUI.Image#getDescription()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Description();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.AppBar <em>App Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Bar</em>'.
	 * @see de.example.gui.GUI.AppBar
	 * @generated
	 */
	EClass getAppBar();

	/**
	 * Returns the meta object for the containment reference list '{@link de.example.gui.GUI.AppBar#getAppbarentry <em>Appbarentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appbarentry</em>'.
	 * @see de.example.gui.GUI.AppBar#getAppbarentry()
	 * @see #getAppBar()
	 * @generated
	 */
	EReference getAppBar_Appbarentry();

	/**
	 * Returns the meta object for the containment reference list '{@link de.example.gui.GUI.AppBar#getOptionsEntry <em>Options Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options Entry</em>'.
	 * @see de.example.gui.GUI.AppBar#getOptionsEntry()
	 * @see #getAppBar()
	 * @generated
	 */
	EReference getAppBar_OptionsEntry();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.AppBarEntry <em>App Bar Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Bar Entry</em>'.
	 * @see de.example.gui.GUI.AppBarEntry
	 * @generated
	 */
	EClass getAppBarEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.AppBarEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.example.gui.GUI.AppBarEntry#getName()
	 * @see #getAppBarEntry()
	 * @generated
	 */
	EAttribute getAppBarEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.AppBarEntry#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.example.gui.GUI.AppBarEntry#getIcon()
	 * @see #getAppBarEntry()
	 * @generated
	 */
	EAttribute getAppBarEntry_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link de.example.gui.GUI.AppBarEntry#getClickEvent <em>Click Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Click Event</em>'.
	 * @see de.example.gui.GUI.AppBarEntry#getClickEvent()
	 * @see #getAppBarEntry()
	 * @generated
	 */
	EReference getAppBarEntry_ClickEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.AppBarEntry#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.example.gui.GUI.AppBarEntry#getText()
	 * @see #getAppBarEntry()
	 * @generated
	 */
	EAttribute getAppBarEntry_Text();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Entry</em>'.
	 * @see de.example.gui.GUI.MenuEntry
	 * @generated
	 */
	EClass getMenuEntry();

	/**
	 * Returns the meta object for the reference '{@link de.example.gui.GUI.MenuEntry#getMenuentry <em>Menuentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menuentry</em>'.
	 * @see de.example.gui.GUI.MenuEntry#getMenuentry()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EReference getMenuEntry_Menuentry();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.MenuEntry#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see de.example.gui.GUI.MenuEntry#getIcon()
	 * @see #getMenuEntry()
	 * @generated
	 */
	EAttribute getMenuEntry_Icon();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.example.gui.GUI.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Tapped <em>Tapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tapped</em>'.
	 * @see de.example.gui.GUI.Tapped
	 * @generated
	 */
	EClass getTapped();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Tapped#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.example.gui.GUI.Tapped#getName()
	 * @see #getTapped()
	 * @generated
	 */
	EAttribute getTapped_Name();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.TextChanged <em>Text Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Changed</em>'.
	 * @see de.example.gui.GUI.TextChanged
	 * @generated
	 */
	EClass getTextChanged();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.ChangePage <em>Change Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Page</em>'.
	 * @see de.example.gui.GUI.ChangePage
	 * @generated
	 */
	EClass getChangePage();

	/**
	 * Returns the meta object for the reference '{@link de.example.gui.GUI.ChangePage#getChangeDisplayedPage <em>Change Displayed Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Displayed Page</em>'.
	 * @see de.example.gui.GUI.ChangePage#getChangeDisplayedPage()
	 * @see #getChangePage()
	 * @generated
	 */
	EReference getChangePage_ChangeDisplayedPage();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Bar</em>'.
	 * @see de.example.gui.GUI.ToolBar
	 * @generated
	 */
	EClass getToolBar();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see de.example.gui.GUI.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Grid#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see de.example.gui.GUI.Grid#getRows()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Rows();

	/**
	 * Returns the meta object for the attribute '{@link de.example.gui.GUI.Grid#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see de.example.gui.GUI.Grid#getColumns()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Columns();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.ActionEntry <em>Action Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Entry</em>'.
	 * @see de.example.gui.GUI.ActionEntry
	 * @generated
	 */
	EClass getActionEntry();

	/**
	 * Returns the meta object for class '{@link de.example.gui.GUI.OptionsEntry <em>Options Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Entry</em>'.
	 * @see de.example.gui.GUI.OptionsEntry
	 * @generated
	 */
	EClass getOptionsEntry();

	/**
	 * Returns the meta object for enum '{@link de.example.gui.GUI.eventType <em>event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>event Type</em>'.
	 * @see de.example.gui.GUI.eventType
	 * @generated
	 */
	EEnum geteventType();

	/**
	 * Returns the meta object for enum '{@link de.example.gui.GUI.Wp7TabType <em>Wp7 Tab Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wp7 Tab Type</em>'.
	 * @see de.example.gui.GUI.Wp7TabType
	 * @generated
	 */
	EEnum getWp7TabType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuiFactory getGuiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ApplicationImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAMESPACE = eINSTANCE.getApplication_Namespace();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__WINDOW = eINSTANCE.getApplication_Window();

		/**
		 * The meta object literal for the '<em><b>Start Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__START_PAGE = eINSTANCE.getApplication_StartPage();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.PageContentImpl <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.PageContentImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getPageContent()
		 * @generated
		 */
		EClass PAGE_CONTENT = eINSTANCE.getPageContent();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.LayoutManagerImpl <em>Layout Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.LayoutManagerImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getLayoutManager()
		 * @generated
		 */
		EClass LAYOUT_MANAGER = eINSTANCE.getLayoutManager();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT_MANAGER__ELEMENTS = eINSTANCE.getLayoutManager_Elements();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.HorizontalImpl <em>Horizontal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.HorizontalImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getHorizontal()
		 * @generated
		 */
		EClass HORIZONTAL = eINSTANCE.getHorizontal();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.VerticalImpl <em>Vertical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.VerticalImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getVertical()
		 * @generated
		 */
		EClass VERTICAL = eINSTANCE.getVertical();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ControlsImpl <em>Controls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ControlsImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getControls()
		 * @generated
		 */
		EClass CONTROLS = eINSTANCE.getControls();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.LabelImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.InputTextImpl <em>Input Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.InputTextImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getInputText()
		 * @generated
		 */
		EClass INPUT_TEXT = eINSTANCE.getInputText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TEXT__TEXT = eINSTANCE.getInputText_Text();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TEXT__EDITABLE = eINSTANCE.getInputText_Editable();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ButtonImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.PageImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LAYOUT = eINSTANCE.getPage_Layout();

		/**
		 * The meta object literal for the '<em><b>Toolbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__TOOLBAR = eINSTANCE.getPage_Toolbar();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ElementImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.TabBarImpl <em>Tab Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.TabBarImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTabBar()
		 * @generated
		 */
		EClass TAB_BAR = eINSTANCE.getTabBar();

		/**
		 * The meta object literal for the '<em><b>Tabpages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_BAR__TABPAGES = eINSTANCE.getTabBar_Tabpages();

		/**
		 * The meta object literal for the '<em><b>Wp7 Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_BAR__WP7_TYPE = eINSTANCE.getTabBar_Wp7Type();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.TabPageImpl <em>Tab Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.TabPageImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTabPage()
		 * @generated
		 */
		EClass TAB_PAGE = eINSTANCE.getTabPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_PAGE__NAME = eINSTANCE.getTabPage_Name();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_PAGE__ICON = eINSTANCE.getTabPage_Icon();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB_PAGE__PAGE = eINSTANCE.getTabPage_Page();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB_PAGE__TITLE = eINSTANCE.getTabPage_Title();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.DisplayedPageImpl <em>Displayed Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.DisplayedPageImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getDisplayedPage()
		 * @generated
		 */
		EClass DISPLAYED_PAGE = eINSTANCE.getDisplayedPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAYED_PAGE__NAME = eINSTANCE.getDisplayedPage_Name();

		/**
		 * The meta object literal for the '<em><b>Appbar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAYED_PAGE__APPBAR = eINSTANCE.getDisplayedPage_Appbar();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ActiveControlsImpl <em>Active Controls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ActiveControlsImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getActiveControls()
		 * @generated
		 */
		EClass ACTIVE_CONTROLS = eINSTANCE.getActiveControls();

		/**
		 * The meta object literal for the '<em><b>Click Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVE_CONTROLS__CLICK_EVENT = eINSTANCE.getActiveControls_ClickEvent();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ImageImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Default Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__DEFAULT_IMAGE = eINSTANCE.getImage_DefaultImage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__DESCRIPTION = eINSTANCE.getImage_Description();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.AppBarImpl <em>App Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.AppBarImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getAppBar()
		 * @generated
		 */
		EClass APP_BAR = eINSTANCE.getAppBar();

		/**
		 * The meta object literal for the '<em><b>Appbarentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BAR__APPBARENTRY = eINSTANCE.getAppBar_Appbarentry();

		/**
		 * The meta object literal for the '<em><b>Options Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BAR__OPTIONS_ENTRY = eINSTANCE.getAppBar_OptionsEntry();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.AppBarEntryImpl <em>App Bar Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.AppBarEntryImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getAppBarEntry()
		 * @generated
		 */
		EClass APP_BAR_ENTRY = eINSTANCE.getAppBarEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BAR_ENTRY__NAME = eINSTANCE.getAppBarEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BAR_ENTRY__ICON = eINSTANCE.getAppBarEntry_Icon();

		/**
		 * The meta object literal for the '<em><b>Click Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BAR_ENTRY__CLICK_EVENT = eINSTANCE.getAppBarEntry_ClickEvent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BAR_ENTRY__TEXT = eINSTANCE.getAppBarEntry_Text();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.MenuEntryImpl <em>Menu Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.MenuEntryImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getMenuEntry()
		 * @generated
		 */
		EClass MENU_ENTRY = eINSTANCE.getMenuEntry();

		/**
		 * The meta object literal for the '<em><b>Menuentry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_ENTRY__MENUENTRY = eINSTANCE.getMenuEntry_Menuentry();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ENTRY__ICON = eINSTANCE.getMenuEntry_Icon();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.EventImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.TappedImpl <em>Tapped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.TappedImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTapped()
		 * @generated
		 */
		EClass TAPPED = eINSTANCE.getTapped();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAPPED__NAME = eINSTANCE.getTapped_Name();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.TextChangedImpl <em>Text Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.TextChangedImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getTextChanged()
		 * @generated
		 */
		EClass TEXT_CHANGED = eINSTANCE.getTextChanged();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ChangePageImpl <em>Change Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ChangePageImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getChangePage()
		 * @generated
		 */
		EClass CHANGE_PAGE = eINSTANCE.getChangePage();

		/**
		 * The meta object literal for the '<em><b>Change Displayed Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PAGE__CHANGE_DISPLAYED_PAGE = eINSTANCE.getChangePage_ChangeDisplayedPage();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ToolBarImpl <em>Tool Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ToolBarImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getToolBar()
		 * @generated
		 */
		EClass TOOL_BAR = eINSTANCE.getToolBar();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.GridImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__ROWS = eINSTANCE.getGrid_Rows();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__COLUMNS = eINSTANCE.getGrid_Columns();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.ActionEntryImpl <em>Action Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.ActionEntryImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getActionEntry()
		 * @generated
		 */
		EClass ACTION_ENTRY = eINSTANCE.getActionEntry();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.impl.OptionsEntryImpl <em>Options Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.impl.OptionsEntryImpl
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getOptionsEntry()
		 * @generated
		 */
		EClass OPTIONS_ENTRY = eINSTANCE.getOptionsEntry();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.eventType <em>event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.eventType
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#geteventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.geteventType();

		/**
		 * The meta object literal for the '{@link de.example.gui.GUI.Wp7TabType <em>Wp7 Tab Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.example.gui.GUI.Wp7TabType
		 * @see de.example.gui.GUI.impl.GuiPackageImpl#getWp7TabType()
		 * @generated
		 */
		EEnum WP7_TAB_TYPE = eINSTANCE.getWp7TabType();

	}

} //GuiPackage

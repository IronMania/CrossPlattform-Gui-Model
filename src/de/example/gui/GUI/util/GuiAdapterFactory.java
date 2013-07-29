/**
 */
package de.example.gui.GUI.util;

import de.example.gui.GUI.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.example.gui.GUI.GuiPackage
 * @generated
 */
public class GuiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GuiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiSwitch<Adapter> modelSwitch =
		new GuiSwitch<Adapter>() {
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter casePageContent(PageContent object) {
				return createPageContentAdapter();
			}
			@Override
			public Adapter caseLayoutManager(LayoutManager object) {
				return createLayoutManagerAdapter();
			}
			@Override
			public Adapter caseHorizontal(Horizontal object) {
				return createHorizontalAdapter();
			}
			@Override
			public Adapter caseVertical(Vertical object) {
				return createVerticalAdapter();
			}
			@Override
			public Adapter caseControls(Controls object) {
				return createControlsAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseInputText(InputText object) {
				return createInputTextAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseTabBar(TabBar object) {
				return createTabBarAdapter();
			}
			@Override
			public Adapter caseTabPage(TabPage object) {
				return createTabPageAdapter();
			}
			@Override
			public Adapter caseDisplayedPage(DisplayedPage object) {
				return createDisplayedPageAdapter();
			}
			@Override
			public Adapter caseActiveControls(ActiveControls object) {
				return createActiveControlsAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseAppBar(AppBar object) {
				return createAppBarAdapter();
			}
			@Override
			public Adapter caseAppBarEntry(AppBarEntry object) {
				return createAppBarEntryAdapter();
			}
			@Override
			public Adapter caseMenuEntry(MenuEntry object) {
				return createMenuEntryAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTapped(Tapped object) {
				return createTappedAdapter();
			}
			@Override
			public Adapter caseTextChanged(TextChanged object) {
				return createTextChangedAdapter();
			}
			@Override
			public Adapter caseChangePage(ChangePage object) {
				return createChangePageAdapter();
			}
			@Override
			public Adapter caseToolBar(ToolBar object) {
				return createToolBarAdapter();
			}
			@Override
			public Adapter caseGrid(Grid object) {
				return createGridAdapter();
			}
			@Override
			public Adapter caseActionEntry(ActionEntry object) {
				return createActionEntryAdapter();
			}
			@Override
			public Adapter caseOptionsEntry(OptionsEntry object) {
				return createOptionsEntryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.PageContent
	 * @generated
	 */
	public Adapter createPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.LayoutManager <em>Layout Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.LayoutManager
	 * @generated
	 */
	public Adapter createLayoutManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Horizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Horizontal
	 * @generated
	 */
	public Adapter createHorizontalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Vertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Vertical
	 * @generated
	 */
	public Adapter createVerticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Controls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Controls
	 * @generated
	 */
	public Adapter createControlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.InputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.InputText
	 * @generated
	 */
	public Adapter createInputTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.TabBar <em>Tab Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.TabBar
	 * @generated
	 */
	public Adapter createTabBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.TabPage <em>Tab Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.TabPage
	 * @generated
	 */
	public Adapter createTabPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.DisplayedPage <em>Displayed Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.DisplayedPage
	 * @generated
	 */
	public Adapter createDisplayedPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.ActiveControls <em>Active Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.ActiveControls
	 * @generated
	 */
	public Adapter createActiveControlsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.AppBar <em>App Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.AppBar
	 * @generated
	 */
	public Adapter createAppBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.AppBarEntry <em>App Bar Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.AppBarEntry
	 * @generated
	 */
	public Adapter createAppBarEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.MenuEntry
	 * @generated
	 */
	public Adapter createMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Tapped <em>Tapped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Tapped
	 * @generated
	 */
	public Adapter createTappedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.TextChanged <em>Text Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.TextChanged
	 * @generated
	 */
	public Adapter createTextChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.ChangePage <em>Change Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.ChangePage
	 * @generated
	 */
	public Adapter createChangePageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.ToolBar <em>Tool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.ToolBar
	 * @generated
	 */
	public Adapter createToolBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.Grid
	 * @generated
	 */
	public Adapter createGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.ActionEntry <em>Action Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.ActionEntry
	 * @generated
	 */
	public Adapter createActionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.example.gui.GUI.OptionsEntry <em>Options Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.example.gui.GUI.OptionsEntry
	 * @generated
	 */
	public Adapter createOptionsEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GuiAdapterFactory

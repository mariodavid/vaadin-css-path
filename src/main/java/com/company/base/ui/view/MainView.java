package com.company.base.ui.view;

import com.company.base.ui.component.ViewToolbar;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;
import jakarta.annotation.security.PermitAll;

/**
 * This view shows up when a user navigates to the root ('/') of the application.
 */
@Route
@PermitAll // When security is enabled, allow all authenticated users
public final class MainView extends Main {


    MainView() {
        addClassName(LumoUtility.Padding.MEDIUM);
        ViewToolbar main = new ViewToolbar("Main");
        main.addClassNames("toolbar-bikini-bottom");
        add(main);
        Div div = new Div();
        div.addClassName("main-view-content");
        add(div);
    }

    /**
     * Navigates to the main view.
     */
    public static void showMainView() {
        UI.getCurrent().navigate(MainView.class);
    }
}

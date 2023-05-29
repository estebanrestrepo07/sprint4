package com.udea.calidad.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserPage extends PageObject {

    public static final Target BUTTON_HEAD_OF_DEPARTMENT = Target.the("Head of department button").locatedBy("//*[@id=\"root\"]/div/form/div/div/button[1]");
    public static final Target BUTTON_VICEDEAN = Target.the("Vicedean button").locatedBy("//*[@id=\"root\"]/div/form/div/div/button[2]");

    public static final Target MENU_TITLE = Target.the("menu title").locatedBy("//*[@id=\"root\"]/div/div/h2");


}

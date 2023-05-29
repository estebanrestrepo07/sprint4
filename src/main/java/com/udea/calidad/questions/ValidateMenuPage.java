package com.udea.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.text.Normalizer;

import static com.udea.calidad.userInterfaces.UserPage.MENU_TITLE;

public class ValidateMenuPage implements Question<Boolean> {
    private static String menuTitle = "";

    @Override
    public Boolean answeredBy(Actor actor) {
        String stringCreditPage = Text.of(MENU_TITLE).viewedBy(actor).asString();
        stringCreditPage = Normalizer.normalize(stringCreditPage , Normalizer.Form.NFD);
        stringCreditPage = stringCreditPage.replaceAll("[^\\p{ASCII}]", "");

        return(stringCreditPage.equals(menuTitle));
    }

    public static ValidateMenuPage validateTitle(String titleToValidate ){
        menuTitle = titleToValidate;
        return new ValidateMenuPage();
    }
}
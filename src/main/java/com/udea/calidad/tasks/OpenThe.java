package com.udea.calidad.tasks;

import com.udea.calidad.interactions.SelectRolePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import net.serenitybdd.screenplay.targets.Target;

public class OpenThe implements Task {

    public PageObject page;
    public Target target;

    public OpenThe(PageObject page, Target target) {

        this.page = page;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // todo interactions
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(SelectRolePage.go(target));
    }

    public static OpenThe Browser(PageObject page, Target target){
        return Tasks.instrumented(OpenThe.class,page, target);
    }
}

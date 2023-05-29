package com.udea.calidad.stepdefinitions;

import com.udea.calidad.questions.ValidateMenuPage;
import com.udea.calidad.tasks.OpenThe;
import com.udea.calidad.userInterfaces.UserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.udea.calidad.userInterfaces.UserPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(CucumberWithSerenity.class)
public class OpenProgPeriodoAcadStepDefinitions {

    @Managed(driver ="chrome")
    public WebDriver driver;
    private final Actor user = Actor.named("User");

    @Before
    public void preStage(){
        user.can(BrowseTheWeb.with(driver));

    }

    @Given("User is in the select role page")
    public void userInTheSelectRolePage(){
        //todo interaction
        driver.manage().window().maximize();
        user.can(BrowseTheWeb.with(driver));
    }

    @When("User clicks the button to login as head of department")
    public void userClicksHeadOfDepartmentBtn(){
        // todo tasks
        user.attemptsTo(OpenThe.Browser(new UserPage(),BUTTON_HEAD_OF_DEPARTMENT));
    }

    @Then("User can see the head of department menu page")
    public void userSeeHeadOfDepartmentMenuPage(){
      user.should(seeThat(ValidateMenuPage.validateTitle("Menu Jefe de Departamento:"), equalTo(true)));
    }

    @When("User clicks the button to login as vicedean")
    public void userClicksVicedeanBtn(){
        // todo tasks
        user.attemptsTo(OpenThe.Browser(new UserPage(),BUTTON_VICEDEAN));
    }

    @Then("User can see the vicedean menu page")
    public void userSeeVicedeanMenuPage(){
        user.should(seeThat(ValidateMenuPage.validateTitle("Menu Vicedecano:"), equalTo(true)));
    }
}



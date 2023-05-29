package com.udea.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/open_prog_periodo_acad.feature",
        glue = "com.udea.calidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class OpenProgPeriodoAcadLogin {
}


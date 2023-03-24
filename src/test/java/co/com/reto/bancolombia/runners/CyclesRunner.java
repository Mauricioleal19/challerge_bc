package co.com.reto.bancolombia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/number_array.feature",
        tags = "@stories",
        glue = "co.com.reto.bancolombia.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)


public class CyclesRunner {
}

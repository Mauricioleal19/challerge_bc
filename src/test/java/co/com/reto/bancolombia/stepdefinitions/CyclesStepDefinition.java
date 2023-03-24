package co.com.reto.bancolombia.stepdefinitions;

import co.com.reto.bancolombia.tasks.CalculatePosition;
import co.com.reto.bancolombia.tasks.LogIn;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.reto.bancolombia.utils.EnvironmentConstants.*;

public class CyclesStepDefinition {

    @Before
    public void initialConfiguration(){
        OnStage.setTheStage( new OnlineCast());
        OnStage.theActorCalled(CLIENT).wasAbleTo(
                Open.url(URL)
        );

    }
    @Given("I want to log in to the platform")
    public void iWantToLogInToThePlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogIn.theCredentials()
        );

    }
    @When("i calculate position of the number in the array in all cycles")
    public void iCalculatePositionOfTheNumberInTheArrayInAllCycles() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CalculatePosition.ofCycles()
        );

    }

    @Then("i should see the hash")
    public void iShouldSeeTheHash() {

    }

}

package co.com.reto.bancolombia.tasks;

import co.com.reto.bancolombia.utils.EnvironmentConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.reto.bancolombia.userinterface.LogInPage.*;

public class LogIn implements Task {

    public static LogIn theCredentials() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(EnvironmentConstants.USERNAME).into(USER),
                Enter.theValue(EnvironmentConstants.PASSWORD).into(PASSWORD),
                Click.on(SEND_BUTTON)


                );
    }
}

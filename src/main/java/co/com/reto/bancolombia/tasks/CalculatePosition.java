package co.com.reto.bancolombia.tasks;


import co.com.reto.bancolombia.model.HashModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.reto.bancolombia.userinterface.PositionPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class CalculatePosition implements Task {
    public static CalculatePosition ofCycles() {
        return Tasks.instrumented(CalculatePosition.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECT_POSITION_CYCLE_ONE,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_ONE),
                Click.on(SELECT_POSITION_CYCLE_ONE),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1646").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_TWO,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_TWO),
                Click.on(SELECT_POSITION_CYCLE_TWO),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1305").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_THREE,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_THREE),
                Click.on(SELECT_POSITION_CYCLE_THREE),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1442").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_FOUR,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_FOUR),
                Click.on(SELECT_POSITION_CYCLE_FOUR),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1226").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_FIVE,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_FIVE),
                Click.on(SELECT_POSITION_CYCLE_FIVE),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1433").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_SIX,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_SIX),
                Click.on(SELECT_POSITION_CYCLE_SIX),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("857").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_SEVEN,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_SEVEN),
                Click.on(SELECT_POSITION_CYCLE_SEVEN),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1565").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_EIGHT,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_EIGHT),
                Click.on(SELECT_POSITION_CYCLE_EIGHT),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1351").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_NINE,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_NINE),
                Click.on(SELECT_POSITION_CYCLE_NINE),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1607").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_TEN,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_TEN),
                Click.on(SELECT_POSITION_CYCLE_TEN),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1639").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_ELEVEN,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_ELEVEN),
                Click.on(SELECT_POSITION_CYCLE_ELEVEN),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1333").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_TWELVE,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_TWELVE),
                Click.on(SELECT_POSITION_CYCLE_TWELVE),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1499").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(SELECT_POSITION_CYCLE_THIRTEEN,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SELECT_POSITION_CYCLE_THIRTEEN),
                Click.on(SELECT_POSITION_CYCLE_THIRTEEN),
                WaitUntil.the(ENTER_TOTAL,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1606").into(ENTER_TOTAL),
                Click.on(SEND_BUTTON),

                WaitUntil.the(HASH, isCurrentlyVisible()).forNoMoreThan(120).seconds()

        );
        String hash = Text.of(HASH).viewedBy(actor).asString();
        System.out.println(hash);
    }
}

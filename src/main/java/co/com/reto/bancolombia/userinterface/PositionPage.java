package co.com.reto.bancolombia.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PositionPage extends PageObject {
    public static final Target SELECT_POSITION_CYCLE_ONE = Target.the("Select position cycle one")
            .located(By.xpath("//button[@value='158']"));
    public static final Target SELECT_POSITION_CYCLE_TWO = Target.the("Select position cycle two")
            .located(By.xpath("//button[@value='99']"));
    public static final Target SELECT_POSITION_CYCLE_THREE = Target.the("Select position cycle three")
            .located(By.xpath("//button[@value='103']"));
    public static final Target SELECT_POSITION_CYCLE_FOUR = Target.the("Select position cycle four")
            .located(By.xpath("//button[@value='81']"));
    public static final Target SELECT_POSITION_CYCLE_FIVE = Target.the("Select position cycle five")
            .located(By.xpath("//button[@value='6']"));
    public static final Target SELECT_POSITION_CYCLE_SIX = Target.the("Select position cycle six")
            .located(By.xpath("//button[@value='51']"));
    public static final Target SELECT_POSITION_CYCLE_SEVEN = Target.the("Select position cycle seven")
            .located(By.xpath("//button[@value='137']"));
    public static final Target SELECT_POSITION_CYCLE_EIGHT = Target.the("Select position cycle eight")
            .located(By.xpath("//button[@value='100']"));
    public static final Target SELECT_POSITION_CYCLE_NINE = Target.the("Select position cycle nine")
            .located(By.xpath("//button[@value='48']"));
    public static final Target SELECT_POSITION_CYCLE_TEN = Target.the("Select position cycle ten")
            .located(By.xpath("//button[@value='41']"));
    public static final Target SELECT_POSITION_CYCLE_ELEVEN = Target.the("Select position cycle eleven")
            .located(By.xpath("//button[@value='52']"));
    public static final Target SELECT_POSITION_CYCLE_TWELVE = Target.the("Select position cycle twelve")
            .located(By.xpath("//button[@value='101']"));
    public static final Target SELECT_POSITION_CYCLE_THIRTEEN = Target.the("Select position cycle thirteen")
            .located(By.xpath("//button[@value='152']"));

    public static final Target ENTER_TOTAL = Target.the("Enter the total sum")
            .located(By.xpath("//input[@type='number']"));
    public static final Target SEND_BUTTON = Target.the("Select send button")
            .located(org.openqa.selenium.By.xpath("//button[@type='submit'][contains(.,'Enviar')]"));

    public static final Target SUCCESS_MESSAGE = Target.the("Congratulation")
            .located(org.openqa.selenium.By.xpath("//h1[contains(.,'Felicidades, has terminado la prueba exitosamente')]"));
    public static final Target HASH = Target.the("Hash")
            .located(org.openqa.selenium.By.xpath("//div[@class='m-auto p-5 rounded-md bg-black w-3/5 ']//p"));

//div[@class='m-auto p-5 rounded-md bg-black w-3/5 ']//p
}

package co.com.reto.bancolombia.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class LogInPage extends PageObject {

    public static final Target USER = Target.the("Enter user")
            .located(By.name("username"));
    public static final Target PASSWORD = Target.the("Enter password")
            .located(By.name("password"));
    public static final Target SEND_BUTTON = Target.the("Select send button")
            .located(By.xpath("//button[@type='submit'][contains(.,'Enviar')]"));


}

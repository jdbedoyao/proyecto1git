package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Boton que Muestra el uso del formulario de Login").located(By.xpath("//*[@id=\"nav-menu\"]/ul/li/a"));
    public static final Target INPUT_USER = Target.the("Campo en donde se escribe el Usuario").located(By.xpath("//*[@id=\"username\"]"));
    public static final Target INPUT_PASSWORD = Target.the("Campo en donde se escribe La Contraseña").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Boton para enviar el formulario de Login").located(By.xpath("//*[@id=\"yui_3_17_2_1_1632797666366_27\"]/div[3]/button"));

}

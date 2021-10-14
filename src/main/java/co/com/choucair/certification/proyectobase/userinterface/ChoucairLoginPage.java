package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Boton que Muestra el fomulario de Join Today").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_FISTNAME = Target.the("Campo en donde se escribe el FirsName").located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LASTNAME = Target.the("Campo en donde se escribe el LastName").located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_EMAIL = Target.the("Campo en donde se escribe el Email").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target INPUT_MONTH = Target.the("Mes de Nacimiento dropdown").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Dia de Nacimiento dropdown").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Año de nacimiento dropdown").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("Lenguajes dropdown").located(By.id("languages"));
    public static final Target ENTER_BUTTON = Target.the("Boton de Next para la siguiente pagina").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));

}

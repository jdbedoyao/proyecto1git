package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CC = Target.the("Selecciona cursos y certificaciones").located(By.xpath("//*[@id=\"certificaciones\"]/div[1]"));
    public static final Target INPUTARGET = Target.the("Selecciona la caja de texto cursos y certificaciones").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso").located(By.xpath("//*[@id=\"yui_3_17_2_1_1632882483961_20\"]/button"));
    public static final Target SELECT_COURSE = Target.the("Da click para abrir el curso").located(By.xpath("//*[@id=\"yui_3_17_2_1_1632883476964_20\"]/a/div[2]/h4"));

}

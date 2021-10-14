package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Performable onThePage() {
      return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
      actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
              Enter.theValue("JOSE DARIO").into(ChoucairLoginPage.INPUT_FISTNAME),
              Enter.theValue("BEDOYA ORTIZ").into(ChoucairLoginPage.INPUT_LASTNAME),
              Enter.theValue("jdbedoyaortiz@gmail.com").into(ChoucairLoginPage.INPUT_EMAIL),
              Enter.theValue("MARCH").into(ChoucairLoginPage.INPUT_MONTH),
              Enter.theValue("17").into(ChoucairLoginPage.INPUT_DAY),
              Enter.theValue("1981").into(ChoucairLoginPage.INPUT_YEAR),
              Enter.theValue("Spanish").into(ChoucairLoginPage.INPUT_LANGUAGES),
              Click.on(ChoucairLoginPage.ENTER_BUTTON)
       );

    }
}

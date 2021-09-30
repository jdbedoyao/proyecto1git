package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
      OnStage.theActorCalled("Brandon" ).wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
        String course = null;
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {

    }

}

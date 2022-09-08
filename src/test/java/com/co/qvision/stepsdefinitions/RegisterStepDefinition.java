package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.DataRegister;
import com.co.qvision.questions.VerifyCorrectRegister;
import com.co.qvision.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterStepDefinition {

    //Anotacion Manage para especificar el que driver se va a utilizar
    @Managed
    WebDriver hisBrowser;

    //Anotacion Before para crear y nombrar el actor
    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    //Anotacion Given para indicar que el actor fue capaz de abrir la url especificada en el archivo feature
    @Given("^that enter on the website \"([^\"]*)\"$")
    public void thatEnterOnTheWebsite(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    //Anotacion Manage para indicar que el actor realiza la tarea de registrarse satisfactoriamente
    @When("^he clicks on my account and fill in the following form data$")
    public void heClicksOnMyAccountAndFillInTheFollowingFormData(List<DataRegister> dataRegisterList) {
        DataRegister dataRegister;
        dataRegister = dataRegisterList.get(0);
        theActorInTheSpotlight().attemptsTo(RegisterUser.inThePage(dataRegister));

    }

    //Anotacion Then para indicar que se debe validar que el registro de usuario fue exitoso
    @Then("^he will be successfully registered$")
    public void heWillBeSuccessfullyRegistered() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCorrectRegister.inThePage(),
                Matchers.equalTo("1059234270")));
    }


}

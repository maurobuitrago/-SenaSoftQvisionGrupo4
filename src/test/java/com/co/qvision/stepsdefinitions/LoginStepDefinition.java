package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.questions.VerifyCorrectLogin;
import com.co.qvision.questions.VerifyWrongLogin;
import com.co.qvision.tasks.CorrectLogin;
import com.co.qvision.tasks.WrongLogin;
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

public class LoginStepDefinition {

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
    @Given("^that enter to the website \"([^\"]*)\"$")
    public void thatEnterToTheWebsite(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    //Anotacion Manage para indicar que el actor realiza la tarea de iniciar sesion correctamente
    @When("^he enter the correct credentials$")
    public void heEnterTheCorrectCredentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        theActorInTheSpotlight().attemptsTo(CorrectLogin.inThePage(credentials));

    }

    //Anotacion Then para indicar que se debe validar que el inicio de sesion fue correcto
    @Then("^he will login correctly$")
    public void heWillLoginCorrectly() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCorrectLogin.inThePage(),
                Matchers.equalTo("1059234151")));

    }

    //Anotacion Manage para indicar que el actor realiza la tarea de iniciar sesion con credenciales erróneas
    @When("^he enter the wrong credentials$")
    public void heEnterTheWrongCredentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        theActorInTheSpotlight().attemptsTo(WrongLogin.inThePage(credentials));

    }


    //Anotacion Then para indicar que se debe validar que el inicio de sesion no fue realizado con exito
    @Then("^he will log in incorrectly$")
    public void heWillLogInIncorrectly() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyWrongLogin.inThePage(),
                Matchers.equalTo(Boolean.TRUE)));
    }

}

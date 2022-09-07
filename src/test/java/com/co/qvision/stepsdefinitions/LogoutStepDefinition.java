package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.questions.VerifyLogout;
import com.co.qvision.tasks.CorrectLogin;
import com.co.qvision.tasks.Logout;
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

public class LogoutStepDefinition {


    public static String urlfinish;
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
    @Given("^that enter the page \"([^\"]*)\"$")
    public void thatEnterThePage(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    //Anotacion Manage para indicar que el actor realiza la tarea de cerrar sesión satisfactoriamente
    @When("^He clicks on the My Account module and clicks on the logOut option$")
    public void heClicksOnTheMyAccountModuleAndClicksOnTheLogOutOption(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        theActorInTheSpotlight().attemptsTo(Logout.inThePage(credentials));

        //Imprimimos en consola la url de la ventana después de haber cerrado sesión, para vizualizar que se logró la tarea satisfactoriamente
        urlfinish = hisBrowser.getCurrentUrl();
        System.out.println("Url donde verificamos que cerró sesión y se encuentra en la página de login y register");
        System.out.println(urlfinish);

    }

    //Anotacion Then para indicar que se debe validar que fue exitoso el cierre de sesión
    @Then("^he will have logged out of his logged in account$")
    public void heWillHaveLoggedOutOfHisLoggedInAccount() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyLogout.inThePage(),
                Matchers.equalTo("Acceder")));
    }
}

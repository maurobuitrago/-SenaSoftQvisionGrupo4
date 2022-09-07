package com.co.qvision.stepsdefinitions;

import com.co.qvision.tasks.ObtainInformationOutlet;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class OutletStepDefinition {


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
    @Given("^that enter the web page \"([^\"]*)\"$")
    public void thatEnterTheWebPage(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    //Anotacion Manage para indicar que debe obtener el precio normal y el precio con descuento del primer producto en el módulo de Outlet
    @When("^he clicks on the Outlet option and chooses a product$")
    public void heClicksOnTheOutletOptionAndChoosesAProduct() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(ObtainInformationOutlet.inThePage());
        Thread.sleep(2000);
    }

    //Deberá imprimir la informacion de los precios del producto en consola
    @Then("^it should display the output product price information in the console$")
    public void itShouldDisplayTheOutputProductPriceInformationInTheConsole() {

    }


}

package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.tasks.ObtainInformationProductOrder;
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
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AccountStepDefinition {

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

    @Given("^that enter on the web site  \"([^\"]*)\"$")
    public void thatEnterOnTheWebSite(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^See information about a product in the module My account and the order option$")
    public void seeInformationAboutAProductInTheModuleMyAccountAndTheOrderOption(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        theActorInTheSpotlight().attemptsTo(ObtainInformationProductOrder.inThePage(credentials));
    }

    @Then("^you should see the product information in the console$")
    public void youShouldSeeTheProductInformationInTheConsole() {

    }
}

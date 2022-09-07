package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.DataAccessories;
import com.co.qvision.questions.VerifyBuyAccessories;
import com.co.qvision.tasks.BuyAccessories;
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

public class AccessoriesStepDefinition {


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

    @Given("^that enter on the web site \"([^\"]*)\"$")
    public void thatEnterOnTheWebSite(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^he clicks on the accessories module and click buy now to the secoxnd item$")
    public void heClicksOnTheAccessoriesModuleAndClickBuyNowToTheSecoxndItem(List<DataAccessories> dataAccessoriesList) throws InterruptedException {

        DataAccessories dataAccessories;
        dataAccessories = dataAccessoriesList.get(0);
        theActorInTheSpotlight().attemptsTo(BuyAccessories.inThePage(dataAccessories));
        Thread.sleep(1000);
    }

    @Then("^he will buy the accessory product successfully$")
    public void heWillBuyTheAccessoryProductSuccessfully() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBuyAccessories.inThePage(),
            Matchers.equalTo(Boolean.TRUE)));
    }

}

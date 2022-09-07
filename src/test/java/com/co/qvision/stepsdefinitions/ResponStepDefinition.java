package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.VerifyRespon;
import com.co.qvision.tasks.Respon;
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

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ResponStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^enter the website r \"([^\"]*)\"$")
    public void enter_the_website_r(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^he clicks on Social Responsibility$")
    public void he_clicks_on_Social_Responsibility() {
        theActorInTheSpotlight().attemptsTo(Respon.responPage());
    }

    @Then("^he will bring up the information on this site\\.$")
    public void he_will_bring_up_the_information_on_this_site() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyRespon.verifyRespon(),
                Matchers.equalTo(Boolean.TRUE)));
    }
}

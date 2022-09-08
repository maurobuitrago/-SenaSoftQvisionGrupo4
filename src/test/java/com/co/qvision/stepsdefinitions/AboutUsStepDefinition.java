package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.VerifyAboutUs;
import com.co.qvision.tasks.AboutUs;
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

public class AboutUsStepDefinition {

    @Managed
    WebDriver hisBrowser;

    //Anotacion Before para crear y nombrar el actor
    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^that enter on the web site a \"([^\"]*)\"$")
    public void that_enter_on_the_web_site_a(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^he clicks on About us$")
    public void he_clicks_on_About_us() {
        theActorInTheSpotlight().attemptsTo(AboutUs.aboutUs());
    }

    @Then("^he will bring the company information$")
    public void he_will_bring_the_company_information() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyAboutUs.verifyAboutUs(),
                Matchers.equalTo(Boolean.TRUE)));
    }
}

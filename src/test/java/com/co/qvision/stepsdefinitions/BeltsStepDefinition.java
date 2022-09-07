package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.VerifyAddBagToCart;
import com.co.qvision.tasks.BeltsToCart;
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

public class BeltsStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^enter the website b \"([^\"]*)\"$")
    public void enter_the_website_b(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^he clicks on the belts module and add the third product to the add to cart module, he will verify that the handbags product is in the shopping cart$")
    public void he_clicks_on_the_belts_module_and_add_the_third_product_to_the_add_to_cart_module_he_will_verify_that_the_handbags_product_is_in_the_shopping_cart() {
        theActorInTheSpotlight().attemptsTo(BeltsToCart.beltsToCart());
    }

    @Then("^he will verify that the handbags product is in the shopping cart$")
    public void he_will_verify_that_the_handbags_product_is_in_the_shopping_cart() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyAddBagToCart.inThePage(),
                Matchers.equalTo("Cinturones color frambuesa en cuero - 16")));
    }


}

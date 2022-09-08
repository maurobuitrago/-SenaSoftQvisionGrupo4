package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Belts;
import com.co.qvision.questions.VerifyAddBagToCart;
import com.co.qvision.questions.VerifyBuyBelts;
import com.co.qvision.tasks.BeltsToCart;
import com.co.qvision.tasks.BuyBelts;
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

    //Compra de un producto del modulo de cinturones
    @When("^he clicks on the free belts module and click buy now to the second item$")
    public void he_clicks_on_the_free_belts_module_and_click_to_the_second_item(List<Belts> beltsList) {
        Belts belts;
        belts = beltsList.get(0);
        theActorInTheSpotlight().attemptsTo(BuyBelts.buyBelts(belts));
    }

    @Then("^he will buy the belts product successfully$")
    public void he_will_buy_the_belts_product_successfully() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBuyBelts.verifyBuyBelts(),
                Matchers.equalTo(Boolean.TRUE)));
    }

}

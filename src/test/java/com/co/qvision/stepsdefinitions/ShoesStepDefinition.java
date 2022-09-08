package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.models.Shoes;
import com.co.qvision.questions.VerifyAddShoesToCart;
import com.co.qvision.questions.VerifyBuyShoes;
import com.co.qvision.tasks.AddShoesToCart;
import com.co.qvision.tasks.BuyShoes;
import com.co.qvision.tasks.CorrectLogin;
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

public class ShoesStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^enter the website s \"([^\"]*)\"$")
    public void enter_the_website(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^he clicks on the shoes-tennis module and hits the buy now button on the second item$")
    public void he_clicks_on_the_shoes_tennis_module_and_hits_the_button_on_the_second_item(List<Shoes> shoesList) {
        Shoes shoes;
        shoes = shoesList.get(0);
        theActorInTheSpotlight().attemptsTo(BuyShoes.buyShoes(shoes));
    }

    @Then("^he will buy the shoes product successfully\\.$")
    public void he_will_buy_the_shoes_product_successfully() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBuyShoes.verifyBuyShoes(),
                Matchers.equalTo(Boolean.TRUE)));
    }
    //Anotacion Manage para indicar que el actor realiza la tarea de añadir un zapato al carrito de compras
    @When("^he clicks on the Shoes-Boots module and adds the third product to add to the cart$")
    public void he_clicks_on_the_Shoes_Boots_module_and_adds_the_third_product_to_add_to_the_cart() {
        theActorInTheSpotlight().attemptsTo(AddShoesToCart.inThePage());
    }

    //Anotacion Then para indicar que se debe validar que el producto se añadió satisfactoriamente en la sección "ver carrito"
    @Then("^he should see the shoe product in the shopping cart$")
    public void he_should_see_the_shoe_product_in_the_shopping_cart() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyAddShoesToCart.inThePage(),
                Matchers.equalTo("Botines chelsea track color negro ónix en cuero - 35")));
    }
}

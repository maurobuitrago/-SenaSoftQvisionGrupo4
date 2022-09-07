package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Credentials;
import com.co.qvision.models.Handbag;
import com.co.qvision.questions.VerifyAddBagToCart;
import com.co.qvision.questions.VerifyHandbagWishList;
import com.co.qvision.tasks.AddBagToCart;
import com.co.qvision.tasks.CorrectLogin;
import com.co.qvision.tasks.HandbagAddList;
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

public class HandbagStepDefinition {


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
    @Given("^that enter  to the website \"([^\"]*)\"$")
    public void thatEnterToTheWebsite(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    //Anotacion Manage para indicar que el actor realiza la tarea de añadir el tercer producto al carrito de compras
    @When("^he clicks on the Bags module and add the third product to the add to cart module$")
    public void heClicksOnTheBagsModuleAndAddTheThirdProductToTheAddToCartModule() {
        theActorInTheSpotlight().attemptsTo(AddBagToCart.inThePage());
    }

    //Anotacion Then para indicar que se debe validar que el nombre del articulo agregado al carrito es el que realmente se deseaba agregar
    @Then("^he will verify that the bags product is in the shopping cart$")
    public void heWillVerifyThatTheBagsProductIsInTheShoppingCart() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyAddBagToCart.inThePage(),
                Matchers.equalTo("Bolso bombonera en cuero grabado color verde esmeralda")));
    }

    //Añadir a la lista de deseos
    @When("^he clicks on Handbags-wallets he can change the color of the second item and add it to my wishlist$")
    public void heClicksOnHandbagsWalletsHeCanChangeTheColorOfTheSecondItemAndAddItToMyWishlist(List<Handbag> handbagsList) {
        Handbag handbag;
        handbag = handbagsList.get(0);
        theActorInTheSpotlight().attemptsTo(HandbagAddList.handbagAddList(handbag));
    }

    @Then("^he will verify that in the My account-wishlist module is the product Handbags$")
    public void heWillVerifyThatInTheMyAccountWishlistModuleIsTheProductHandbags() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyHandbagWishList.verifyHandbagWishList(),
                Matchers.equalTo(Boolean.TRUE)));
    }
}

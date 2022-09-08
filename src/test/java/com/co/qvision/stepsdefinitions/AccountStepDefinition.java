package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.AccountDates;
import com.co.qvision.questions.VerifyAccountList;
import com.co.qvision.tasks.AccountList;
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

public class AccountStepDefinition {

    @Managed
    WebDriver hisBrowser;

    //Anotacion Before para crear y nombrar el actor
    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^enter the website p \"([^\"]*)\"$")
    public void enter_the_website_p(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^he clicks on My Account - Wish List and the first product in the list he clicks on the x, deleting the product$")
    public void he_clicks_on_My_Account_Wish_List_and_the_first_product_in_the_list_he_clicks_on_the_x_deleting_the_product(List<AccountDates> accountList) {
        AccountDates accountDates;
        accountDates = accountList.get(0);
        theActorInTheSpotlight().attemptsTo(AccountList.accountList(accountDates));
    }

    @Then("^he will see in the wish list that the product is removed$")
    public void he_will_see_in_the_wish_list_that_the_product_is_removed() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyAccountList.accountList(),
                Matchers.equalTo(Boolean.TRUE)));
    }
}

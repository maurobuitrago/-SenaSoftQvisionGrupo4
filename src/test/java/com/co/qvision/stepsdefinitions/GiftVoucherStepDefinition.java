package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.VerifyGiftVoucher;
import com.co.qvision.tasks.GiftVoucherInformation;
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

public class GiftVoucherStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^enter the website g \"([^\"]*)\"$")
    public void enter_the_website(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    @When("^he clicks on Gift Voucher$")
    public void he_clicks_on_Gift_Voucher() {
        theActorInTheSpotlight().attemptsTo(GiftVoucherInformation.giftVoucherInformation());
    }

    @Then("^he will bring up the Gift Voucher detail information$")
    public void he_will_bring_up_the_Gift_Voucher_detail_information() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyGiftVoucher.verifyGiftVoucher(),
                Matchers.equalTo(Boolean.FALSE)));
    }
}

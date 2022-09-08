package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.VerifyInformationProfile;
import com.co.qvision.tasks.NavigateProfileInstagram;
import com.co.qvision.userinterfaces.NavigateInstagramPage;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.co.qvision.userinterfaces.NavigateInstagramPage.BTN_INSTAGRAM;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class NavigateInstagramStepDefinition {

    public static String urlInstagram;
    public static String urlactual;

    //Anotacion Manage para especificar el que driver se va a utilizar
    @Managed
    WebDriver hisBrowser;

    //Anotacion Before para crear y nombrar el actor
    @Before
    public void setIni() {
        setTheStage(new OnlineCast());
        theActorCalled("Mauro");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^that enter the  web page \"([^\"]*)\"$")
    public void thatEnterTheWebPage(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }

    //Anotacion Manage para indicar que el actor realiza la tarea de navegar a la url obtenida desde el botón de instagram
    @When("^he clicks on the menu and selects the instagram icon$")
    public void heClicksOnTheMenuAndSelectsTheInstagramIcon() {
        theActorInTheSpotlight().attemptsTo(NavigateProfileInstagram.inThePage());

        urlInstagram = hisBrowser.findElement(By.xpath("//div/div[3]/a[1][@class='social_net']")).getAttribute("href");
        System.out.println("Url obtenida del bóton de instagram:");
        System.out.println(urlInstagram);
        hisBrowser.navigate().to(urlInstagram);
        urlactual = hisBrowser.getCurrentUrl();
        System.out.println("Url actual al navegar al instagran");
        System.out.println(urlactual);
    }

    //Anotacion Then para indicar que se debe validar que la url de la ventana donde me encuentro es la misma url obtenida desde el botón de instragam
    @Then("^you should navigate to the instagram profile of the company and you will get the url$")
    public void youShouldNavigateToTheInstagramProfileOfTheCompanyAndYouWillGetTheUrl() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInformationProfile.inThePage(),
                Matchers.equalTo(urlactual)));
    }
}

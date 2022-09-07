package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;

import com.co.qvision.userinterfaces.AccountPage;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class ObtainInformationProductOrder implements Task {


    Credentials credentials;
    public ObtainInformationProductOrder( Credentials credentials) {
        this.credentials = credentials;
    }

    public static ObtainInformationProductOrder inThePage(Credentials credentials){
        return Tasks.instrumented(ObtainInformationProductOrder.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AccountPage.BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(credentials.getIdentification()).into(AccountPage.TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(AccountPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(AccountPage.BTN_ACCESS));

        actor.attemptsTo(Click.on(AccountPage.BTN_MENU));
        actor.attemptsTo(Click.on(AccountPage.BTN_MYACCOUNT));
        actor.attemptsTo(Click.on(AccountPage.BTN_ORDER));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(AccountPage.BTN_SEE));
        System.out.println(Text.of(AccountPage.TXT_VERIFYINFORMATION).viewedBy(actor).asString());
    }
}

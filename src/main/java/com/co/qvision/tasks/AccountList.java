package com.co.qvision.tasks;

import com.co.qvision.models.AccountDates;
import com.co.qvision.userinterfaces.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.qvision.userinterfaces.AccountPage.*;


public class AccountList implements Task {

    AccountDates dates;

    public AccountList(AccountDates dates) {
        this.dates = dates;
    }

    public static AccountList accountList(AccountDates dates){
        return Tasks.instrumented(AccountList.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // el actor inicio sesion
        actor.attemptsTo(Click.on(AccountPage.BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(dates.getIdentification()).into(AccountPage.TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(dates.getPassword()).into(AccountPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(AccountPage.BTN_ACCESS));

        //Eliminar prodcuto de la lista de deseos
        actor.attemptsTo(Click.on(SELECT_LIST));
        actor.attemptsTo(Click.on(BTN_CANCEL));

    }
}

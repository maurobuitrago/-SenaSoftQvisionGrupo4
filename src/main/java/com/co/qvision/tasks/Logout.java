package com.co.qvision.tasks;


import com.co.qvision.models.Credentials;

import com.co.qvision.userinterfaces.LogoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

//Implementamos Taks de la librería Serenity Screenplay
public class Logout implements Task {

    Credentials credentials;

    public Logout(Credentials credentials) {
        this.credentials = credentials;
    }

    //Constructor publico que permite que la clase Logout pueda ser instanciada en la clase LoginStepDefinition

    public static Logout inThePage(Credentials credentials) {
        return Tasks.instrumented(Logout.class, credentials);
    }

    //Especificamos las acciones para cerrar sesión
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LogoutPage.BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(credentials.getIdentification()).into(LogoutPage.TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LogoutPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LogoutPage.BTN_ACCESS));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(LogoutPage.BTN_MENU));
        actor.attemptsTo(Click.on(LogoutPage.BTN_MYACCOUNT));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(LogoutPage.BTN_LOGOUT));


    }
}

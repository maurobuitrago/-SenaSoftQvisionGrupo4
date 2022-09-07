package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

//Implementamos Task
public class WrongLogin implements Task {


    Credentials credentials;

    public WrongLogin(Credentials credentials) {
        this.credentials = credentials;
    }

    //Constructor publico que permite que la clase WrongLogin pueda ser instanciada en la clase LoginStepDefinition
    public static WrongLogin inThePage(Credentials credentials){
        return Tasks.instrumented(WrongLogin.class, credentials);
    }

    //Definimos que acciones realiza el actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(credentials.getIdentification()).into(LoginPage.TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_ACCESS));
        System.out.println(Text.of(LoginPage.TXT_IDENTIFICATION).viewedBy(actor).asString());
    }
}
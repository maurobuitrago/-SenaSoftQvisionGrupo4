package com.co.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.ResponPage.*;

public class Respon implements Task {

    public static Respon responPage(){
        return Tasks.instrumented(Respon.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //el actor extrae los datos del modulo resposabilidad social
        actor.attemptsTo(Click.on(MENUU));
        actor.attemptsTo(Click.on(MODULE_RESPON));
        actor.attemptsTo(Scroll.to(TXT_VALIDATE));
        System.out.println(Text.of(TXT_VALIDATE).viewedBy(actor).asString());
    }
}

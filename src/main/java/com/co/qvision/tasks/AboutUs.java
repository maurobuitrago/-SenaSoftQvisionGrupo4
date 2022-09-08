package com.co.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.AboutUsPage.BTN_ABOUT_US;
import static com.co.qvision.userinterfaces.AboutUsPage.TXT_INFO;

public class AboutUs implements Task {

    public static AboutUs aboutUs(){
        return Tasks.instrumented(AboutUs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //el actor extrae la informacion de "Quienes Somos"
        actor.attemptsTo(Scroll.to(BTN_ABOUT_US));
        actor.attemptsTo(Click.on(BTN_ABOUT_US));
        System.out.println(Text.of(TXT_INFO).viewedBy(actor).asString());
    }
}

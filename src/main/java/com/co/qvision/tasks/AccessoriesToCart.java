package com.co.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.AccessoriesToCartPage.*;

public class AccessoriesToCart implements Task {
    public static AccessoriesToCart accessoriesToCart(){
        return Tasks.instrumented(AccessoriesToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU));
        actor.attemptsTo(Click.on(MODULE_ACCESSORIES));
        actor.attemptsTo(Click.on(BTN_ITEM3));
        actor.attemptsTo(Scroll.to(BTN_ADDTOCART));
        actor.attemptsTo(Click.on(BTN_ADDTOCART));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(BTN_SHOPPINGCART));
        actor.attemptsTo(Click.on(BTN_SEECART));

        System.out.println(Text.of(TXT_VERIFYITEM3).viewedBy(actor).asString());
    }
}

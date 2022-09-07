package com.co.qvision.tasks;

import com.co.qvision.models.Handbag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.HandbagWishListPage.*;


public class HandbagAddList implements Task {

    Handbag dates;

    public HandbagAddList(Handbag dates) {
        this.dates = dates;
    }

    public static HandbagAddList handbagAddList(Handbag dates){
        return Tasks.instrumented(HandbagAddList.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // el actor inicio sesion
        actor.attemptsTo(Click.on(BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(dates.getIdentification()).into(TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(dates.getPassword()).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_ACCESS));

        //se añade el producto al carrito
        actor.attemptsTo(Click.on(MENU));
        actor.attemptsTo(Click.on(MODULE_HANDBAG));
        actor.attemptsTo(Click.on(SELECT_WALLETS));
        actor.attemptsTo(Click.on(SECOND_TARGET));
        actor.attemptsTo(Scroll.to(CHANGE_COLOR));
        actor.attemptsTo(Click.on(CHANGE_COLOR));
        actor.attemptsTo(Scroll.to(ADD_LIST));
        actor.attemptsTo(Click.on(ADD_LIST));
        actor.attemptsTo(Click.on(BTN_ACCOUNT));
        actor.attemptsTo(Click.on(SELECTED_LIST));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Text.of(VALIDATE_TEXT).viewedBy(actor).asString());


    }
}

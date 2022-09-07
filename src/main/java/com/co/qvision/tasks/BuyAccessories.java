package com.co.qvision.tasks;

import com.co.qvision.models.DataAccessories;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import static com.co.qvision.userinterfaces.AccessoriesPage.*;
import static com.co.qvision.userinterfaces.ShoesPage.BTN_TO_PAY;


public class BuyAccessories implements Task {

    DataAccessories dataAccessories;

    public BuyAccessories(DataAccessories dataAccessories) {
        this.dataAccessories = dataAccessories;
    }
    public static BuyAccessories inThePage(DataAccessories dataAccessories){
        return Tasks.instrumented(BuyAccessories.class,dataAccessories);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Acciones para el inicio de sesión del usuario
        actor.attemptsTo(Click.on(BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(dataAccessories.getIdentification()).into(TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(dataAccessories.getPassword()).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_ACCESS));


        //Acciones para la compra del acessorio
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(BTN_ACCESSORIES));
        actor.attemptsTo(Click.on(BTN_ITEM2));
        actor.attemptsTo(Scroll.to(BTN_BUYNOW));
        actor.attemptsTo(Click.on(BTN_BUYNOW));
        actor.attemptsTo(Scroll.to(TXT_VERIFYITEM2));
        actor.attemptsTo(Click.on(BTN_FINISHBUY));

        //Accion diligenciar formulario para facturación
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Enter.theValue(dataAccessories.getName()).into(TXT_NAME));
        actor.attemptsTo(Enter.theValue(dataAccessories.getLastname()).into(TXT_LASTNAME));
        actor.attemptsTo(Scroll.to(TXT_NAME));
        actor.attemptsTo(Click.on(CHECK_F));
        actor.attemptsTo(Click.on(TYPE_IDENTITY));
        actor.attemptsTo(Click.on(DOC_IDENTITY));
        actor.attemptsTo(Click.on(DOC_IDENTITY));
        actor.attemptsTo(Enter.theValue(dataAccessories.getNumidentify()).into(NUM_IDENTITY));
        actor.attemptsTo(Enter.theValue(dataAccessories.getEmail()).into(EMAIL));
        actor.attemptsTo(Enter.theValue(dataAccessories.getTelephone()).into(TELEPHONE));

        actor.attemptsTo(Enter.theValue(dataAccessories.getDirection()).into(DIRECTION));
        actor.attemptsTo(Enter.theValue(dataAccessories.getCode()).into(CODE_POSTAL));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(BTN_TO_PAY));

    }
}

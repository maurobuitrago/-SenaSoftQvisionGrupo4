package com.co.qvision.tasks;

import com.co.qvision.models.DataOutlet;
import com.co.qvision.userinterfaces.OutletPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class BuyProductOnSale implements Task {
    DataOutlet dataOutlet;

    public BuyProductOnSale(DataOutlet dataOutlet) {
        this.dataOutlet = dataOutlet;
    }

    public static BuyProductOnSale inThePage(DataOutlet dataOutlet) {
        return Tasks.instrumented(BuyProductOnSale.class, dataOutlet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Accion de inicio de sesión
        actor.attemptsTo(Click.on(OutletPage.BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(dataOutlet.getIdentification()).into(OutletPage.TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(dataOutlet.getPassword()).into(OutletPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(OutletPage.BTN_ACCESS));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Accion de selección de modulo Outlet y selección de la segunda publicación
        actor.attemptsTo(Click.on(OutletPage.BTN_OUTLET));
        actor.attemptsTo(Click.on(OutletPage.BTN_ITEM3));

        actor.attemptsTo(Scroll.to(OutletPage.SELECT_TALLA));
        actor.attemptsTo(Click.on(OutletPage.SELECT_TALLA));
        actor.attemptsTo(Click.on(OutletPage.SELECT_LIST36));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        actor.attemptsTo(Scroll.to(OutletPage.BTN_BUYNOW));
        actor.attemptsTo(Click.on(OutletPage.BTN_BUYNOW));


        actor.attemptsTo(Scroll.to(OutletPage.TXT_VERIFYITEM2));
        actor.attemptsTo(Click.on(OutletPage.BTN_FINISHBUY));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Acciones para diligenciar el formulario que me permita finalizar con la compra del producto
        actor.attemptsTo(Enter.theValue(dataOutlet.getName()).into(OutletPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(dataOutlet.getLastname()).into(OutletPage.TXT_LASTNAME));
        actor.attemptsTo(Scroll.to(OutletPage.TXT_NAME));
        actor.attemptsTo(Click.on(OutletPage.CHECK_F));
        actor.attemptsTo(Click.on(OutletPage.TYPE_IDENTITY));
        actor.attemptsTo(Click.on(OutletPage.DOC_IDENTITY));
        actor.attemptsTo(Click.on(OutletPage.DOC_IDENTITY));
        actor.attemptsTo(Enter.theValue(dataOutlet.getNumidentify()).into(OutletPage.NUM_IDENTITY));
        actor.attemptsTo(Enter.theValue(dataOutlet.getEmail()).into(OutletPage.EMAIL));
        actor.attemptsTo(Enter.theValue(dataOutlet.getTelephone()).into(OutletPage.TELEPHONE));
        actor.attemptsTo(Enter.theValue(dataOutlet.getDirection()).into(OutletPage.DIRECTION));
        actor.attemptsTo(Enter.theValue(dataOutlet.getCode()).into(OutletPage.CODE_POSTAL));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(OutletPage.BTN_TO_PAY));
    }
}

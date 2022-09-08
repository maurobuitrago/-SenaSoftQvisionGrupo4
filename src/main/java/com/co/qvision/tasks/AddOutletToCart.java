package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.userinterfaces.HandbagPage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.co.qvision.userinterfaces.OutletPage.*;

public class AddOutletToCart implements Task {

    public static AddOutletToCart addOutletToCart(){
        return Tasks.instrumented(AddOutletToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //El actor agregar el producto en añadir al carrito
        actor.attemptsTo(Click.on(BTN_OUTLET));
        actor.attemptsTo(Click.on(BTN_ITEM3));
        actor.attemptsTo(Scroll.to(SELECT_SIZE));
        actor.attemptsTo(Click.on(SELECT_SIZE));
        actor.attemptsTo(Click.on(SELECT_NUMBER));
        actor.attemptsTo(Scroll.to(BTN_ADDTOCART));
        actor.attemptsTo(Click.on(BTN_ADDTOCART));
        //Tiempo de espera a la pagina
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(BTN_SHOPPINGCART));
        actor.attemptsTo(Click.on(BTN_SEECART));

        //Imprimimos en consola el texto del nombre del artículo agregado al carrito de compras
        System.out.println(TXT_VERIFYITEM3.resolveFor(actor).getText());
    }
}

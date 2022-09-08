package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HandbagPage;
import com.co.qvision.userinterfaces.OutletPage;
import com.co.qvision.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddShoesToCart implements Task {

    public static AddShoesToCart inThePage(){
        return Tasks.instrumented(AddShoesToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Seleccionamos la opción de zapatos-botines
        actor.attemptsTo(Click.on(ShoesPage.MENU));
        actor.attemptsTo(Click.on(ShoesPage.MODULE_SHOES));
        actor.attemptsTo(Click.on(ShoesPage.SELECT_BOTINES));

        //Seleccionamos el tercer producto
        actor.attemptsTo(Click.on(ShoesPage.BTN_ITEM3));
        actor.attemptsTo(Scroll.to(ShoesPage.SELECT_TALLA));
        actor.attemptsTo(Click.on(ShoesPage.SELECT_TALLA));
        actor.attemptsTo(Click.on(ShoesPage.SELECT_LIST35));

        //Añadimos el producto al carrito de compras
        actor.attemptsTo(Scroll.to(ShoesPage.BTN_ADDTOCART));
        actor.attemptsTo(Click.on(ShoesPage.BTN_ADDTOCART));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Nos dirijimos a la sección "Ver Carrito"
        actor.attemptsTo(Click.on(ShoesPage.BTN_SHOPPINGCART));
        actor.attemptsTo(Click.on(ShoesPage.BTN_SEECART));

        //Imprimimos en consola el texto del nombre del artículo agregado al carrito de compras
        System.out.println(ShoesPage.TXT_VERIFYITEM3.resolveFor(actor).getText());
    }
    }


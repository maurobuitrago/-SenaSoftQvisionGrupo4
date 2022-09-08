package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.HandbagPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

//Implementamos Task de la librería de serenity screenplay
public class AddBagToCart implements Task {

    //Constructor público que permite que la clase AddBagToCart pueda ser instanciada en la clase HandbagStepDefinition
    public static AddBagToCart inThePage(){
        return Tasks.instrumented(AddBagToCart.class);
    }

    //Digitamos que acciones son las que realiza el actor
    @Override
    public <T extends Actor> void performAs(T actor) {
        //El actor agregar el producto en añadir al carrito
        actor.attemptsTo(Click.on(HandbagPage.BTN_HANDBAG));
        actor.attemptsTo(Click.on(HandbagPage.BTN_ITEM3));
        actor.attemptsTo(Scroll.to(HandbagPage.BTN_ADDTOCART));
        actor.attemptsTo(Click.on(HandbagPage.BTN_ADDTOCART));
        //Tiempo de espera a la pagina
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(HandbagPage.BTN_SHOPPINGCART));
        actor.attemptsTo(Click.on(HandbagPage.BTN_SEECART));

        //Imprimimos en consola el texto del nombre del artículo agregado al carrito de compras
        System.out.println(HandbagPage.TXT_VERIFYITEM3.resolveFor(actor).getText());
    }
}

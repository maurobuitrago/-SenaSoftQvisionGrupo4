package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.OutletPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;


//Implementamos Task dela libreria de Serenity Screenplay
public class ObtainInformationOutlet implements Task {
    public static ObtainInformationOutlet inThePage(){
        return Tasks.instrumented(ObtainInformationOutlet.class);
    }

    //Especificamos que acciones realizará el actor para lograr obtener la información
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OutletPage.BTN_OUTLET));
        actor.attemptsTo(Click.on(OutletPage.BTN_ITEM1));

        //Imprimimos en consola la información del precio del producto
        System.out.println("Precio normal del producto:");
        System.out.println(Text.of(OutletPage.TXT_VERIFYNORMALPRICE).viewedBy(actor).asString());
        System.out.println("Precio con descuento del producto:");
        System.out.println(Text.of(OutletPage.TXT_VERIFYSALEPRICE).viewedBy(actor).asString());
    }
}

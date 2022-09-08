package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.GiftVoucherPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.GiftVoucherPage.*;


public class GiftVoucherInformation implements Task {

    public static GiftVoucherInformation giftVoucherInformation(){
        return Tasks.instrumented(GiftVoucherInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //el actor extrae el dato del detalle y lo muestra en consola
        actor.attemptsTo(Click.on(MENU));
        actor.attemptsTo(Click.on(MODULE_GIFTVOUCHER));
        System.out.println(Text.of(INFORMATION_GIFTVOUCHER).viewedBy(actor).asString());
    }
}

package com.co.qvision.tasks;

import com.co.qvision.models.GiftVoucher;
import com.co.qvision.userinterfaces.GiftVoucherPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.GiftVoucherChangePage.*;



public class GiftVoucherChange implements Task {

    GiftVoucher dates;

    public GiftVoucherChange(GiftVoucher dates) {
        this.dates = dates;
    }

    public static GiftVoucherChange giftVoucherChange(GiftVoucher dates){
        return Tasks.instrumented(GiftVoucherChange.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // el actor inicio sesion
        actor.attemptsTo(Click.on(BTN_ACCOUNNT));
        actor.attemptsTo(Enter.theValue(dates.getIdentification()).into(TXT_IDENTIFICATIONN));
        actor.attemptsTo(Enter.theValue(dates.getPassword()).into(TXT_PASSWORDD));
        actor.attemptsTo(Click.on(BTN_ACCESS));

        //cambiar precio y agregar a la lista de deseos
        actor.attemptsTo(Click.on(MENU));
        actor.attemptsTo(Click.on(MODULE_GIFTVOUCHER));
        actor.attemptsTo(Click.on(PRICE));
        actor.attemptsTo(Click.on(SELECT_PRICE));



    }
}

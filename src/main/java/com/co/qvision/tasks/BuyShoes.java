package com.co.qvision.tasks;

import com.co.qvision.models.Credentials;
import com.co.qvision.models.Shoes;
import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.ShoesPage.*;

public class BuyShoes implements Task {

    //llamamos el modelo Shoes que coniene nuestros datos
    Shoes dates;

    public BuyShoes(Shoes dates) {
        this.dates = dates;
    }

    public static BuyShoes buyShoes(Shoes dates){
        return Tasks.instrumented(BuyShoes.class, dates);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // el actor inicio sesion
        actor.attemptsTo(Click.on(BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(dates.getIdentification()).into(TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(dates.getPassword()).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_ACCESS));

        // el actor accede al menu de Zapatos y compra especificamente un tenis
        actor.attemptsTo(Click.on(MENU));
        actor.attemptsTo(Click.on(MODULE_SHOES));
        actor.attemptsTo(Click.on(SELECT_TENNIS));
        actor.attemptsTo(Click.on(SECOND_TARGET));
        actor.attemptsTo(Scroll.to(SELECT_SIZE));
        actor.attemptsTo(Click.on(SELECT_SIZE));
        actor.attemptsTo(Click.on(SELECT_NUMBER));
        actor.attemptsTo(Scroll.to(BTN_BUY_NOW));
        actor.attemptsTo(Click.on(BTN_BUY_NOW));

        //espera para que alcance a cargar la pagina
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //el actor finaliza la compra
        actor.attemptsTo(Scroll.to(SCROLL_FINALLY_BUY));
        actor.attemptsTo(Click.on(FINALLY_BUY));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //el actor llena el formulario de envio y le da click al boton de pagar
        actor.attemptsTo(Enter.theValue(dates.getName()).into(NAME));
        actor.attemptsTo(Enter.theValue(dates.getLastname()).into(LAST_NAME));
        actor.attemptsTo(Click.on(CHECK_F));
        actor.attemptsTo(Scroll.to(NAME));
        actor.attemptsTo(Click.on(TYPE_IDENTITY));
        actor.attemptsTo(Click.on(DOC_IDENTITY));
        actor.attemptsTo(Click.on(DOC_IDENTITY));
        actor.attemptsTo(Enter.theValue(dates.getNumidentify()).into(NUM_IDENTITY));
        actor.attemptsTo(Enter.theValue(dates.getEmail()).into(EMAIL));
        actor.attemptsTo(Enter.theValue(dates.getTelephone()).into(TELEPHONE));
        /*actor.attemptsTo(Click.on(COUNTRY));
        actor.attemptsTo(Click.on(SELECT_COUNTRY));
        actor.attemptsTo(Click.on(DEPARTMENT));
        actor.attemptsTo(Click.on(SELECT_DEPARTMENT));
        actor.attemptsTo(Click.on(CITY));
        actor.attemptsTo(Click.on(SELECT_CITY));*/
        actor.attemptsTo(Enter.theValue(dates.getDirection()).into(DIRECTION));
        actor.attemptsTo(Enter.theValue(dates.getCode()).into(CODE_POSTAL));
        actor.attemptsTo(Click.on(BTN_TO_PAY));

    }
}

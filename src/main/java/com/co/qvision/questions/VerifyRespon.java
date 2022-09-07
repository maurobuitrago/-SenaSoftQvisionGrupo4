package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.ResponPage.TXT_VALIDATE;

public class VerifyRespon implements Question<Boolean> {

    public static VerifyRespon verifyRespon(){
        return new VerifyRespon();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_VALIDATE.resolveFor(actor).getText().contains("Gracias a nuestra alianza con la fundación Saving the Amazon estamos devolviendo a la naturaleza recursos para equilibrar nuestro consumo");
    }
}

package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.ShoesPage.VALIDATE_TEXT;

public class VerifyBuyShoes implements Question<Boolean> {

    public static VerifyBuyShoes verifyBuyShoes(){
        return new VerifyBuyShoes();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        //se valida el que el nombre de la pagina sea el mismo que aparece en la pagina de Wompi
        return VALIDATE_TEXT.resolveFor(actor).getText().contains("BON-BONITE");
    }
}

package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.AccessoriesToCartPage.TXT_VERIFYITEM3;

public class VerifyAddAccessoriesToCart implements Question<Boolean> {

    public static VerifyAddAccessoriesToCart verifyAddAccessoriesToCart(){
        return new VerifyAddAccessoriesToCart();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_VERIFYITEM3.resolveFor(actor).getText().contains("Billetera en cuero color verde esmeralda por naranja fuego") ;
    }
}

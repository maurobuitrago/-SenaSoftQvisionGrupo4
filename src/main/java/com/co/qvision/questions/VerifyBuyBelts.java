package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.BeltsBuyPage.VALIDATE_TEXT;

public class VerifyBuyBelts implements Question<Boolean> {

    public static VerifyBuyBelts verifyBuyBelts(){
        return new VerifyBuyBelts();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATE_TEXT.resolveFor(actor).getText().contains("BON-BONITE");
    }
}

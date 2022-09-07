package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.AccessoriesPage.VALIDATE_TEXT;

public class VerifyBuyAccessories implements Question<Boolean> {

    public static VerifyBuyAccessories inThePage(){
        return new VerifyBuyAccessories();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATE_TEXT.resolveFor(actor).getText().contains("BON-BONITE");
    }
}

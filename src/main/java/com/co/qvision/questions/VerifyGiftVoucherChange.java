package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.GiftVoucherChangePage.VALIDATE_TEXT;

public class VerifyGiftVoucherChange implements Question<Boolean> {

    public static VerifyGiftVoucherChange verifyGiftVoucherChange(){
        return new VerifyGiftVoucherChange();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATE_TEXT.resolveFor(actor).getText().contains("Eliminar de la Lista de deseos");
    }
}

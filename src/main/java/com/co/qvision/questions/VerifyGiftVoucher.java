package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.GiftVoucherPage.VALIDATE_GIFTVOUCHER;

public class VerifyGiftVoucher implements Question<Boolean> {

    public static VerifyGiftVoucher verifyGiftVoucher(){
        return new VerifyGiftVoucher();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATE_GIFTVOUCHER.resolveFor(actor).getText().contains("Detalles");
    }
}

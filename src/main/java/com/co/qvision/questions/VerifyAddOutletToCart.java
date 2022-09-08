package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.OutletPage.TXT_VERIFYITEM3;

public class VerifyAddOutletToCart implements Question<Boolean> {

    public static VerifyAddOutletToCart verifyAddOutletToCart(){
        return new VerifyAddOutletToCart();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_VERIFYITEM3.resolveFor(actor).getText().contains("Sandalias color miel en cuero. - 37");
    }
}

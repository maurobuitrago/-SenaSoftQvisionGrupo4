package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.HandbagWishListPage.VALIDATE_TEXT;

public class VerifyHandbagWishList implements Question<Boolean> {

    public static VerifyHandbagWishList verifyHandbagWishList(){
        return new VerifyHandbagWishList();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATE_TEXT.resolveFor(actor).getText().contains("Bolso bombonera en cuero grabado color verde esmeralda");
    }
}

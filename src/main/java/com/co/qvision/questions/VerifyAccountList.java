package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.AccountPage.TXT_VALIDATE;

public class VerifyAccountList implements Question<Boolean> {

    public static VerifyAccountList accountList(){
        return new VerifyAccountList();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_VALIDATE.resolveFor(actor).getText().contains("eliminado");
    }
}

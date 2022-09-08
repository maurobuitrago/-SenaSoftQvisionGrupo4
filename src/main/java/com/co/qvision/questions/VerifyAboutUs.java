package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.AboutUsPage.TXT_INFO;
import static com.co.qvision.userinterfaces.AboutUsPage.TXT_VALIDATE;

public class VerifyAboutUs implements Question<Boolean> {

    public static VerifyAboutUs verifyAboutUs(){
        return new VerifyAboutUs();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_VALIDATE.resolveFor(actor).getText().contains("LA EMPRESA");
    }
}

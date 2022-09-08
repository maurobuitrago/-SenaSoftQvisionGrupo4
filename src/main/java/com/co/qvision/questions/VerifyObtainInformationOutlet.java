package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.OutletPage.TXT_VERIFYNAME;

public class VerifyObtainInformationOutlet implements Question {


    public static VerifyObtainInformationOutlet inThePage(){
        return new VerifyObtainInformationOutlet();
    }

    @Override
    public String answeredBy(Actor actor) {
        return TXT_VERIFYNAME.resolveFor(actor).getText();
    }
}

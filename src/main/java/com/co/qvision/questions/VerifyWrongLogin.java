package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.LoginPage.TXT_IDENTIFICATION;

//Implementamos Question de la libreria serenity screenplay
public class VerifyWrongLogin implements Question<Boolean> {

    //Constructor publico que permite que la clase VerifyWrongLogin pueda ser instanciada en la clase LoginStepDefinition
    public static VerifyWrongLogin inThePage( ){
        return new VerifyWrongLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_IDENTIFICATION.resolveFor(actor).getAttribute("value").contains("1059234242");
    }
}

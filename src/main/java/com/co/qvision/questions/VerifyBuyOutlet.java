package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.OutletPage.VALIDATE_TEXT;

public class VerifyBuyOutlet implements Question<Boolean> {


    //Constructor publico que permite que la clase VerifyBuyOutlet pueda ser instanciada en la clase LoginStepDefinition
    public static VerifyBuyOutlet inThePage(){
        return new VerifyBuyOutlet();
    }

    //Vamos a validar que el elemento VALIDATE_TEXT obtenga el texto de la etiqueta y además compare ese texto con la palabra BON-BONITE
    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATE_TEXT.resolveFor(actor).getText().contains("BON-BONITE");
    }
}

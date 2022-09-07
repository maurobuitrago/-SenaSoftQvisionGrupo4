package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.AccessoriesPage.VALIDATE_TEXT;

//Implementamos Question de la libreria de Serenity Screenplay
public class VerifyBuyAccessories implements Question<Boolean> {

    public static VerifyBuyAccessories inThePage(){
        return new VerifyBuyAccessories();
    }

    //Obtenemos el texto del eleemtno mapeado anteriormente para realizar la validación en AccessoriesStepDefinition
    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDATE_TEXT.resolveFor(actor).getText().contains("BON-BONITE");
    }
}

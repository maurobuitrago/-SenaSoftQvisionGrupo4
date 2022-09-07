package com.co.qvision.questions;

import com.co.qvision.userinterfaces.HandbagPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.HandbagPage.TXT_VERIFYITEM3;

//Implementamos Question de la librería de serenity screenplay
public class VerifyAddBagToCart implements Question {

    //Constructr público que permite instanciar la clase VerifyAddBagToCart en la clase HandbagStepDefinition
    public static VerifyAddBagToCart inThePage(){
        return new VerifyAddBagToCart();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_VERIFYITEM3).viewedBy(actor).asString();
    }
}

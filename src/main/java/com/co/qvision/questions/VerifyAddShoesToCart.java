package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.ShoesPage.TXT_VERIFYITEM3;

public class VerifyAddShoesToCart implements Question {

    public static VerifyAddShoesToCart inThePage(){
        return new VerifyAddShoesToCart();
    }

    //Obtenemos el texto del elemento TXT_VERIFYITEM3 para seguidamente hacer la comparación en ShoesStepDefinition
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(TXT_VERIFYITEM3).viewedBy(actor).asString();
    }
}

package com.co.qvision.questions;

import com.co.qvision.userinterfaces.HandbagPage;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


//Implementamos Question de la librería de serenity screenplay
public class VerifyCorrectRegister implements Question {
    public static VerifyCorrectRegister inThePage(){
        return new VerifyCorrectRegister();
    }

    //Obtenemos el texto que se encuentra en el elemento mapeado como TXT_VERIFYIDENTIFICATION para después validar en la clase RegisterStepDefinition
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RegisterPage.TXT_VERIFYIDENTIFICATION).viewedBy(actor).asString();
    }
}

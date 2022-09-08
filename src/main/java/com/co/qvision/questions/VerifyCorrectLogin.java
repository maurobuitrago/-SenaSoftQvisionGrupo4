package com.co.qvision.questions;

import com.co.qvision.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.LoginPage.TXT_VERIFYIDENTIFICATION;

public class VerifyCorrectLogin implements Question {

    //Constructor publico que permite que la clase VerifyCorrectLogin pueda ser instanciada en la clase LoginStepDefinition
    public static VerifyCorrectLogin inThePage(){
        return new VerifyCorrectLogin();
    }

    //Especificamos traer el texto del campo TXT_VERIFYIDENTIFICATION
    @Override
    public Object answeredBy(Actor actor) {
        return TXT_VERIFYIDENTIFICATION.resolveFor(actor).getText();
    }
}

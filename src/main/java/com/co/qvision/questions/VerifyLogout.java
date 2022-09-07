package com.co.qvision.questions;

import com.co.qvision.userinterfaces.LoginPage;
import com.co.qvision.userinterfaces.LogoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.LogoutPage.TXT_ACCESS;

//Implementamos Question de la libreria Serenity Screenplay
public class VerifyLogout implements Question<String> {

    //Constructor que nos permite instanciar la clase VerifyLogout en la clase LogoutStepDefinition
    public static VerifyLogout inThePage(){
        return new VerifyLogout();
    }

    //Obtenemos la información del elemento TXT_ACCES para validar en LogoutStepDefinitions que se realizó satisfactoriamente la tarea
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TXT_ACCESS).viewedBy(actor).asString();
    }
}

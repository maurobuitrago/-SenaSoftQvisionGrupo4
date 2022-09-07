package com.co.qvision.tasks;

import com.co.qvision.models.DataRegister;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

//Implementamos Task de la librería de serenity screenplay
public class RegisterUser implements Task {

    DataRegister dataRegister;


    public RegisterUser(   DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }


    //Constructor público que permite que la clase RegisterUser pueda ser instanciada en la clase HandbagStepDefinition
    public static RegisterUser inThePage(DataRegister dataRegister){
        return Tasks.instrumented(RegisterUser.class, dataRegister);
    }

    //Definimos las acciones que debe realizar el actor para lograr el registro satisfactorio
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_ACCOUNT));
        actor.attemptsTo(Enter.theValue(dataRegister.getIdentification()).into(RegisterPage.TXT_IDENTIFICATION));
        actor.attemptsTo(Enter.theValue(dataRegister.getEmail()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(dataRegister.getPassword()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Scroll.to(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.CHBOX_AUTHORIZED));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));

        //Se imprime en consola el número de identificaión para vizualizar que es el dato ingresado desde el archivo register.feature
        System.out.println(Text.of(RegisterPage.TXT_VERIFYIDENTIFICATION).viewedBy(actor).asString());
    }
}

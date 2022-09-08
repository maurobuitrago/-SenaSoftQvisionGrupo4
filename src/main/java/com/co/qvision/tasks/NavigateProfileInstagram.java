package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.NavigateInstagramPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.qvision.userinterfaces.NavigateInstagramPage.BTN_INSTAGRAM;


public class NavigateProfileInstagram implements Task {

    //Variable pública la cuál podrá ser llamada en la clase VerifyInformationProfile
    public static String UrlIG;


    public static NavigateProfileInstagram inThePage() {
        return Tasks.instrumented(NavigateProfileInstagram.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Accion de dirijirme al botón de instagram
        actor.attemptsTo(Click.on(NavigateInstagramPage.BTN_MENU));
        actor.attemptsTo(Scroll.to(BTN_INSTAGRAM));

        //Obtenemos el hipervinculo de la etiqueta Button para después navegar y hacer la comparación en NavigateInstagramStepDefinition
        UrlIG = BTN_INSTAGRAM.resolveFor(actor).getAttribute("href");

/*        actor.attemptsTo(Switch.toWindow(urlInstagram));
        try {
            System.out.println(Text.of(NavigateInstagramPage.TXT_INFORMATION).viewedBy(actor).asString());
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*/
    }
}

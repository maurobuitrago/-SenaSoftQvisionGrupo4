package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutUsPage {

    public static final Target BTN_ABOUT_US = Target.the("Boton de Quienes somos").located(By.xpath("//*[@id='menu-item-50231']/a"));
    public static final Target TXT_INFO = Target.the("informacion de la empresa").located(By.xpath("//*[@id='content']/div[2]/div[1]/p"));
    public static final Target TXT_VALIDATE = Target.the("titulo de validacion").located(By.xpath("//*[@id='content']/div[2]/div[1]/h2"));
}

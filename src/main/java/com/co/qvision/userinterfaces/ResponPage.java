package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResponPage {

    public static final Target MENUU = Target.the("Abre el menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target MODULE_RESPON = Target.the("MODULO RESPON").located(By.xpath("//*[@id='menu-item-32200']/a"));
    public static final Target TXT_VALIDATE = Target.the("TXT MODULO RESPON").located(By.xpath("//*[@id='content']/div[2]/div/div[1]/p"));

}

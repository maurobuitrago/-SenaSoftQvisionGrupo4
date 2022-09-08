package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavigateInstagramPage {

    //Mapeo de elementos para dirijirme al botón de instagram
    public static final Target BTN_MENU = Target.the("Botón opción menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target BTN_INSTAGRAM = Target.the("Botón opción ir a instagram").located(By.xpath("//div/div[3]/a[1][@class='social_net']"));

}

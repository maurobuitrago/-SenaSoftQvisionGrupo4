package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GiftVoucherPage {

    //Mapeo del detalle del modulo bolsa de regalo
    public static final Target MENU = Target.the("Abre el menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target MODULE_GIFTVOUCHER = Target.the("Abre el modulo bono de regalos").located(By.xpath("//*[@id='menu-item-488']"));
    public static final Target INFORMATION_GIFTVOUCHER = Target.the("Detalle de bono de regalos").located(By.xpath("//*[@id='tab4']/p"));
    public static final Target VALIDATE_GIFTVOUCHER = Target.the("Texto de validacion").located(By.xpath("//*[@id='product-481']/div[2]/div[2]/ul/li[1]/a"));

}

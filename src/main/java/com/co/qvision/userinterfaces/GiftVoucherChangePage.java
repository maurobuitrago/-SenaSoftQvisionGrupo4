package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GiftVoucherChangePage {

    //Mapeo de inicio de sesion
    public static final Target BTN_ACCOUNNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));
    public static final Target TXT_IDENTIFICATIONN = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORDD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));

    //Mapeo del cambio de precio del bono de regalo y el agregado a la lista
    public static final Target MENU = Target.the("Abre el menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target MODULE_GIFTVOUCHER = Target.the("Abre el modulo bono de regalos").located(By.xpath("//*[@id='menu-item-488']/a"));
    public static final Target PRICE = Target.the("Despliega los precios").located(By.xpath("//*[@id='pa_valor-bono-regalo']"));
    public static final Target SELECT_PRICE = Target.the("Selecciona el valor").located(By.xpath("//*[@id='pa_valor-bono-regalo']/option[5]"));

    public static final Target ADD_LIST = Target.the("Añadir producto al la lista de deseos").located(By.xpath("//*[text() ='Añadir a Lista de deseos']"));
    public static final Target VALIDATE_TEXT = Target.the("Verifica si el bolos si se agrego").located(By.xpath("//*[text()='Eliminar de la Lista de deseos']"));


}

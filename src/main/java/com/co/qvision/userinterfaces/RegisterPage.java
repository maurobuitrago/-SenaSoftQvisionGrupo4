package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {

    //Mapeamos los elementos necesarios para ejecutar la automatización
    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));

    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='reg_username']"));
    public static final Target TXT_EMAIL = Target.the("Campo de texto para email").located(By.xpath("//input[@id='reg_email']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='reg_password']"));
    public static final Target BTN_REGISTER = Target.the("Botón opción registrar usuario").located(By.xpath("//button[text()='Registrarse']"));
    public static final Target CHBOX_AUTHORIZED = Target.the("Check box opción autorizar el tratamiento de mis datos personales").located(By.xpath("//div[@class='u-column2 col-2']/form/p[5]/span/label/abbr"));

    //Mapeamos el elemto que me permita obtener el número de identificación
    public static final Target TXT_VERIFYIDENTIFICATION = Target.the("Campo de texto para verificar inicio de sesión exitoso").located(By.xpath("//p/strong[1]"));


}

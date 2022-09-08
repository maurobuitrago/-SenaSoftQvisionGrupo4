package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));

    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));

    public static final Target TXT_VERIFYIDENTIFICATION = Target.the("Campo de texto para verificar inicio de sesión exitoso").located(By.xpath("//div[@class = 'woocommerce-MyAccount-content']/p[1]/strong[1]"));



}

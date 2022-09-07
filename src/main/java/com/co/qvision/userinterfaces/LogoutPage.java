package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogoutPage {

    //Mapeamos los elementos de inicio de sesión

    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));
    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));

    //Mapeamos los elementos de Cierre de sesión
    public static final Target BTN_MENU = Target.the("Botón opción menú de los módulos").located(By.xpath("//*[@id='burger']"));
    public static final Target BTN_MYACCOUNT = Target.the("Botón opción Mi cuenta").located(By.xpath("//*[@id='menu-item-30']"));
    public static final Target BTN_LOGOUT = Target.the("Botón opción Cerrar sesión").located(By.xpath("//a[text()='Salir']"));

    //Mapeamos el elemento que contiene el texto Acceder para después validar que cerró sesión
    public static final Target TXT_ACCESS = Target.the("Texto para verificar que cerró sesión").located(By.xpath("//h2[text()='Acceder']"));

}

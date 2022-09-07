package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountPage {

    //Mapeo los elementos para iniciar sesion
    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));

    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));

    //Mapeo los elementos para dirijirme a la sección pedidos del módulo mi cuenta
    public static final Target BTN_MENU = Target.the("Botón opción menú de los módulos").located(By.xpath("//*[@id='burger']"));
    public static final Target BTN_MYACCOUNT = Target.the("Botón opción Mi cuenta").located(By.xpath("//*[@id='menu-item-30']"));
    public static final Target BTN_ORDER = Target.the("Botón opción Cerrar sesión").located(By.xpath("//a[text()='Pedidos']"));

    public static final Target BTN_SEE = Target.the("Botón opción ver del primer pedido").located(By.xpath("//tr[1]/td/a[text()='Ver']"));
    public static final Target TXT_VERIFYINFORMATION = Target.the("Texto verificación de la infromacion del primer pedido").located(By.xpath("//div[@id='main']/div/div/div/nav/ul/li/div/section[1]"));

}

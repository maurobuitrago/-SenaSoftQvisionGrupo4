package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountPage {

    //Mapeo de inicio de sesion
    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));
    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));

    //Mapeo de mi cuenta hacia la lista de deseos
    public static final Target SELECT_LIST = Target.the("Selecciona la lisat de deseos").located(By.xpath("//*[@id='content']/div/div/nav/ul/li[2]/a"));
    public static final Target BTN_CANCEL = Target.the("Boton de elimiar de la lista de deseos").located(By.xpath("//*[@id='content']/div/div/div/div[2]/form/table/tbody/tr[1]/td[1]/button/i"));
    public static final Target TXT_VALIDATE = Target.the("Validacion de que se elimino correctamente").located(By.xpath("//*[@id='content']/div/div/div[2]"));


}

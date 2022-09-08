package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HandbagWishListPage {

    //Mapeo inicio de sesion
    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));
    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));
    //Mapeo de añadir producto a la lista de deseos
    public static final Target MENU = Target.the("Abre el menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target MODULE_HANDBAG = Target.the("Abre el modulo bolsos").located(By.xpath("//*[@id='menu-item-17054']"));
    public static final Target SELECT_WALLETS = Target.the("Abre la seccion de carteras").located(By.xpath("//*[@id='menu-item-55869']/a"));
    public static final Target SECOND_TARGET = Target.the("Selecciona la segunda publicacion de tenis").located(By.xpath("//*[@id='wrapper']/div[5]/ul/li[2]/a"));
    public static final Target CHANGE_COLOR = Target.the("Cambia el color del producto").located(By.xpath("//*[@id='product-205468']/div[2]/div[1]/div/div[2]/ul/li[3]"));
    public static final Target ADD_LIST = Target.the("Añadir producto al la lista de deseos").located(By.xpath("//*[text() ='Añadir a Lista de deseos']"));
    public static final Target SELECTED_LIST = Target.the("Seleccionar la lista de deseos").located(By.xpath("//*[@id='content']/div/div/nav/ul/li[2]"));
    public static final Target VALIDATE_TEXT = Target.the("Verifica si el bolos si se agrego").located(By.xpath("//*[text()='Bolso bombonera en cuero grabado color verde esmeralda']"));




}

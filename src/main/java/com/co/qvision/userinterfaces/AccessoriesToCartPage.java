package com.co.qvision.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AccessoriesToCartPage {

    public static final Target MENU = Target.the("Abre el menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target MODULE_ACCESSORIES = Target.the("Abre el modulo de accesorios").located(By.xpath("//*[@id='menu-item-18950']/a"));
    public static final Target BTN_ITEM3 = Target.the("Botón de opción tercer artículo").located(By.xpath("//*[@id='wrapper']/div[5]/ul/li[3]/a"));
    public static final Target BTN_ADDTOCART = Target.the("Botón de opción añadir al carrito").located(By.xpath("//button[text()='Añadir al carrito']"));
    public static final Target BTN_SHOPPINGCART = Target.the("Botón de opción carrito").located(By.xpath("//div[@class='cart']"));
    public static final Target BTN_SEECART = Target.the("Botón de opción ver carrito").located(By.xpath("//a[text()='Ver carrito']"));
    public static final Target TXT_VERIFYITEM3 = Target.the("Campo de texto que verifica el nombre del artículo 3").located(By.xpath("//tr/td[3]/a"));
}

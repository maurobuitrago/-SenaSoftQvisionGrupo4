package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoesPage {

    //Mapeo del Login
    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));
    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));

    //Mapeo de comprar zapatos

    public static final Target MENU = Target.the("Abre el menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target MODULE_SHOES = Target.the("Abre el modulo de zapatos").located(By.xpath("//*[@id='menu-item-17053']"));
    public static final Target SELECT_TENNIS = Target.the("Selecciona la seccion de tennis").located(By.xpath("//*[@id='menu-item-17053']/ul/li[5]/a"));
    public static final Target SECOND_TARGET = Target.the("Selecciona la segunda publicacion de tenis").located(By.xpath("//*[@id='wrapper']/div[5]/ul/li[2]/a"));
    public static final Target SELECT_SIZE = Target.the("Coloca la talla que desea").located(By.xpath("//*[@id='pa_talla']"));
    public static final Target SELECT_NUMBER = Target.the("Selecciona la talla 38").located(By.xpath("//*[@id='pa_talla']/option[6]"));
    public static final Target BTN_BUY_NOW = Target.the("Click en el boton comprar ahora").located(By.xpath("//a[text()='Comprar Ahora']"));
    public static final Target SCROLL_FINALLY_BUY = Target.the("SClick en el boton finalizar compra").located(By.xpath("//*[@id='content']/div/div/div[2]/div/table/tbody/tr[1]"));
    public static final Target FINALLY_BUY = Target.the("Click en el boton finalizar compra").located(By.xpath("//*[@id='content']/div/div/div[2]/div/div/a"));

    //Formulario de compra
    public static final Target NAME = Target.the("Ingresa nombre").located(By.xpath("//*[@id='billing_first_name']"));
    public static final Target LAST_NAME = Target.the("Ingresa apellidos").located(By.xpath("//*[@id='billing_last_name']"));
    public static final Target CHECK_F = Target.the("Checkbox femenino").located(By.xpath("//*[@id='billing_gender_field']/span/label[3]"));
    public static final Target TYPE_IDENTITY = Target.the("Selecciona tipo de doc").located(By.xpath("//*[@id='billing_tipo_documento']"));
    public static final Target DOC_IDENTITY = Target.the("seleciona doc").located(By.xpath("//*[@id='billing_tipo_documento']/option[1]"));
    public static final Target NUM_IDENTITY = Target.the("Ingresa numero de doc").located(By.xpath("//*[@id='billing_user_login']"));
    public static final Target EMAIL = Target.the("Ingresa correo").located(By.xpath("//*[@id='billing_email']"));
    public static final Target TELEPHONE = Target.the("Ingresa telefono").located(By.xpath("//*[@id='billing_phone']"));
    public static final Target DIRECTION = Target.the("Ingresa direccion").located(By.xpath("//*[@id='billing_address_1']"));
    public static final Target CODE_POSTAL = Target.the("Ingresa codigo postal").located(By.xpath("//*[@id='billing_postcode']"));
    public static final Target BTN_TO_PAY = Target.the("boton pagar").located(By.xpath("//button[text()='Pagar']"));
    public static final Target VALIDATE_TEXT = Target.the("texto de validacion").located(By.xpath("//*[text()='BON-BONITE']"));


    //Mapeo de elementos para añadir el tercer producto al Carrito de Compras
    public static final Target SELECT_BOTINES = Target.the("Selecciona la seccion de botines").located(By.xpath("//*[@id='menu-item-17053']/ul/li[2]/a"));

    public static final Target BTN_ITEM3 = Target.the("Botón de opción tercer artículo").located(By.xpath("//div[@id='wrapper']/div[5]/ul/li[3]/a"));
    public static final Target SELECT_TALLA = Target.the("Lista desplegable para seleccionar la talla de zapato").located(By.xpath("//select[@id='pa_talla']"));
    public static final Target SELECT_LIST35 = Target.the("Opción talla 37 de la lista desplegable").located(By.xpath("//option[@value='35']"));

    public static final Target BTN_ADDTOCART = Target.the("Botón de opción añadir al carrito").located(By.xpath("//button[text()='Añadir al carrito']"));
    public static final Target BTN_SHOPPINGCART = Target.the("Botón de opción carrito").located(By.xpath("//div[@class='cart']"));
    public static final Target BTN_SEECART = Target.the("Botón de opción ver carrito").located(By.xpath("//a[text()='Ver carrito']"));
    public static final Target TXT_VERIFYITEM3 = Target.the("Campo de texto que verifica el nombre del artículo 3").located(By.xpath("//tr/td[3]/a"));
}

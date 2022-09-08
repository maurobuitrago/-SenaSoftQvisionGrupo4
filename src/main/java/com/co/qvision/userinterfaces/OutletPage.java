package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OutletPage {
//Mapeo de los elementos para iniciar sesión antes de realizar la compra de un producto del módulo de Outlet

    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));

    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));


    //Mapeo de elemento opción Outley y de elemento primer producto
    public static final Target BTN_OUTLET = Target.the("Botón opción Outlet").located(By.xpath("//header/div/div/div/div/ul/li/a[text()='Outlet']"));
    public static final Target BTN_ITEM1 = Target.the("Botón de opción primer artículo").located(By.xpath("//div[@id='wrapper']/div[5]/ul/li[1]/a"));

    //Mapeo de los elementos para obtener la información del precio del producto
    public static final Target TXT_VERIFYNORMALPRICE = Target.the("Campo de texto que verifica el precio normal del producto 1 en oferta").located(By.xpath("//p[@class='price']/del/span/bdi"));
    public static final Target TXT_VERIFYSALEPRICE = Target.the("Campo de texto que verifica el precio con descuento del producto 1 en oferta").located(By.xpath("//p[@class='price']/ins/span/bdi"));


    //Mapeo de los elementos para realizar la compra éxitosa del segundo producto del módulo Outlet
    public static final Target BTN_ITEM3 = Target.the("Botón de opción segundo artículo").located(By.xpath("//div[@id='wrapper']/div[5]/ul/li[3]/a"));
    public static final Target SELECT_TALLA = Target.the("Lista desplegable para seleccionar la talla de zapato").located(By.xpath("//select[@id='pa_talla']"));
    public static final Target SELECT_LIST36 = Target.the("Opción talla 37 de la lista desplegable").located(By.xpath("//option[@value='36']"));

    public static final Target BTN_BUYNOW = Target.the("Botón de opción comprar ahora").located(By.xpath("//a[text()='Comprar Ahora']"));
    public static final Target BTN_FINISHBUY = Target.the("Botón de opción finalizar compra").located(By.xpath("//div[@class='wc-proceed-to-checkout']/a"));

    public static final Target TXT_VERIFYITEM2 = Target.the("Campo de texto que verifica el nombre del artículo").located(By.xpath("//tr/td[3]/a"));
    public static final Target TXT_VERIFYNAME = Target.the("Campo de texto que verifica el precio con descuento del producto 1 en oferta").located(By.xpath("//div[@class='positioner']/h1"));

    //Mapeo de los elementos para diligenciar datos de facturación
    public static final Target TXT_NAME = Target.the("Ingresa nombre").located(By.xpath("//*[@id='billing_first_name']"));
    public static final Target TXT_LASTNAME = Target.the("Ingresa apellidos").located(By.xpath("//*[@id='billing_last_name']"));
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

    //Mapeo faltante para agregar producto al carrito
    public static final Target BTN_ADDTOCART = Target.the("Botón de opción añadir al carrito").located(By.xpath("//button[text()='Añadir al carrito']"));
    public static final Target BTN_SHOPPINGCART = Target.the("Botón de opción carrito").located(By.xpath("//div[@class='cart']"));
    public static final Target BTN_SEECART = Target.the("Botón de opción ver carrito").located(By.xpath("//a[text()='Ver carrito']"));
    public static final Target TXT_VERIFYITEM3 = Target.the("Campo de texto que verifica el nombre del artículo 3").located(By.xpath("//tr/td[3]/a"));
    public static final Target SELECT_SIZE = Target.the("Coloca la talla que desea").located(By.xpath("//*[@id='pa_talla']"));
    public static final Target SELECT_NUMBER = Target.the("Selecciona la talla 37").located(By.xpath("//*[@id='pa_talla']/option[3]"));



}

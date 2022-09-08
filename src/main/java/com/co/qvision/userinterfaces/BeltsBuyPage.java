package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BeltsBuyPage {
    //Mapeo de inicio de sesion
    public static final Target BTN_ACCOUNT = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//div[@class= 'myaccount']/a"));
    public static final Target TXT_IDENTIFICATION = Target.the("Campo de texto para número de identificación").located(By.xpath("//input[@id='username']"));
    public static final Target TXT_PASSWORD = Target.the("Campo de texto para contraseña").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_ACCESS = Target.the("Botón opción acceder a inicio de sesión").located(By.xpath("//button[text()= 'Acceder']"));

    //Mapeo de compra del producto
    public static final Target MENU = Target.the("Abre el menu de los modulos").located(By.xpath("//*[@id='burger']"));
    public static final Target MODULE_BELTS = Target.the("Abre el modulo de cinturones").located(By.xpath("//*[@id='menu-item-18949']/a"));
    public static final Target SECOND_TARGET = Target.the("Selecciona la segunda publicacion").located(By.xpath("//*[@id='wrapper']/div[5]/ul/li[2]/a"));
    public static final Target SELECT_SIZE = Target.the("Coloca la talla que desea").located(By.xpath("//*[@id='pa_talla']"));
    public static final Target SELECT_NUMBER = Target.the("Selecciona la talla 38").located(By.xpath("//*[@id='pa_talla']/option[4]"));
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
    public static final Target COUNTRY = Target.the("Seleciona pais").located(By.xpath("//*[@id=\"billing_country_field\"]"));
    public static final Target SELECT_COUNTRY = Target.the("Seleciona pais Colombia").located(By.xpath("//*[@id=\"billing_country_field\"]/span/select/option[48]"));
    public static final Target DEPARTMENT = Target.the("Seleciona departamento").located(By.xpath("//*[@id='billing_state']"));
    public static final Target SELECT_DEPARTMENT = Target.the("Seleciona departamento Cauca").located(By.xpath("//*[@id='billing_state']/option[11]"));
    public static final Target CITY = Target.the("Selecciona ciudad").located(By.xpath("//*[@id='billing_city']"));
    public static final Target SELECT_CITY = Target.the("selecciona ciudad Popayan").located(By.xpath("//*[@id='billing_city']/option[27]"));
    public static final Target DIRECTION = Target.the("Ingresa direccion").located(By.xpath("//*[@id='billing_address_1']"));
    public static final Target CODE_POSTAL = Target.the("Ingresa codigo postal").located(By.xpath("//*[@id='billing_postcode']"));
    public static final Target BTN_TO_PAY = Target.the("boton pagar").located(By.xpath("//button[text()='Pagar']"));
    public static final Target VALIDATE_TEXT = Target.the("texto de validacion").located(By.xpath("//*[text()='BON-BONITE']"));



}

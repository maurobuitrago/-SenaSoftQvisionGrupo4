package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OutletPage {

    //Mapeo de elemento opción Outley y de elemento primer producto
    public static final Target BTN_OUTLET = Target.the("Botón opción Outlet").located(By.xpath("//header/div/div/div/div/ul/li/a[text()='Outlet']"));
    public static final Target BTN_ITEM1 = Target.the("Botón de opción primer artículo").located(By.xpath("//div[@id='wrapper']/div[5]/ul/li[1]/a"));

    //Mapeo de los elementos para obtener la información del precio del producto
    public static final Target TXT_VERIFYNORMALPRICE = Target.the("Campo de texto que verifica el precio normal del producto 1 en oferta").located(By.xpath("//p[@class='price']/del/span/bdi"));
    public static final Target TXT_VERIFYSALEPRICE = Target.the("Campo de texto que verifica el precio con descuento del producto 1 en oferta").located(By.xpath("//p[@class='price']/ins/span/bdi"));
}

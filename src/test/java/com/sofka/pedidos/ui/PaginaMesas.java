package com.sofka.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaMesas {

    public static final Target BOTON_SELECCIONAR_MESA = Target.the("botón de la mesa {0}")
            .locatedBy("//button[.//div[normalize-space()='{0}']]");
}

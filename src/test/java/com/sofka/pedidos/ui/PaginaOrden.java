package com.sofka.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaOrden {

    public static final Target BOTON_VER_ESTADO = Target.the("botón Ver estado")
            .locatedBy("//button[contains(normalize-space(.), 'Ver estado')]");

    public static final Target BOTON_VOLVER_MENU = Target.the("botón Volver al menu")
            .locatedBy("//button[normalize-space()='Volver al menu']");
}

package com.sofka.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicio {

    public static final Target BOTON_INICIAR = Target.the("botón Iniciar")
            .locatedBy("//button[normalize-space()='Iniciar']");
}

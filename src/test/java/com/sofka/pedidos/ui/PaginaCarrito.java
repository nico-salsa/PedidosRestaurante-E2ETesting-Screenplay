package com.sofka.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaCarrito {

    public static final Target CAMPO_NOTAS_PLATO = Target.the("campo de notas del plato")
            .locatedBy("//textarea[@placeholder='Notas para este plato...']");

    public static final Target CAMPO_NOTAS_ADICIONALES = Target.the("campo de notas adicionales")
            .locatedBy("//textarea[@placeholder='Ej: sin picante, enviar cubiertos extras...']");

    public static final Target BOTON_CONFIRMAR_PEDIDO = Target.the("botón Confirmar pedido")
            .locatedBy("//button[normalize-space()='Confirmar pedido']");
}

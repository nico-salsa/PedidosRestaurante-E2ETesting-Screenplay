package com.sofka.pedidos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaMenu {

    public static final Target PRIMER_BOTON_AGREGAR = Target.the("primer botón Agregar del menú")
            .locatedBy("(//button[contains(normalize-space(.), 'Agregar')])[1]");

    public static final Target BOTON_COMPRAR = Target.the("botón ir al carrito")
            .locatedBy("//a[@href='/client/cart']");
}

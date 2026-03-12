package com.sofka.pedidos.questions;

import com.sofka.pedidos.ui.PaginaOrden;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("el mensaje de confirmación del pedido es visible")
public class ConfirmacionOrden implements Question<Boolean> {

    public static ConfirmacionOrden estaVisible() {
        return new ConfirmacionOrden();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PaginaOrden.MENSAJE_PEDIDO_CONFIRMADO.resolveFor(actor).isVisible();
    }
}

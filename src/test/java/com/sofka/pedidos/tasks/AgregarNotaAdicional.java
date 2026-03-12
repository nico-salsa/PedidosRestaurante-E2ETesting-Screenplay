package com.sofka.pedidos.tasks;

import com.sofka.pedidos.ui.PaginaCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("agregar nota adicional al pedido y confirmar")
public class AgregarNotaAdicional implements Task {

    private final String nota;

    public AgregarNotaAdicional(String nota) {
        this.nota = nota;
    }

    public static AgregarNotaAdicional agregarNotaAdicional(String nota) {
        return new AgregarNotaAdicional(nota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nota).into(PaginaCarrito.CAMPO_NOTAS_ADICIONALES),
                Click.on(PaginaCarrito.BOTON_CONFIRMAR_PEDIDO)
        );
    }
}

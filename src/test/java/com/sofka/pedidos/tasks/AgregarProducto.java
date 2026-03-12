package com.sofka.pedidos.tasks;

import com.sofka.pedidos.ui.PaginaInicio;
import com.sofka.pedidos.ui.PaginaMesas;
import com.sofka.pedidos.ui.PaginaMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Subject("agregar el primer producto del menú para la mesa #actor")
public class AgregarProducto implements Task {

    private final String numeroDeMesa;

    public AgregarProducto(String numeroDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
    }

    public static AgregarProducto agregarProducto(String numeroDeMesa) {
        return new AgregarProducto(numeroDeMesa);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PaginaInicio.BOTON_INICIAR, isVisible()),
                Click.on(PaginaInicio.BOTON_INICIAR),
                WaitUntil.the(PaginaMesas.BOTON_SELECCIONAR_MESA.of(numeroDeMesa), isVisible()),
                Click.on(PaginaMesas.BOTON_SELECCIONAR_MESA.of(numeroDeMesa)),
                WaitUntil.the(PaginaMenu.PRIMER_BOTON_AGREGAR, isVisible()),
                Click.on(PaginaMenu.PRIMER_BOTON_AGREGAR),
                Click.on(PaginaMenu.BOTON_COMPRAR)
        );
    }
}

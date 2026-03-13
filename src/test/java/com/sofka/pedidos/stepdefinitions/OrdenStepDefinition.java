package com.sofka.pedidos.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import com.sofka.pedidos.hooks.AbrirNavegador;
import com.sofka.pedidos.questions.ConfirmacionOrden;
import com.sofka.pedidos.tasks.AgregarNotaAdicional;
import com.sofka.pedidos.tasks.AgregarProducto;
import com.sofka.pedidos.util.Constantes;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrdenStepDefinition {

    private Actor cliente;

    @Given("que el cliente accede a la aplicacion del restaurante Sofka")
    public void elClienteAccedeALaAplicacion() {
        OnStage.theActorCalled(Constantes.ACTOR).attemptsTo(
            AbrirNavegador.abrirUrl(Constantes.URL_BASE)
        );
    }

    @When("hace clic en Iniciar, selecciona la mesa numero {string} y agrega el primer producto disponible al carrito")
    public void haceClicEnIniciarSeleccionaMesaYAgregaProducto(String numeroDeMesa) {
        theActorInTheSpotlight().attemptsTo(
            AgregarProducto.agregarProducto(numeroDeMesa)
        );
    }

    @And("registra la nota {string} y confirma el pedido")
    public void registraLaNotaYConfirmaElPedido(String nota) {
        theActorInTheSpotlight().attemptsTo(
            AgregarNotaAdicional.agregarNotaAdicional(nota)
        );
    }

    @Then("el sistema confirma exitosamente el pedido realizado")
    public void elSistemaConfirmaElPedido() {
        theActorInTheSpotlight().should(
            seeThat(ConfirmacionOrden.estaVisible(), is(true))
        );
    }
}

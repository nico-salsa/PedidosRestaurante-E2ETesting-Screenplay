package com.sofka.pedidos.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class OrdenStepDefinition {

    private Actor cliente;

    @Given("que el cliente accede a la aplicacion del restaurante Sofka")
    public void elClienteAccedeALaAplicacion() {
        // El cliente accede a la aplicación del restaurante Sofka
    }

    @When("hace clic en Iniciar y selecciona la mesa numero {string}")
    public void haceClicEnIniciarYSeleccionaMesa(String numeroDeMesa) {
        // El cliente hace clic en "Iniciar" y selecciona la mesa número proporcionada
    }

    @And("elige un producto del menu y lo agrega al carrito")
    public void eligeUnProductoYLoAgregaAlCarrito() {
        // El cliente elige un producto del menú y lo agrega al carrito
    }

    @And("registra la nota {string} antes de confirmar")
    public void registraLaNotaYConfirma(String nota) {
        // El cliente registra una nota antes de confirmar el pedido
    }

    @Then("el sistema confirma exitosamente el pedido realizado")
    public void elSistemaConfirmaElPedido() {
        // El sistema confirma exitosamente el pedido realizado
    }
}

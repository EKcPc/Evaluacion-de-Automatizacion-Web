package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MyStoreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class MyStoreStepsDef {

    private WebDriver driver;
    private MyStoreSteps MyStoreSteps;

    public MyStoreStepsDef() {
        this.driver = getDriver();
        this.MyStoreSteps = new MyStoreSteps(driver);
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String categoria, String subcategoria) {
        MyStoreSteps.navegarCategoriaSubcategoria();
        screenShot();
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            MyStoreSteps.agregarPrimerProducto();
        }
        screenShot();

    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
        Assertions.assertTrue(MyStoreSteps.validarCompraProducto(), "No se confirmó el producto en el popup.");
        screenShot();
    }

    @Then("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        double unitPrice = 19.12;
        MyStoreSteps.validateTotalAmount(unitPrice);
        screenShot();
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        MyStoreSteps myStoreSteps = new MyStoreSteps(driver);
        myStoreSteps.finalizarCompra();
        screenShot();
    }


}

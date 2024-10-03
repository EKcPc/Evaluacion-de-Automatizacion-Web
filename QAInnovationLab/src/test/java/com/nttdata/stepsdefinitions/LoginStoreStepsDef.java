package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginStoreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class LoginStoreStepsDef {
    private WebDriver driver;

    @Given("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() {

        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion");
        screenShot();


    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String usuario, String clave) {

        LoginStoreSteps login = new LoginStoreSteps(driver);
        login.escribirUsuario(usuario);
        login.escribirClave(clave);
        login.clickSubmit();
        //login.validoautenticacion();
        login.loginerror();
        screenShot();


    }

    //@When("navego a la categoria {string} y subcategoria {string}")
    //public void navegoALaCategoriaYSubcategoria(String arg0, String arg1) {
    //}

    //@And("agrego {int} unidades del primer producto al carrito")
    //public void agregoUnidadesDelPrimerProductoAlCarrito(int arg0) {
    //}

    //@Then("valido en el popup la confirmación del producto agregado")
    //public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {
    //}

    //@And("valido en el popup que el monto total sea calculado correctamente")
    //public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
    //}

    //@When("finalizo la compra")
    //public void finalizoLaCompra() {
    //}

    //@Then("valido el titulo de la pagina del carrito")
    //public void validoElTituloDeLaPaginaDelCarrito() {
    //}

    //@And("vuelvo a validar el calculo de precios en el carrito")
    //public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {
    //}
}

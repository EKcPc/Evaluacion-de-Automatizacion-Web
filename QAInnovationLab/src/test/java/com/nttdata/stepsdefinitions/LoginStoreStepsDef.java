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


}

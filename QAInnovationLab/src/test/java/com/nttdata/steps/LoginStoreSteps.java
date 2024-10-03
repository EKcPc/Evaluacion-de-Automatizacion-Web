package com.nttdata.steps;

import com.nttdata.page.LoginStorePage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.screenShot;

public class LoginStoreSteps {

    private WebDriver driver;

    public LoginStoreSteps(WebDriver driver) {
        this.driver = driver;
    }


    public void escribirUsuario(String usuario) {
        WebElement usuarioInput = driver.findElement(LoginStorePage.userInput);
        usuarioInput.sendKeys(usuario);

    }

    public void escribirClave(String clave) {
        this.driver.findElement(LoginStorePage.passInput).sendKeys(clave);
    }

    public void clickSubmit() {

        WebElement boton = driver.findElement(LoginStorePage.loginButton);
        boton.click();

    }

    public void loginerror() {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
            WebElement mensajeError = wait.until(ExpectedConditions.visibilityOfElementLocated(LoginStorePage.errorMessage));

            if (mensajeError != null) {
                screenShot();
                throw new AssertionError("Error en el login: credenciales incorrectas.");
            }

        } catch (TimeoutException e) {

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


}

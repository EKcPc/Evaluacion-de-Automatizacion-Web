package com.nttdata.steps;

import com.nttdata.page.MyStorePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyStoreSteps {

    private WebDriver driver;


    public MyStoreSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarCategoriaSubcategoria() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.clothesCategory)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.menSubCategory)).click();
    }

    public void agregarPrimerProducto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.firstProduct)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.addToCartButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.addToCartButtonx2)).click();
    }

    public boolean validarCompraProducto() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement confirmationPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.productConfirmationPopup));
        return confirmationPopup.isDisplayed();
    }


    // Metodo para validar/calcular monto total
    public void validateTotalAmount(double unitPrice) {

        int quantity = 2;

        double expectedTotal = unitPrice * quantity;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement totalAmountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.totalAmountPopup)); // Reemplaza por el selector real


        String totalText = totalAmountElement.getText().replace("$", "").trim(); // Ajusta el selector y la moneda según sea necesario
        double actualTotal = Double.parseDouble(totalText);


        Assertions.assertEquals(expectedTotal, actualTotal, "El monto total no es correcto. Se esperaba: " + expectedTotal + " pero se obtuvo: " + actualTotal);

    }

    public void finalizarCompra() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(MyStorePage.finishPurchaseButton)).click();
    }

}



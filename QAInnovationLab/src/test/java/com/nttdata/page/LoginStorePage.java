package com.nttdata.page;

import org.openqa.selenium.By;

public class LoginStorePage {

    public static By userInput = By.id("field-email");
    public static By passInput = By.id("field-password");
    public static By loginButton = By.id("submit-login");

    public static By errorMessage = By.cssSelector("li.alert.alert-danger");

}

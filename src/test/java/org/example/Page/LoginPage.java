package org.example.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
    private WebDriver driver;

    // Locators for Herokuapp Login page
    private By usernameField = By.id("username"); // Username field ID
    private By passwordField = By.id("password"); // Password field ID
    private By loginButton = By.cssSelector("button[type='submit']"); // Login button using CSS selector
    private By errorMessage = By.id("flash"); // Error message ID (if login fails)

    // Constructor to initialize WebDriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods to interact with the elements
    public WebElement getUsernameField() {
        return driver.findElement(usernameField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getErrorMessage() {
        return driver.findElement(errorMessage);
    }

    // Method to perform login
    public void login(String username, String password) {
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }

    // Method to get the error message text (if login fails)
    public String getErrorMessageText() {
        return getErrorMessage().getText();
    }
}


package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By usernameField = By.id("username-input");
    By passwordField = By.xpath("//*[@id=\"password-input\"]/input");
    By loginButton = By.xpath("//*[@id=\"app\"]/main/section/div/section[1]/div/form/div[2]/button");
    By imputErrorMsg = By.id("error-msg");

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public LoginPage openPage(String url) {
        super.openPage(url);
        return this;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(imputErrorMsg).getText();
    }

    public void closedPage() {
        super.closedPage();
    }

}

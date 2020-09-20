package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By txtUsername = By.id("username");
    private static By txtPassword = By.id("password");
    private static By loginPage = By.xpath("//h2");
    private static By login = By.className("radius");
    private static By looutAlert = By.id("flash");


    public static void SetUserNameAndPassword(String email, String password) {
        getDriver().findElement(txtUsername).sendKeys(email);
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static boolean isLoginPageDisplayed() {
        return getDriver().findElement(loginPage).isDisplayed();
    }

    public static boolean isLooutAlertPageDisplayed() {
        return getDriver().findElement(looutAlert).isDisplayed();
    }

    public static boolean invalidLoginAlertDisplayed(){
        return getDriver().findElement(looutAlert).isDisplayed();
    }

    public static void clickSubmit() {
        getDriver().findElement(login).click();
    }
}

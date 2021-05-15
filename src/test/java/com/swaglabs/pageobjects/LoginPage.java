package com.swaglabs.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id="user-name")
    public WebElementFacade txtUsername;

    @FindBy(id="password")
    public WebElementFacade txtPassword;

    @FindBy(id="login-button")
    public WebElementFacade btnLogin;

    public void user(String user) {
        txtUsername.sendKeys(user);
    }

    public void password(String password) {
        txtPassword.sendKeys(password);
    }

    public void login() {
        btnLogin.click();
    }
}

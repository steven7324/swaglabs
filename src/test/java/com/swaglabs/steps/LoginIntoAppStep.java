package com.swaglabs.steps;

import com.swaglabs.pageobjects.LoginPage;

public class LoginIntoAppStep {

    LoginPage loginPage;

    public void WithUserAndPassword(String user, String password) {
        loginPage.open();
        loginPage.user(user);
        loginPage.password(password);
        loginPage.login();

    }
}

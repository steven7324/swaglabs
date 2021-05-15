package com.swaglabs.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class VerifyOrderPage extends PageObject {

    @FindBy(xpath="//h2[@class='complete-header']")
    public WebElementFacade message;

    public void verifyMessage(String dato){
        message.waitUntilPresent();
        assertThat(message.getText(), equalTo(dato));
    }

}

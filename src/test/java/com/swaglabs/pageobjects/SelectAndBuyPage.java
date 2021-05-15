package com.swaglabs.pageobjects;

import com.typesafe.config.ConfigException;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectAndBuyPage extends PageObject {

    @FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[2]//div[2]//button")
    public WebElementFacade btnAddToCart;

    @FindBy(className = "shopping_cart_link")
    public WebElementFacade btnCheckCart;

    @FindBy(id = "checkout")
    public WebElementFacade btnCheckout;

    @FindBy(id = "first-name")
    public WebElementFacade txtFirstName;

    @FindBy(id = "last-name")
    public WebElementFacade txtLastName;

    @FindBy(id = "postal-code")
    public WebElementFacade txtPostalCode;

    @FindBy(id = "continue")
    public WebElementFacade btnContinue;

    @FindBy(id = "finish")
    public WebElementFacade btnFinish;

    public void addItemToCart() {
        btnAddToCart.waitUntilVisible();
        btnAddToCart.click();
    }

    public void checkCart() {
        btnCheckCart.click();
    }

    public void checkout() {
        btnCheckout.waitUntilVisible();
        btnCheckout.click();
    }

    public void firstName(String data) {
        txtFirstName.waitUntilVisible();
        txtFirstName.sendKeys(data);
    }

    public void lastName(String data) {
        txtLastName.sendKeys(data);
    }

    public void postalCode(String data) {
        txtPostalCode.sendKeys(data);
    }

    public void continueChecking() {
        btnContinue.click();
    }

    public void finishBuy() {
        btnFinish.waitUntilVisible();
        btnFinish.click();
    }

    public void buyItem() {
        int i = 1, j = 1, aux = 0, aux2 = 0;
        double highestPricePosition = 0.0;

        btnAddToCart.waitUntilVisible();
        List<WebElement> priceList = btnAddToCart.findElements(By.xpath("(//div[@class='inventory_item_price'])"));

        for (WebElement price : priceList) {
            Double parsePrice = Double.parseDouble(price.getText().replace("$", ""));

            if (parsePrice >= highestPricePosition) {
                highestPricePosition = parsePrice;
                aux = i;
            }
            i++;
        }

        double lowestPricePosition = highestPricePosition;
        for (WebElement price : priceList) {
            double parsePrice = Double.parseDouble(price.getText().replace("$", ""));
            if (parsePrice <= lowestPricePosition) {
                lowestPricePosition = parsePrice;
                aux2 = j;
            }
            j++;
        }
        btnAddToCart.findElement(By.xpath("(//div[@class='inventory_list']//button)[" + aux + "]")).click();
        btnAddToCart.findElement(By.xpath("(//div[@class='inventory_list']//button)[" + aux2 + "]")).click();
    }

}

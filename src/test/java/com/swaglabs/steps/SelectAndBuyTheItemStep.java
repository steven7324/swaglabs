package com.swaglabs.steps;

import com.swaglabs.pageobjects.SelectAndBuyPage;

import java.util.List;

public class SelectAndBuyTheItemStep {

    SelectAndBuyPage selectAndBuyPage;

    public void FromTheSite(List<List<String>> dt, int i) {
        selectAndBuyPage.addItemToCart();
        selectAndBuyPage.checkCart();
        selectAndBuyPage.checkout();
        selectAndBuyPage.firstName(dt.get(i).get(0).trim());
        selectAndBuyPage.lastName(dt.get(i).get(1).trim());
        selectAndBuyPage.postalCode(dt.get(i).get(2).trim());
        selectAndBuyPage.continueChecking();
        selectAndBuyPage.finishBuy();
    }

    public void withlowerAndHigherPrice(List<List<String>> dt, int i){
        selectAndBuyPage.buyItem();
        selectAndBuyPage.checkCart();
        selectAndBuyPage.checkout();
        selectAndBuyPage.firstName(dt.get(i).get(0).trim());
        selectAndBuyPage.lastName(dt.get(i).get(1).trim());
        selectAndBuyPage.postalCode(dt.get(i).get(2).trim());
        selectAndBuyPage.continueChecking();
        selectAndBuyPage.finishBuy();
    }
}

package com.swaglabs.definition;

import com.swaglabs.steps.LoginIntoAppStep;
import com.swaglabs.steps.SelectAndBuyTheItemStep;
import com.swaglabs.steps.VerifyOrderStep;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class SwaglabDefinition {

    @Steps
    LoginIntoAppStep loginIntoApp;

    @Steps
    SelectAndBuyTheItemStep selectAndBuyTheItem;

    @Steps
    VerifyOrderStep verifyOrder;

    @Given("^I login into the app with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_login_into_the_app_with_username_and_password(String user, String password) {
        loginIntoApp.WithUserAndPassword(user, password);
    }

    @When("^I select an item from the site and make the buy$")
    public void i_select_an_item_from_the_site_and_make_the_buy(DataTable data) {
        List<List<String>> dt = data.raw();

        for (int i = 1; i < dt.size(); i++) {
            selectAndBuyTheItem.FromTheSite(dt, i);
        }
    }

    @When("^I buy the lower and the higher price items from the site$")
    public void i_buy_the_lower_and_the_higher_price_items(DataTable data) {
        List<List<String>> dt = data.raw();

        for (int i = 1; i < dt.size(); i++) {
            selectAndBuyTheItem.withlowerAndHigherPrice(dt, i);
        }
    }

    @Then("^Verify the message \"([^\"]*)\" after complete the order$")
    public void verify_the_message_after_complete_the_order(String message) {
        verifyOrder.byFinalMessage(message);

    }


}


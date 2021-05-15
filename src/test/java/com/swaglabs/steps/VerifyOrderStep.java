package com.swaglabs.steps;

import com.swaglabs.pageobjects.VerifyOrderPage;

public class VerifyOrderStep {

    VerifyOrderPage verifyOrderPage;

    public void byFinalMessage(String message) {
        verifyOrderPage.verifyMessage(message);
    }
}

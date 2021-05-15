package com.swaglabs;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features ="src/test/resources/features/swaglab.feature", tags = "@Regresion")
public class SwaglabRunner {

}

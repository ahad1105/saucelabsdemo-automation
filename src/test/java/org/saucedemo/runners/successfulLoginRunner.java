package org.saucedemo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/resources/Feature/01Login.feature",
                "src/test/resources/Feature/02HomePage.feature"
        },
        glue = {"org.saucedemo.stepdefinations", "org.saucedemo.hooks"}, // Path to your step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}, // Plugins for reporting
        monochrome = true // Makes console output more readable
)
public class successfulLoginRunner extends AbstractTestNGCucumberTests {
}
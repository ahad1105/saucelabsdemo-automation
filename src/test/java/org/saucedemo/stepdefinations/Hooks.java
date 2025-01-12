package org.saucedemo.stepdefinations;

import io.cucumber.java.*;
import org.saucedemo.base.BaseTest;
import org.testng.annotations.*;

public class Hooks extends BaseTest {

    @BeforeAll
    public static void initializeTest() {
        if (driver == null) {
            initializeDriver();
            System.out.println("Driver initialized in Hooks: " + (driver != null));
        }
    }

    @AfterAll
    public static void tearDownSuite() {
        System.out.println("Tearing down the suite...");
        BaseTest.tearDown(); // Call the tearDown() method after all tests are executed
        System.out.println("Driver quit successfully.");
    }
}





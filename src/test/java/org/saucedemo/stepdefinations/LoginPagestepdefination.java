package org.saucedemo.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.saucedemo.base.BaseTest;
import org.saucedemo.pages.HomePage;

public class LoginPagestepdefination extends BaseTest {

    @Given("user navigates to the login page")
    public void user_navigates_to_the_login_page() {
        System.out.println("Navigating to the login page...");
        loginPage.hitUrl();
    }

    @When("user enters a valid username")
    public void user_enters_valid_username() {
        loginPage.enterUsername("standard_user");
    }

    @And("enters a valid password")
    public void user_enters_valid_password() {
        loginPage.enterPassword("secret_sauce");
    }

    @And("user clicks on login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user successfully navigates to the homepage")
    public void user_enters_homepage() {
        loginPage.isHomePageDisplayed();
    }
}
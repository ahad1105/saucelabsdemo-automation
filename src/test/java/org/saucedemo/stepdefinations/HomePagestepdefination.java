package org.saucedemo.stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.saucedemo.base.BaseTest;
import org.saucedemo.pages.HomePage;

public class HomePagestepdefination extends BaseTest {

    HomePage homePage = new HomePage(driver);

    @When("user clicks on the sorting filter")
    public void userClicksOnTheSortingFilter() {
        homePage.clicksSorting();
    }

    @And("user sorts items from low to high")
    public void userSortsItemsFromLowToHigh() {
        homePage.sortProducts();
    }

    @And("user selects a particular item from the list")
    public void userSelectsAParticularItemFromTheList() {
        homePage.selectProduct();
    }

    @And("user clicks on the add to cart button")
    public void userClicksOnTheAddToCartButton() {
        homePage.addtoCart();
    }

    @Then("user is navigated to the cart")
    public void userIsNavigatedToTheCart() {
        homePage.clickonCart();
    }
}
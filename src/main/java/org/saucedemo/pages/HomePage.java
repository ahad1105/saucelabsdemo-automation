package org.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clicksSorting() {
        getElement("xpath", "//select[@class='product_sort_container']").click();
    }

    public void sortProducts() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

        Select select = new Select(dropdown);
        select.selectByIndex(2);
    }

    public void selectProduct() {
        getElement("xpath", "//div[normalize-space()='Sauce Labs Backpack']").click();
    }

    public void addtoCart() {
        getElement("xpath", "//button[@id='add-to-cart']").click();
    }

    public void clickonCart() {
        getElement("xpath", "//a[@class='shopping_cart_link']").click();
    }

    private WebElement getElement(String locatorType, String locatorValue) {
        switch (locatorType.toLowerCase()) {
            case "xpath":
                return driver.findElement(By.xpath(locatorValue));
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
        }
    }
}

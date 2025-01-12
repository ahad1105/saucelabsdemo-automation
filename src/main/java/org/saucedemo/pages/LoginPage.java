
package org.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Utility Method: Find Element by Locator Type and Value
    public WebElement getElement(String locatorType, String locatorValue) {
        switch (locatorType.toLowerCase()) {
            case "id":
                return driver.findElement(By.id(locatorValue));
            case "name":
                return driver.findElement(By.name(locatorValue));
            case "xpath":
                return driver.findElement(By.xpath(locatorValue));
            case "cssselector":
                return driver.findElement(By.cssSelector(locatorValue));
            case "classname":
                return driver.findElement(By.className(locatorValue));
            case "tagname":
                return driver.findElement(By.tagName(locatorValue));
            case "linktext":
                return driver.findElement(By.linkText(locatorValue));
            case "partiallinktext":
                return driver.findElement(By.partialLinkText(locatorValue));
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
        }
    }

    // Navigate to URL
    public void hitUrl() {
        driver.get("https://www.saucedemo.com/");
    }

    // Enter Username
    public void enterUsername(String username) {
        getElement("xpath", "//input[@id='user-name']").sendKeys(username);
    }

    // Enter Password
    public void enterPassword(String password) {
        getElement("xpath", "//input[@id='password']").sendKeys(password);
    }

    // Click Login Button
    public void clickLoginButton() {
        getElement("xpath", "//input[@id='login-button']").click();
    }

    // Verify Home Page
    public void isHomePageDisplayed() {
        String actualText = getElement("xpath", "//div[@class='app_logo']").getText();
        String expectedText = "Swag Labs";
        Assert.assertEquals(actualText, expectedText, "Homepage text does not match!");
    }
}

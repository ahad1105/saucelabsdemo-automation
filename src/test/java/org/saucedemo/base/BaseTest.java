package org.saucedemo.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.saucedemo.pages.LoginPage;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static LoginPage loginPage;

    public static void initializeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        loginPage = new LoginPage(driver);
    }

    public static void tearDown() {

        if (driver != null) {
            driver.quit();
            driver = null; // Ensure driver is set to null after quitting
            System.out.println("Driver quit successfully.");

        }
    }}

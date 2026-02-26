package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By sortField = By.cssSelector("select.form-select");

    public void sortProduct(String product) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(sortField));
        new Select(dropdown).selectByVisibleText(product);
    }
}

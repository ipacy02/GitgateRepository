package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // locator available
    private By sortField = By.cssSelector("select.form-select");

    // Sort Action
    public void sortProduct(String option) {
        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(sortField));
        new Select(dropdown).selectByVisibleText(option);
    }

    // Get Selected Option
    public String getSelectedSortOption() {
        WebElement dropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(sortField));
        return new Select(dropdown).getFirstSelectedOption().getText();
    }
}

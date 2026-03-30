package com.example;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contact {
    getDriver driver = new getDriver();

    public void waitFor(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    // length >= 10
    public boolean validateMessageLength(String email, String message) {
        WebDriver driver = this.driver.chromWebDriver();
        driver.get("http://localhost:3000");

        WebElement emailBox = driver.findElement(By.id("exampleFormControlInput1"));
        emailBox.sendKeys(email);
        this.waitFor(driver, 1000);

        WebElement messageBox = driver.findElement(By.id("exampleFormControlTextarea1"));
        messageBox.sendKeys(message);
        this.waitFor(driver, 1000);

        WebElement submitButton = driver.findElement(By.className("btn-primary"));
        submitButton.click();
        this.waitFor(driver, 1000);

        // Handle alerts
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();

        if (!alertText.startsWith("Thank you")) {
            return false;
        }
        System.out.println("Alert Text: " + alertText);

        driver.quit();
        return true;
    }
}

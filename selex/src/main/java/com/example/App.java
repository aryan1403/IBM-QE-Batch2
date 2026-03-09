package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    getDriver driver = new getDriver();

    public void waitFor(WebDriver driver, int time) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
    public String getTitle() {
        WebDriver driver = this.driver.chromWebDriver();

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        driver.quit();

        return title;
    }
    public void search() throws InterruptedException {
        WebDriver driver = this.driver.chromWebDriver();

        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("github aryan1403");
        this.waitFor(driver, 2000);

        searchBox.submit();

        String currentUrl = driver.getCurrentUrl().toString();
        this.waitFor(driver, 1000);
        System.out.println("Current URL: " + currentUrl);
        driver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        // WebDriverManager.chromedriver().setup();

        // // Create WebDriver instance
        // WebDriver driver = new ChromeDriver();

        // // Navigate to website
        // driver.get("https://www.google.com");

        // // Print title to verify
        // System.out.println("Page title: " + driver.getTitle());

        // // Close browser
        // driver.quit();

        App app = new App();
        app.search();
    }
}

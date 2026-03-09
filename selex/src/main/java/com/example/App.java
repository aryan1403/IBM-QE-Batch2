package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to website
        driver.get("https://www.google.com");

        // Print title to verify
        System.out.println("Page title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}

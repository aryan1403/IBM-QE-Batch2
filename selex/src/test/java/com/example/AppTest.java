package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    getDriver driver = new getDriver();

    @Test
    public void getText() {
        WebDriver driver = this.driver.chromWebDriver();
        driver.get("http://localhost:3000");

        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println("Result: " + h1.getText());
        driver.quit();
    }
    /**
     * Rigorous Test :-)
     */
    // App app = new App();
    // @Test
    // public void getTitle()
    // {
    //     String title = app.getTitle();
    //     assertEquals("Google", title);
    // }
}

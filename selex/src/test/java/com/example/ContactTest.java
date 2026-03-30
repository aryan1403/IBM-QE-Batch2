package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactTest {
    contact c;
    getDriver driver;
    WebDriver webDriver;

    @BeforeEach
    public void setup() {
        c = new contact();
        driver = new getDriver();
        webDriver = this.driver.chromWebDriver();
    }

    @AfterEach
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    static class creds {
        String email;
        String message;


        creds(String email, String message) {
            this.email = email;
            this.message = message;
        }
    }



    static Stream<creds> provideTestData() {
        return Stream.of(
            new creds("aaryan@gmail.com", "aryan12344567"),
            new creds("arush@gmail.com", "arush1234567"),
            new creds("kirti@gmail.com", "kirti4561234")
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testMethodValidateMessageLength(creds c) {
        webDriver.get("http://localhost:3000");
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement emailBox = webDriver.findElement(By.id("exampleFormControlInput1"));
        emailBox.sendKeys(c.email);
        WebElement messageBox = webDriver.findElement(By.id("exampleFormControlTextarea1"));
        messageBox.sendKeys(c.message);
        WebElement submitButton = webDriver.findElement(By.className("btn-primary"));
        submitButton.click();

        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        assertEquals("Thank you for contacting us! We will get back to you soon.", alertText);
    }

    @ParameterizedTest
    @CsvSource({
        "aaryan@gmail.com, aryan14032006",
        "arush@gmail.com, arush1234567",
        "kirti@gmail.com, kirti4563456"
    })
    public void testValidateMessageLength(String email, String message) {
        webDriver.get("http://localhost:3000");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement emailBox = webDriver.findElement(By.id("exampleFormControlInput1"));
        emailBox.sendKeys(email);

        WebElement messageBox = webDriver.findElement(By.id("exampleFormControlTextarea1"));
        messageBox.sendKeys(message);

        WebElement submitButton = webDriver.findElement(By.className("btn-primary"));
        submitButton.click();

        Alert alert = webDriver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();

        assertEquals("Thank you for contacting us! We will get back to you soon.", alertText);
    }
}
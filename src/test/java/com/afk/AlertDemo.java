package com.afk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo {

    @Test
    public void AlertBox() throws InterruptedException {
        // Initialize the WebDriver for Firefox
        WebDriver driver = new FirefoxDriver();

        // Initialize WebDriverWait with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to the test page
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the button to trigger the alert
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();

        // Wait until the alert is present
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Get the text from the alert and print it
        String text = alert.getText();
        System.out.println(text);

        // Accept the alert (click OK)
        alert.accept();

        // Wait for 2 seconds to observe the result (not generally recommended in production code)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }

    @Test
    public void ConfirmBox() throws InterruptedException {
        // Initialize the WebDriver for Firefox
        WebDriver driver = new FirefoxDriver();

        // Initialize WebDriverWait with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to the test page
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the button to trigger the confirm box
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();

        // Wait until the confirm box is present
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Get the text from the confirm box and print it
        String text2 = alert.getText();
        System.out.println(text2);

        // Accept the confirm box (click OK)
        alert.accept();

        // Wait for 2 seconds to observe the result (not generally recommended in production code)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }

    @Test
    public void PromptBox() throws InterruptedException {
        // Initialize the WebDriver for Firefox
        WebDriver driver = new FirefoxDriver();

        // Initialize WebDriverWait with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to the test page
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the button to trigger the prompt box
        driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();

        // Wait until the prompt box is present
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        // Enter text into the prompt box
        alert.sendKeys("Pramod");

        // Accept the prompt box (click OK)
        alert.accept();

        // Print the result from the page
        System.out.println(driver.findElement(By.id("result")).getText());

        // Wait for 2 seconds to observe the result (not generally recommended in production code)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}

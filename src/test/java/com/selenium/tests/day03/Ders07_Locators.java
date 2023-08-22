package com.selenium.tests.day03;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ders07_Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullname_textbox = driver.findElement(By.id("userName"));
        fullname_textbox.sendKeys("adnan ortaköy");

        WebElement userEmail_textbox = driver.findElement(By.id("userEmail"));
        userEmail_textbox.sendKeys("ortakoyadnan@gmail.com");

        Thread.sleep(10000);

        driver.close();

    }
}

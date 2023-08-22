package com.selenium.tests.day03;

import com.selenium.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Ders07_Locators {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box%22");
        driver.manage().window().maximize();

    }
}

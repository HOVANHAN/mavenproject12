package org.example.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;

public class GoogleTest {


    WebDriver driver;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();  // Tự động setup ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    void testggSearchTitle(){
        driver.get("https://www.google.com");
        String title =driver.getTitle();
        Assertions.assertTrue(title.contains("Google"));
        System.out.println("Title: " + title);
    }

    @AfterEach
    void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }




}

package org.example.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class SeleniumTest {

    @Test
    public void basicSeleniumTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();



        try{
            //navigate
            driver.get("https://the-internet.herokuapp.com/upload");
            //find element160mg7 haan
            WebElement uploadElement = driver.findElement(By.id("file-upload"));

            uploadElement.sendKeys("C:\\Users\\hvhan\\Desktop\\Java\\projectmaven\\Resources\\text.txt");
            driver.findElement(By.id("file-submit")).click();

            //verify uploaded file
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement uploadedFile = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("uploaded-files"))
            );
            String uploaded = uploadedFile.getText();
            assert uploaded.equals("text.txt");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
//            driver.quit();
        }


    }
}

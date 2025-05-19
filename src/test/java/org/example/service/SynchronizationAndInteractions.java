package org.example.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SynchronizationAndInteractions {
    @Disabled
    @Test
    public  void TestWithImplicitWait(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
    }

    @Disabled
    @Test
    public void TestExplicitWait(){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds max wait 160mg7

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //wait until the element appear
        WebElement removeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Remove']")));

        removeButton.click(); // Click the button when it's visible

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        System.out.println("Message: " + message.getText());  // Wait for the text to appear javacore/junit/selenium

    }

    @Test
    public void TestFluentWait(){
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement dynamicButton = wait.until(drivers -> drivers.findElement(By.id("dynamicElement")));
        dynamicButton.click();  // Click the button after it's found

       // driver.quit();


    }

}
//best pratice:
//| Tình huống                  | Cách xử lý đề xuất                         |
//        | --------------------------- | ------------------------------------------ |
//        | Load page                   | `wait.until(ExpectedConditions.titleIs())` |
//        | Element xuất hiện           | `visibilityOfElementLocated()`             |
//        | Element sẵn sàng click      | `elementToBeClickable()`                   |
//        | Load bảng/ kết quả tìm kiếm | `presenceOfAllElementsLocatedBy()`         |
//        | Chờ spinner biến mất        | `invisibilityOfElementLocated()`           |
//        | Chờ text thay đổi           | `textToBePresentInElement()`               |
//        | Chuyển alert                | `alertIsPresent()`                         |
// dùng để xử lí tương tac : bus

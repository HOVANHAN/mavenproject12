package org.example.service;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Automatically manage the driver version with WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Set up Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Headless mode
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920x1080");

        // Create the WebDriver instance with the options
        driver = new ChromeDriver(options);
    }

    @Test
    public void testHeadlessBrowser() {
        driver.get("https://www.example.com");
        System.out.println("Title of the page: " + driver.getTitle());
        Assertions.assertEquals("Example Domain", driver.getTitle());
    }

    @AfterEach
    public void tearDown() {
        // Quit the driver after the test
        if (driver != null) {
            driver.quit();
        }
    }
}

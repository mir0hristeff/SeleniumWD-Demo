package framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseTest {
    protected Logger LOGGER = LogManager.getRootLogger();
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    public void startUp(){

        //Initialize the ChromeDriver
        driver = WebDriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //Explicit wait - This will wait until a condition is met or reaching the timeout

        //Make it full screen
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown()
    {
        //tearDown()
        WebDriverManager.closeDriver();
    }
}

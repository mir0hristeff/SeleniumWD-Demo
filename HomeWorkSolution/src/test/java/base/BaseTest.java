package base;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    protected static WebDriver startChrome() {
        return new ChromeDriver();
    }
}

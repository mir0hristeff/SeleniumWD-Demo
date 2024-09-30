package bingsearchtests;

import com.google.GoogleCookieConsentPage;
import com.google.GoogleResultsPage;
import com.google.GoogleSearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseBingTest {
    Logger LOGGER = LogManager.getRootLogger();
    WebDriver driver;
    WebDriverWait wait;
    GoogleCookieConsentPage consentPage;
    GoogleSearchPage searchPage;
    GoogleResultsPage resultsPage;

    @BeforeEach
    public void startUp(){
        LOGGER.info("Initializing the webdriver");

        //Initialize the ChromeDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //Explicit wait - This will wait until a condition is met or reaching the timeout

        //Initialization of the PageObject
        consentPage = new GoogleCookieConsentPage(driver);
        searchPage = new GoogleSearchPage(driver);
        resultsPage = new GoogleResultsPage(driver);

        //Make it full screen
        driver.manage().window().maximize();
        // navigate
        searchPage.navigate();

        //Accept Terms
        consentPage.acceptTerms();
    }

    @AfterEach
    public void tearDown()
    {
        //tearDown()
        LOGGER.info("closing the webdriver");
        driver.close();
    }
}

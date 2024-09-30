package framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    private static WebDriver driver;
    private static Logger LOGGER = LogManager.getRootLogger();

    public static WebDriver getDriver(){
        //SINGLETON
        if(driver == null) {
            LOGGER.info("Initializing the webdriver");
            driver = setupDriver(BrowserTypes.CHROME);
        }

        return driver;
    }

    public static WebDriver setupDriver(BrowserTypes browserType){
        switch (browserType){
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            case EDGE:
                return new EdgeDriver();
        }

        return driver;
    }

    public static void closeDriver(){
        LOGGER.info("closing the webdriver");;
        driver.close();
    }
}

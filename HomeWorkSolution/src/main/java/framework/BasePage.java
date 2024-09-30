package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected final WebDriver webDriver;
    protected final WebDriverWait webDriverWait;
    protected final String baseUrl;
    private final String pageUrl;

    //A constructor
    public BasePage(String baseUrl, String pagePath){

        this.webDriver = WebDriverManager.getDriver();
        this.webDriverWait = new WebDriverWait(this.webDriver, Duration.ofSeconds(20));
        this.baseUrl = baseUrl;
        this.pageUrl = pagePath;
    }

    public String getUrl(){
        return baseUrl + pageUrl;
    }

    public void navigate(){
        webDriver.get(baseUrl + pageUrl);
    }
}

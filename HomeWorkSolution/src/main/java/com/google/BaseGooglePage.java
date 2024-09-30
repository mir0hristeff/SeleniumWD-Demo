package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseGooglePage {

    protected final WebDriver webDriver;
    protected final WebDriverWait webDriverWait;
    protected final String baseUrl = "https://google.com";
    private final String pageUrl;

    //A constructor
    public BaseGooglePage(WebDriver driver, String pagePath){

        webDriver = driver;
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        pageUrl = pagePath;
    }

    public String getUrl(){
        return baseUrl + pageUrl;
    }

    public void navigate(){
        webDriver.get(baseUrl + pageUrl);
    }
}

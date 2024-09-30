package com.google;

import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseGooglePage extends BasePage {

    protected final WebDriverWait webDriverWait;

    //A constructor
    public BaseGooglePage(WebDriver driver, String pagePath){
        super(driver, "https://google.com", pagePath);

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
}

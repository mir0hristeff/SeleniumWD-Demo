package com.google;

import framework.BasePage;
import framework.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseGooglePage extends BasePage {

    protected final WebDriverWait webDriverWait;

    //A constructor
    public BaseGooglePage(String pagePath){
        super("https://google.com", pagePath);

        webDriverWait = new WebDriverWait(WebDriverManager.getDriver(), Duration.ofSeconds(20));
    }
}

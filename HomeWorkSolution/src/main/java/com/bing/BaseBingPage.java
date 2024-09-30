package com.bing;

import framework.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseBingPage extends BasePage {

    //A constructor
    public BaseBingPage(WebDriver driver, String pagePath){
        super(driver, "https://bing.com", pagePath);


    }
}

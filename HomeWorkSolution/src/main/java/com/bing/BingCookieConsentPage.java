package com.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingCookieConsentPage extends BaseBingPage {

    //Locators
    private final By acceptCookieBtnLocator = By.id("changeMe");

    public BingCookieConsentPage() {
        super("");
    }

    //A method to accept the cookie terms
    public void acceptTerms(){
        //Accept cookies
        WebElement acceptCookieBtn = webDriver.findElement(acceptCookieBtnLocator);
        acceptCookieBtn.click();
    }
}

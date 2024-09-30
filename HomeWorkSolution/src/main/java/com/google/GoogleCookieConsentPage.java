package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleCookieConsentPage extends BaseGooglePage{

    //Locators
    private final By acceptCookieBtnLocator = By.id("L2AGLb");

    public GoogleCookieConsentPage(WebDriver driver) {
        super(driver, "");
    }

    //A method to accept the cookie terms
    public void acceptTerms(){
        //Accept cookies
        WebElement acceptCookieBtn = webDriver.findElement(acceptCookieBtnLocator);
        acceptCookieBtn.click();
    }
}

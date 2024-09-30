package com.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BingSearchPage extends BaseBingPage {

    private final By searchFieldLocator = By.name("changeMe");

    public BingSearchPage(WebDriver driver) {
        super(driver, "");
    }

    public void searchTerm(String term){
        WebElement searchField = webDriver.findElement(searchFieldLocator);
        searchField.sendKeys(term);
        searchField.sendKeys(Keys.ENTER);
    }
}

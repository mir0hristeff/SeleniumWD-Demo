package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends BaseGooglePage{

    private final By searchFieldLocator = By.name("q");

    public GoogleSearchPage() {
        super("");
    }

    public void searchTerm(String term){
        WebElement searchField = webDriver.findElement(searchFieldLocator);
        searchField.sendKeys(term);
        searchField.sendKeys(Keys.ENTER);
    }
}

package com.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BingResultsPage extends BaseBingPage {

    private final By resultListLocator = By.xpath("changeME");

    public BingResultsPage(WebDriver driver) {
        super(driver, "/search");
    }

    public List<WebElement> getResults(){

       webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(resultListLocator));

        return webDriver.findElements(resultListLocator);
    }
}

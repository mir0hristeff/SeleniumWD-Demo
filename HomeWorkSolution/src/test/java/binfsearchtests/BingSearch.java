package binfsearchtests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BingSearch extends BaseTest {

    @BeforeAll
    //This will run before all tests
    public static void browserSetup() {

        //Base class fields
        driver = startChrome();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @Test
    public void searchByTermBing() {

        //Navigate
        driver.get("https://bing.com");

        //Accept - да спомена за visibilityOf(елемент) § presenceOfElementLocated(локатор)
        //WebElement acceptBtn = driver.findElement(By.id("bnp_btn_accept"));
        //wait.until(ExpectedConditions.visibilityOf(acceptBtn));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bnp_btn_accept")));
        WebElement acceptBtn = driver.findElement(By.id("bnp_btn_accept"));
        acceptBtn.click();

        //Type Term to search in input
        WebElement input = driver.findElement(By.name("q"));
        wait.until(ExpectedConditions.visibilityOf(input));
        input.sendKeys("Telerik Academy Alpha");
        input.sendKeys(Keys.ENTER);

        //Assert
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("b_tween_searchResults")));

        List<WebElement> resultList = driver.findElements(By.xpath("//*[@id='b_results']/li[1]//a"));
        WebElement firstResult = resultList.get(1);
        String actualResult = firstResult.getText();

        Assertions.assertEquals("IT Career Start in 6 Months - Telerik Academy Alpha", actualResult, "Telerik was not the first result, The first is: " + actualResult );
    }
}

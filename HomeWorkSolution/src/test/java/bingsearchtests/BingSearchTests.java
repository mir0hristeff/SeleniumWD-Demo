package bingsearchtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BingSearchTests extends BaseBingTest {

    @Test
    public void searchByTermOptimized() {
        searchPage.searchTerm("Telerik academy Alpha");

        var actualResult = resultsPage.getResults().get(0).getText();
        Assertions.assertEquals("IT Career Start in 6 Months - Telerik Academy Alpha", actualResult);
    }

    @Test
    public void searchByTermOptimized_2() {
        searchPage.searchTerm("Telerik academy Alpha");

        var actualResult = resultsPage.getResults().get(0).getText();
        Assertions.assertEquals("IT Career Start in 6 Months - Telerik Academy Alpha", actualResult);
    }
}

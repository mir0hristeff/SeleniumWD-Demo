package googlesearchtests;

import org.junit.jupiter.api.*;

public class GoogleSearchTests extends BaseGoogleTest{

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

package bingsearchtests;

import com.google.GoogleCookieConsentPage;
import com.google.GoogleResultsPage;
import com.google.GoogleSearchPage;
import framework.BaseTest;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseBingTest extends BaseTest {
    GoogleCookieConsentPage consentPage;
    GoogleSearchPage searchPage;
    GoogleResultsPage resultsPage;

    @BeforeEach
    public void startUp(){
        super.startUp();
        //Initialization of the PageObject
        consentPage = new GoogleCookieConsentPage();
        searchPage = new GoogleSearchPage();
        resultsPage = new GoogleResultsPage();

        // navigate
        searchPage.navigate();

        //Accept Terms
        consentPage.acceptTerms();
    }
}

package googlesearchtests;

import com.google.GoogleCookieConsentPage;
import com.google.GoogleResultsPage;
import com.google.GoogleSearchPage;
import framework.BaseTest;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseGoogleTest extends BaseTest {
    GoogleCookieConsentPage consentPage;
    GoogleSearchPage searchPage;
    GoogleResultsPage resultsPage;

    @BeforeEach
    public void startUp(){
        super.startUp();

        //Initialization of the PageObject
        consentPage = new GoogleCookieConsentPage(driver);
        searchPage = new GoogleSearchPage(driver);
        resultsPage = new GoogleResultsPage(driver);

        //Make it full screen
        //Go to the BaseURL
        searchPage.navigate();

        //Accept Terms
        consentPage.acceptTerms();
    }
}

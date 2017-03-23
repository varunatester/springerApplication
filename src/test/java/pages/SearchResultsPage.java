package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;


public class SearchResultsPage {

    WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "number-of-search-results-and-search-terms")
    private WebElement searchResultHeader;


    public void verifySearchResultsAreDisplayedFor(String searchMessage) throws InterruptedException {
        assertTrue(searchResultHeader.getText().contains(searchMessage));
    }
}

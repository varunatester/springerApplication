package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    SearchResultsPage searchResultsPage;

    @FindBy(id = "query")
    private WebElement searchInput;

    @FindBy(id = "search")
    private WebElement searchSubmit;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultsPage searchForKeyword(String s) throws InterruptedException {
        searchInput.sendKeys(s);
        searchResultsPage = this.searchForTheJourney();
        searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        return searchResultsPage;
    }

    public SearchResultsPage searchForTheJourney() {
        searchSubmit.click();
        return new SearchResultsPage(driver);
    }

}




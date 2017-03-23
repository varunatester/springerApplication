package tests;


import org.testng.annotations.Test;
import pages.SearchResultsPage;
import utils.Categories;
import utils.SearchTestData;


public class SearchTests extends BaseTest {

    SearchResultsPage searchResultsPage;

    @Test(groups = {Categories.SANITY}, dataProviderClass = SearchTestData.class, dataProvider = "searchTestData")
    public void verifySearchResultsAreDisplayedForSearchKeyword(String searchKeyword,String searchMessage) throws InterruptedException {
        searchResultsPage = homePage.searchForKeyword(searchKeyword);
        searchResultsPage.verifySearchResultsAreDisplayedFor(searchMessage);
    }
}

package utils;

import org.testng.annotations.DataProvider;

public class SearchTestData {

    @DataProvider
    public static Object[][] searchTestData() {
        return new Object[][]{
                {"Environmental Management","Result(s) for "+ "'" +"Environmental Management"+ "'"},
                {"searchRandom","Result(s) for "+ "'" +"searchRandom"+ "'"}
        };
    }
}

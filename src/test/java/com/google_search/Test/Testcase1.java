package com.google_search.Test;
import com.google_search.Pages.SearchListing;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import com.google_search.Base.BaseClass;
import com.google_search.Constants.Constants;
import com.google_search.Pages.HomePage;
import org.testng.Assert;

public class Testcase1 extends BaseClass {
    HomePage homepage;
    SearchListing SL;

    @Test(description = "Testing for the testcase1")
    public void searchGoogle() throws Exception {
        driver.get(Constants.baseUrl);
        homepage = new HomePage(driver);
        homepage.searchData("Automation Testing");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "Automation Testing - Google Search");
        SL = new SearchListing(driver);
        SL.SearchResult();
        Thread.sleep(2000);


    }


}

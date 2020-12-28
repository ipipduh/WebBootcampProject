package com.nprtest;

import com.npr.pages.HomePage;
import com.npr.pages.SearchPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageValidations extends TestBase {

    private HomePage homePage;
    private SearchPage searchPage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        searchPage = PageFactory.initElements(driver, SearchPage.class);


    }
    @Test(enabled = false)
    public void validateUserCanSearchForNews() {
        homePage.userCanClickOnSearchBar();
        searchPage.validateSearchPage();
        searchPage.userCanSearchNews();
        searchPage.validateSearchResults();
    }
}

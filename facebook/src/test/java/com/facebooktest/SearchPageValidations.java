package com.facebooktest;

import com.facebook.pages.HomePage;
import com.facebook.pages.SearchPage;
import com.facebook.pages.UserHomePage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageValidations extends TestBase {

    private HomePage homePage;
    private UserHomePage userHomePage;
    private SearchPage searchPage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        homePage.loginToFacebook();
    }

    @Test(enabled = false)
    public void validateUserCanSearchForAFriend(){
        userHomePage.searchForAFriend();
        searchPage.validateSearchPage();
    }

    @Test(enabled = false)
    public void validateUserCanSendAFriendRequest() {
        userHomePage.searchAndAddFriend();
        searchPage.validateSearchResults();
        searchPage.sendFriendRequest();
    }
}

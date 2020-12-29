package com.facebooktest;

import com.facebook.pages.HomePage;
import com.facebook.pages.UserHomePage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserHomePageValidations extends TestBase {

    private HomePage homePage;
    private UserHomePage userHomePage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        homePage.loginToFacebook();
    }

    @Test(enabled = false)
    public void validateUserCanSearchForAFriend(){
        userHomePage.searchForAFriend();
    }

    @Test(enabled = false)
    public void validateUserCanCreateAFacebookPost() {
        userHomePage.createAFBPost();
        userHomePage.validateFacebookPost();
    }

    @Test(enabled = false)
    public void validateUserCanLikeAPost() {
        userHomePage.userClicksTheLikeButton();
        userHomePage.validateFacebookLike();
    }

    @Test(enabled = false)
    public void validateUserCanPostAComment() {
        userHomePage.userCreatesAComment();
        userHomePage.validateFacebookComment();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToEventsPage() {
        userHomePage.userCanNavigateToEventsPage();
        userHomePage.validateEventLinkNaviation();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToGroupsPage() {
        userHomePage.userCanNavigateToGroupsPage();
        userHomePage.validateGroupsLinkNaviation();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToJobsPage() {
        userHomePage.userCanNavigateToJobsPage();
        userHomePage.validateJobsLinkNaviation();
    }
}

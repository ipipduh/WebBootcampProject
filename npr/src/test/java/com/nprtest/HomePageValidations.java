package com.nprtest;

import com.npr.pages.HomePage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(enabled = false)
    public void validateNprHomePageLink(){
        homePage.validateNprHomePage();
    }

    @Test(enabled = false)
    public void validateUserCanSignIn() {
        homePage.userClicksSignInButton();
    }

    @Test(enabled = false)
    public void validateHomePageArticleAccess() {
        homePage.userArticleAccess();
        homePage.validateLogoOnArticlePage();
    }

    @Test(enabled = false)
    public void validateUserCanHoverAndSelectFromDropdown() {
        homePage.hoverOverNews();
        homePage.selectFromDropdown();
        homePage.validateNationalPage();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateBackToHomePage() {
        homePage.hoverOverNews();
        homePage.selectFromDropdown();
        homePage.validateNationalPage();
        homePage.userCanNavigateBack();
        homePage.validateNprHomePage();
    }
}

package com.nprtest;

import com.npr.pages.HomePage;
import com.npr.pages.SignInPage;
import com.npr.pages.UserHomePage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserHomePageValidations extends TestBase {

    private SignInPage signInPage;
    private HomePage homePage;
    private UserHomePage userHomePage;

    @BeforeMethod
    public void pageFactorySetup(){
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        userHomePage = PageFactory.initElements(driver, UserHomePage.class);
    }


    @Test(enabled = false)
    public void validateNprUserHomePage(){
        homePage.userClicksSignInButton();
        signInPage.validateSignInPage();
        sleepFor(5);
        signInPage.userEntersValidInformation();
        sleepFor(5);
        userHomePage.validateUserPageDisplays();
    }

    @Test(enabled = false)
    public void validateUserCanSignOutOfAccount() {
        validateNprUserHomePage();
        userHomePage.userClicksSignOutButton();
    }
}

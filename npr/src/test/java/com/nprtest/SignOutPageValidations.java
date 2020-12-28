package com.nprtest;

import com.npr.pages.HomePage;
import com.npr.pages.SignInPage;
import com.npr.pages.SignOutPage;
import com.npr.pages.UserHomePage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignOutPageValidations extends TestBase {

    private SignInPage signInPage;
    private HomePage homePage;
    private UserHomePage userHomePage;
    private SignOutPage signOutPage;

    @BeforeMethod
    public void pageFactorySetup(){
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        signOutPage = PageFactory.initElements(driver, SignOutPage.class);
    }


    @Test(enabled = false)
    public void validateSignOutPage(){
        homePage.userClicksSignInButton();
        signInPage.validateSignInPage();
        signInPage.userEntersValidInformation();
        userHomePage.validateUserPageDisplays();
        signOutPage.validateSignOutLogo();
    }
}

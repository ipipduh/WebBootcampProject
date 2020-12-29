package com.facebooktest;

import com.facebook.pages.HomePage;
import com.facebook.pages.UserHomePage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;
    private UserHomePage userHomePage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        homePage.loginToFacebook();
    }

    @Test(enabled = false)
    public void validateFacebookHomePageLink(){
        homePage.validateFacebookHomePage();
    }
}

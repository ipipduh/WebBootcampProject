package com.nprtest;

import com.npr.pages.HomePage;
import com.npr.pages.SignInPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageValidations extends TestBase {

    private SignInPage signInPage;
    private HomePage homePage;

    @BeforeMethod
    public void pageFactorySetup(){
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(enabled = false)
    public void validateNprHomePageLink(){
        homePage.userClicksSignInButton();
        signInPage.validateSignInPage();
    }

    @Test(enabled = false)
    public void validateUserCanEnterValidInformationOnSignInPageAndLogin() {
        homePage.userClicksSignInButton();
        signInPage.validateSignInPage();
        signInPage.userEntersValidInformation();
    }
}

package com.cignatest;

import com.cigna.pages.HomePage;
import com.cigna.pages.SignInPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInValidations extends TestBase {

    private HomePage homePage;
    private SignInPage signInPage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }


    @Test(enabled = false)
    public void validateUserCannotSignInWithInvalidCredentials(){
        homePage.userClicksOnSignInButton();
        signInPage.validateFirstCignaLoginPage();
        signInPage.userClicksLoginButtonOnFirstLoginPage();
        signInPage.validateSecondLoginPage();
        signInPage.userEntersInvalidInformationAndClicksLogIn();
        signInPage.validateErrorMessage();
    }

    // did not do a logout test since i was unable to create an account to begin with
}

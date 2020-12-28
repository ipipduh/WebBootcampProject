package com.amazontest;

import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.amazon.pages.SignOutPage;

public class SignOutPageValidations extends TestBase {


    @Test(enabled = false)
    public void validateUserCanSearchForAnItem() {
        LoginPageValidations loginPageValidations = PageFactory.initElements(driver, LoginPageValidations.class);
        loginPageValidations.validateUserCanLogInWithValidCredentials();
       SignOutPage signOutPage = PageFactory.initElements(driver, SignOutPage.class);
       signOutPage.hoverOverAccountAndLists();
       signOutPage.userSignsOutOfAccount();
       signOutPage.validateSignOut();
    }

}

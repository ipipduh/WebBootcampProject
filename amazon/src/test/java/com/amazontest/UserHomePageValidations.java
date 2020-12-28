package com.amazontest;

import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.pages.UserHomePage;

public class UserHomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateTheLoginPage(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverHelloSignInOnHomePage();
        homePage.clickOnSignInButton();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userEntersValidLoginCredentialsAndLogsIn();
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        userHomePage.validateWelcomeMessage();
    }

    @Test(enabled = false)
    public void validateUserCanSearchForAnItem() {
        validateTheLoginPage();
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        userHomePage.userSearchesForItem();
    }


}

package com.amazontest;

import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateHomePageLink(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateHomePage();
    }

    @Test(enabled = false)
    public void validateHoverOverHelloSignIn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverHelloSignInOnHomePage();
    }

    @Test(enabled = false)
    public void validateUserCanHoverAndClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverHelloSignInOnHomePage();
        homePage.clickOnSignInButton();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.validateAmazonLoginPageLogo();
    }

    @Test(enabled = false)
    public void validateUserCanScrollAndClickOnElement() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollAndClickOnElement();
    }



}

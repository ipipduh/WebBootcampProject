package com.citibanktest;

import com.citibank.pages.HomePage;
import com.citibank.pages.RegisterPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageValidations extends TestBase {

    private HomePage homePage;
    private RegisterPage registerPage;


    @BeforeMethod
    public void pageFactorySetup(){
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(enabled = false)
    public void validateCignaHomePageLink(){
        registerPage.validateCitibankRegisterPage();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToRegisterPage() {
        homePage.userClicksRegisterLink();
        registerPage.validateCitibankRegisterPage();
    }

    @Test(enabled = false)
    public void validateUserCannotRegisterWithInvalidCredentials() {
        validateUserCanNavigateToRegisterPage();
        registerPage.userEntersInvalidCreditCardInformation();
        sleepFor(2);
        registerPage.validateErrorMessage();
        sleepFor(2);
    }
}

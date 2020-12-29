package com.citibanktest;

import com.citibank.pages.HomePage;
import com.citibank.pages.SavingsPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SavingsPageValidations extends TestBase {

    private HomePage homePage;
    private SavingsPage savingsPage;


    @BeforeMethod
    public void pageFactorySetup(){
        savingsPage = PageFactory.initElements(driver, SavingsPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(enabled = false)
    public void validateUserCanViewCreditCardDetails(){
        homePage.navigateToSavingsPage();
        homePage.userEntersZipcodeAndSubmits();
        savingsPage.validateSavingsPage();
        savingsPage.viewCreditCardTermDetails();
        savingsPage.validateCreditCardDetailsNavigation();
    }

    @Test(enabled = false)
    public void validateUserCanClickToApplyForACreditCard() {
        homePage.navigateToSavingsPage();
        homePage.userEntersZipcodeAndSubmits();
        savingsPage.validateSavingsPage();
        savingsPage.scrollToApplyAndClick();
        savingsPage.validateApplyPage();
    }

    @Test(enabled = false)
    public void validateUserCanClickLearnMore() {
        homePage.navigateToSavingsPage();
        homePage.userEntersZipcodeAndSubmits();
        savingsPage.validateSavingsPage();
        savingsPage.userCanAccessLearnMoreButton();
    }
}

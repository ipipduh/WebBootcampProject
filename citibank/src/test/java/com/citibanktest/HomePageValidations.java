package com.citibanktest;

import com.citibank.pages.HomePage;
import com.citibank.pages.SavingsPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;
    private SavingsPage savingsPage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        savingsPage = PageFactory.initElements(driver, SavingsPage.class);
    }


    @Test(enabled = false)
    public void validateCignaHomePageLink(){
        homePage.validateCitibankHomePage();
    }

    @Test(enabled = false)
    public void validateUserCanAccessWealthManagementTeamPage() {
        homePage.findAWealthTeam();
        homePage.validateWealthTeamNavigation();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToSavingsPageAndClosePopup() {
        homePage.navigateToSavingsPage();
        homePage.handlePopUp();
        sleepFor(2);
        homePage.validateCitibankHomePage();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToSavingsPageAndAddZipcode() {
        homePage.navigateToSavingsPage();
        homePage.userEntersZipcodeAndSubmits();
        savingsPage.validateSavingsPage();
    }


}

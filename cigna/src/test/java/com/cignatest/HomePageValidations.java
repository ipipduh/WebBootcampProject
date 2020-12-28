package com.cignatest;

import com.cigna.pages.HomePage;
import com.cigna.pages.MemberResourcesPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;
    private MemberResourcesPage memberResourcesPage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        memberResourcesPage = PageFactory.initElements(driver, MemberResourcesPage.class);
    }


    @Test(enabled = false)
    public void validateCignaHomePageLink(){
        homePage.validateCignaHomePage();
    }

    @Test(enabled = false)
    public void validateScrollToElement() {
        homePage.scrollToElement();
    }

    @Test(enabled = false)
    public void validateHoverAndClickOnElement() {
        homePage.hoverAndClickOnElement();
        homePage.validateLeadershipPageNavigation();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToMemberResourcesPage() {
        homePage.hoverOverDropDownAndSelect();
        homePage.clickOnOverviewLink();
        sleepFor(4);
        memberResourcesPage.validateOverviewPage();
        sleepFor(4);
    }
}

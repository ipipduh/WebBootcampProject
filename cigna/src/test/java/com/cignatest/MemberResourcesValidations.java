package com.cignatest;

import com.cigna.pages.HomePage;
import com.cigna.pages.MedicarePage;
import com.cigna.pages.MemberResourcesPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MemberResourcesValidations extends TestBase {

    private MemberResourcesPage memberResourcesPage;
    private HomePage homePage;
    private MedicarePage medicarePage;

    @BeforeMethod
    public void pageFactorySetup(){
        memberResourcesPage = PageFactory.initElements(driver, MemberResourcesPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        medicarePage = PageFactory.initElements(driver, MedicarePage.class);
    }


    @Test(enabled = false)
    public void validateCignaOverviewPage() {
        memberResourcesPage.validateOverviewPage();
    }

    @Test(enabled = false)
    public void validateUserCanNavigateToAnotherDropDownPage() {
        homePage.hoverOverDropDownAndSelect();
        memberResourcesPage.userSelectsFromDropdown();
        memberResourcesPage.hoverAndSelectFromMedicareDropdown();
        medicarePage.validateMedicarePage();
    }
}

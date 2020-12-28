package com.cignatest;

import com.cigna.pages.MedicarePage;
import com.cigna.pages.MemberResourcesPage;
import com.peoplentech.webbootcampprojec.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MedicarePageValidations extends TestBase {

    private MedicarePage medicarePage;
    private MemberResourcesPage memberResourcesPage;

    @BeforeMethod
    public void pageFactorySetup(){
        medicarePage = PageFactory.initElements(driver, MedicarePage.class);
        memberResourcesPage = PageFactory.initElements(driver, MemberResourcesPage.class);
    }


    @Test(enabled = false)
    public void validateMedicarePage() {
        medicarePage.validateMedicarePage();
    }

    @Test(enabled = false)
    public void validateUserCanScrollToText() {
        memberResourcesPage.hoverAndSelectFromMedicareDropdown();
        medicarePage.scrollToText();
    }

    @Test(enabled = false)
    public void validateUserCanSearchPlansByZipcode() {
        memberResourcesPage.hoverAndSelectFromMedicareDropdown();
        medicarePage.userCanEnterZipcodeIntoFieldAndSearch();
        medicarePage.validateLogoOnSearchResults();
    }
}

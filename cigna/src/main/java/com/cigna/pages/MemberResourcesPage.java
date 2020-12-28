package com.cigna.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MemberResourcesPage extends TestBase {

    @FindBy(xpath = "//button[@id='plans-services-1-tab']")
    private WebElement productsAndServices;

    @FindBy(xpath = "(//a[contains(text(),'Health Insurance for Individuals and Families')])[1]")
    private WebElement healthInsForFams;

    @FindBy(xpath = "//a[@id='medicare-level-one-link']")
    private WebElement hoverMedicare;

    @FindBy(xpath = "//button[@id='enrollment-and-eligibility-tab']")
    private WebElement eligibilityLink;

    @FindBy(xpath = "//a[contains(text(),'Medicare Advantage Enrollment and Eligibility')]")
    private WebElement advantageLink;



    public void validateOverviewPage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/individuals-families/plans-services/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Cigna overview page URL has been validated");
    }

    public void userSelectsFromDropdown() {
        productsAndServices.click();
        ExtentTestManager.log("User clicks on Products and Services");
        healthInsForFams.click();
        ExtentTestManager.log("User clicks on Health Insurance for Families and Individuals");
    }

    public void hoverAndSelectFromMedicareDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverMedicare).build().perform();
        ExtentTestManager.log("User hovers over Medicare dropdown");
        sleepFor(2);
        eligibilityLink.click();
        ExtentTestManager.log("User clicks Enrollment and Eligibility Link");
        advantageLink.click();
        ExtentTestManager.log("User clicks Advantage Medicare Link");
        sleepFor(4);
    }


}

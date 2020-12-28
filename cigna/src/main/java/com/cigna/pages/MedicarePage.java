package com.cigna.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MedicarePage extends TestBase {


    @FindBy(xpath = "//a[contains(text(),'Medicare Advantage Enrollment and Eligibility')]")
    private WebElement scrollElement;

    @FindBy(xpath = "//input[@id='zip-314']")
    private WebElement zipcodeField;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary btn-micro planfinder-submit'])[1]")
    private WebElement shopPlanBtn;

    @FindBy(xpath = "//img[@class='header-primary-logo']")
    private WebElement logoSrchRslt;

    @FindBy(xpath = "(//span[contains(text(),'Login')])[3]")
    private WebElement verifySrchRslt;



    public void validateMedicarePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/medicare/enrollment-and-eligibility/medicare-advantage";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Cigna medicare URL has been validated");
    }

    public void scrollToText() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
        ExtentTestManager.log("User scrolls to text");
        sleepFor(4);
    }

    public void userCanEnterZipcodeIntoFieldAndSearch() {
        zipcodeField.click();
        ExtentTestManager.log("User clicks on zipcode field");
        zipcodeField.sendKeys("02476");
        ExtentTestManager.log("User enters zipcode in zipcode field");
        shopPlanBtn.click();
        ExtentTestManager.log("User clicks the shop for plans button");
    }

    public void validateLogoOnSearchResults() {
        Assert.assertTrue(verifySrchRslt.isDisplayed());
        ExtentTestManager.log("Test is displayed on search results page");
    }
}

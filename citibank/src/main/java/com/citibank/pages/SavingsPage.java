package com.citibank.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SavingsPage {

    @FindBy(xpath = "//h1[contains(text(),'Savings accounts')]")
    private WebElement savingsPageValidation;

    @FindBy(xpath = "(//strong[contains(text(),'See Details')])[7]")
    private WebElement seeCCDetails;

    @FindBy(xpath = "(//a[@id='applyonline_d1'])[2]")
    private WebElement applyButton;

    @FindBy(xpath = "//button[contains(text(),'Learn More')]")
    private WebElement learnMoreBtn;

    @FindBy(xpath = "//a[contains(text(),'Cancel')]")
    private WebElement cancelBtn;

    @FindBy(xpath = "//input[@class='submit']")
    private WebElement popUpVer;



    public void validateSavingsPage() {
        Assert.assertTrue(savingsPageValidation.isDisplayed());
        ExtentTestManager.log("Text is displayed on Savings page");
    }

    public void viewCreditCardTermDetails() {
        seeCCDetails.click();
        ExtentTestManager.log("User clicks See Details for credit card");
    }

    public void validateCreditCardDetailsNavigation() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/ag/banking/citi-accelerate-savings";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Citibank credit card details URL has been validated");
    }

    public void scrollToApplyAndClick() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", applyButton);
        ExtentTestManager.log("The page scrolled down to the Apply button");
        applyButton.click();
        ExtentTestManager.log("User clicks on apply");
    }

    public void validateApplyPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/ag/open-a-bank-account/checking-saving";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Citibank application URL has been validated");
    }

    public void userCanAccessLearnMoreButton() {
        learnMoreBtn.click();
        ExtentTestManager.log("User clicks Learn More Button");
        cancelBtn.click();
        ExtentTestManager.log("User clicks cancel button");
    }

    public void validateLearnMorePopUp() {
        Assert.assertTrue(popUpVer.isDisplayed());
        ExtentTestManager.log("Text is displayed on popup page");
    }
}

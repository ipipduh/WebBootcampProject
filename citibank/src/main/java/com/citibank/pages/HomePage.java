package com.citibank.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@id='register_acc']")
    private WebElement registerLink;

    @FindBy(xpath = "//a[@id='citigoldli']")
    private WebElement hoverWM;

    @FindBy(xpath = "//a[@id='wm_retationmanager']")
    private WebElement findTeamLink;

    @FindBy(xpath = "//header/div[@id='site-logo']/div[1]/a[1]/img[1]")
    private WebElement teamPgValidation;

    @FindBy(xpath = "//a[@id='banking']")
    private WebElement bankingLink;

    @FindBy(xpath = "//a[@id='savingsBanking_Link']")
    private WebElement savingsLink;

    @FindBy(xpath = "(//button[@aria-label='Close'])[12]")
    private WebElement xPopUp;

    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipcodeInput;

    @FindBy(xpath = "//button[@class='btn btn-primary update-zipcode']")
    private WebElement submitZip;





    public void validateCitibankHomePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/login.do";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Citibank homepage URL has been validated");
    }

    public void userClicksRegisterLink() {
        registerLink.click();
        ExtentTestManager.log("User clicks register button");
        sleepFor(4);
    }

    public void findAWealthTeam() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverWM).build().perform();
        ExtentTestManager.log("User hovers over Wealth Management");
        findTeamLink.click();
        ExtentTestManager.log("User clicks find a wealth team from the dropdown");
    }

    public void validateWealthTeamNavigation() {
        Assert.assertTrue(teamPgValidation.isDisplayed());
        ExtentTestManager.log("Header is displayed on the wealth team page");
    }

    public void navigateToSavingsPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(bankingLink).build().perform();
        ExtentTestManager.log("User hovers over Banking");
        savingsLink.click();
        ExtentTestManager.log("User clicks on Savings link");
    }

    public void handlePopUp() {
        xPopUp.click();
        ExtentTestManager.log("User clicks to x out of popup");
    }

    public void userEntersZipcodeAndSubmits() {
        zipcodeInput.click();
        ExtentTestManager.log("User clicks on zipcode field");
        zipcodeInput.sendKeys("02476");
        ExtentTestManager.log("User enters zipcode in zipcode field");
        submitZip.click();
        ExtentTestManager.log("User clicks submit button");
    }
}

package com.cigna.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-primary'])[1]")
    private WebElement homePageSignInButton;

    @FindBy(xpath = "//strong[contains(text(),'Follow Us')]")
    private WebElement scrollElement;

    @FindBy(xpath = "//a[@id='about-us-level-one-link']")
    private WebElement hoverAboutUs;

    @FindBy(xpath = "//a[contains(text(),'Leadership Team')]")
    private WebElement hoverDropdownSelection;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement leadershipPgLogo;

    @FindBy(xpath = "//a[@id='individuals-families-level-one-link']")
    private WebElement indivAndFamDropDown;

    @FindBy(xpath = "//button[@id='member-resources-tab']")
    private WebElement mmbrResourcesLink;

    @FindBy(xpath = "//a[@class='link-action header-link']")
    private WebElement overviewLink;


    public void validateCignaHomePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cigna.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Cigna homepage URL has been validated");
    }

    public void userClicksOnSignInButton() {
        homePageSignInButton.click();
        ExtentTestManager.log("User clicks the sign in button");
        sleepFor(5);
    }

    public void hoverAndClickOnElement() {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverAboutUs).build().perform();
        ExtentTestManager.log("User hovers over About Us");
        sleepFor(2);
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollElement);
        ExtentTestManager.log("User scrolls to element");
        sleepFor(4);
        hoverDropdownSelection.click();
        ExtentTestManager.log("User clicks on Leadership Team from About Us dropdown");
    }

    public void validateLeadershipPageNavigation() {
        Assert.assertTrue(leadershipPgLogo.isDisplayed());
        ExtentTestManager.log("Leadership page logo is displayed");
    }

    public void hoverOverDropDownAndSelect() {
        Actions actions = new Actions(driver);
        actions.moveToElement(indivAndFamDropDown).build().perform();
        ExtentTestManager.log("User hovers over Individuals and Families dropdown");
        mmbrResourcesLink.click();
        ExtentTestManager.log("User clicks on Member Resources link");
    }

    public void clickOnOverviewLink() {
        overviewLink.click();
        ExtentTestManager.log("User clicks on Overview link");
    }

}

package com.npr.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@class='user-account__sign-in']")
    private WebElement signInButton;

    @FindBy(xpath = "(//h3[@class='title'])[1]")
    private WebElement newsArticle;

    @FindBy(xpath = "//li[@class='navigation__home']")
    private WebElement articleLogo;

    @FindBy(xpath = "(//a[contains(text(),'News')])[1]")
    private WebElement hoverNews;

    @FindBy(xpath = "(//a[contains(text(),'National')])[1]")
    private WebElement selectNational;

    @FindBy(xpath = "//a[@id='navigation_dropdown-search']")
    private WebElement searchNewsBar;


    public void validateNprHomePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.npr.org/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("NPR homepage URL has been validated");
    }

    public void userClicksSignInButton() {
        signInButton.click();
        ExtentTestManager.log("Sign in button is clicked");
    }

    public void userArticleAccess() {
        newsArticle.click();
        ExtentTestManager.log("User clicks on news article");
    }

    public void validateLogoOnArticlePage() {
        Assert.assertTrue(articleLogo.isDisplayed());
        ExtentTestManager.log("NPR logo is displayed on the article page");
    }

    public void hoverOverNews() {
        sleepFor(2);
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(hoverNews).build().perform();
        sleepFor(2);
        ExtentTestManager.log("User hovers mouse over the News dropdown");
    }

    public void selectFromDropdown() {
        hoverOverNews();
        ExtentTestManager.log("Mouse hovers over the News dropdown");
        sleepFor(2);
        selectNational.click();
        ExtentTestManager.log("User clicks National from the News dropdown");
    }

    public void validateNationalPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.npr.org/sections/national/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("NPR National news URL has been validated");
    }

    public void userCanNavigateBack() {
        navigateBack();
        ExtentTestManager.log("User navigates back to homepage");
    }

    public void userCanClickOnSearchBar() {
        searchNewsBar.click();
        ExtentTestManager.log("User clicks on the search bar");
    }

}

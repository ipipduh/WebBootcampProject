package com.npr.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage extends TestBase {

    @FindBy(xpath = "//input[@type ='search']")
    private WebElement searchPageBar;

    @FindBy(xpath = "//button[@class ='ais-SearchBox-submit']")
    private WebElement searchPageButton;

    @FindBy(xpath = "//span[@class='ais-Stats-text']")
    private WebElement searchResultsVerification;


    public void validateSearchPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.npr.org/search";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("NPR search page has been validated");
    }

    public void userCanSearchNews() {
        searchPageBar.click();
        ExtentTestManager.log("Search bar on search page is clicked");
        searchPageBar.sendKeys("Stimulus Package");
        ExtentTestManager.log("Text is entered into the search bar");
        searchPageButton.click();
        ExtentTestManager.log("Search button is clicked");
    }

    public void validateSearchResults() {
        Assert.assertTrue(searchResultsVerification.isDisplayed());
        ExtentTestManager.log("Search results display on the search page");
    }
}

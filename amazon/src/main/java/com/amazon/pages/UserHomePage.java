package com.amazon.pages;


import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserHomePage extends TestBase {

    @FindBy(xpath = "(//span[contains(text(),'Hello')])[1]")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchBar;

    @FindBy(xpath = "(//div[@class='nav-right'])[1]")
    private WebElement searchButton;


    public void validateWelcomeMessage(){
        Assert.assertTrue(welcomeMessage.isDisplayed());
        ExtentTestManager.log("Welcome message displays for user on user homepage");
    }

    public void userSearchesForItem() {
        searchBar.click();
        ExtentTestManager.log("User clicks on search bar");
        searchBar.sendKeys("prayer mat");
        ExtentTestManager.log("User enters search text");
        searchButton.click();
        ExtentTestManager.log("User clicks the search button");
    }

}

package com.npr.pages;

import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserHomePage {

    @FindBy(xpath = "//h2[contains(text(),'Manage Your Account')]")
    private WebElement accountText;

    @FindBy(xpath = "//a[contains(text(),'Sign out')]")
    private WebElement signOutButton;


    public void validateUserPageDisplays(){
        Assert.assertTrue(accountText.isDisplayed());
        ExtentTestManager.log("User account text is displayed");
    }

    public void userClicksSignOutButton() {
        signOutButton.click();
        ExtentTestManager.log("User clicks sign out button");
    }
}

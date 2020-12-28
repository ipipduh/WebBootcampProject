package com.npr.pages;

import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignOutPage {

    @FindBy(xpath = "//header/a[@id='npr-logo']/img[1]")
    private WebElement signOutPageLogo;


    public void validateSignOutLogo(){
        Assert.assertTrue(signOutPageLogo.isDisplayed());
        ExtentTestManager.log("Sign out page logo is displayed");
    }
}

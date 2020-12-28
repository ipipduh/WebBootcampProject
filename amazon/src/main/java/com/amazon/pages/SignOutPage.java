package com.amazon.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignOutPage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Sign Out')]")
    private WebElement signOutButton;

    @FindBy(xpath = "//span[contains(text(),'Account & Lists')]")
    private WebElement hoverOverAccountDropdown;

    @FindBy(xpath = "//i[@class='a-icon a-icon-logo']")
    private WebElement signOutLogo;


    public void userSignsOutOfAccount(){
        signOutButton.click();
        ExtentTestManager.log("User clicks the sign out button");
    }

    public void hoverOverAccountAndLists(){
        sleepFor(2);
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(hoverOverAccountDropdown).build().perform();
        sleepFor(2);
        ExtentTestManager.log("User hovers mouse over the Account Dropdown under Account & Lists");
    }

    public void validateSignOut() {
        Assert.assertTrue(signOutLogo.isDisplayed());
        ExtentTestManager.log("Sign out is validated with the display of the Amazon logo");
    }
}

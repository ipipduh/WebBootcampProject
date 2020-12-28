package com.amazon.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//i[@aria-label='Amazon']")
    private WebElement amazonSignInPageLogo;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement loginEmailBar;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement loginContinueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement loginPasswordBar;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement clickLoginButton;


    public void validateAmazonLoginPageLogo(){
        Assert.assertTrue(amazonSignInPageLogo.isDisplayed());
        ExtentTestManager.log("Amazon logo is displayed on the Amazon login page");
    }

    public void userEntersValidLoginCredentialsAndLogsIn(){
        loginEmailBar.click();
        loginEmailBar.clear();
        loginEmailBar.sendKeys("testonetwothree123@yahoo.com");
        ExtentTestManager.log("User clicks on the email bar and enters valid email");
        loginContinueButton.click();
        ExtentTestManager.log("User clicks continue button");
        loginPasswordBar.click();
        loginPasswordBar.sendKeys("testabc123!");
        ExtentTestManager.log("User clicks on the password bar and enters valid password");
        clickLoginButton.click();
        ExtentTestManager.log("User clicks on the login button");
    }

}

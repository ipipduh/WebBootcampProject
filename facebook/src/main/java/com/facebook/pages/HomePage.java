package com.facebook.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement passField;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement fbLoginBtn;




    public void validateFacebookHomePage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Facebook homepage URL has been validated");
    }

    public void loginToFacebook() {
        emailField.clear();
        ExtentTestManager.log("Email field is cleared");
        emailField.sendKeys("testonetwothree123@yahoo.com");
        ExtentTestManager.log("Valid email is entered");
        passField.clear();
        ExtentTestManager.log("Pass field is cleared");
        passField.sendKeys("testabc123!");
        ExtentTestManager.log("Valid password is entered");
        fbLoginBtn.click();
        ExtentTestManager.log("Login button is clicked");
    }




}

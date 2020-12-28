package com.npr.pages;

import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage {

    @FindBy(xpath = "//a[@id='npr-logo']")
    private WebElement signInPageLogo;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailBar;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='login-submit']")
    private WebElement submitButton;


    public void validateSignInPage(){
        Assert.assertTrue(signInPageLogo.isDisplayed());
        ExtentTestManager.log("NPR logo is displayed on the sign in page");
    }

    public void userEntersValidInformation() {
        emailBar.click();
        ExtentTestManager.log("Email bar is clicked");
        emailBar.sendKeys("testonetwothree123@yahoo.com");
        ExtentTestManager.log("Valid email is entered into email bar");
        nextButton.click();
        ExtentTestManager.log("Next button is clicked");
        passwordField.click();
        ExtentTestManager.log("Password field is clicked");
        passwordField.sendKeys("testabc123!");
        ExtentTestManager.log("Valid password is entered into password field");
        submitButton.click();
        ExtentTestManager.log("Sign in button is clicked");
    }
}

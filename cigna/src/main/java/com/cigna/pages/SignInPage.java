package com.cigna.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage {

    @FindBy(xpath = "//a[@class='login__btn ng-star-inserted']")
    private WebElement loginBtnSignInPg;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='loginbutton']")
    private WebElement scndLoginBtn;

    @FindBy(xpath = "//div[@id='alertmessage']")
    private WebElement errorMsg;


    public void validateFirstCignaLoginPage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://hcpdirectory.cigna.com/web/public/consumer/directory";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("First Cigna sign in URL has been validated");
    }

    public void userClicksLoginButtonOnFirstLoginPage() {
        loginBtnSignInPg.click();
        ExtentTestManager.log("Login button is clicked on the first login page");
    }

    public void validateSecondLoginPage() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://my.cigna.com/web/public/guest";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Second Cigna sign in URL has been validated");
    }

    public void userEntersInvalidInformationAndClicksLogIn() {
        usernameField.click();
        ExtentTestManager.log("Username field is clicked");
        usernameField.sendKeys("Regina Filange");
        ExtentTestManager.log("Invalid username is entered into username field");
        passwordField.click();
        ExtentTestManager.log("Password field is clicked");
        passwordField.sendKeys("BananaHammock123!");
        ExtentTestManager.log("Invalid password is entered into password field");
        scndLoginBtn.click();
        ExtentTestManager.log("Login button is clicked");
    }

    public void validateErrorMessage() {
        Assert.assertTrue(errorMsg.isDisplayed());
        ExtentTestManager.log("Error message displays on the sign in page");
    }
}

package com.citibank.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends TestBase {

    @FindBy(xpath = "//input[@id='cardNumberValue']")
    private WebElement cardNmbrField;

    @FindBy(xpath = "//button[contains(text(),'Continue Set Up')]")
    private WebElement continueSetUp;

    @FindBy(xpath = "//span[@class='validation-message-danger']")
    private WebElement errorMessage;



    public void validateCitibankRegisterPage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/ag/bank/registration/set-up-online-access";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Citibank register page URL has been validated");
    }

    public void userEntersInvalidCreditCardInformation() {
        cardNmbrField.click();
        ExtentTestManager.log("User clicks on card field");
        cardNmbrField.sendKeys("123456");
        ExtentTestManager.log("User enters invalid credit card credentials");
        continueSetUp.click();
        ExtentTestManager.log("User clicks continue setup button");
        sleepFor(2);
    }

    public void validateErrorMessage() {
        Assert.assertTrue(errorMessage.isDisplayed());
        ExtentTestManager.log("Register error message is displayed");
    }


}

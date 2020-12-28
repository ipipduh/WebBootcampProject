package com.amazon.pages;


import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
    private WebElement hoverOverHelloSignIn;

    @FindBy(xpath = "//span[@class='nav-action-inner']")
    private WebElement signInButton;

    @FindBy(linkText = "Become an Affiliate")
    private WebElement elementAmazonPersonalizedRecommendations;


    public void validateHomePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Amazon homepage URL has been validated");
    }

    public void hoverOverHelloSignInOnHomePage(){
        sleepFor(2);
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(hoverOverHelloSignIn).build().perform();
        sleepFor(2);
        ExtentTestManager.log("User hovers mouse over the Hello Sign In on the Amazon homepage");
    }

    public void clickOnSignInButton(){

        signInButton.click();
        ExtentTestManager.log("User clicks the sign in button");
    }

    public void scrollAndClickOnElement(){
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", elementAmazonPersonalizedRecommendations);
        ExtentTestManager.log("The page scrolled down to Personalized Recommendations button");

        elementAmazonPersonalizedRecommendations.click();
        ExtentTestManager.log("After scrolling down to element, click on Sign In To View Personalized Recommendations");
    }



}

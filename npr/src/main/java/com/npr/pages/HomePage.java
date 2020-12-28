package com.npr.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//a[@class='user-account__sign-in']")
    private WebElement signInButton;

    @FindBy(xpath = "(//h3[@class='title'])[1]")
    private WebElement newsArticle;

    @FindBy(xpath = "//li[@class='navigation__home']")
    private WebElement articleLogo;


    public void validateNprHomePage(){
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.npr.org/";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("NPR homepage URL has been validated");
    }

    public void userClicksSignInButton() {
        signInButton.click();
        ExtentTestManager.log("Sign in button is clicked");
    }

    public void userArticleAccess() {
        newsArticle.click();
        ExtentTestManager.log("User clicks on news article");
    }

    public void validateLogoOnArticlePage() {
        Assert.assertTrue(articleLogo.isDisplayed());
        ExtentTestManager.log("NPR logo is displayed on the article page");
    }

}

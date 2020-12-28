package com.amazon.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AffiliatePage extends TestBase {


    @FindBy(xpath = "//div[@class='ac-logo']")
    private WebElement affiliatePageLogo;


    public void validateAffiliatePageLogo(){
        Assert.assertTrue(affiliatePageLogo.isDisplayed());
        ExtentTestManager.log("Amazon Affiliate logo is displayed on the Amazon affiliate page");
    }
}

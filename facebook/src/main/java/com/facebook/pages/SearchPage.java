package com.facebook.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage {

    @FindBy(xpath = "//h1[contains(text(),'Search Results for')]")
    private WebElement searchPageValidation;

    @FindBy(xpath = "(//div[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3'])[5]")
    private WebElement addFriendBtn;


    public void validateSearchPage() {
        Assert.assertTrue(searchPageValidation.isDisplayed());
        ExtentTestManager.log("Search results are displayed on the FB search page");
    }

    public void validateSearchResults() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.facebook.com/search/top?q=tursun.nahaj";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("Facebook search result URL has been validated");
    }

    public void sendFriendRequest() {
        addFriendBtn.click();
        ExtentTestManager.log("User clicks add friend button");
    }
}

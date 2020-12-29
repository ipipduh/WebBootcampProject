package com.facebook.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UserHomePage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Welcome to Facebook, Chanelander')]")
    private WebElement welcomeMsg;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    private WebElement searchBar;

    @FindBy(xpath = "//i[@class='hu5pjgll eb18blue sp_iR8mecyncnx sx_77fd9a']")
    private WebElement searchBtn;

    @FindBy(xpath = "//input[@aria-label='Search by name or email']")
    private WebElement searchFriendBtn;

    @FindBy(xpath = "//span[contains(text(),'What's on your mind, Chanelander?')]")
    private WebElement postBar;

    @FindBy(xpath = "//div[@aria-label='Post']")
    private WebElement postButton;

    @FindBy(xpath = "//div[contains(text(),'Shut up! Shut UP! ShUT UuUuUpP!')]")
    private WebElement postVer;

    @FindBy(xpath = "(//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 g5gj957u rj1gh0hx buofh1pr hpfvmrgz taijpn5t bp9cbjyn owycx6da btwxx1t3 d1544ag0 tw6a2znq jb3vyjys dlv3wnog rl04r1d5 mysgfdmx hddg9phg qu8okrzs g0qnabr5'])[1]")
    private WebElement likeButton;

    @FindBy(xpath = "//a[contains(text(),'Chanelandler Bong')]")
    private WebElement scrollToName;

    @FindBy(xpath = "//div[@class='_1mf _1mj']")
    private WebElement commentBar;

    @FindBy(xpath = "//div[contains(text(),'PIVOT!')]")
    private WebElement validateComment;

    @FindBy(xpath = "//span[@class='pcp91wgn']")
    private WebElement validateLike;

    @FindBy(xpath = "//span[contains(text(),'Events')]")
    private WebElement eventsLink;

    @FindBy(xpath = "//span[contains(text(),'Happening Online Now')]")
    private WebElement eventsDisplay;

    @FindBy(xpath = "//span[contains(text(),'Groups')]")
    private WebElement groupsLink;

    @FindBy(xpath = "//span[contains(text(),'Suggested for You')]")
    private WebElement groupsDisplay;

    @FindBy(xpath = "//span[contains(text(),'Jobs')]")
    private WebElement jobsLink;

    @FindBy(xpath = "//span[contains(text(),'Jobs at Nearby Businesses')]")
    private WebElement jobsDisplay;


    public void validateFBLogin() {
        Assert.assertTrue(welcomeMsg.isDisplayed());
        ExtentTestManager.log("Header is displayed on the wealth team page");
    }

    public void searchForAFriend() {
        searchBar.click();
        ExtentTestManager.log("User clicks search bar");
        searchBar.sendKeys("Monica Gellar");
        ExtentTestManager.log("User enters text into the search bar");
        searchBtn.click();
        ExtentTestManager.log("User clicks the search button");
    }

    public void searchAndAddFriend() {
        searchFriendBtn.click();
        ExtentTestManager.log("User clicks search bar");
        searchFriendBtn.sendKeys("Tursun Nahaj");
        searchBtn.click();
        ExtentTestManager.log("User clicks the search button");
    }

    public void createAFBPost() {
        postBar.click();
        ExtentTestManager.log("User clicks the post bar");
        postBar.sendKeys("Shut up! Shut UP! ShUT UuUuUpP!");
        ExtentTestManager.log("User enters text in the post bar");
        postButton.click();
        ExtentTestManager.log("User clicks the post button");
    }

    public void validateFacebookPost() {
        Assert.assertTrue(postVer.isDisplayed());
        ExtentTestManager.log("Facebook post is displayed");
    }

    public void userClicksTheLikeButton() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollToName);
        ExtentTestManager.log("User scrolls to name");
        likeButton.click();
        ExtentTestManager.log("User clicks like button on post of person");
    }

    public void userCreatesAComment() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollToName);
        ExtentTestManager.log("User scrolls to name");
        commentBar.click();
        ExtentTestManager.log("User clicks on comment bar");
        commentBar.sendKeys("PIVOT!");
        ExtentTestManager.log("User enters text on comment bar");
        driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys(Keys.ENTER);
        ExtentTestManager.log("User hits enter on the comment bar");
    }

    public void validateFacebookComment() {
        Assert.assertTrue(validateComment.isDisplayed());
        ExtentTestManager.log("Facebook comment is displayed");
    }

    public void validateFacebookLike() {
        Assert.assertTrue(validateLike.isDisplayed());
        ExtentTestManager.log("Facebook like is displayed");
    }

    public void userCanNavigateToEventsPage() {
        eventsLink.click();
        ExtentTestManager.log("User clicks on event link");
    }

    public void validateEventLinkNaviation() {
        Assert.assertTrue(eventsDisplay.isDisplayed());
        ExtentTestManager.log("Facebook Evebts page is displayed");
    }

    public void userCanNavigateToGroupsPage() {
        eventsLink.click();
        ExtentTestManager.log("User clicks on event link");
    }

    public void validateGroupsLinkNaviation() {
        Assert.assertTrue(groupsDisplay.isDisplayed());
        ExtentTestManager.log("Facebook Groups page is displayed");
    }

    public void userCanNavigateToJobsPage() {
        jobsLink.click();
        ExtentTestManager.log("User clicks on job link");
    }

    public void validateJobsLinkNaviation() {
        Assert.assertTrue(jobsDisplay.isDisplayed());
        ExtentTestManager.log("Facebook jobs page is displayed");
    }

}

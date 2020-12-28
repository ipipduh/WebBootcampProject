package com.amazon.pages;

import com.peoplentech.webbootcampprojec.TestBase;
import com.peoplentech.webbootcampprojec.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'prayer mat')]")
    private WebElement prayerMatText;

    @FindBy(xpath = "//span[contains(text(),'My Salah Mat - Educational Interactive Prayer Mat')]")
    private WebElement kidsPrayerMatText;

    @FindBy(xpath = "//a[@id='bylineInfo']")
    private WebElement storeName;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCart;

    @FindBy(xpath = "//h1[contains(text(),'Added to Cart')]")
    private WebElement addToCartConfirmation;


    public void validateProductSearchResults(){
        UserHomePage userHomePage = PageFactory.initElements(driver, UserHomePage.class);
        userHomePage.userSearchesForItem();
        Assert.assertTrue(prayerMatText.isDisplayed());
        ExtentTestManager.log("prayer mat text displays for user on product search page");
    }

    public void userClicksOnProductFromSearchResults(){
        kidsPrayerMatText.click();
        ExtentTestManager.log("User clicks on product text");
    }

    public void validateProductPage(){
        Assert.assertTrue(storeName.isDisplayed());
        ExtentTestManager.log("Store name is displayed with the product on the product page");
    }

    public void addItemToShoppingCart(){
        addToCart.click();
        ExtentTestManager.log("User adds product to shopping card");
    }

    public void validateAddedToCart(){
        Assert.assertTrue(addToCartConfirmation.isDisplayed());
        ExtentTestManager.log("Product has been added to shopping cart");
    }
}

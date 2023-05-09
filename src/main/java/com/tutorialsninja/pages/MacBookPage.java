package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MacBookPage extends Utilities {
        @CacheLookup
        @FindBy(xpath = "//h1[text()='MacBook']")
        WebElement textMacBook;
        @CacheLookup
        @FindBy(css = "#button-cart")
        WebElement addToCartButton;
        @CacheLookup
        @FindBy(css = ".alert.alert-success.alert-dismissible")
        WebElement textSuccess;
        @CacheLookup
        @FindBy(css = ".alert.alert-success.alert-dismissible a:nth-of-type(2)")
        WebElement linkShoppingCart;

        public String getTextMacBook(){
            Reporter.log("Text from MacBook" + textMacBook.toString());
            CustomListeners.test.log(Status.PASS, "Text from MacBook");
            return getTextFromElement(textMacBook);
        }
        public void clickOnAddToCartButton(){
            Reporter.log("Add to cart Button Link" + addToCartButton.toString());
            clickOnElement(addToCartButton);
            CustomListeners.test.log(Status.PASS, "Add to cart Button Link");
        }
        public String getTextSuccess(){
            Reporter.log("Text from Success" + textSuccess.toString());
            CustomListeners.test.log(Status.PASS, "Text from Success");
            return getTextFromElement(textSuccess);
        }
        public void clickLinkShoppingCart(){
            Reporter.log("Link to shipping cart" + linkShoppingCart.toString());
            clickOnElement(linkShoppingCart);
            CustomListeners.test.log(Status.PASS, "Link to shipping cart");
        }

}

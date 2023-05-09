package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HPLP3065Page extends Utilities {
    @CacheLookup
    @FindBy(css = "#content h1")
    WebElement textHPLP3065;
    @CacheLookup
    @FindBy(css = "#input-quantity")
    WebElement quantity;
    @CacheLookup
    @FindBy(css = "#button-cart")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement textMessageSuccess;
    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible a:nth-of-type(2)")
    WebElement linkShoppingCart;

    public String getTextHPLP3065(){
        Reporter.log("Text from HPLP3065" + textHPLP3065.toString());
        CustomListeners.test.log(Status.PASS, "Text from HPLP3065");
        return getTextFromElement(textHPLP3065);
    }
    public void enterQuantity(){
        Reporter.log("Quantity" + quantity.toString());
        sendTextToElement(quantity,"");
        CustomListeners.test.log(Status.PASS, "Quantity");
    }
    public void clickOnAddToCartButton(){
        Reporter.log("Click on add to Cart" + addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on add to Cart");
    }
    public String getTextMessageSuccess(){
        Reporter.log("Text Message Success" + textMessageSuccess.toString());
        CustomListeners.test.log(Status.PASS, "Text Message Success");
        return getTextFromElement(textMessageSuccess);
    }
    public void clickOnLinkShoppingCart(){
        Reporter.log("Click on Shopping cart link" + linkShoppingCart.toString());
        clickOnElement(linkShoppingCart);
        CustomListeners.test.log(Status.PASS, "Click on Shopping cart link");
    }
    public void selectDeliveryDate(){
        String year = "2022";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

}

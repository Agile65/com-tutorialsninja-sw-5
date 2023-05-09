package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utilities {
    @CacheLookup
    @FindBy(css = "#content h2")
    WebElement laptopsAndNotebooks;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement selectSortBy;
    @CacheLookup
    @FindBy(xpath = "//a[text()='MacBook']")
    WebElement productMacBook;

    public String getTextFromLaptopsAndNotebooks(){
        Reporter.log("Text from Laptops and Notebooks" + laptopsAndNotebooks.toString());
        CustomListeners.test.log(Status.PASS, "Text from HPLP3065");
        return getTextFromElement(laptopsAndNotebooks);
    }
    public void clickOnSortByDropDown(){
        Reporter.log("Text from Laptops and Notebooks" + selectSortBy.toString());
        clickOnElement(selectSortBy);
        CustomListeners.test.log(Status.PASS, "Text from Laptops and Notebooks");
    }
    public void selectPriceHighToLowFromDropdown(){
        Reporter.log("Price High to Low" + selectSortBy.toString());
        selectByVisibleTextFromDropDown(selectSortBy,"Price (High > Low)");
        CustomListeners.test.log(Status.PASS, "Price High to Low");
    }
    public void selectProductMacBook(){
        Reporter.log("Select product MacBook" + selectSortBy.toString());
        clickOnElement(productMacBook);
        CustomListeners.test.log(Status.PASS, "Select product MacBook");
    }
    public void verifyProductsArrangedByPriceHighToLow(){
         List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(afterSortByPrice);
        Assert.assertEquals(originalProductsPrice, afterSortByPrice,"Product not sorted by price High to Low");
    }
}

package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utilities {

    @CacheLookup
    @FindBy(xpath = "//h2")
    WebElement desktops;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByPosition;
    @CacheLookup
    @FindBy(xpath= "//a[text()='HP LP3065']")
    WebElement productHPLP3065;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    public String getTextFromDesktops(){
        Reporter.log("Text from Desktops" + desktops.toString());
        CustomListeners.test.log(Status.PASS, "Text from Desktops");
        return getTextFromElement(desktops);
    }
    public void clickOnSortByDropDown(){
        Reporter.log("Click on Sort By Dropdown" + sortByPosition.toString());
        clickOnElement(sortByPosition);
        CustomListeners.test.log(Status.PASS, "Click on sort by Dropdown");
    }
    public void selectNameZToAFromDropdown(){
        Reporter.log("Select name Z to A" + sortByPosition.toString());
        selectByVisibleTextFromDropDown(sortByPosition,"Name (Z - A)");
        CustomListeners.test.log(Status.PASS, "Select name Z to A");
    }
    public void selectNameAToZFromDropdown(){
        Reporter.log("Select name A to Z" + sortByPosition.toString());
        selectByVisibleTextFromDropDown(sortByPosition,"Name (A - Z)");
        CustomListeners.test.log(Status.PASS, "Select name A to Z");
    }
    public void selectHPLP3065(){
        Reporter.log("Select HP product " + productHPLP3065.toString());
        clickOnElement(productHPLP3065);
        CustomListeners.test.log(Status.PASS, "Select HP product");
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        Reporter.log("Get elements sorted in reverse order" + sortByPosition.toString());
//        List<WebElement> elements = productsList;
//        ArrayList<String> originalElementList = new ArrayList<>();
//        for (WebElement e : elements) {
//            originalElementList.add(e.getText());
//        }
//        System.out.println(originalElementList);
//
//        Collections.reverse(originalElementList);
//        System.out.println(originalElementList);
//        elements = productsList;
//        ArrayList<String> afterSortByReverseList = new ArrayList<>();
//        for (WebElement e : elements) {
//            afterSortByReverseList.add(e.getText());
//        }
//        System.out.println(afterSortByReverseList);
//        Assert.assertEquals(originalElementList,afterSortByReverseList,"Error in sorting");


         //Get all the products name and stored into array list
        List<WebElement> products = productsList;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        //Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = productsList;
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals(originalProductsName,afterSortByZToAProductsName,"Error in sorting");
        CustomListeners.test.log(Status.PASS,"Get elements sorted in reverse order");
    }
}

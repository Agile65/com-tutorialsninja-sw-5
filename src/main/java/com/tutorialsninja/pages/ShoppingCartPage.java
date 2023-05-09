package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;

public class ShoppingCartPage extends Utilities {
    By textShoppingCart = By.cssSelector("#content>h1");
    By textProductName = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
    By textDeliveryDate = By.xpath("//small[text()='Delivery Date:2022-11-30']");
    By textModel = By.xpath("//td[text()='Product 21']");
    By textTotal = By.cssSelector("#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");
    By textMacBook = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
    By quantity = By.cssSelector("div.input-group.btn-block>input");
    By updateTab = By.cssSelector(".fa.fa-refresh");
    By textMessage = By.cssSelector(".alert.alert-success.alert-dismissible");
    By textTotal1 = By.cssSelector("#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)");
    By checkOutbtn = By.cssSelector("a.btn.btn-primary");
    By textCheckout = By.xpath("//h1[text()='Checkout']");
    By textNewCustomer = By.xpath("//h2[text()='New Customer']");
    By guestCheckOutRadio = By.cssSelector("input[value='guest']");
    By continueButton = By.cssSelector("#button-account");
    By firstName = By.cssSelector("#input-payment-firstname");
    By lastName = By.cssSelector("#input-payment-lastname");
    By email = By.cssSelector("#input-payment-email");
    By telephone = By.cssSelector("#input-payment-telephone");
    By address = By.cssSelector("#input-payment-address-1");
    By city = By.cssSelector("#input-payment-city");
    By postcode = By.cssSelector("#input-payment-postcode");
    By zone = By.cssSelector("#input-payment-zone");
    By continueButton1 = By.cssSelector("#button-guest");
    By addCommentsAboutOrder = By.cssSelector("textarea[name='comment']");
    By tncCheckbox = By.cssSelector("input[type='checkbox']");
    By continueButton2 = By.cssSelector("#button-payment-method");
    By textWarning = By.cssSelector(".alert.alert-danger.alert-dismissible");

    public String getTextShoppingCart() {
        Reporter.log("Text Shopping Cart" + textShoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Text Shopping Cart");
        return getTextFromElement(textShoppingCart);
    }

    public String getTextProductName() {
        Reporter.log("Text Product name" + textProductName.toString());
        CustomListeners.test.log(Status.PASS, "Text Product Name");
        return getTextFromElement(textProductName);
    }

    public String getTextDeliveryDate() {
        Reporter.log("Text Delivery date" + textDeliveryDate.toString());
        CustomListeners.test.log(Status.PASS, "Text Delivery date");
        return getTextFromElement(textDeliveryDate);
    }

    public String getTextModel() {
        Reporter.log("Text Model" + textModel.toString());
        CustomListeners.test.log(Status.PASS, "Text Model");
        return getTextFromElement(textModel);
    }

    public String getTextTotal() {
        Reporter.log("Text Total" + textTotal.toString());
        CustomListeners.test.log(Status.PASS, "Text Total");
        return getTextFromElement(textTotal);
    }

    public String getTextMacBook() {
        Reporter.log("Text MacBook" + textMacBook.toString());
        CustomListeners.test.log(Status.PASS, "Text MacBook");
        return getTextFromElement(textMacBook);
    }

    public void changeQuantity() {
        Reporter.log("Quantity" + quantity.toString());
        sendTextToElement(quantity, Keys.BACK_SPACE + "2");
        CustomListeners.test.log(Status.PASS, "Quantity");
    }

    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
    }

    public String getTextMessage() {
        Reporter.log("Text Message" + textMessage.toString());
        CustomListeners.test.log(Status.PASS, "Text Message");
        return getTextFromElement(textMessage);
    }

    public String getTextTotal1() {
        Reporter.log("Text Total" + textTotal1.toString());
        CustomListeners.test.log(Status.PASS, "Text Total1");
        return getTextFromElement(textTotal1);
    }

    public void clickOnCheckOutButton() {
        Reporter.log("Click on check out button" + checkOutbtn.toString());
        CustomListeners.test.log(Status.PASS, "Click on check out button");
        clickOnElement(checkOutbtn);
    }

    public String getTextCheckOut() {
        Reporter.log("Get check out text" + textCheckout.toString());
        CustomListeners.test.log(Status.PASS, "Get check out text");
        return getTextFromElement(textCheckout);
    }

    public String getTextNewCustomer() {
        Reporter.log("Get new customer text" + textNewCustomer.toString());
        CustomListeners.test.log(Status.PASS, "Get new customer text");
        return getTextFromElement(textNewCustomer);
    }

    public void clickOnGuestCheckOutRadio() {
        Reporter.log("Click on guest check out" + guestCheckOutRadio.toString());
        clickOnElement(guestCheckOutRadio);
        CustomListeners.test.log(Status.PASS, "Click on guest check out");
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue button");
    }

    public void fillInMandatoryFields() {
        Reporter.log(" Information ");
        sendTextToElement(firstName, "Ramesh");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "rameshpatel@gmail.com");
        sendTextToElement(telephone, "76895433452");
        sendTextToElement(address, "Kings Street");
        sendTextToElement(city, "London");
        sendTextToElement(postcode, "WC11BC");
        selectByVisibleTextFromDropdown(zone, "Berkshire");
        CustomListeners.test.log(Status.PASS, "Information");
    }

    public void clickOnContinueButton1() {
        Reporter.log("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton1);
        CustomListeners.test.log(Status.PASS, "Click on continue button");
    }

    public void addCommentsAboutOrder() {
        Reporter.log("Add comments" + continueButton.toString());
        sendTextToElement(addCommentsAboutOrder, "Thank You for Your Order");
        CustomListeners.test.log(Status.PASS, "Add comment");
    }

    public void clickOnTermsAndConditionCheckbox() {
        Reporter.log("Click on terms and conditions" + tncCheckbox.toString());
        clickOnElement(tncCheckbox);
        CustomListeners.test.log(Status.PASS, "Click on terms and conditions");
    }

    public void clickOnContinueButton2() {
        Reporter.log("Click on continue" + continueButton2.toString());
        clickOnElement(continueButton2);
        CustomListeners.test.log(Status.PASS, "Click on continue");
    }

    public String getTextWarningMessage() {
        Reporter.log("Get warning text" + textWarning.toString());
        CustomListeners.test.log(Status.PASS, "Get warning text");
        return getTextFromElement(textWarning);
    }
}

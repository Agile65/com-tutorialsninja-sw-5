package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountsPage extends Utilities {

    @CacheLookup
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(css = "#top-links a")
    WebElement myAccountOption;
    @CacheLookup
    @FindBy(css = "#content h1")
    WebElement textRegister;
    @CacheLookup
    @FindBy(css = "#content > div > div:nth-child(2) > div > h2")
    WebElement textReturningCustomer;
    @CacheLookup
    @FindBy(css = "#input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(css = "#input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#input-email")
    WebElement email;
    @CacheLookup
    @FindBy(css = "#input-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(css = "#input-password")
    WebElement password;
    @CacheLookup
    @FindBy(css = "#input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(css = "input[type='radio'][name='newsletter'][value='1']")
    WebElement radioYes;
    @CacheLookup
    @FindBy(css = "input[type='checkbox']")
    WebElement checkPrivacy;
    @CacheLookup
    @FindBy(css = "input[value='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement textAccountCreated;
    @CacheLookup
    @FindBy(css = "a[class='btn btn-primary']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement textAccountLogOut;
    @CacheLookup
    @FindBy(css = ".btn.btn-primary")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(css = "input[value='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement textMyAccount;

    public void clickOnMyAccountLink(){
        Reporter.log("Click on My Account Link" + myAccountLink.toString());
        clickOnElement(myAccountLink);
        CustomListeners.test.log(Status.PASS, "Click on My Account Link");
    }
    public void callSelectMyAccountOptionMethod(){
        Reporter.log("Select My account option Register");
        selectMyAccountOptions("Register");
        CustomListeners.test.log(Status.PASS, "Select My account option Register");
    }
    public void callSelectMyAccountLogoutMethod(){
        Reporter.log("Select My account option Logout");
        selectMyAccountOptions("Logout");
        CustomListeners.test.log(Status.PASS, "Select My account option Logout");
    }
    public String getTextRegister(){
        Reporter.log("Text from Register" + textRegister.toString());
        CustomListeners.test.log(Status.PASS, "Text from Register");
        return getTextFromElement(textRegister);
    }
    public void callSelectMyAccountLoginMethod(){
        Reporter.log("Select My account option Login");
        selectMyAccountOptions("Login");
        CustomListeners.test.log(Status.PASS, "Select My account option Login");
    }
    public String getTextReturningCustomer(){
        Reporter.log("Text from Returning Customer" + textReturningCustomer.toString());
        CustomListeners.test.log(Status.PASS, "Text from Returning Customer");
        return getTextFromElement(textReturningCustomer);
    }
    public void fillInInformation(){
        Reporter.log(" Information ");
        sendTextToElement(firstName,"Vina");
        sendTextToElement(lastName,"Shah");
        sendTextToElement(email,"vinashah1234567@gmail.com");
        sendTextToElement(telephone,"78945636547");
        sendTextToElement(password,"12as5464");
        sendTextToElement(confirmPassword,"12as5464");
        clickOnElement(radioYes);
        clickOnElement(checkPrivacy);
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Information");
    }
    public void fillInEmailPassword(){
        Reporter.log("Email and Password ");
        sendTextToElement(email,"vinashah1234@gmail.com");
        sendTextToElement(password,"12as5464");
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Email and Password ");
    }
    public String getTextAccountCreated(){
        Reporter.log("Text Account created" + textAccountCreated.toString());
        CustomListeners.test.log(Status.PASS, "Text Account created");
        return getTextFromElement(textAccountCreated);
    }
    public void clickOnContinueButton(){
        Reporter.log("Click on Continue Button" + continueButton1.toString());
        clickOnElement(continueButton1);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");
    }
    public String getTextAccountLogOut(){
        Reporter.log("Text Account Log out" + textAccountLogOut.toString());
        CustomListeners.test.log(Status.PASS, "Text Account Log out");
        return getTextFromElement(textAccountLogOut);
    }
    public void clickOnContinueButton2(){
        Reporter.log("Click on Continue Button" + continueButton2.toString());
        clickOnElement(continueButton2);
        CustomListeners.test.log(Status.PASS, "Click on Continue Button");
    }
    public String getTextMyAccount(){
        Reporter.log("Text from My Account" + textMyAccount.toString());
        CustomListeners.test.log(Status.PASS, "Text from My Account");
        return getTextFromElement(textMyAccount);
    }
}

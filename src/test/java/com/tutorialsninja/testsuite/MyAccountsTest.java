package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class MyAccountsTest extends BaseTest {

    MyAccountsPage myAccountsPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        myAccountsPage=new MyAccountsPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
    //1.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
    //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountsPage.callSelectMyAccountOptionMethod();
    //1.3 Verify the text “Register Account”.
        Assert.assertEquals(myAccountsPage.getTextRegister(),"Register Account","Error");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
    //2.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
    //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountsPage.callSelectMyAccountLoginMethod();
    //2.3 Verify the text “Returning Customer”.
        Assert.assertEquals(myAccountsPage.getTextReturningCustomer(),"Returning Customer","Error");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserRegisterAccountSuccessfully(){
    //3.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
    //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountsPage.callSelectMyAccountOptionMethod();
    //3.3 Enter First Name 3.4 Enter Last Name 3.5 Enter Email 3.6 Enter Telephone 3.7 Enter Password 3.8 Enter Password Confirm
    //3.9 Select Subscribe Yes radio button 3.10 Click on Privacy Policy check box 3.11 Click on Continue button
        myAccountsPage.fillInInformation();
    //3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals(myAccountsPage.getTextAccountCreated(),"Your Account Has Been Created!","Error");
    //3.13 Click on Continue button
        myAccountsPage.clickOnContinueButton();
    //3.14 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
    //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountsPage.callSelectMyAccountLogoutMethod();
    //3.16 Verify the text “Account Logout”
        Assert.assertEquals(myAccountsPage.getTextAccountLogOut(),"Account Logout","Error");
    //3.17 Click on Continue button
        myAccountsPage.clickOnContinueButton2();
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
    //4.1 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
    //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountsPage.callSelectMyAccountLoginMethod();
    //4.3 Enter Email address 4.5 Enter Password 4.6 Click on Login button
        myAccountsPage.fillInEmailPassword();
    //4.7 Verify text “My Account”
        Assert.assertEquals(myAccountsPage.getTextMyAccount(),"My Account","Error");
    //4.8 Click on My Account Link.
        myAccountsPage.clickOnMyAccountLink();
    //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountsPage.callSelectMyAccountLogoutMethod();
    //4.10 Verify the text “Account Logout”
        Assert.assertEquals(myAccountsPage.getTextAccountLogOut(),"Account Logout","Error");
    //4.11 Click on Continue button
        myAccountsPage.clickOnContinueButton2();
    }
}

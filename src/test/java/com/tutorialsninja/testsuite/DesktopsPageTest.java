package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HPLP3065Page;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class DesktopsPageTest extends BaseTest {

    HomePage homePage;
    DesktopsPage desktopsPage;
    HPLP3065Page hplp3065Page;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        desktopsPage= new DesktopsPage();
        hplp3065Page=new HPLP3065Page();
        shoppingCartPage=new ShoppingCartPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() throws Exception {
        //1.1 Mouse hover on Desktops Tab and click
        homePage.hoverOnDesktopsTabAndClick();
        //1.2 Click on “Show All Desktops”
        homePage.callSelectMenuMethodAndClick("Show AllDesktops");
        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.clickOnSortByDropDown();
        desktopsPage.selectNameZToAFromDropdown();
        //1.4 Verify the Product will arrange in Descending order.
        desktopsPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //2.1 Mouse hover on Desktops Tab. and click
        homePage.hoverOnDesktopsTabAndClick();
        //2.2 Click on “Show All Desktops”
        homePage.callSelectMenuMethodAndClick("Show AllDesktops");
        //2.3 Select Sort By position "Name: A to Z"
        desktopsPage.clickOnSortByDropDown();
        desktopsPage.selectNameAToZFromDropdown();
        //2.4 Select product “HP LP3065”
        desktopsPage.selectHPLP3065();
        //2.5 Verify the Text "HP LP3065"
        Assert.assertEquals(hplp3065Page.getTextHPLP3065(),"HP LP3065","Error");
        //2.6 Select Delivery Date "2022-11-30"
        hplp3065Page.selectDeliveryDate();
        //2.7.Enter Qty "1” using Select class.
        hplp3065Page.enterQuantity();
        //2.8 Click on “Add to Cart” button
        hplp3065Page.clickOnAddToCartButton();
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Assert.assertEquals(hplp3065Page.getTextMessageSuccess(),"Success: You have added HP LP3065 to your shopping cart!\n" +
                "×","Error");
        //2.10 Click on link “shopping cart” display into success message
        hplp3065Page.clickOnLinkShoppingCart();
        //2.11 Verify the text "Shopping Cart"
        Assert.assertEquals(shoppingCartPage.getTextShoppingCart(),"Shopping Cart  (1.00kg)","Error");
        //2.12 Verify the Product name "HP LP3065"
        Assert.assertEquals(shoppingCartPage.getTextProductName(),"HP LP3065","Error");
        //2.13 Verify the Delivery Date "2022-11-30"
        Assert.assertEquals(shoppingCartPage.getTextDeliveryDate(),"Delivery Date:2022-11-30","Error");
        //2.14 Verify the Model "Product21"
        Assert.assertEquals(shoppingCartPage.getTextModel(),"Product 21","Error");
        //2.15 Verify the Todat "£74.73"
        Assert.assertEquals(shoppingCartPage.getTextTotal(),"$122.00","Error");
    }
}

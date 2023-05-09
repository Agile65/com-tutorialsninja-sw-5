package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homePage;
    DesktopsPage desktopsPage;
    LaptopsAndNotebooksPage laptopsAndNotebooksPage;
    ComponentsPage componentsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        desktopsPage= new DesktopsPage();
        laptopsAndNotebooksPage=new LaptopsAndNotebooksPage();
        componentsPage=new ComponentsPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.hoverOnDesktopsTabAndClick();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.callSelectMenuMethodAndClick("Show AllDesktops");
        //1.3 Verify the text ‘Desktops
        Assert.assertEquals(desktopsPage.getTextFromDesktops(), "Desktops", "Error");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.hoverOnlaptopsAndNotebooksAndClick();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.callSelectMenuMethodAndClick("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(laptopsAndNotebooksPage.getTextFromLaptopsAndNotebooks(),"Laptops & Notebooks","Error");
    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
        homePage.hoverOnComponentsAndClick();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.callSelectMenuMethodAndClick("Show AllComponents");
        //3.3 Verify the text ‘Components’
        Assert.assertEquals(componentsPage.getTextComponents(),"Components","Error");
    }
}

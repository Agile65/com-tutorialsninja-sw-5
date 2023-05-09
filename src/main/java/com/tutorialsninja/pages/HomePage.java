package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utilities {
    @CacheLookup
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktopTab;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
    WebElement laptopsAndNotebooks;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Components']")
    WebElement components;

    public void hoverOnDesktopsTabAndClick(){
        Reporter.log("Hover on desktop tabs and click" + desktopTab.toString());
        mouseHoverToElementAndClick(desktopTab);
        CustomListeners.test.log(Status.PASS, "Hover on desktop tabs and click");
    }
    public void callSelectMenuMethodAndClick(String menu){
        Reporter.log("Select menu and click" + menu.toString());
        selectMenu(menu);
        CustomListeners.test.log(Status.PASS, "Select menu and click");
    }
    public void hoverOnlaptopsAndNotebooksAndClick(){
        Reporter.log("Hover on laptops and click" + laptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooks);
        CustomListeners.test.log(Status.PASS, "Hover on laptops and click");
    }
    public void hoverOnComponentsAndClick(){
        Reporter.log("Hover on components and click" + components.toString());
        mouseHoverToElementAndClick(components);
        CustomListeners.test.log(Status.PASS, "Hover on components and click");
    }
}

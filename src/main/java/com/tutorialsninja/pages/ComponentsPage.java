package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComponentsPage extends Utilities {

    @CacheLookup
    @FindBy(css ="#content h2")
    WebElement components;


        public String getTextComponents(){
            Reporter.log("Components Text " + components.toString());
            CustomListeners.test.log(Status.PASS,"Components Text ");
            return getTextFromElement(components);
        }
}

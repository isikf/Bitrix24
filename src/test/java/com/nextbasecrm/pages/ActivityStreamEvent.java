package com.nextbasecrm.pages;


import com.nextbasecrm.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamEvent extends BasePage {


    @FindBy( id = "feed-add-post-form-tab-calendar")
    WebElement eventTab;



    public void navigateToEventTab(){

        BrowserUtils.waitForClickablility(eventTab,5);
       // navigateToModule("Activity Stream");
        eventTab.click();
    }
}

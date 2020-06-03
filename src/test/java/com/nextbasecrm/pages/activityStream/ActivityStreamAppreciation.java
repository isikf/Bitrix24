package com.nextbasecrm.pages.activityStream;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActivityStreamAppreciation extends BasePage {

    //Adem abi and Mehmet Ali abi
    //SM and SWE
    public void postbuttonAction(String postButton) {
        String postbutton="//div[@class='feed-add-post-form-wrap']//div[@class='feed-add-post-form-but-wrap']//span[@title='" + postButton + "']";
        WebElement postElement = Driver.get().findElement(By.xpath(postbutton));
        postElement.click();
    }
}

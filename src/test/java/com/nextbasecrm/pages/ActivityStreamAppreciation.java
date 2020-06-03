package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamAppreciation extends BasePage {

    public void postbuttonAction(String postButton) {
        String postbutton="//div[@class='feed-add-post-form-wrap']//div[@class='feed-add-post-form-but-wrap']//span[@title='" + postButton + "']";
        WebElement postElement = Driver.get().findElement(By.xpath(postbutton));
        postElement.click();
    }
}

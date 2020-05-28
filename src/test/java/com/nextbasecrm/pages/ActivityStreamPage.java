package com.nextbasecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Announcement']")
    public WebElement announcementButton;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFiles;

    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement commaIcon;

    @FindBy(css = "blockquote")
    public WebElement blockQuote;

    public void navigateToAnnouncement(){
        moreButton.click();
        announcementButton.click();
    }
}

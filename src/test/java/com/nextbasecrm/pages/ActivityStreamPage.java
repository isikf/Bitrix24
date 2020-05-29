package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ActivityStreamPage extends BasePage{

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Announcement']")
    public WebElement announcementButton;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFiles;

    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement commaIcon;

    @FindBy(css = "#bx-b-link-blogPostForm>span")
    public WebElement linkIcon;

    @FindBy(css = "#bx-b-video-blogPostForm>span")
    public WebElement videoIcon;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceInput;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-title")
    public WebElement videoTitleBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(css = "blockquote")
    public WebElement blockQuote;

    //Search it after switching to frame
    @FindBy(id = "search-textbox-input")
    public WebElement searchInput;

    @FindBy(css = "body[contenteditable=true]")
    public WebElement textInput;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendTextButton;

    public void navigateToAnnouncement(){
        moreButton.click();
        announcementButton.click();
    }

    public void addLink(String text, String url){
        linkIcon.click();
        linkText.sendKeys(text);
        linkUrl.sendKeys(url);
        Driver.get().findElement(By.id("undefined")).click();
    }


}

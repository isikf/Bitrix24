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

    @FindBy(id="pagetitle")
    public WebElement activityStreamPageTitle;

    @FindBy(id="LIVEFEED_search")
    public WebElement searchAndFilterButton;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[1]")
    public WebElement favoriteButton;

    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']//span[.='Poll']")
    public WebElement PollButton;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement addMoreButton;

    @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-last.bx-finder-box-tab-selected")
    public WebElement recentOption;

    @FindBy(css = ".bx-finder-box-tab.bx-lm-tab-department")
    public WebElement employeeAndDepartment;

    @FindBy(css = ".bx-ilike-text")
    public WebElement firstPostLikeButton;

    @FindBy(css = ".feed-inform-comments")
    public WebElement firstPostCommentButton;
    @FindBy(css = ".feed-inform-follow")
    public WebElement firstPostUnfollowButton;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement firstPostCommentInputBox;

    @FindBy(css = ".ui-btn.ui-btn-sm.ui-btn-primary")
    public WebElement sendCommentButton;

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

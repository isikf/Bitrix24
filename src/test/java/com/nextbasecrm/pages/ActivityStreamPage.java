package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(css = "#bx-b-link-blogPostForm>span")
    public WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(css = "blockquote")
    public WebElement blockQuote;

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesButton;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndImagesBtn;

    @FindBy(xpath = "//a[@class='files-path']")
    public WebElement uploadedFileMessage;

    @FindBy(xpath = "//span[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud']")
    public WebElement downloadFromExternalDrive;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[1]")
    public WebElement selectDocFromBitrix24;

    @FindBy(id = "bx-destination-tag")
    public WebElement addUsers;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement selectAllUsers;

    @FindBy(xpath = "//a[starts-with(@id,'destEmailTab_destination')]")
    public WebElement addByEmailUsers;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_destination')]")
    public WebElement addByEmployeesAndDepartments;


    @FindBy(xpath = "//a[starts-with(@id,'destLastTab_destination')]")
    public WebElement recentButton;

    @FindBy(id = "destination9550413_last_UA")
    public WebElement addAllEmployees;

    @FindBy(xpath = "//span[@class = 'popup-window-close-icon']")
    public WebElement popupWindowClose;

    @FindBy(xpath = "//div[@class='diskuf-label']")
    public WebElement attachedFilesNotification;

    @FindBy(xpath = "//div[@class='ui-notification-balloon-message']")
    public WebElement externalErrorNotification;

    @FindBy(xpath = "//span[@title='Sales and marketing']")
    public WebElement selectSalesAndMarketing;

    @FindBy(xpath = "//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-folder']")
    public WebElement selectMarketingAndAdvertising;

    @FindBy(xpath = "//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file']")
    public  WebElement selectLogoGif;

    @FindBy(xpath = "//span[@title='My Drive']")
    public WebElement myDriveButton;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement selectDocumentButton;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-editor'])[1]")
    public WebElement createUsingOffice365Button;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement desktopApplicationsButton;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement downloadButton;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement allEmployeesBtn;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement textBox;

    @FindBy(xpath = "//div[@class=\"bx-finder-company-department-employee-position\"]")
    public WebElement selectAnEmailFromEmpAndDep;

    @FindBy(id = "blog-submit-button-save")
    public WebElement messageSendButton;

    @FindBy(className = "bx-editor-iframe")
    public WebElement textEditorFrame;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement textBoxEmailUsers;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement selectAnEmailFromEmailUsers;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkTextBox;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURLBox;

    @FindBy(id = "cancel")
    public WebElement linkCancelButton;

    @FindBy(id = "undefined")
    public WebElement linkSaveButton;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideo;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoLinkBox;

    @FindBy(xpath = "//img[starts-with(@id,'bxid')]")
    public WebElement addedVideoLink;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement videoWasNotFound;

    @FindBy(id = "undefined")
    public WebElement saveButtonForVideo;

    @FindBy(xpath = "//img[@title='Video']")
    public WebElement videoAddedSuccessfully;

    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement quoteTextButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteTextBox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionButton;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_mention')]")
    public WebElement employeesAndDepartmentsForAddMention;

    @FindBy(xpath = "//div[@class = 'bx-finder-company-department-employee-position']")
    public WebElement selectEmployeesAndDepForAddMention;

    @FindBy(xpath = "//span[@class = 'feed-add-post-destination-text']")
    public WebElement checkSelectedEmployees;

    @FindBy(xpath = "//span[@id = 'lhe_button_editor_blogPostForm']")
    public WebElement visualEditorButton;

    @FindBy(xpath = "//div[@id = 'bx-html-editor-tlbr-idPostFormLHE_blogPostForm']")
    public WebElement visualEditorTab;

    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement topicButton;

    @FindBy(id = "POST_TITLE")
    public WebElement topicTitle;

    @FindBy(xpath = "//span[@class = 'feed-add-post-form-but-cnt feed-add-videomessage']")
    public WebElement recordVideoButton;

    @FindBy(xpath = "//span[@class = 'popup-window-button popup-window-button-blue']")
    public WebElement allowDeviceAccessButton;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    public WebElement errorMessage;


    public void navigateToAnnouncement(){
        moreButton.click();
        announcementButton.click();
    }

    public void addLinkAfterClick(String text, String url){
        linkText.sendKeys(text);
        linkUrl.sendKeys(url);
        Driver.get().findElement(By.id("undefined")).click();
    }




}

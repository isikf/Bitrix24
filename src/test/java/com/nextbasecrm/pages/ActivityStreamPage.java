package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.*;

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

    //In another frame
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

    //In another frame
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
    public WebElement pollButton;

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

    @FindBy(xpath = "//input[contains(@id,'LIVEFEED')]")
    public WebElement filterAndSearchInput;

    @FindBy(id = "LIVEFEED_search_container")
    public WebElement filterAndSearchInputContainer;


    @FindBy(className = "main-ui-filter-add-item")
    public WebElement saveFilterButtonAfterFilterAndSearch;

    @FindBy(className = "main-ui-filter-sidebar-edit-control")
    public WebElement filterNameInputAfterSaveFilterButton;

    @FindBy(xpath = "//*[@class='main-ui-control main-ui-select']")
    public List<WebElement> dateDropdownInFilterAndSearch;

    @FindBy(xpath = "//*[@class='main-ui-control main-ui-multi-select']")
    public List<WebElement> typeDropdownInFilterAndSearch;

    @FindBy(xpath = "//*[contains(@class,'main-ui-filter-save')]")
    public WebElement saveButtonAfterSaveFilter;

    @FindBy(xpath = "//*[contains(@class,'main-ui-filter-find')]")
    public WebElement searchButtonInFilterAndSearch;

    @FindBy(xpath = "//div[contains(@class,'feed-post-cont-wrap')]")
    public List<WebElement> resultsAfterUsingFilterAndSearch;

    @FindBy(xpath = "//*[@class='main-ui-item-icon main-ui-search']")
    public WebElement findIconInFilterAndSearchInput;

    @FindBy(xpath = "//*[@class='main-ui-filter-sidebar-item'][1]")
    public WebElement workButtonInFilterAndSearchInput;

    @FindBy(xpath = "//*[@class='main-ui-filter-sidebar-item'][2]")
    public WebElement favoritesButtonInFilterAndSearchInput;

    @FindBy(xpath = "//*[@class='main-ui-filter-sidebar-item'][3]")
    public WebElement myActivityButtonInFilterAndSearchInput;

    @FindBy(xpath = "//*[@class='main-ui-filter-sidebar-item'][4]")
    public WebElement announcementsButtonInFilterAndSearchInput;

    @FindBy(xpath = "//*[@class='main-ui-filter-sidebar-item'][5]")
    public WebElement workflowsButtonInFilterAndSearchInput;

    @FindBy(xpath = "//span[@class = 'feed-add-post-form-but-cnt feed-add-videomessage']")
    public WebElement recordVideoButton;

    @FindBy(xpath = "//span[@class = 'popup-window-button popup-window-button-blue']")
    public WebElement allowDeviceAccessButton;

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;


    public void insertVideo(String link){
        videoIcon.click();
        videoSourceInput.sendKeys(link);
        BrowserUtils.waitForVisibility(videoTitleBox,3);
        WebElement saveButton = Driver.get().findElement(By.id("undefined"));
        BrowserUtils.waitForVisibility(saveButton,5);
        saveButton.click();
    }

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImagesPoll;




    public void navigateToAnnouncement(){
        moreButton.click();
        announcementButton.click();
    }

    public void addLink(String text, String url){
        linkIcon.click();
        linkText.sendKeys(text);
        linkUrl.sendKeys(url);
        if(text.isEmpty() && url.isEmpty()){
            return;
        }
        Driver.get().findElement(By.id("undefined")).click();
    }



    /**
     * this methot navigate for activityStream page's tabs
     * Tlh
     */
    public void navigateToTab(String tab){

        WebElement tabElement = Driver.get().findElement(By.xpath("//div[@id='feed-add-post-form-tab']//span[contains(text(),'" + tab + "')]"));
        BrowserUtils.waitForClickablility(tabElement,5);
        // navigateToModule("Activity Stream");
        tabElement.click();
    }
    /**
     * This method will getting under the Active Stream main module all tab
     * If we write 'Message' it will go to the Message fields..
     * @adam
     * @param module
     */

    public void navigateAllUnderModule(String module){
        Actions actions = new Actions(Driver.get());
        try{
            actions.click(Driver.get().findElement(By.xpath("//span/span[.='"+module+"']")));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method will be click under the 'More' module all fields.
     * It will navigate to us under 'More' module File,Appreciation,Announcement,Workflow
     * @adam
     * @param moreField
     */

    public void navigateToMoreModule(String moreField){
        Actions actions = new Actions(Driver.get());
        try{
            actions.click(Driver.get().findElement(By.id("feed-add-post-form-link-text")));
            actions.moveToElement(Driver.get().findElement(By.xpath("//span/span[.='"+moreField+"']"))).click().perform();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



}

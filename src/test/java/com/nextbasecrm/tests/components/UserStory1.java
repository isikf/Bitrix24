package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.activityStream.ActivityStreamMessage;
import com.nextbasecrm.pages.activityStream.ActivityStreamPage;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory1  extends TestBase {

    LoginPage loginPage = new LoginPage();
    ActivityStreamMessage activityStreamMessage = new ActivityStreamMessage();

    @Test
    public void AC1(){

        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        driver.switchTo().frame(activityStreamMessage.textEditorFrame);
        activityStreamMessage.textInput.sendKeys("Hello World");
        driver.switchTo().defaultContent();

        activityStreamMessage.uploadFilesButton.click();


        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";
        String filePath = projectPath + "/" + relativePath;

        activityStreamMessage.uploadFilesAndImagesBtn.sendKeys(filePath);

        Assert.assertTrue(activityStreamMessage.uploadedFileMessage.isDisplayed());

        BrowserUtils.waitFor(2);


        //DOWNLOAD FROM EXTERNAL DRIVE ERROR
//        activityStreamPage.downloadFromExternalDrive.click();
//        Assert.assertFalse(activityStreamPage.externalErrorNotification.isDisplayed());


        //SELECT DOCUMENT FROM BITRIX24
        activityStreamMessage.selectDocFromBitrix24.click();
        activityStreamMessage.myDriveButton.click();
        activityStreamMessage.selectSalesAndMarketing.click();
        activityStreamMessage.selectMarketingAndAdvertising.click();
        activityStreamMessage.selectLogoGif.click();
        activityStreamMessage.selectDocumentButton.click();
        Assert.assertEquals(activityStreamMessage.attachedFilesNotification.getText(),"Attached files and images");

        BrowserUtils.waitFor(2);


        //CREATE USING OFFICE365
        activityStreamMessage.createUsingOffice365Button.click();
        activityStreamMessage.desktopApplicationsButton.click();

        Assert.assertTrue(activityStreamMessage.downloadButton.isEnabled());

        //activityStreamPage.downloadButton.click();





    }

    @Test
    public void AC2() {

        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();


        activityStreamMessage.allEmployeesBtn.click();
        activityStreamMessage.addByEmployeesAndDepartments.click();
        activityStreamMessage.selectAnEmailFromEmpAndDep.click();

        Assert.assertTrue(activityStreamMessage.checkSelectedEmployees2.isDisplayed());


        activityStreamMessage.addByEmailUsers.click();
        activityStreamMessage.textBoxEmailUsers.sendKeys("hr6@cybertekschool.com");
        activityStreamMessage.selectAnEmailFromEmailUsers.click();

        Assert.assertTrue(activityStreamMessage.checkSelectedEmployees3.isDisplayed());


    }

    @Test
    public void AC3() {

        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        activityStreamMessage.linkButton.click();
        activityStreamMessage.linkCancelButton.click();

        activityStreamMessage.linkButton.click();

        //activityStreamPage.linkTextBox.sendKeys("Title");

        String addedUrl = "https://login.nextbasecrm.com/stream/";

        BrowserUtils.waitFor(2);
        activityStreamMessage.linkURLBox.sendKeys(addedUrl);
        BrowserUtils.waitFor(4);

        //Assert.assertEquals(activityStreamPage.linkURLBox.getText(),"https://login.nextbasecrm.com/stream/");





    }

    @Test
    public void AC4(){

        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        activityStreamMessage.insertVideo.click();
        activityStreamMessage.videoLinkBox.sendKeys("https://youtu.be/BIab2VEg9Tw");

        Assert.assertTrue(activityStreamMessage.errorMessageforURL.isDisplayed());


    }

    @Test
    public void AC5(){

        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        activityStreamMessage.quoteTextButton.click();

        driver.switchTo().frame(activityStreamMessage.textEditorFrame);
        activityStreamMessage.quoteTextBox.sendKeys("Quote Text Box!");
        Assert.assertTrue(activityStreamMessage.quoteTextBox.isDisplayed());

        Assert.assertTrue(activityStreamMessage.quoteTextBox.isDisplayed());


    }

    @Test
    public void AC6(){


        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        activityStreamMessage.addMentionButton.click();

        activityStreamMessage.employeesAndDepartmentsForAddMention.click();
        activityStreamMessage.selectEmployeesAndDepForAddMention.click();
        Assert.assertTrue(activityStreamMessage.checkSelectedEmployees.isDisplayed());

    }

    @Test
    public void AC7() {

        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        activityStreamMessage.visualEditorButton.click();
        Assert.assertTrue(activityStreamMessage.visualEditorTab.isDisplayed());
    }

    @Test
    public void AC8() {

        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        activityStreamMessage.topicButton.click();
        Assert.assertTrue(activityStreamMessage.topicTitle.isDisplayed());

    }

    @Test
    public void AC9() throws InterruptedException {


        loginPage.loginAsHelpDesk();

        activityStreamMessage.messageButton.click();

        Thread.sleep(3000);
        activityStreamMessage.recordVideoButton.click();
        activityStreamMessage.allowDeviceAccessButton.click();

        BrowserUtils.waitFor(5);

        String actualRecordMessage = activityStreamMessage.errorMessage.getText();
        String expectedRecordMessage = "Succusfully Added";
        Assert.assertEquals(actualRecordMessage,expectedRecordMessage);

//        Assert.assertFalse(activityStreamPage.errorMessage.isDisplayed());

    }


}


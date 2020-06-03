package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;

import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.TreeMap;

public class UserStory1  extends TestBase {

    @Test
    public void AC1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

        driver.switchTo().frame(activityStreamPage.textEditorFrame);
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello World");
        driver.switchTo().defaultContent();

        activityStreamPage.uploadFilesButton.click();


        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";
        String filePath = projectPath + "/" + relativePath;

        activityStreamPage.uploadFilesAndImagesBtn.sendKeys(filePath);

        Assert.assertTrue(activityStreamPage.uploadedFileMessage.isDisplayed());

        Thread.sleep(2000);


        //DOWNLOAD FROM EXTERNAL DRIVE ERROR
//        activityStreamPage.downloadFromExternalDrive.click();
//        Assert.assertFalse(activityStreamPage.externalErrorNotification.isDisplayed());


        //SELECT DOCUMENT FROM BITRIX24
        activityStreamPage.selectDocFromBitrix24.click();
        activityStreamPage.myDriveButton.click();
        activityStreamPage.selectSalesAndMarketing.click();
        activityStreamPage.selectMarketingAndAdvertising.click();
        activityStreamPage.selectLogoGif.click();
        activityStreamPage.selectDocumentButton.click();
        Assert.assertEquals(activityStreamPage.attachedFilesNotification.getText(),"Attached files and images");

        Thread.sleep(2000);


        //CREATE USING OFFICE365 How I should
        activityStreamPage.createUsingOffice365Button.click();
        activityStreamPage.desktopApplicationsButton.click();
        activityStreamPage.downloadButton.click();


        Thread.sleep(5000);


    }

    @Test
    public void AC2() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

        driver.switchTo().frame(activityStreamPage.textEditorFrame);
        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello World");
        driver.switchTo().defaultContent();

        activityStreamPage.allEmployeesBtn.click();
        activityStreamPage.addByEmployeesAndDepartments.click();
        activityStreamPage.selectAnEmailFromEmpAndDep.click();

        activityStreamPage.addByEmailUsers.click();
        activityStreamPage.textBoxEmailUsers.sendKeys("hr6@cybertekschool.com");
        activityStreamPage.selectAnEmailFromEmailUsers.click();

        //activityStreamPage.popupWindowClose.click();





        //activityStreamPage.messageSendButton.click();

        Thread.sleep(3000);

    }

    @Test
    public void AC3()throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();


        activityStreamPage.linkButton.click();
        activityStreamPage.linkCancelButton.click();

        activityStreamPage.linkButton.click();

        activityStreamPage.linkTextBox.sendKeys("Test URL");
        activityStreamPage.wait(5000);
        activityStreamPage.linkURLBox.sendKeys("https://login.nextbasecrm.com/stream/");
//        activityStreamPage.linkSaveButton.click();


        activityStreamPage.wait(3000);


    }

    @Test
    public void AC4()throws InterruptedException{

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

//        activityStreamPage.insertVideo.click();
//        activityStreamPage.videoLinkBox.sendKeys("https://www.youtube.com/watch?v=K7z3590-Mt0");
//        Thread.sleep(5000);
//        activityStreamPage.linkCancelButton.click();


        activityStreamPage.insertVideo.click();
        activityStreamPage.videoLinkBox.sendKeys("https://youtu.be/BIab2VEg9Tw");
        BrowserUtils.waitFor(10);
        activityStreamPage.saveButtonForVideo.click();

        driver.switchTo().frame(activityStreamPage.textEditorFrame);
        String actualText = driver.findElement(By.xpath("//body[@ contenteditable ='true']")).getText();
        String expectedText = "";

        Assert.assertNotEquals(actualText,expectedText);

        //Assert.assertTrue(activityStreamPage.videoAddedSuccessfully.isDisplayed());



    }

    @Test
    public void AC5(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

//        driver.switchTo().frame(activityStreamPage.textEditorFrame);
//        driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hello World");
//        driver.switchTo().defaultContent();

        activityStreamPage.quoteTextButton.click();

        driver.switchTo().frame(activityStreamPage.textEditorFrame);
        activityStreamPage.quoteTextBox.sendKeys("Quote Text Box!");
        Assert.assertTrue(activityStreamPage.quoteTextBox.isDisplayed());
        driver.switchTo().defaultContent();

    }

    @Test
    public void AC6(){

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

        activityStreamPage.addMentionButton.click();

        activityStreamPage.employeesAndDepartmentsForAddMention.click();
        activityStreamPage.selectEmployeesAndDepForAddMention.click();
        Assert.assertTrue(activityStreamPage.checkSelectedEmployees.isDisplayed());

    }

    @Test
    public void AC7() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

        activityStreamPage.visualEditorButton.click();

        Assert.assertTrue(activityStreamPage.visualEditorTab.isDisplayed());
    }

    @Test
    public void AC8() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

        activityStreamPage.topicButton.click();
        Assert.assertTrue(activityStreamPage.topicTitle.isDisplayed());

    }

    @Test
    public void AC9() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHelpDesk();

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.messageButton.click();

        Thread.sleep(3000);
        activityStreamPage.recordVideoButton.click();
        activityStreamPage.allowDeviceAccessButton.click();

        BrowserUtils.waitFor(5);

        String actualRecordMessage = activityStreamPage.errorMessage.getText();
        String expectedRecordMessage = "Succusfully Added";
        Assert.assertEquals(actualRecordMessage,expectedRecordMessage);

//        Assert.assertFalse(activityStreamPage.errorMessage.isDisplayed());

    }


}


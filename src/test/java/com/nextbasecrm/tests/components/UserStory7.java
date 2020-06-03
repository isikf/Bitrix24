package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class UserStory7 extends TestBase {

    @Test
    public void test1(){
        extentLogger = report.createTest("Announcement Upload Verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login As Help Desk");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToAnnouncement();
        extentLogger.info("Go To Announcement");
    }
    @DataProvider
    public Object[][] linkData(){
        String[][] data = {
//                {"","https://www.youtube.com/"},
//                {"youtube","https://www.youtube.com/"},
//                {"youtube",""},
                {"",""}
        };
        return data;
    }
    @Test(dataProvider = "linkData")
    public void test3(String text, String url){
        extentLogger = report.createTest("Announcement Link Verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login As Help Desk");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToAnnouncement();
        extentLogger.info("Go To Announcement");
        Driver.get().switchTo().frame(0);
        activityStreamPage.textInput.clear();
        Driver.get().switchTo().parentFrame();
        activityStreamPage.addLink(text,url);
        extentLogger.info("Add Link");
        Driver.get().switchTo().frame(0);
        if(!text.isEmpty()) {
            Assert.assertTrue(Driver.get().findElement(By.linkText(text)).isDisplayed());
        }else if(!url.isEmpty()){
            Assert.assertTrue(Driver.get().findElement(By.linkText(url)).isDisplayed());
        }else{
            //you couldn't locate it
            Assert.assertFalse(Driver.get().findElement(By.xpath("(//input[@id ='undefined'])[2]")).isEnabled());
        }
        extentLogger.info("Verify link is displayed");
        extentLogger.pass("PASS");
    }

    @DataProvider
    public Object[] testData(){
        String[] data ={
                "https://www.youtube.com/watch?v=eIrMbAQSU34",
                "https://www.youtube.com/watch?v=5MgBikgcWnY",
                "https://www.youtube.com/watch?v=5MgB",
                "https://www.google.com"
        };
        return data;
    }
    @Test//(dataProvider = "testData")
    public void test4(/**String link*/){
        extentLogger = report.createTest("Announcement Video Insert Verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login As Help Desk");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToAnnouncement();
        extentLogger.info("Go to announcement");
        Driver.get().switchTo().frame(0);
        activityStreamPage.textInput.clear();
        Driver.get().switchTo().parentFrame();
    //    activityStreamPage.insertVideo(link);
        activityStreamPage.videoIcon.click();
        activityStreamPage.videoSourceInput.sendKeys("https://www.youtube.com/watch?v=eIrMbAQSU34");
        BrowserUtils.waitForVisibility(activityStreamPage.videoTitleBox,5);
        WebElement saveButton = Driver.get().findElement(By.id("defined"));
        BrowserUtils.waitForClickablility(saveButton,5);
        saveButton.click();
        extentLogger.info("Click video icon to insert video");
        BrowserUtils.waitFor(3);
    }

    @Test
    public void test5(){
        extentLogger = report.createTest("Announcement Quote Verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login As Help Desk");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToAnnouncement();
        extentLogger.info("Go To Announcement");
        activityStreamPage.commaIcon.click();
        extentLogger.info("Click Comma Icon To Create Quote");
        Driver.get().switchTo().frame(0);
        Assert.assertTrue(activityStreamPage.blockQuote.isDisplayed());
        extentLogger.info("Verify Block Quote Is Displayed");
        extentLogger.pass("PASS");
    }
}

package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
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

    @Test
    public void test2(){
        extentLogger = report.createTest("Announcement Link Verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login As Help Desk");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToAnnouncement();
        extentLogger.info("Go To Announcement");
        Driver.get().switchTo().frame(0);
        Driver.get().findElement(By.xpath("//body[@contenteditable='true']")).clear();
        Driver.get().switchTo().parentFrame();
        activityStreamPage.linkIcon.click();
        extentLogger.info("Click link icon to create link");
        String text = "amazon";
        String url = "https://www.amazon.co.uk/";
        activityStreamPage.addLinkAfterClick(text,url);
        extentLogger.info("Add Link");
        Driver.get().switchTo().frame(0);
        if(!text.isEmpty()) {
            Assert.assertTrue(Driver.get().findElement(By.linkText(text)).isDisplayed());
        }else{
            Assert.assertTrue(Driver.get().findElement(By.linkText(url)).isDisplayed());
        }
        extentLogger.info("Verify link is displayed");
        extentLogger.pass("PASS");
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

package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.Driver;
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

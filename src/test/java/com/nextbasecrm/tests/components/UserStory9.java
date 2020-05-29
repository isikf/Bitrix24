package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory9 extends TestBase {

    @Test
    public void test3(){
        extentLogger = report.createTest("Search Written Message Verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login as a Help Desk");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToAnnouncement();
        extentLogger.info("Go to announcement");
        Driver.get().switchTo().frame(0);
        String text = "Final Announcement emergency";
        activityStreamPage.textInput.clear();
        extentLogger.info("Clear text input");
        activityStreamPage.textInput.sendKeys(text);
        extentLogger.info("Type something");
        Driver.get().switchTo().parentFrame();
        activityStreamPage.sendTextButton.click();
        extentLogger.info("Send the message");
        BrowserUtils.waitFor(3);
        activityStreamPage.searchInput.sendKeys(text.split(" ")[0] + Keys.ENTER);
        extentLogger.info("Search something");
        String textOfWrittenMessage = Driver.get().findElement(By.xpath("//div[@class='feed-post-text-block-inner-inner']")).getText();
        Assert.assertTrue(textOfWrittenMessage.contains(text));
        extentLogger.info("Verify that this message is diplayed");
        extentLogger.pass("PASS");
    }
}

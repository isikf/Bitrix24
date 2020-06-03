package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory9 extends TestBase {

    @Test
    public void test1(){
        extentLogger = report.createTest("Search by clicking on default filters verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login as a Help Desk");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.navigateToAnnouncement();
        extentLogger.info("Navigate to announcement");
        Driver.get().switchTo().frame(0);
        activityStreamPage.textInput.sendKeys("test Filter and Search Input");
        extentLogger.info("Type something in textInput");
        Driver.get().switchTo().parentFrame();
        activityStreamPage.sendTextButton.click();
        extentLogger.info("Send this message");
        activityStreamPage.filterAndSearchInput.click();
        extentLogger.info("Click filter and search input");
        activityStreamPage.announcementsButtonInFilterAndSearchInput.click();
        extentLogger.info("click announcements as default filter");
        Assert.assertFalse(activityStreamPage.resultsAfterUsingFilterAndSearch.isEmpty());
        extentLogger.info("Verify it can be searched by default filters");
        extentLogger.pass("PASS");
    }

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

    @Test
    public void test4(){
        extentLogger = report.createTest("Save Filter functionality verification");
        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login as Help Desker");
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.filterAndSearchInputContainer.click();
        extentLogger.info("Click on filter and search input");
        activityStreamPage.saveFilterButtonAfterFilterAndSearch.click();
        extentLogger.info("Click on save filter button");
        String name = "example2";
        activityStreamPage.filterNameInputAfterSaveFilterButton.sendKeys(name);
        extentLogger.info("name the filter");
//        List<WebElement> dateDropdownInFilterAndSearch = activityStreamPage.dateDropdownInFilterAndSearch;
//        dateDropdownInFilterAndSearch.get(0).click();
//        extentLogger.info("Select one type of date");
//        List<WebElement> typeDropdownInFilterAndSearch = activityStreamPage.typeDropdownInFilterAndSearch;
//        typeDropdownInFilterAndSearch.get(0).click();
//        extentLogger.info("Select one type of type");
        activityStreamPage.saveButtonAfterSaveFilter.click();
        activityStreamPage.searchButtonInFilterAndSearch.click();
        extentLogger.info("Save this filter and search");
        Assert.assertTrue(Driver.get().findElement(By.xpath("//*[text()='"+name+"'][@class='main-ui-square-item']")).isDisplayed());
        extentLogger.info("Verify that this filter is displayed");
        extentLogger.pass("PASS");
    }
}

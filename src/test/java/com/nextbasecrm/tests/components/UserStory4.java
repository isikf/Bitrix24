package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory4 extends TestBase {
    LoginPage loginPage = new LoginPage();
    ActivityStreamPage activityStreamPage =new ActivityStreamPage();

    @Test
    public void AC1(){
        extentLogger=report.createTest("US 4 AC1 test");

        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login as a help desk");

        ActivityStreamPage activityStreamPage =new ActivityStreamPage();

        WebElement PollButton = driver.findElement(By.xpath("//div[@id='feed-add-post-form-tab']//span[.='Poll']"));
        PollButton.click();
        extentLogger.info("Click on poll button");

        WebElement uploadFileIcon = driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileIcon.click();
        extentLogger.info("Click on upload file icon");

        String path = System.getProperty("user.dir")+"/"+"src/test/resources/Istanbul.jpg";
        activityStreamPage.uploadFilesAndImagesPoll.sendKeys(path);
        extentLogger.info("Upload imaggs ");

        WebElement sendUploadButton =driver.findElement(By.id("blog-submit-button-save"));
        sendUploadButton.click();
        BrowserUtils.waitFor(5);



    }

    @Test
    public void AC2(){
        extentLogger=report.createTest("US 4 ac1-2 test");

        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login as a help desk");


        activityStreamPage.PollButton.click();
        extentLogger.info("Click on poll button");

        activityStreamPage.addMoreButton.click();
        extentLogger.info("Click on add more input box");

        activityStreamPage.recentOption.click();
        extentLogger.info("Click on recent option");

        WebElement recentEmployee = driver.findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[1]"));
        BrowserUtils.waitFor(5);
        recentEmployee.click();

        activityStreamPage.employeeAndDepartment.click();
        extentLogger.info("Click on employee and department option");

        WebElement firstEmployee = driver.findElement(By.cssSelector(".bx-finder-company-department-employee-name"));
        String expectedEmployeeName=firstEmployee.getText();
        firstEmployee.click();

        List<WebElement> listOfEmployees = driver.findElements(By.xpath("//span[@id='feed-add-post-destination-item']/span"));
        int number = listOfEmployees.size();
        Assert.assertEquals(listOfEmployees.get(number-1).getText(),expectedEmployeeName);

    }
    @Test
    public void AC3 () {
        extentLogger=report.createTest("US 4 AC3 test");

        loginPage.loginAsHelpDesk();
        extentLogger.info("Login as a help desk");

        activityStreamPage.PollButton.click();
        extentLogger.info("Click on poll button");

        activityStreamPage.addLink("Cybertek Mainpage", "www.cybertekschool.com");
        extentLogger.info("Add Cybertek mainpage text and link");

        activityStreamPage.sendTextButton.click();
        extentLogger.info("Click send button");

        activityStreamPage.searchAndFilterButton.click();
        extentLogger.info("Click on filter and search button");

        activityStreamPage.myActivityButtonInFilterAndSearchInput.click();
        extentLogger.info("Click on my activity button in filter and search button");

    }

}

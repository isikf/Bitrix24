package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory4 extends TestBase {
    @Test
    public void AC1(){
        extentLogger=report.createTest("US 4 ac1-2 test");

        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login as a help desk");

        WebElement PollButton = driver.findElement(By.xpath("//div[@id='feed-add-post-form-tab']//span[.='Poll']"));
        PollButton.click();
        extentLogger.info("Click on poll button");

        WebElement uploadFileIcon = driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileIcon.click();
        extentLogger.info("Click on upload file icon");

        String path = System.getProperty("user.dir")+"/"+"src/test/resources/Istanbul.jpg";

        WebElement uploadFilesAndImages = driver.findElement(By.xpath("((//table/tbody)[7]//td)[1]"));
        //WebElement uploadFilesAndImages =driver.findElement(By.cssSelector(".wd-fa-add-file-light-title-text"));
        //wait.until(ExpectedConditions.elementToBeClickable(uploadFilesAndImages));
        uploadFilesAndImages.click();

    }

    @Test
    public void AC2(){
        extentLogger=report.createTest("US 4 ac1-2 test");

        new LoginPage().loginAsHelpDesk();
        extentLogger.info("Login as a help desk");

        ActivityStreamPage activityStreamPage =new ActivityStreamPage();
        activityStreamPage.PollButton.click();
        extentLogger.info("Click on poll button");

        activityStreamPage.addMoreButton.click();
        extentLogger.info("Click on add more input box");

        activityStreamPage.recentOption.click();
        extentLogger.info("Click on recent option");

        WebElement recentEmployee = driver.findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[1]"));
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
}

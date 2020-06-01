package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory4 extends TestBase {
    @Test
    public void test1(){
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

        //WebElement uploadFilesAndImages = driver.findElement(By.xpath("(//div[@class='diskuf-uploader'])[1]"));
        WebElement uploadFilesAndImages = driver.findElement(By.xpath("((//table/tbody)[7]//td)[1]"));
        uploadFilesAndImages.sendKeys(path);


        WebElement addUsersButton = driver.findElement(By.id("feed-add-post-destination-container"));
        addUsersButton.click();

        WebElement recentOption = driver.findElement(By.cssSelector(".bx-finder-box-tab.bx-lm-tab-last.bx-finder-box-tab-selected"));
        recentOption.click();
        driver.findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[2]")).click();

        WebElement employeeAndDepartmentsOption = driver.findElement(By.cssSelector(".bx-finder-box-tab.bx-lm-tab-department"));
        employeeAndDepartmentsOption.click();




    }
}

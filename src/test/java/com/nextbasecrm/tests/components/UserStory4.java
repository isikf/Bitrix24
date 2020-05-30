package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory4 extends TestBase {
    @Test
    public void test1(){
        new LoginPage().loginAsHelpDesk();

        WebElement PollButton = driver.findElement(By.xpath("//div[@id='feed-add-post-form-tab']//span[.='Poll']"));
        PollButton.click();

        WebElement uploadFileButton = driver.findElement(By.id("bx-b-uploadfile-blogPostForm"));
        uploadFileButton.click();

        String path = System.getProperty("user.dir")+"/"+"src/test/resources/Istanbul.png";

        WebElement uploadFromLocal = driver.findElement(By.xpath("(//div[@class='diskuf-uploader'])[1]"));
        uploadFromLocal.sendKeys(path);


        WebElement addUsersButton = driver.findElement(By.id("feed-add-post-destination-container"));
        addUsersButton.click();

        WebElement recentOption = driver.findElement(By.cssSelector(".bx-finder-box-tab.bx-lm-tab-last.bx-finder-box-tab-selected"));
        recentOption.click();
        driver.findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[2]")).click();

        WebElement employeeAndDepartmentsOption = driver.findElement(By.cssSelector(".bx-finder-box-tab.bx-lm-tab-department"));
        employeeAndDepartmentsOption.click();




    }
}

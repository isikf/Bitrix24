package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserStory10 extends TestBase {

    @DataProvider
    public Object[][] testData(){

        String [][] data = {

                //{"marketing5@cybertekschool.com","UserUser"},
                {ConfigurationReader.get("marketing_username"),ConfigurationReader.get("marketing_password")}

        };
        return data;
    }

    @Test(dataProvider = "testData")
    public void test1(String username,String password){
        extentLogger=report.createTest("User Story 10 AC:1");
        new LoginPage().login(username,password);
        extentLogger.info("login as a marketing user");

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        wait.until(ExpectedConditions.visibilityOf(activityStreamPage.activityStreamPageTitle));

        //WebElement likeButton = driver.findElement(By.xpath("//span[starts-with(@id,'bx-ilike-button-BLOG_POST_179-')]"));
        WebElement likeButton = driver.findElement(By.cssSelector(".bx-ilike-text"));
        likeButton.click();
        extentLogger.info("Click on first post's like button");
        String likedUsers = driver.findElement(By.cssSelector(".feed-post-emoji-top-panel-outer")).getText();

        if(likedUsers.contains("You")){
            Assert.assertTrue(likedUsers.contains("You"),"Verify that you liked the first post");
        }else{
            likeButton.click();
            String likedUsers2 = driver.findElement(By.cssSelector(".feed-post-emoji-top-panel-outer")).getText();
            Assert.assertTrue(likedUsers2.contains("You"));
        }
        extentLogger.info("Verify that You liked the first post");

        WebElement commentButton = driver.findElement(By.cssSelector(".feed-inform-comments"));
        commentButton.click();
        extentLogger.info("Click on first post's comment button");

        driver.switchTo().frame(0);
        extentLogger.info("Switch your frame to comment input box frame");

        WebElement commentInputBox = driver.findElement(By.xpath("//body[@style='min-height: 84px;']"));
        String expectedComment="Have a good day";
        commentInputBox.sendKeys(expectedComment);
        extentLogger.info("Write your comment");

        driver.switchTo().defaultContent();
        extentLogger.info("Switch your frame to main html");

        WebElement sendButton = driver.findElement(By.cssSelector(".ui-btn.ui-btn-sm.ui-btn-primary"));
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        sendButton.click();

        extentLogger.info("Click send comment button");
        BrowserUtils.waitFor(3);

        List<WebElement> comments = driver.findElements(By.xpath("(//div[starts-with(@id,'blg-comment-')])[1]/div"));
        WebElement lastComment=driver.findElement(By.xpath("(//div[starts-with(@id,'blg-comment-')])[1]/div["+(comments.size()-1)+"]//div[1]/div[2]/div[2]/div[1]/div"));
        String actualComment =lastComment.getText();
        Assert.assertEquals(actualComment,expectedComment,"Verify your comment");


        WebElement unfollowFirstPost =driver.findElement(By.cssSelector(".feed-inform-follow"));
        if(unfollowFirstPost.getText().equals("Unfollow")){
            unfollowFirstPost.click();
            Assert.assertEquals(unfollowFirstPost.getText(),"Follow");
        }else {
            unfollowFirstPost.click();
            Assert.assertTrue(unfollowFirstPost.getText().equals("Unfollow"));
        }
        extentLogger.info("Click on unfollow button of first post's");
        extentLogger.pass("US10 AC1:PASS");


    }
    @Test(dataProvider = "testData")
    public void test3(String username,String password){

        extentLogger=report.createTest("User Story 10 AC:1");
        new LoginPage().login(username,password);
        extentLogger.info("login as a marketing user");

        WebElement pageTitle = driver.findElement(By.id("pagetitle"));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));

        WebElement reviewer = driver.findElement(By.xpath("//a[starts-with(@class,'feed-com-name  feed-author-name feed-author-name-')]"));
        reviewer.click();
        extentLogger.info("Click on first reviewer name");
        //WebElement profileMenu = driver.findElement(By.cssSelector(".profile-menu-name"));
        //wait.until(ExpectedConditions.visibilityOf(profileMenu));

        WebElement title = driver.findElement(By.id("pagetitle"));
        Assert.assertTrue(title.isDisplayed());
        extentLogger.info("Verify that reviewer name's profile is displayed");
        extentLogger.pass("PASS");


    }

    @Test(dataProvider = "testData")
    public void test4(String username,String password){

        extentLogger=report.createTest("User Story 10 AC:1");
        new LoginPage().login(username,password);
        extentLogger.info("login as a marketing user");

        WebElement starIcon = driver.findElement(By.cssSelector(".feed-post-important-switch"));
        starIcon.click();
        extentLogger.info("Click star icon on first post");

        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.searchAndFilterButton.click();
        extentLogger.info("Click on search and filter input box");

        /*WebElement searchAndFilterButton = driver.findElement(By.id("LIVEFEED_search"));
        searchAndFilterButton.click();

        WebElement favoritesButton = driver.findElement(By.xpath("(//span[@class='main-ui-filter-sidebar-item-text'])[1]"));
        favoritesButton.click();
         */

        activityStreamPage.favoriteButton.click();
        extentLogger.info("Go to favorites page");

        WebElement favoritedPost = driver.findElement(By.cssSelector(".feed-post-important-switch.feed-post-important-switch-active"));
        extentLogger.info("Find the favorited post");

        Assert.assertTrue(favoritedPost.isDisplayed());
        /*if(!favoritedPost.isDisplayed()){
            starIcon.click();
            activityStreamPage.searchAndFilterButton.click();
            activityStreamPage.favoriteButton.click();
            Assert.assertTrue(favoritedPost.isDisplayed());

        }

         */
        extentLogger.info("Verify that office photo post is favorited");
        extentLogger.pass("PASS");

    }

}

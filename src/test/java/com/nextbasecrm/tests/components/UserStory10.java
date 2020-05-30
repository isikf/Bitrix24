package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserStory10 extends TestBase {

    @DataProvider
    public Object[][] testData(){
        String [][] data = {

                {"marketing5@cybertekschool.com","UserUser"}

        };
        return data;
    }

    @Test(dataProvider = "testData")
    public void test1(String username,String password){
        extentLogger=report.createTest("User Story 10 AC:1");
        new LoginPage().login(username,password);
        extentLogger.info("login as a marketing user");

        WebElement pageTitle = driver.findElement(By.id("pagetitle"));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));

        WebElement likeButton = driver.findElement(By.xpath("//span[starts-with(@id,'bx-ilike-button-BLOG_POST_179-')]"));
        likeButton.click();
        extentLogger.info("Click on like button");

        String likedUsers=driver.findElement(By.cssSelector(".feed-post-emoji-text-box.feed-post-emoji-move-to-right")).getText();
        extentLogger.info("Collect likedUseers name");

        if(likedUsers.contains("You")){
            Assert.assertTrue(likedUsers.contains("You"),"verify that you liked this post");
            System.out.println("You liked the post just now");
        }else if(!likedUsers.contains("You")){
            Assert.assertFalse(likedUsers.contains("You"),"verify that you unliked this post");
            System.out.println("You unliked the post because you already iked that post before");
        }


        WebElement commentButton = driver.findElement(By.id("blog-post-addc-add-179"));
        commentButton.click();
        extentLogger.info("Click on comment button");

        driver.switchTo().frame(0);
        extentLogger.info("Switch your frame");

        WebElement commentInput = driver.findElement(By.xpath("//body[@style='min-height: 84px;']"));
        String expectedComment="Nice photo";
        commentInput.sendKeys(expectedComment);
        extentLogger.info("Write your comment");

        driver.switchTo().defaultContent();
        extentLogger.info("Switch your frame to default");

        driver.findElement(By.cssSelector(".ui-btn.ui-btn-sm.ui-btn-primary")).click();
        extentLogger.info("Click send comment button");

        String actualComment=driver.findElement(By.xpath("")).getText();

        Assert.assertEquals(actualComment,expectedComment,"verify your comment is displayed");

        WebElement unfollow =driver.findElement(By.xpath("//span[@onclick='__blogPostSetFollow(873)']"));
        unfollow.click();
        extentLogger.info("Click on unfollow button");

        Assert.assertEquals(unfollow.getText(),"Follow");


    }
    @Test(dataProvider = "testData")
    public void test3(String username,String password){

        extentLogger=report.createTest("User Story 10 AC:1");
        new LoginPage().login(username,password);
        extentLogger.info("login as a marketing user");

        WebElement pageTitle = driver.findElement(By.id("pagetitle"));
        wait.until(ExpectedConditions.visibilityOf(pageTitle));

        WebElement reviewer = driver.findElement(By.cssSelector("#bpc_BLOG_179-177"));
        reviewer.click();
        extentLogger.info("Click on reviewer name");
        //WebElement profileMenu = driver.findElement(By.cssSelector(".profile-menu-name"));
        //wait.until(ExpectedConditions.visibilityOf(profileMenu));

        WebElement title = driver.findElement(By.id("pagetitle"));
        Assert.assertTrue(title.isDisplayed());
        extentLogger.info("Verify that reviewer name's profile");
        extentLogger.pass("PASS");


    }

    @Test(dataProvider = "testData")
    public void test4(String username,String password){

        extentLogger=report.createTest("User Story 10 AC:1");
        new LoginPage().login(username,password);
        extentLogger.info("login as a marketing user");

        WebElement starIcon = driver.findElement(By.cssSelector("#log_entry_favorites_896"));
        extentLogger.info("Click star icon on office post");

        WebElement searchAndFilterButton = driver.findElement(By.id("LIVEFEED_search"));
        searchAndFilterButton.click();

        WebElement favoritesButton = driver.findElement(By.xpath("(//span[@class='main-ui-filter-sidebar-item-text'])[1]"));
        favoritesButton.click();
        extentLogger.info("Go to favorites posts page");

        WebElement favoritedPost = driver.findElement(By.id("disk-attach-image-197"));

        Assert.assertTrue(favoritedPost.isDisplayed());
        extentLogger.info("Verify that office photo post is favorited");
        extentLogger.pass("PASS");



    }

}

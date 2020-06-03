package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.ActivityStreamEvent;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.ConfigurationReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserStory3 extends TestBase {


    @DataProvider(name ="user credentials")
    public Object[] userData(){
        return new Object[] {
                "helpdesk",
//                "marketing",
//                "hr"
        };
    }
    @Test (dataProvider = "user credentials")
    public void createEvent(String user){
    // USER STORY 3: 3. As a user, I should be able to create events by clicking on Event tab under Activity Stream.
    // AC:
//        1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
//        2. User should be able to attach link by clicking on the link icon.
//        4. User should be able to insert videos by clicking on the video icon and entering the video URL.
//        5. User should be able to create a quote by clicking on the Comma icon.
//        6. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
//        7. User should be able to add Event start and ending date and time, and specify the time zone.
//        8. User should be able to set reminder by entering the timeing.
//        9. User should be able to select event location from dropdown.
//        10. User should be able to add attendees by selecting contacts individually or adding grups and departments.
//        11. Useer should be able to click on More to specify the event details.

        extentLogger = report.createTest("TestCase US-3: create events by clicking on Event tab under Activity Stream");

        extentLogger.info("username: " + ConfigurationReader.get(user+"_username"));
        extentLogger.info("password: " + ConfigurationReader.get(user+"_password"));

        LoginPage loginPage = new LoginPage();

        extentLogger.info("Login as a"+user);
        loginPage.loginAs(user);

        extentLogger.info("Navigate to Activity Stream -> Event");
        ActivityStreamPage activityStream = new ActivityStreamPage();
        ActivityStreamEvent eventPage = new ActivityStreamEvent();
        activityStream.navigateToTab("Event");


        //Ac 1 varification from mardan

        //Ac 2 verification dome by talha

    }
}
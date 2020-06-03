package com.nextbasecrm.tests.components;

import com.nextbasecrm.pages.ActivityStreamAppreciation;
import com.nextbasecrm.pages.ActivityStreamPage;
import com.nextbasecrm.pages.DashboardPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.tests.TestBase;
import org.testng.annotations.Test;

public class UserStory6 extends TestBase {


    @Test

    public void tC1(){

        LoginPage loginPage=new LoginPage();
        loginPage.loginAsHR();

        DashboardPage dashboardPage= new DashboardPage();
        //dashboardPage.waitUntilNoContactsAppear();

        dashboardPage.navigateToModule("MORE","Appreciation");
        //dashboardPage.navigateToModule("TASK",null);

         ActivityStreamAppreciation ActStApp= new ActivityStreamAppreciation();
         ActStApp.postbuttonAction("Link");







    }
}

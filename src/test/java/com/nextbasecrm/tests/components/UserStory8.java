package com.nextbasecrm.tests.components;


import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.activityStream.ActivityStreamWorkflows;
import com.nextbasecrm.tests.TestBase;
import com.nextbasecrm.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory8 extends TestBase {

    /*
    As a user, I should be able to create and send workflows by selecting different workflows from "More" tab under Activity Stream.

    1. User should be able to request a Leave Approval by: assigning approvers and processors; selecting start
    and ending date from date picker; select Absence type from dropdown; and entering reason for leave information.
    2. User should be able to request a Business Trip by: assigning approvers, processors and entering user instructions;
    entering trip Title, Destination, Purpose, Planned Expenses and Currency information; selecting start
    and ending date from date picker; and attach documents.
    3. User should be able to send a General Request by entering request Title, Description, priority level and Send Request To field.
    4. User should be able to send a Purchase Request by: assigning approvers and processors; entering Request Title, Amount
    and Currency; and attach documents.
    5. User should be able to send a Expense Report by: assigning approvers and accountants; entering Report Title, Amount
    and Currency; and attach files.
    6. User should be able to create new workflows.
    7. User should be able to access Workflows Directory page.
     */

    LoginPage loginPage = new LoginPage();
    ActivityStreamWorkflows activityStreamWorkflows = new ActivityStreamWorkflows();

    @Test
    public void testcase1(){
        loginPage.loginAsHR();
        BrowserUtils.waitFor(2);
        activityStreamWorkflows.openWorkflowModule("Activity Stream","More","Leave Approval");
    }

    @Test
    public void verifyLeaveApproval(){
        loginPage.loginAsHR();
        BrowserUtils.waitFor(2);
        activityStreamWorkflows.navigateToModule("Activity Stream","More");
        activityStreamWorkflows.navigateToSubModule("Leave Approval");
        activityStreamWorkflows.setLeaveAproval();
        String expectedApprovalMessage = "Your leave is waiting approval";
        Assert.assertTrue(activityStreamWorkflows.approvalSubmitMessage.isDisplayed());
        Assert.assertEquals(activityStreamWorkflows.approvalSubmitMessage.getText(),expectedApprovalMessage,"verify leave approval");
    }

    @Test
    public void verifyBusinessTrip() {
        loginPage.loginAsHR();
        BrowserUtils.waitFor(2);
        activityStreamWorkflows.openWorkflowModule("Activity Stream","More","Business Trip");
        activityStreamWorkflows.setBusinessTrip();
        BrowserUtils.waitFor(2);
        String expectedBusinessMessage = "Your business trip is waiting approval";
        Assert.assertEquals(activityStreamWorkflows.approvalSubmitMessage.getText(),expectedBusinessMessage,"verify business trip");

    }

    @Test
    public void verifyGeneralRequest() {
        loginPage.loginAsHR();
        BrowserUtils.waitFor(2);
        activityStreamWorkflows.openWorkflowModule("Activity Stream","More","General Request");

        activityStreamWorkflows.setGeneralRequest();
        String sendGeneralRequestTitle = "In Progress";
        BrowserUtils.waitFor(5);
        Assert.assertTrue(activityStreamWorkflows.generalRequestText.isDisplayed());
        Assert.assertEquals(activityStreamWorkflows.actualGeneralRequestTitle.getText(),sendGeneralRequestTitle,"verify general request");

    }

    @Test
    public void verifyPurchaseRequest() {
        loginPage.loginAsHR();
        BrowserUtils.waitFor(2);
        activityStreamWorkflows.openWorkflowModule("Activity Stream","More","Purchase Request");

        activityStreamWorkflows.setPurchaseRequest();
        String expectedBusinessMessage = "Your purchase request is waiting approval";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(activityStreamWorkflows.approvalSubmitMessage.getText(),expectedBusinessMessage,"verify business trip");


    }

    @Test
    public void verifyExpenseReport() {
        loginPage.loginAsHR();
        BrowserUtils.waitFor(2);
        activityStreamWorkflows.openWorkflowModule("Activity Stream","More","Expense Report");
        activityStreamWorkflows.setExpenseReport();
        String expectedBusinessMessage = "Your expense report is waiting approval";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(activityStreamWorkflows.approvalSubmitMessage.getText(),expectedBusinessMessage,"verify business trip");

    }

    @Test
    public void verifyWorkflowsDirectory() {
        loginPage.loginAsHR();
        BrowserUtils.waitFor(2);
        activityStreamWorkflows.openWorkflowModule("Activity Stream","More","Workflows Directory");
        String expectedMessage = "Workflow Directory";
        Assert.assertEquals(activityStreamWorkflows.setWorkflowsDirectory(),expectedMessage,"verify workflows directory");

    }

    @Test
    public void verifyNewWorkflows(){
        
    }

}

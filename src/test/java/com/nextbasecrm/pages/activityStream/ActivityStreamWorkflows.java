package com.nextbasecrm.pages.activityStream;
import com.nextbasecrm.pages.BasePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.NoSuchElementException;

public class ActivityStreamWorkflows extends BasePage {

    //Omer abi and Hasan abi
    //SM and SWE

    @FindBy(xpath = "(//span[contains(text(),'Leave Approval')]")
    public WebElement fileBtn;

    @FindBy(xpath = "(//span[contains(text(),'Workflow')])[3]")
    public WebElement workflowBtn;

    @FindBy(xpath = "//span[contains(text(),'Leave Approval')]")
    public WebElement leaveApprovalBtn;

    @FindBy(xpath = "//span[contains(text(),'Business Trip')]")
    public WebElement businessTripBtn;

    @FindBy(xpath = "//span[contains(text(),'General Requests')]")
    public WebElement generalRequestsBtn;

    @FindBy(xpath = "//span[contains(text(),'Purchase Request')]")
    public WebElement purchaseRequestBtn;

    @FindBy(xpath = "//span[contains(text(),' Expense Report')]")
    public WebElement expenseReportBtn;

    @FindBy(xpath = "//span[contains(text(),'Workflows Directory')]")
    public WebElement workflowsDirectoryBtn;

    @FindBy(id = "bx-lists-notify-button-480")
    public WebElement permissionBtn;

    @FindBy(xpath = "(//span[@class='popup-window-close-icon popup-window-titlebar-close-icon'])[2]")
    public WebElement closeIconBtn;

    @FindBy(xpath = "(//span[@class='bx-lists-calendar-icon'])[1]")
    public WebElement startDateCalendar;

    @FindBy(xpath = "(//span[@class='bx-lists-calendar-icon'])[2]")
    public WebElement endDateCalendar;

    @FindBy(xpath = "//a[@class='bx-calendar-cell']")
    public List<WebElement> calendarDays;

    @FindBy(name = "PROPERTY_88")
    public WebElement selectforLeaveApproval;

    @FindBy(name = "PREVIEW_TEXT")
    public WebElement purposeBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement submitApproval;

    @FindBy(id = "bx-lists-block-errors")
    public WebElement approvalSubmitMessage;

    @FindBy(css = "input[name='NAME']")
    public WebElement titleBox;

    @FindBy(css = "input[name='PROPERTY_70[n0][VALUE]']")
    public WebElement businessDestinationBox;

    @FindBy(css = "input[name='PROPERTY_73[n0][VALUE]']")
    public WebElement businessExpensesBox;

    @FindBy(name = "PROPERTY_74")
    public WebElement selectBusinessCurrency;

    @FindBy(className = "sitemap-menu-lines")
    public WebElement menuBtn;

    @FindBy(name = "PROPERTY_84")
    public WebElement selectPriorityLevel;

    @FindBy(xpath = "//a[contains(text(),'Select')]")
    public WebElement selectBtn;

    @FindBy(className = "finder-box-search-textbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@bx-tooltip-user-id='484'])[2]")
    public WebElement searchName;

    @FindBy(className = "bx-lists-live-feed-title-link")
    public WebElement generalRequestText;

    @FindBy(xpath = "//span[contains(text(),'In Progress')]")
    public WebElement actualGeneralRequestTitle;

    @FindBy(name = "PROPERTY_90[n0][VALUE]")
    public WebElement amountBox;

    @FindBy(name = "PROPERTY_91")
    public WebElement selectPurchaseCurrency;

    @FindBy(name = "PROPERTY_79[n0][VALUE]")
    public WebElement expenseReportDescriptionBox;

    @FindBy(name = "PROPERTY_80[n0][VALUE]")
    public WebElement expenseReportAmountBox;

    @FindBy(name = "PROPERTY_81")
    public WebElement selectExpenseReportCurrency;

    @FindBy(xpath = "//span[@class='bx-lists-alert-text']")
    public WebElement workflowsDirectoryAlert;

    
    public void navigateToModule (String tab, String module) {
        menuBtn.click();
        String tabLocator = "//a[normalize-space()='" + tab + "' and contains(@class,'sitemap-section-item')]";

        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class,'feed-add-post-form-link')]";
//            Driver.get().findElement(By.xpath(tabLocator)).click();
//            BrowserUtils.waitFor(3);
//
//            Driver.get().findElement(By.xpath(moduleLocator)).click();
//            BrowserUtils.waitFor(5);

        BrowserUtils.waitForPageToLoad(3);
        try {
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            BrowserUtils.waitForClickablility(tabElement,5);
            tabElement.click();
            WebElement moduleElement = Driver.get().findElement(By.xpath(moduleLocator));
            BrowserUtils.waitForClickablility(moduleElement,5);
            moduleElement.click();
            //new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();//span[@class='menu-item-link-text'][contains(text(),'Mail')]
        } catch (NoSuchElementException e) {
            e.printStackTrace();


        }
    }

    public void navigateToSubModule(String module){
        workflowBtn.click();
        BrowserUtils.waitFor(3);
        String subModule = "//span[contains(text(),'"+module+"')]";
        try {
            WebElement subModuleElement = Driver.get().findElement(By.xpath(subModule));
            BrowserUtils.waitForClickablility(subModuleElement,5);
            subModuleElement.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

    }

    public void selectDate(){

        startDateCalendar.click();
        // calendarDays.get(5).click();
        Driver.get().findElement(By.xpath("//a[.='4']")).click();
        BrowserUtils.waitFor(2);
        // calendarDays.clear();
        endDateCalendar.click();
        // calendarDays.get(17).click();
        Driver.get().findElement(By.xpath("//a[.='19']")).click();
        BrowserUtils.waitFor(3);

    }


    public void setLeaveAproval() {
//            workflowBtn.click();
//            BrowserUtils.waitFor(3);
//            leaveApprovalBtn.click();
        permissionBtn.click();
        closeIconBtn.click();


        Select reasonDropdown = new Select(selectforLeaveApproval);
        reasonDropdown.selectByVisibleText("Annual leave");
        purposeBox.sendKeys("You cant reach me between 06/04/2019 - 06/19/2019");
        submitApproval.click();
        BrowserUtils.waitFor(2);

    }
    public void openWorkflowModule(String tab, String module, String subModule){
        navigateToModule(tab,module);
        navigateToSubModule(subModule);
        BrowserUtils.waitFor(3);
    }

    public void setBusinessTrip() {
//        workflowBtn.click();
//        BrowserUtils.waitFor(3);
//         businessTripBtn.click();
        permissionBtn.click();
        closeIconBtn.click();
        titleBox.sendKeys("Mr.John");
        businessDestinationBox.sendKeys("London");
        selectDate();
        purposeBox.sendKeys("Customer visit and meeting");
        businessExpensesBox.sendKeys("2000");

        Select currency = new Select(selectBusinessCurrency);
        currency.selectByVisibleText("GBP");
        submitApproval.click();

    }

    public void setGeneralRequest() {
//        workflowBtn.click();
//        BrowserUtils.waitFor(3);
//        generalRequestsBtn.click();

        titleBox.sendKeys("Mr.James");
        purposeBox.sendKeys("I will be off..Thanks");

        Select priorityLevel = new Select(selectPriorityLevel);
        priorityLevel.selectByVisibleText("High");
        BrowserUtils.waitFor(2);
        selectBtn.click();
       // BrowserUtils.executeJScommand(searchBox,"James");
        searchBox.sendKeys("James");
        BrowserUtils.waitFor(2);
        searchName.click();
       // BrowserUtils.clickWithJS(searchName);
        BrowserUtils.waitFor(1);
        submitApproval.click();


    }

    public void setPurchaseRequest() {

        permissionBtn.click();
        closeIconBtn.click();

        titleBox.sendKeys("Mr.James");
        amountBox.sendKeys("30000");

        Select purchaseCurrency = new Select(selectPurchaseCurrency);
        purchaseCurrency.selectByVisibleText("GBP");
        submitApproval.click();

    }

    public void setExpenseReport() {

        permissionBtn.click();
        closeIconBtn.click();

        titleBox.sendKeys("Mr.James");
        expenseReportDescriptionBox.sendKeys("Reporting for tester");
        expenseReportAmountBox.sendKeys("10000");
        Select expenseCurrency = new Select(selectExpenseReportCurrency);
        expenseCurrency.selectByVisibleText("GBP");
        submitApproval.click();
    }

    public String setWorkflowsDirectory() {
        return workflowsDirectoryAlert.getText();

    }
}

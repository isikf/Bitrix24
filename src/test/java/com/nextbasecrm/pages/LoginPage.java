package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(id="USER_REMEMBER")
    public WebElement rememberMeBox;

    @FindBy(tagName = "Forgot your password?")
    public WebElement forgotPasswordLink;

    public void login(String userNameStr, String passwordStr){
        userNameInput.sendKeys(userNameStr);
        passwordInput.sendKeys(passwordStr);
        loginButton.click();
    }

    public void loginAsHelpDesk(){
        userNameInput.sendKeys(ConfigurationReader.get("helpdesk_username"));
        passwordInput.sendKeys(ConfigurationReader.get("helpdesk_password"));
        loginButton.click();
    }

    public void loginAsMarketing(){
        userNameInput.sendKeys(ConfigurationReader.get("marketing_username"));
        passwordInput.sendKeys(ConfigurationReader.get("marketing_password"));
        loginButton.click();
    }

    public void loginAsHR(){
        userNameInput.sendKeys(ConfigurationReader.get("hr_username"));
        passwordInput.sendKeys(ConfigurationReader.get("hr_password"));
        loginButton.click();
    }

}

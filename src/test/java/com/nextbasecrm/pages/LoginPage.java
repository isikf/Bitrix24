package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
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

    @FindBy(name = "USER_LOGIN")
    WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    WebElement password;

    @FindBy(css = ".login-btn")
    WebElement loginButton2;

    @FindBy(css =".login-link-forgot-pass")
    WebElement forgotPasswordButton;




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


    /*
    * This method accept just user type name , then take data from conf.pro.
    * u can type data in data provider
    * @param user
    * Tlh
    * */
    public void loginAs(String user){

        userName.sendKeys(ConfigurationReader.get(user+"_username") );
        password.sendKeys(ConfigurationReader.get(user+"_password"));
        loginButton2.click();
        BrowserUtils.waitFor(2);
    }

}

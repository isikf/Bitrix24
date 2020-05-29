package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "logo_24_a")
    public WebElement homePage;

    @FindBy(id = "user-block")
    public WebElement userMail;

    @FindBy(linkText = "/auth/?logout=yes&backurl=%2Fstream%2F")
    public WebElement logOut;

    @FindBy(id = "search-textbox-input")
    public WebElement searchInput;
}

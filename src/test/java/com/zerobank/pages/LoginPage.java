package com.zerobank.pages;

import com.zerobank.utils.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user_login")
    WebElement usernameBox;

    @FindBy(id = "user_password")
    WebElement passwordBox;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id='login_form']/div[1]")
    WebElement errorMessage;

    public void login() {
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        submitButton.click();
    }

    public void invalidUsernameLogin() {
        usernameBox.sendKeys(ConfigurationReader.getProperty("wrongusename"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        submitButton.click();
    }

    public void invalidPasswordLogin() {
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("wrongpassword"));
        submitButton.click();
    }

    public void errorMessageIsDisplayed(){
        Assert.assertTrue("Error Message is missing",errorMessage.isDisplayed());
    }

}

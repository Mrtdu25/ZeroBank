package com.zerobank.pages;

import com.zerobank.utils.BrowserUtils;
import com.zerobank.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountSummaryPage extends BasePage{





    public void clickOnLink(String str){
        WebElement accountLink = Driver.getDriver().findElement(By.xpath("//a[contains(text(),'"+str+"')]"));
        BrowserUtils.clickOnElement(accountLink);
    }








}

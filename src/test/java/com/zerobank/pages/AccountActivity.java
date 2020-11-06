package com.zerobank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountActivity extends AccountSummaryPage{
    @FindBy(xpath = "//select")
    private WebElement accountDropdown;


    Select accountSelect = new Select(accountDropdown);

    public void isChoosenOptionSelected(String str){
        Assert.assertEquals("wrong selected",str,accountSelect.getFirstSelectedOption().getText());
    }
}

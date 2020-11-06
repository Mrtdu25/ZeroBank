package com.zerobank.pages;

import com.zerobank.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[contains(text(),'Zero Bank')]")
    private WebElement getHomePage;

    public String getHomePageOfZeroBank(){
        return getHomePage.getText().trim();

    }

    public boolean pageUrlIsContains(String str){
        String acctualUrl = Driver.getDriver().getCurrentUrl();
        return acctualUrl.contains(str.toLowerCase());
    }

}

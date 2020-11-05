package com.zerobank.pages;

import com.zerobank.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }



}

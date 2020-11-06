package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ActivitySteps {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    AccountActivity accountActivity = new AccountActivity();



    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {
        Assert.assertTrue("wrong page",accountSummaryPage.pageUrlIsContains(string));
    }


    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        accountActivity.isChoosenOptionSelected(string);
    }

}

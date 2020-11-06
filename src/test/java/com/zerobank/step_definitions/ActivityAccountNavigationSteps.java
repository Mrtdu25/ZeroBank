package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utils.ConfigurationReader;
import com.zerobank.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ActivityAccountNavigationSteps {
    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    //AccountActivity accountActivity = new AccountActivity();

    @Given("user is on the homepage page")
    public void user_is_on_the_homepage_page() {
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        loginPage.login();
        String expected="Zero Bank";
        String actual=loginPage.getHomePageOfZeroBank();
        Assert.assertEquals(expected,actual);
    }



    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_account_summary_page(String string) {
        accountSummaryPage.clickOnLink(string);
    }




}

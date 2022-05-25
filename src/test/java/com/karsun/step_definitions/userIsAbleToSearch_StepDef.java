package com.karsun.step_definitions;


import com.github.dockerjava.api.model.Frame;
import com.github.javafaker.Job;
import com.karsun.pages.Careers_Page;
import com.karsun.pages.Jobs_Page;
import com.karsun.pages.Login_Page;
import com.karsun.pages.MainMenu_Page;
import com.karsun.utilities.BrowserUtils;
import com.karsun.utilities.ConfigurationReader;
import com.karsun.utilities.Driver;
import io.cucumber.java.cs.Ale;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class userIsAbleToSearch_StepDef {

    MainMenu_Page mainMenuPage = new MainMenu_Page();
    Careers_Page careers_page = new Careers_Page();
    Jobs_Page jobs_page = new Jobs_Page();
    Login_Page loginPage = new Login_Page();

    @Given("user on the main page")
    public void user_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        mainMenuPage.careersModulelink.click();
    }


    @When("user enters {string} in search box")
    public void user_enters_job_title(String string) {
        careers_page.searchBox.sendKeys(ConfigurationReader.getProperty("jobTitle"));
    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String string) {
        careers_page.findJobsBtn.click();
    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        jobs_page.searchBtn.click();
    }

    @When("user clicks on the SDET job position link")
    public void user_clicks_on_the_sdet_job_position_link() {
        jobs_page.SDETLink.click();
    }

    @When("user clicks on apply button")
    public void user_clicks_on_apply_button() {

        jobs_page.applyBtn.click();
    }

    @Then("user enters email into email input box")
    public void user_enters_email_into_email_input_box() {
      loginPage.emailInputBox.sendKeys("Test");
    }
        @Then("user clicks the next button")
    public void user_clicks_the_next_button() {
        loginPage.nextBtn.click();
    }


}

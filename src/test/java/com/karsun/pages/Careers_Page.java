package com.karsun.pages;

import com.karsun.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careers_Page {
    public Careers_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Search Keyword']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[.='Find Jobs']")
    public WebElement findJobsBtn;

    @FindBy(xpath = "//*[@id=\"link-featured-job-0\"]/span")
    public WebElement softwareDeveloperEningeerInTestLink;

    @FindBy(xpath = "//*[@id='link-apply']")
    public WebElement applyBtn;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//*[@id='enterEmailSubmitButton']")
    public WebElement nextBtn;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@id='enterEmailSubmitButton']")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='iCIMS_Message iCIMS_SuccessMessage iCIMS_GenericMessage']")
    public WebElement successMessage;

    @FindBy(xpath = "//span[.='Search All Jobs']")
    public WebElement searchAllJobsBtn;



}

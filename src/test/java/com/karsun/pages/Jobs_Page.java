package com.karsun.pages;

import com.karsun.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobs_Page {
    public Jobs_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='search-btn']")
    public WebElement searchBtn;

    @FindBy(xpath = "//span[.='Software Developer Engineer in Test (SDET)']")
    public WebElement SDETLink;

    @FindBy(xpath = "//*[@id='link-apply']")
    public WebElement applyBtn;
}

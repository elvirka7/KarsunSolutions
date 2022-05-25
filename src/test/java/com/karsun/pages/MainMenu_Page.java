package com.karsun.pages;


import com.karsun.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu_Page {
    public MainMenu_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //CAREERS MODULE LINKS
    @FindBy(xpath = "//span[.='Careers']")
    public WebElement careersModulelink;




}

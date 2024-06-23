package com.google_search.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {
    WebDriver driver;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        
    }

    @FindBy(xpath = "//div/textarea[@aria-label='Search']")
    private WebElement searchBox;

    public void searchData(String Text){
        searchBox.clear();
        searchBox.sendKeys(Text);
        searchBox.submit();
    }

}

package com.google_search.Pages;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchListing {

    WebDriver driver;

    public SearchListing(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }



    @FindBy(xpath = "//div[@class='yuRUbf']/div/span/a[@jsname='UWckNb']")
    List<WebElement> searchheading;

    public void SearchResult() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.visibilityOfAllElements(searchheading));
            if (searchheading != null && !searchheading.isEmpty()) {
                String heading = searchheading.get(1).getText();
                System.out.println(heading);

            } else {
                System.out.println("No heading found");
            }
        }catch (Exception e)
        {
            System.out.println("An error occured during execution");
            e.printStackTrace();
        }

    }





}

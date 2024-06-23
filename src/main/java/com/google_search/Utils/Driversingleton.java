package com.google_search.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Driversingleton {

    private static WebDriver driver = null;
    private Driversingleton(){}

    public static WebDriver getDriver(){
        if(driver==null)
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Create Driver()");
            
        }
        driver.manage().window().maximize();
        return driver;
    
    
            
    }


}

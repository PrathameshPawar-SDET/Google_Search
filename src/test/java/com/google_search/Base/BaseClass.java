package com.google_search.Base;

import org.openqa.selenium.WebDriver;
import com.google_search.Utils.Driversingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void createdriver(){
        driver = Driversingleton.getDriver();
    }

    @AfterClass
    public void quitdriver(){
        if(driver!=null){
            driver.quit();
        }
    }
   

}

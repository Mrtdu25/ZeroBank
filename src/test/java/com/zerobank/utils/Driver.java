package com.zerobank.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver() throws MalformedURLException {

        if (driver==null){

            String browser = ConfigurationReader.getProperty("browser");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    driver.manage().window().maximize();
                    break;
            }


        }
        return driver;
    }


    public static void closeDriver(){
        if (driver!=null) {
            driver.quit();
            driver=null;
        }
    }


}

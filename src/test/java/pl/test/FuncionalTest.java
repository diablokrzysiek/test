package pl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


/**
 * Created by kk on 13/07/2017.
 */
public class FuncionalTest {

    public String baseUrl = "http://localhost/logowanieProject/trunk/";
    //    String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ;

    @BeforeTest
    public void set() {
        System.out.println("launching firefox browser");
        System.setProperty("webdriver.firefox.driver","geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseUrl);
    }

//    @AfterTest
//    public void terminateBrowser(){
//        driver.close();
//    }
}
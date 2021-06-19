package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLanch {
   public static WebDriver driver;
    public static void main(String[] args) {


        firefoxLaunch();
        //chromeLaunch();





    }
    public static void firefoxLaunch(){
        //set driver path static
        //System.setProperty("webdriver.gecko.driver","G:\\Tutorials\\TestingQA_BITM\\TestingSoftware\\geckodriver-v0.29.1-win64\\geckodriver.exe");

        //set driver path dynamic
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//main//resources//geckodriver.exe");

        driver = new FirefoxDriver();
    }
    public static void chromeLaunch(){
        System.setProperty("webdriver.chrome.driver","G:\\Tutorials\\TestingQA_BITM\\TestingSoftware\\chromedriver_win32\\chromedriver.exe");
        //set driver path dynamic
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
        driver = new ChromeDriver();
    }
}

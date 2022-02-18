package com.sauceDemo.TestScripts;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.Loginclasses;

public class BaseClass {
WebDriver driver;
Loginclasses login;
HomePageClass home;
  
   
@BeforeClass
public void setupmethod() throws IOException
{
  System.setProperty("webdriver.chrome.driver",
            "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.manage().window().maximize();
  driver.get("https://www.saucedemo.com/");
  System.out.println("The URL is open");    
}
@BeforeMethod
public void loginMethod() 
{
  login=new Loginclasses(driver);
    login.sendUsername();
  login.sendpassword();
  login.clicklogin();      
}

@AfterMethod
public void Logoutmethod() 
{
  home = new HomePageClass(driver);
  home.clickSettingButton();
  home.clickLogoutButton();         
}
@AfterClass
public void TearDown()
{
  driver.quit();
}

}
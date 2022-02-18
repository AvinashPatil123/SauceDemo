package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclasses {
  
     private WebDriver driver;
     @FindBy(xpath="//input[@id='user-name']")
     private WebElement username;
     
     @FindBy(xpath="//input[@id='password']")
     private WebElement pasword;
     
     @FindBy(xpath="//input[@id='login-button']")
     private WebElement login;
     
//     @FindBy(xpath="//button[@id='react-burger-menu-btn']")
//     private WebElement menubutton;
//     
//     @FindBy(xpath="//a[@id='logout_sidebar_link']")
//     private WebElement logout;
     
     public Loginclasses(WebDriver driver) 
     {
       
      this.driver=driver;
      
      PageFactory.initElements(driver, this);
     }
     
     public void sendUsername(){
      username.sendKeys("standard_user");
     }
     
     public void sendpassword() {
      pasword.sendKeys("secret_sauce");
     }
       
     public void clicklogin() 
     {
      login.click();
     }
     
//     public void menubutton() {
//      menubutton.click();
//     }
//     public void logout() {
//      logout.click();   
//     }
     
  }
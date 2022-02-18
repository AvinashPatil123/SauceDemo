package com.sauceDemo.TestScripts;

import org.testng.annotations.Test;

public class TC01Verifyloginfunctionality extends BaseClass 
{
  @Test
  public void verifylogin() 
{
 String actualTitle = "Swag Labs";
 String expectedTitle = driver.getTitle();
 if(expectedTitle.equals(actualTitle))
 {
  System.out.println("Login test is passed");
 }
 else
 {
  System.out.println("Login test is failed");
 }  

 }  
  
 }
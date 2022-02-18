package com.sauceDemo.TestScripts;


import org.testng.annotations.Test;

public class TC03verifylogoutfunctionality extends BaseClass {
  @Test
  public void logoutmethod()
  {
  
      String actualTitle ="Swag Labs";
      String expectedTitle = driver.getTitle();
      if(actualTitle.equals(expectedTitle))
      {
        System.out.println("logout test is passed");
      }
      else
      {
        System.out.println("logout test is failed");
      }
   }
}
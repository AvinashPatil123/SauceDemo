package com.sauceDemo.TestScripts;

import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePageClass;

public class TC02verifyAddtocartfunctionality extends BaseClass {

  @Test
  public void Addtocart() 
  {
      home = new HomePageClass(driver);
      home.clickAddtoCart();
      System.out.println("Products are added to cart");
}
}
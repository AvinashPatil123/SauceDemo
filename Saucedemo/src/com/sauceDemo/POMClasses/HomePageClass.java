package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass 
{
  private WebDriver driver;
  
  @FindBy(xpath="//button[@id='react-burger-menu-btn']")
  private WebElement SettingButton;
  
  @FindBy(xpath="//a[@id='logout_sidebar_link']")
  private WebElement LogoutButton;
  
  @FindBy(xpath="//a[@id='about_sidebar_link']")
  private WebElement AboutButton;
  
  //Add to cart WebElement
  @FindBy(xpath="//div//button")
  private List<WebElement>addToCart;
  
  public HomePageClass(WebDriver driver)
  {
    this.driver= driver;
    PageFactory.initElements(driver, this);
  }
  
  public void clickSettingButton()
  {
    SettingButton.click();
  }
  public void clickLogoutButton()
  {
    LogoutButton.click(); 
  }
  public void clickAboutButton()
  {
    AboutButton.click();
  }
  public void clickAddtoCart()
  {
    for(int i=2;i<8;i++)
    {
      addToCart.get(i).click();
    }
  }
}

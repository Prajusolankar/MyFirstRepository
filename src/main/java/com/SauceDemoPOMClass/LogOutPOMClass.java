package com.SauceDemoPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPOMClass 
{
private WebDriver driver;
@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement settingButton;
public void settingButtonclick() 
{
	settingButton.click();
}

@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logOutButton;
public void logOutButtonclick() {
	logOutButton.click();}
	 public LogOutPOMClass(WebDriver driver)
     {
   	  this.driver=driver;
   	  PageFactory.initElements(driver,this);
     }

}

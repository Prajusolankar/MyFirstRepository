package com.SauceDemoPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPagePOMClass {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']") WebElement cartpage;
	
	public void cartPageClick() 
	{
		cartpage.click();
	}
	@FindBy(xpath="//span[@class='shopping_cart_badge']")WebElement count;
	
	public String totalCount1()
	{
		String totalcnt=count.getText();
		return totalcnt;
	}
	
	  public CartPagePOMClass(WebDriver driver)
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver,this);
      }
      


}

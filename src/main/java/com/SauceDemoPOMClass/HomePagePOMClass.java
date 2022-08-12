package com.SauceDemoPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClass 
{
	private WebDriver driver;
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement bagProduct;
	public void clickOnBagButton()
	{
		bagProduct.click();
	}
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")private WebElement product1;
	public void clickOnBagButton1()
	{
		product1.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")private WebElement product2;
	public void clickOnBagButton2()
	{
		product1.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[4]")private WebElement product3;
	public void clickOnBagButton3()
	{
		product1.click();
	}
	
	   public HomePagePOMClass(WebDriver driver)
	      {
	    	  this.driver=driver;
	    	  PageFactory.initElements(driver,this);
	      }
	      

}

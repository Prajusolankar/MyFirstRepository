package com.SauceDemoTestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMClass.CartPagePOMClass;
import com.SauceDemoPOMClass.HomePagePOMClass;
import com.SauceDemoPOMClass.LoginPagePOMClass;

public class VerifyMultipleProductAddtocartfunctionality extends TestBaseClass {
     @Test
	public void multipleProductAddToCart() 
	{
	HomePagePOMClass hp=new HomePagePOMClass(driver);
	
	hp.clickOnBagButton();
	hp.clickOnBagButton1();
	hp.clickOnBagButton2();
	hp.clickOnBagButton3();
	//Thread.sleep(3000);
	
	 CartPagePOMClass cp=new CartPagePOMClass(driver);
     cp.cartPageClick();
    // Thread.sleep(5000);
     
     String totalcnt=cp.totalCount1();
     String expectedCount="4";
     Assert.assertEquals(totalcnt, expectedCount);
}
}

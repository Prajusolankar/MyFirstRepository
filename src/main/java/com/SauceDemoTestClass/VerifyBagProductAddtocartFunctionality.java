package com.SauceDemoTestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMClass.CartPagePOMClass;
import com.SauceDemoPOMClass.HomePagePOMClass;
import com.SauceDemoPOMClass.LoginPagePOMClass;

public class VerifyBagProductAddtocartFunctionality extends TestBaseClass {
	
	
	       @Test		
			public void homePageFunctionality()
			{
			HomePagePOMClass hp=new HomePagePOMClass(driver);
			
			hp.clickOnBagButton();
//			hp.clickOnBagButton1();
//			hp.clickOnBagButton2();
//			hp.clickOnBagButton3();
	 CartPagePOMClass cp=new CartPagePOMClass(driver);
		     cp.cartPageClick();
		  //   String actualCount=hp.cartPageClick();
		     
		     String totalcnt=cp.totalCount1();
		     String expectedCount="1";
		     Assert.assertEquals(totalcnt, expectedCount);
		

}
}
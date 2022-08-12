package com.SauceDemoTestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMClass.CartPagePOMClass;
import com.SauceDemoPOMClass.HomePagePOMClass;
import com.SauceDemoPOMClass.LogOutPOMClass;
import com.SauceDemoPOMClass.LoginPagePOMClass;

public class VerifyLogOutFunctionality extends TestBaseClass{
@Test
public void logOutFunctionality() throws InterruptedException
{
				LogOutPOMClass lo=new LogOutPOMClass(driver);
				lo.settingButtonclick();
				Thread.sleep(1000);
				lo.logOutButtonclick();
				//validation
				String expectedTitle="Swag Labs";
				String actualTitle=driver.getTitle();
//				if(expectedTitle.equals(actualTitle))
//				{
//					System.out.println("We have successfully logged to sauce demo");
//				}
//				else
//				{
//					System.out.println("Test case is failed");
//				}
				
				Assert.assertEquals(actualTitle, expectedTitle);
			
}
}
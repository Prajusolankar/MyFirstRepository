package com.SauceDemoTestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemoPOMClass.LoginPagePOMClass;
import com.SauceDemoUtilityClass.ScreenshotCode;

public class VerifyLoginFunctionality extends TestBaseClass {
	
         @Test
		public void loginFunctionality()
		{
        	// ScreenshotCode.screenShot();
		//validation
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		
//		if(expectedTitle.equals(actualTitle))
//		{
//			System.out.println("We have successfully logged to sauce demo");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
	
	}

}
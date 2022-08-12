package com.SauceDemoTestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemoPOMClass.LoginPagePOMClass;
import com.SauceDemoUtilityClass.ScreenshotCode;

public class TestBaseClass 
{
	WebDriver driver;
	@Parameters("browserName")
    @BeforeMethod
    public void setUp(String browserName) throws IOException
    {
		if(browserName.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver","D:\\chrom drivr\\chromedriver_win32\\Chromedriver.exe");
	driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\chrom drivr\\chromedriver_win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("throw the error");
		}
		System.out.println("Browser is opened");
	driver.get("https://www.saucedemo.com/");
//	ScreenshotCode.screenShot(driver);
	//ScreenshotCode.screenShot();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	LoginPagePOMClass lp=new LoginPagePOMClass(driver);
	lp.sendUsername();
	lp.sendPassword();
	lp.loginButtonclick();
	//ScreenshotCode.screenShot();
}
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
		System.out.println("Browser is closed");
    }
}
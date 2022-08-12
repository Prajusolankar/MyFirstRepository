package com.SauceDemoUtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCode {
	 static WebDriver driver;
	public static void screenShot() throws IOException {
		
		//date and time format code
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-DD-YY & HH-MM-SS");
		String date=d1.format(d);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File destFile =new File("D:\\screenshots\\Screen"+date+".jpg");
		
		FileHandler.copy(sourcefile, destFile);
		
		
	}

}

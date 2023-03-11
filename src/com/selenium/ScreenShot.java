package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\DINESH C\\eclipse-workspace\\CodoidInvoation\\driver\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
    	System.out.println(screenshotAs);
    	File file=new File("D:\\Codoid");
    	FileUtils.copyFile(screenshotAs, file);
    	


		

	}

}

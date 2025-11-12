package com.ResuableFunc;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Baseclass.Library;

public class SeleniumReusables extends Library {
	
	 public SeleniumReusables(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 
		 
	} 
	 
	 //enter the text 
	public void Entervalue(WebElement element, String Text) {
		try {
			element.sendKeys(Text);
			
		}
		catch (Exception e){
			System.out.println("no such element found");
		}
	}

	//clicks the element on webpage
	public void click(WebElement element) 
	{
		try {
			
			element.click();
		}catch(Exception e)
		{
			System.out.println("no such element");
		}
		}
	//gets the title of page
	public void gettitle() {
		try {
			System.out.println(driver.getTitle());
		}catch(Exception e)
		{
			System.out.println("could not get title");
		}
	}
	//takes the screenshot of the testcase and stores in destined path
	public void screenshot(String path) {
		TakesScreenshot TS=(TakesScreenshot)driver;
		File source=TS.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(path));
		}
		catch(Exception e){
			System.out.println("Screenshot not found");
		}
	}
}

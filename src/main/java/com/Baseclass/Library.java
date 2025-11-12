package com.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
//launching browers etc
	public static Properties prop;
	public static WebDriver driver;
	public void launchapp() throws IOException{
		FileInputStream input =new FileInputStream("/Flipkart_Automation_Test/src/test/resources/Properties/config.properties");
		prop=new Properties();
		
		prop.load(input);
		try {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
				
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(null);
		driver.get(prop.getProperty("url"));
		
	}catch(Exception e) {
		System.out.println("brower launching failed");
		}
}
public void teardown()	{
	driver.close();
	
}

}


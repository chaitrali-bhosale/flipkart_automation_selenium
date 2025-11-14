package com.Pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResuableFunc.SeleniumReusables;


public class Search extends Library {
	public 	Search(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	} 	
	
	
	SeleniumReusables se=new SeleniumReusables( driver);
	@FindBy(xpath="//input[@name='q']")
	WebElement Searchtext;
	
	
	@FindBy(xpath="//html[@lang='en']")
	WebElement Homepage;
	
	
	
	public void Search(String text) {
		se.Entervalue(Searchtext,text);
		
	}
	
	public void Clicksearch() { 
		Searchtext.sendKeys(Keys.ENTER);
	}
	
	public void homescreen() {
		System.out.println(Homepage);
	}
}






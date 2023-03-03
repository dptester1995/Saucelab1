package com.sauce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginpage {
	
	//creat obj of webdriver
	WebDriver ldriver;
	
	//Creat constructor
	public SauceLoginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement login;
	
	
	public void enterusername() {
		username.sendKeys("standard_user");
	}
   public void enterpassword() {
	   password.sendKeys("secret_sauce");
   }

   public void clickonloginbutton() {
	   login.click();
   }
}

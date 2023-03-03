package com.sauce.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page.CaptureScreenshotFormat;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauce.pageobject.SauceLoginpage;
import com.sauce.pageobject.SauceProductpage;

public class SauceLogin extends BaseClass{

	@Test
	public void login() throws IOException{
		driver.get(url);
		logger.info("URL Opened");
		System.out.println(" chrome browser has launched.");
		
		
		SauceLoginpage sauceLogin= new SauceLoginpage(driver);
		sauceLogin.enterusername();
		logger.info("Username entered.");
		
		sauceLogin.enterpassword();
		logger.info("Password entered.");
		
		sauceLogin.clickonloginbutton();
		logger.info("Login button get clicked.");
		
		String title=driver.getTitle();
		System.out.println("Product page title is :"+title);
		
	   if(title.equals("Swag Labs")) {
		logger.info("VerifyLogin -Passed");
		Assert.assertTrue(true);
	    }
	   
	   else {
		logger.info("VerifyLogin-Failed");
		captureScreenShot(driver,"VerifyLogin");
		Assert.assertTrue(false);
	   }
		
	  
	   
		logger.info("Browser Closed.");
	}

}

		
		
	


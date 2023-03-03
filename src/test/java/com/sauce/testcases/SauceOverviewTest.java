package com.sauce.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page.CaptureScreenshotFormat;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauce.pageobject.SauceCartpage;
import com.sauce.pageobject.SauceInformationpage;
import com.sauce.pageobject.SauceLoginpage;
import com.sauce.pageobject.SauceOverviewpage;
import com.sauce.pageobject.SauceProductpage;

public class SauceOverviewTest extends BaseClass{

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
//making object of productpage class
	   SauceProductpage productPage =  new SauceProductpage(driver);
		
		productPage.clickOnProductNmae();
		productPage.clickOnAddToCartBtn();
		
		String url = driver.getCurrentUrl();
		System.out.println("Product page url is :" +url);
		
		if(url.equals("https://www.saucedemo.com/inventory-item.html?id=4"))
		{
			logger.info("VerifyProductpage - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyProductpage - Failed");
			captureScreenShot(driver,"VerifyProductpage");
			Assert.assertTrue(false);
      }
//calliing the Cartpage class by making the object
	
		SauceCartpage cartpage= new SauceCartpage(driver);
		cartpage.clickOnCartBtn();
		cartpage.clickOnCheckoutBtn();
		
		
		
		String CheckoutUrl = driver.getCurrentUrl();
		System.out.println("Checkout Page url is :" +CheckoutUrl);
		
		if(CheckoutUrl.equals("https://www.saucedemo.com/checkout-step-one.html"))
		{
			logger.info("VerifyCartpage - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("VerifyCartpage - Failed");
			captureScreenShot(driver,"VerifyCartpage");
			Assert.assertTrue(false);
      }
		//calliing the information page class by making the object
		SauceInformationpage infopage =new SauceInformationpage(driver);
		infopage.EnterFirstname();	
		infopage.Enterlastname();
		infopage.Enterpostalname();
		infopage.clickOncontinueBtn();
		
		String infoUrl = driver.getCurrentUrl();
		System.out.println("Checkout Page url is :" +infoUrl);
		
		if(infoUrl.equals("https://www.saucedemo.com/checkout-step-two.html"))
		{
			logger.info("Verifyinfopage - Passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Verifyinfopage- Failed");
			captureScreenShot(driver,"Verifyinfopage");
			Assert.assertTrue(false);
		}
		
		
			//object of overview page
		
			SauceOverviewpage overview =new SauceOverviewpage(driver);
			overview.clickOnFinishBtn();
			
			String OverviewUrl = driver.getCurrentUrl();
			System.out.println("Checkout Page url is :" +OverviewUrl);
			
			if(OverviewUrl.equals("https://www.saucedemo.com/checkout-complete.html"))
			{
				logger.info("Verifyoverviewpage - Passed");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("Verifyoverviewpage - Failed");
				captureScreenShot(driver,"Verifyoverviewpage");
				Assert.assertTrue(false);
			}
			
			
			
		logger.info("Browser Closed.");
	}

	}
	

		
		
	


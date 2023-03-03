package com.sauce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SauceSucesspage {
	
	//creat object of webdriver
	WebDriver ldriver;
	//Creat Constructor
	public SauceSucesspage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);
	}
	    @FindBy(xpath="//h2[text()='Thank you for your order!']")
	    WebElement Suceses;
	    
	    public void Sucessmsg() {
	    String msg =Suceses.getText();
	    System.out.println("Product page title is:"+msg);
	    if(msg.equals("Thank you for your order!"))
	    {
	    Assert.assertTrue(true);
	     }
	    else
	    {
	     Assert.assertTrue(false);
	    System.out.println("Sucess message not displayed.");
	    }
	    }
}

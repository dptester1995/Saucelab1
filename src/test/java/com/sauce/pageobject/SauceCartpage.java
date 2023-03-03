package com.sauce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCartpage {
	
	//creat object of webdriver
	WebDriver ldriver;
	//Creat Constructor
	public SauceCartpage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	    @FindBy(xpath="//a[@class='shopping_cart_link']")
	    WebElement cartIcon;
	    
	    @FindBy(id="checkout")
	    WebElement checkoutBtn;
	    
	    
	    public void clickOnCartBtn() {
	    	cartIcon.click();
	    }
	    
	    public void clickOnCheckoutBtn() {
	    	checkoutBtn.click();
	    }
	
	
   
}

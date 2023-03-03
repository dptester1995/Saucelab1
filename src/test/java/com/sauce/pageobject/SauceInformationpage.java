package com.sauce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceInformationpage {
	
	//creat object of webdriver
	WebDriver ldriver;
	//Creat Constructor
	public SauceInformationpage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
    @FindBy(id="first-name")
    WebElement fisrtname;
    
    @FindBy(id="last-name")
    WebElement lastname;
    
    @FindBy(id="postal-code")
    WebElement postalcode;
    
    @FindBy(id="continue")
    WebElement continueBtn;
    
    
    public void EnterFirstname() {
    	fisrtname.sendKeys("joss");
    }
    
    public void Enterlastname() {
    	lastname.sendKeys("buttler");
    }
    
    public void Enterpostalname() {
    	postalcode.sendKeys("12345");
    }
    
    public void clickOncontinueBtn() {
    	continueBtn.click();
    }
}

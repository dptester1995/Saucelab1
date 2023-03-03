package com.sauce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceOverviewpage {
	
	//creat object of webdriver
	WebDriver ldriver;
	//Creat Constructor
	public SauceOverviewpage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
     @FindBy(id="finish")
     WebElement FinishBtn;
     
	 public void clickOnFinishBtn() {
	 FinishBtn.click();
		    }
}

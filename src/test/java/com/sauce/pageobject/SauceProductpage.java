package com.sauce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductpage {

	
	//creat an object of webdriver
	WebDriver ldriver;
	
	//Creat Constructor
	public SauceProductpage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//identify the name of product by text
	@FindBy(xpath="//a[@id='item_4_title_link']")
	//@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
	WebElement productName;
	
	//identify the add cart button
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement AddToCartBtn;
	
	public void clickOnProductNmae() {
		productName.click();
	}
	public void clickOnAddToCartBtn() {
		AddToCartBtn.click();
	}
}

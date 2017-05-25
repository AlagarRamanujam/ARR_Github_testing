package com.Vmetry.pages;

import org.openqa.selenium.WebDriver;

import com.Vmetry.locators.Home_Locators;

public class Home_page extends Home_Locators {

	WebDriver driver;
	
	
	public Home_page(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void gotoLoginpage(){
		driver.findElement(Login).click();
	}
}
//test file for testing

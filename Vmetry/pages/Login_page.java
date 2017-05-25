package com.Vmetry.pages;

import org.openqa.selenium.WebDriver;

import com.Vmetry.locators.Login_Locators;

public class Login_page extends Login_Locators {

	WebDriver driver;
	
	public Login_page(WebDriver driver){
		this.driver=driver;
	}
	
	public void doSignUp(String name,String mail,String mobNum,String pswd,String confpwd){
		driver.findElement(name_text).sendKeys(name);
		driver.findElement(mailid).sendKeys(mail);
		driver.findElement(mobile).sendKeys(mobNum);
		driver.findElement(password).sendKeys(pswd);
		driver.findElement(confirmpassword).sendKeys(confpwd);
		driver.findElement(submit).click();
	}
}

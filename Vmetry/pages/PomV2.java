package com.Vmetry.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Vmetry.pages.Home_page;
import com.Vmetry.pages.Login_page;

public class PomV2 {
	WebDriver driver;
	Home_page hme;
	Login_page lgn;

	@BeforeTest
	public void initTest() throws IOException {
		//System.setProperty("webdriver.gecko.driver", "/Users/user/Documents/Drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://www.ntltaxi.com/");
		driver.manage().window().maximize();
		hme = new Home_page(driver);
		lgn = new Login_page(driver);
	}

	@Test
	public void doRegistration() {
		hme.gotoLoginpage();
		lgn.doSignUp("venkat", "test@gmail.com", "9940613542", "test1234", "test1234");
	}

	@AfterTest
	public void closeTest() throws InterruptedException {
		Thread.sleep(5000);
		if (driver != null) {
			driver.quit();
		}
	}
}

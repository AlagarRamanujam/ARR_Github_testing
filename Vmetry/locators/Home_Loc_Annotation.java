package com.Vmetry.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home_Loc_Annotation {
	@FindBy(how=How.LINK_TEXT,using="Login")
	WebElement Login12;
	WebElement Password;

}

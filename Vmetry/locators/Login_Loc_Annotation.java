package com.Vmetry.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Loc_Annotation {

	@FindBy(how=How.ID,using="namesignup")
	WebElement name_text;
}

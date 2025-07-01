package com.qa.Testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.baseclass;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.Registerpage;
import com.qa.utility.WindowUtils;

public class LoginTest extends baseclass {
	
	LoginPage loginpage;
	WindowUtils windowuti;
	Registerpage registerpage;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intilization();
	
		loginpage=new LoginPage();
		loginpage.clickLoginButton();
		//windowuti=new WindowUtils(driver);
		//windowuti.switchToNewWindow();
		loginpage.EnterEmail("subbud121@gmail.com");
		loginpage.validateButtonDisplayed();
	}
		@Test
		
		public void ValidateSignBtn() {
		    System.out.println("=== Starting ValidateSignBtn Test ===");

		    boolean isDisplayed = loginpage.validateButtonDisplayed();
		    boolean isEnabled = loginpage.validateButtonEnabled();
		    String actualText = loginpage.validateButtontext();
		    String expectedText = "Sign in";

		    System.out.println("Button displayed: " + isDisplayed);
		    System.out.println("Button enabled: " + isEnabled);
		    System.out.println("Button text: " + actualText);

		    Assert.assertTrue(isDisplayed, "Button is not displayed");
		    Assert.assertTrue(isEnabled, "Button is not enabled");
		    Assert.assertEquals(actualText, expectedText, "Button text does not match");

		    System.out.println("=== ValidateSignBtn Test Completed Successfully ===");
		}

		
		
		
		
		
		
	}
	
	


	



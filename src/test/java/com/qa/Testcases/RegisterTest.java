package com.qa.Testcases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.baseclass;
import com.qa.pageobjects.LoginPage;
import com.qa.pageobjects.Registerpage;

public class RegisterTest extends baseclass{
	
	Registerpage registerPage;
	LoginPage loginpage;
	
	public RegisterTest() {
		super();
	}
	
	
	
		
		
		
		@Test
	    public void testRegisterAccount() {
	        String email = "subbu" + System.currentTimeMillis() + "@gmail.com";

	        // Click Sign In and enter email
	        registerPage=new Registerpage();
	         // Add this method if missing
	        registerPage.CreateAccount("subbu", "chowdary", email); 
	        // Click "Create an account" button
	        Registerpage page=new Registerpage();
	      page.Selects("15", "5", "1995");
	       

	        // Wait for registration form
	       
	

	
}}

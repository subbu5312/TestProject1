package com.qa.pageobjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.baseclass;

public class LoginPage extends baseclass {

	
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement SignBtn;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
   
	public void clickLoginButton() {
	    new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(SignBtn));
	    SignBtn.click();
	}
	
	@FindBy(xpath="//input[contains(@id,'email_create')]")
	WebElement EmailField;
	
	@FindBy(xpath="//button[contains(@name,'SubmitCreate')]")
	WebElement CreateButton;
	public boolean validateButtonDisplayed() {
		return SignBtn.isDisplayed();
	}
	public boolean validateButtonEnabled() {
		return SignBtn.isEnabled();
	}

	public String validateButtontext() {
		return SignBtn.getText();
	}
	
public void EnterEmail(String Email) {
	EmailField.sendKeys(Email);
	CreateButton.click();
		
	}

}

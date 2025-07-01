package com.qa.pageobjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.baseclass;

public class Registerpage extends baseclass {
	
	
	
	@FindBy(xpath="//input[contains(@id,'id_gender1')]")
	WebElement RadioButton;
	
	@FindBy(xpath="//input[contains(@id,'customer_firstname')]")
	WebElement FirstName;
	
	@FindBy(xpath="//input[contains(@id,'customer_lastname')]")
	WebElement Lastname;
	
	
	
	@FindBy(xpath="//input[contains(@name,'passwd')]")
	WebElement pswd;
	
	@FindBy(xpath="//select[contains(@id,'days')]")
	WebElement daysSelect;
	
	@FindBy(xpath="//select[contains(@id,'months')]")
	WebElement monthsSelect;
	
	@FindBy(xpath="//select[contains(@id,'years')]")
	WebElement yearsSelect;
	
	@FindBy(xpath="//button[contains(@id,'submitAccount')]")
	WebElement register;
	
	public Registerpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void CreateAccount(String username, String lastname, String password) {

        RadioButton.click();
        FirstName.sendKeys(username);
        Lastname.sendKeys(lastname);
        daysSelect.click();
       
        pswd.sendKeys(password);
	}
        

        public void Selects(String day, String month, String year) {
        	 new Select(daysSelect).selectByValue(day);   
        	 
             new Select(monthsSelect).selectByValue(month); 
             new Select(yearsSelect).selectByValue(year); 
            
             
             register.click();
        }
       
     

}

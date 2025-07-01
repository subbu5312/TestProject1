package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static Properties prop;
	public static WebDriver driver;

	
	@BeforeTest
	public void loadConfig() {
		try {
			prop=new Properties();
			System.out.println("super constructer invoked");
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
			prop.load(ip);
			System.out.println("driver:"+ driver);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void intilization() {
		WebDriverManager.chromedriver().setup();
		String browserName=prop.getProperty("browser");
       if(browserName.contains("chrome")) {
    	   driver=new ChromeDriver();
       }
       else if(browserName.contains("FireFox")) {
    	   driver=new FirefoxDriver();
       }else if(browserName.contains("IE")) {
    	   driver=new InternetExplorerDriver();       }
   	driver.get(prop.getProperty("url"));
   	driver.manage().window().maximize();
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


}

package com.practice;

import java.io.FileInputStream;
import java.util.Properties;

import com.mainjava.ChromeDriver;
import com.mainjava.WebDriver;

public class PropertiesConnection {

	public static void main(String[] args) {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(
				System.getProperty("user.dir") + "\\TestProperties\\src\\com\\properties\\config\\config.properties");
		obj.load(objfile);

		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		// Instantiate a ChromeDriver class.
		WebDriver driver = new ChromeDriver();

		// Launch Salesforce Website
		driver.get(obj.getProperty("URL"));

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter username
		driver.findElement(By.id(obj.getProperty("usernameId"))).sendKeys(obj.getProperty("username"));
		
		// Enter password
		driver.findElement(By.id(obj.getProperty("passwordId"))).sendKeys(obj.getProperty("password"));
		
		// Click login button
		driver.findElement(By.id(obj.getProperty("loginId"))).click();

	}

}

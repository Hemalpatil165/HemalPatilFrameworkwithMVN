package com.mvnassignment;

//W.a.maven program to create simple webdriver Program

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenSimpleWebdriver
{
	
	WebDriver driver;
	
	@Test
	public void simpleWebdriver() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();	
		
		driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);			
		
		driver.close();

	}
	
}





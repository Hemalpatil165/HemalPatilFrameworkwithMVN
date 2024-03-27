package com.mvnassignment;


//W.a.maven program to create Junit with webdriver Program

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenJunitWebdriver {
	
	WebDriver driver;

	@Test
	public void before() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		Thread.sleep(2000);
    }
    
	@Test
    public void login() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
    }
    
	@After
	//take screen shot
	public void after() throws IOException {
    	
     File file=((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
     //copy ss into your file source to destiny..
     Files.copy(file,new File("D:\\Selenium\\SS\\defect_one.png") );
	
     driver.close();
    }	
}

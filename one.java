package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class one
{
	public static WebElement logBtn;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//clcik on close btn je string madhe log in ch yet pop up te x cha
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//step-1Identify/inspcet drodown elemnt 
		//step-2 crt object of action class with webdriver obj as a input
	    Actions act= new Actions(driver);
	   
		//step-3 call action class method
	    act.moveToElement(logBtn).perform();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	
	}

}



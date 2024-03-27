package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyword_prc {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("emailid")).sendKeys("hemal@gmail.com");
		
		driver.findElement(By.name("btnLogin")).click();
		 Thread.sleep(2000);
		 
//		 WebElement a=driver.findElement(By.partialLinkText("Agile Project"));
//		 
//		 Actions actions=new Actions(driver);
//		   
//		   //Action is an interface
//		   Action a1 = actions.moveToElement(a).build();
//		   	   
//		   a1.perform();
//		
//		
//
		 driver.close();
		 }

}

package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_ass {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("uid")).sendKeys("hemal@gmail.com");
		
//		driver.findElement(By.name("btnLogin")).click();
//		 Thread.sleep(2000);
//		

	}

}

package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaText
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//this is for user name
		driver.findElement(By.id("userName")).sendKeys("Hemal Patil");
		Thread.sleep(2000);
		
		//this is for Email
		driver.findElement(By.id("userEmail")).sendKeys("Hemal@gmail.com");
		Thread.sleep(2000);
		
		//this is for current Address
		driver.findElement(By.id("currentAddress")).sendKeys("Surat,Gujrat");
		Thread.sleep(2000);
		
		//this is for Permennt Address
		driver.findElement(By.id("permanentAddress")).sendKeys("Surat,Gujrat");
		Thread.sleep(2000);
		
		//this is done by xpath(submit button)
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(6000);
		
		driver.close();
		


	}
}

package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Anonymous;

public class amzon {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
		
		//for first name
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).
		sendKeys("Hemal Patil");
		Thread.sleep(3000);
		
		//for last name
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).
		sendKeys("Patil");
		Thread.sleep(2000);
		
		//Gender selection
		driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
		Thread.sleep(2000);
		
		//for year experiaction
		driver.findElement(By.xpath("//*[@id=\"exp-0\"]")).click();
		Thread.sleep(2000);
		
		//for date
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("01/03/2024");
		Thread.sleep(2000);
		
		//for profession
		driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		
		WebElement e1= driver.findElement(By.id("continents"));
		
		Select s1=new Select(e1);
		 
		for(int i=0; i<3; i++)
		{
			s1.selectByIndex(i);
			Thread.sleep(2000);
			}
		
//		WebElement e2= driver.findElement(By.id("selenium_commands"));
//		
//		Select s2=new Select(e2);
//		 
//		for(int i=0; i < 4; i++)
//		{
//			s2.selectByIndex(i);
//			Thread.sleep(2000);
//		}
		
//		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[28]/div[2]/div/a")).click();
		
			//driver.close();
		}
}



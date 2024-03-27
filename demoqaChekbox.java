package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaChekbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//this event is done by xpath
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")).click();
		Thread.sleep(2000);
	
		driver.close();
	
	}
	
}
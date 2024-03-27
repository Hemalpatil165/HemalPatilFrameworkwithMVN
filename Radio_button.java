package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button
{
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		

	for(int i=1; i<4; i++) {
				driver.findElement(By.id("vfb-7-"+i)).click();
				Thread.sleep(2000);
			}
	   }
	}
	



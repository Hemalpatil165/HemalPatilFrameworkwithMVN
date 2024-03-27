package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaradio_buton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("yesRadio")).click();
		Thread.sleep(2000);
		
	}	
}


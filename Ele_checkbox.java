package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("");
		Thread.sleep(3000);
		
		
		WebElement e1= driver.findElement(By.id("Checkbox"));

		Select s1=new Select(e1);
	     s1.selectByIndex(4);
	}

}

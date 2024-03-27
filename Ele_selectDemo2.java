package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ele_selectDemo2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e1= driver.findElement(By.id("Country"));
		
		Select s1=new Select(e1);
	     s1.selectByIndex(4);
//		
//		s1.selectByValue("INDIA");
//		Thread.sleep(2000);
		
//		s1.selectByVisibleText("BAHAMAS");
//		Thread.sleep(2000);
		driver.close();
		
		
	}

}

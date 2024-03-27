package Com_Assign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			driver.findElement(By.name("cusid")).sendKeys("123");
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			
			//Interface Alert
			Alert a1= driver.switchTo().alert();
			System.out.println(a1.getText());
			
			//a1.dismiss(); for cancle
			
			a1.accept(); // for okay..
			Thread.sleep(2000);
			
			Alert a2= driver.switchTo().alert();
			System.out.println(a2.getText());
			
			a1.accept();
			Thread.sleep(2000);
			
			driver.close();
			

	}

}

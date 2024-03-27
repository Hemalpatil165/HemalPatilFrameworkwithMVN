package Com_Assign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) throws InterruptedException
	{
		 {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://demo.guru99.com/test/delete_customer.php");
					
					driver.manage().window().maximize();
					Thread.sleep(2000);
					
					driver.findElement(By.name("cusid")).sendKeys("456");
					Thread.sleep(2000);
					
					driver.findElement(By.name("submit")).click();
					Thread.sleep(2000);
					
					Alert alboxdel = driver.switchTo().alert();
					
					//to get sentence of alert box
					System.out.println(alboxdel.getText());
					
					//to close the alert box
					//alboxdel.dismiss();
					
					//to accept[OK] the alert box
					alboxdel.accept();
					
					/*UPTO HERE,THIS IS FOR FIRST ALERTBOX*/
					
					//AND from here,code is written for second alert box
					Thread.sleep(4000);
					Alert secalbox = driver.switchTo().alert();
					
					System.out.println(secalbox.getText());
					
					secalbox.accept();
					
					Thread.sleep(3000);
					
		 }			
		
	}

}

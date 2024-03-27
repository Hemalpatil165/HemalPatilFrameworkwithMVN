package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99_DropDown {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://demo.guru99.com/test/newtours/register.php");
					
					driver.manage().window().maximize();
					Thread.sleep(3000);
					
					WebElement c1=driver.findElement(By.name("country"));
					
	
					Select drop=new Select(c1);
					
//					
//					drop.selectByValue("BAHAMAS");
//					Thread.sleep(3000);
					
					
	}
					
	

}

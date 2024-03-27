package Com_Assign;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
		
		WebDriver fdrive = new FirefoxDriver();
		fdrive.get("https://www.wikipedia.org/");
		Thread.sleep(3000);
		
		fdrive.findElement(By.id("searchInput")).sendKeys("software testing");
		Thread.sleep(3000);
		
		//This code will run
		fdrive.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive")).click();
		
		//This code will run,too.
		//fdrive.findElement(By.xpath("/html/body/main/div[2]/form/fieldset/button")).click();
		Thread.sleep(3000);
				
		fdrive.close();
		
	}

}

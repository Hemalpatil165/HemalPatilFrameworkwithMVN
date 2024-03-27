package Com_Assign;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotDemo {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/v1/index.html");
			
			driver.manage().window().maximize();
			
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
			Thread.sleep(2000);
			
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			
			//take screen shot
			
		File file=((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
		//copy ss into your file source to destiny
		
		Files.copy(file,new File("D:\\Selenium\\SS\\defect_one.png") );
			
		driver.close();
			
			
		
	}

}

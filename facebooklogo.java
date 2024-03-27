package Com_Assign;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogo 
{
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.linkText("<img class=\"fb_logo _8ilh img\" src=\"https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg\" alt=\"Facebook\">").
//	    public WebElement textShown;
//		Thread.sleep(2000);

		
	
	}

}

package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaLink {

	public static void main(String[] args) throws InterruptedException 
	{
 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
    		WebDriver driver=new ChromeDriver();
		
	       driver.get("https://demoqa.com/links");
           driver.manage().window().maximize();
		
		//TO provide how much time the tab will open
		Thread.sleep(3000);

		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		//deiver is checking link text home then click button 
//
//		driver.findElement(By.linkText("HomefHdEf")).click();
//		Thread.sleep(5000);
				
	
		
		//TO CLOSE THE RESPECTIVE OPENED TAB
		driver.close();
		
		
	}

}

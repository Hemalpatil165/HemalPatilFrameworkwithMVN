package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocLinkedTextDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		//STEP 1: To select driver along with browser
				
		//SYNTAX: System.setProperty("webdriver.browsername.driver","Path of executable file");
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\msedgedriver.exe");
		
		//STEP 2: To set build path from project[ONLY SINGLE TIME]
			
			//STEP 3: OPEN BROWSER
				
				//TO OPEN EMPTY BROWSER
		WebDriver driver = new EdgeDriver();
		
		//STEP 4:NOW RUN....
		
		//STEP 5: TO OPEN ANY WEBSITE...
		driver.get("https://www.facebook.com/");
		
		//To maximize browser
		driver.manage().window().maximize();
		
		//TO provide how much time the tab will open
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("hemal");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(5000);
		
		//TO CLOSE THE RESPECTIVE OPENED TAB
		driver.close();
		
		Thread.sleep(5000);
		//TO CLOSE BROWSER
		//driver.quit();
	
		
		
	}

}

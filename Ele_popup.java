package Com_Assign;

//This is a program to open a new tab and get back to prevoius tab

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String main_w=driver.getWindowHandle();
		System.out.println("main_window:"+main_w);
		
		driver.findElement(By.partialLinkText("Cli")).click();
		
		Thread.sleep(2000);
		
		Set<String> all_w=driver.getWindowHandles();
		
		Iterator<String> i1=all_w.iterator();
		
		while (i1.hasNext())
		 {
			String child_w=i1.next();
			System.out.println(child_w);
		
			if (!main_w.equals(child_w))
			{
			
				driver.switchTo().window(child_w);
				Thread.sleep(2000);
				
				driver.findElement(By.name("emailid")).sendKeys("h@gmail.com");
				Thread.sleep(2000); 
				
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000); 
				
				//gsc-input 99 guru website check the varify the using the x path and describe the test script 
				driver.close();
			}
			
		}
		
		Thread.sleep(2000); 
		driver.switchTo().window(main_w);
		Thread.sleep(2000);
		driver.close();
	}

}

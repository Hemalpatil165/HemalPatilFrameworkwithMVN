package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaclcik {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://demoqa.com/buttons");
					Thread.sleep(2000);

					driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]")).click();
					Thread.sleep(2000);
					
	}

}

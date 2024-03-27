package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoqaButtons 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://demoqa.com/buttons");
				
				driver.manage().window().maximize();
				//Instantiating Actions class
				Actions act = new Actions(driver);

				//Locate WebElement to perform double click 
				WebElement btnElement = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));

				//Double Click the button
				act.doubleClick(btnElement).perform();

				System.out.println("Double click operation performed");
				
				//This is for RIGHT CLICK
				WebElement rcbtn = driver.findElement(By.id("rightClickBtn"));
				
				act.contextClick(rcbtn).perform();
				System.out.println("Right click is performed");
				
				//This is for CLICK ME
     			WebElement clm = driver.findElement(By.className("btn btn-primary"));
				
				act.click(clm).perform();
								
				Thread.sleep(3000);
//				driver.close();

				
				}
	
				
	}		



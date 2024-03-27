package Com_Assign;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQaForm 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://demoqa.com/automation-practice-form");
				Thread.sleep(2000);
	
				driver.findElement(By.id("firstName")).sendKeys("Hemal");
				Thread.sleep(2000);
				
				driver.findElement(By.id("lastName")).sendKeys("Patil");
				Thread.sleep(2000);
				
				driver.findElement(By.id("userEmail")).sendKeys("Hemalpatil@gmail.com");
				Thread.sleep(2000);
				
				driver.findElement(By.id("gender-radio-2")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("userNumber")).sendKeys("9879969052");
				Thread.sleep(2000);
				
				driver.findElement(By.id("dateOfBirthInput")).sendKeys("06\06\2002");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Gujrati");
				
	}

}

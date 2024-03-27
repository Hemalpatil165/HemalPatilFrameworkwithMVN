package Com_Assign;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getAllLinksFromWebpage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91769\\Desktop\\Hemal_Documents\\Hemal_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");


		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
	}

}
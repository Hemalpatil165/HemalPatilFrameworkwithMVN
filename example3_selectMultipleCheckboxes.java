package Com_Assign;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_selectMultipleCheckboxes
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91769\\Desktop\\Hemal_Documents\\Hemal_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\\\Users\\\\91769\\\\Desktop\\\\Hemal_Html\\\\SelniMultiple_CheckBox.html");

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement s1:allCheckboxes)
		{
			s1.click();
			Thread.sleep(500);
		}
        
        
	}
}
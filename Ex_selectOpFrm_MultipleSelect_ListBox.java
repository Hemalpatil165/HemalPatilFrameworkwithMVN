package Com_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex_selectOpFrm_MultipleSelect_ListBox
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91769\\Desktop\\Hemal_Documents\\Hemal_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\91769\\Desktop\\Hemal_Html\\multi_dropdown.html");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select(country);
		s.selectByIndex(1);
		
	}

}

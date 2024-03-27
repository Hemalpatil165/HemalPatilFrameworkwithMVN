package Com_Assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaWebtable 

{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://demoqa.com/webtables");
				Thread.sleep(2000);
				
				List<WebElement> thElements = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/"
						+ "div[2]/div[2]/div[3]/div[1]/div[1]"));
				
				System.out.println("No. of head size: " + thElements.size());
				
				
				/*for (int i = 1; i <=7; i++) {
					for (int j = 1; j <=3; j++) {
						String data=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/"
								+ "div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]")).getText();
						
						System.out.print("    |    "+data);
					}
					System.out.println();
				}
				*/
				Thread.sleep(2000);
				driver.close();
}
}

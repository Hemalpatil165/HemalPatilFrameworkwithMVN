package Com_Assign;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class keyworddriven_poi_login
{
	@DataProvider(name="hemal")
	public Object[][] readData() throws InvalidFormatException, IOException{
		
		Object[][] data = null;
		
		//1.to give file path
		String filepath ="D:\\Selenium\\Hemal_Datadriven.xlsx";
		
		//2.to make file
		File file=new File(filepath);
		
		//3. to open a execl file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//4.to open a sheet
		Sheet sheet=workbook.getSheet("Sheet5");
		
		//5.to get row
		int nrows = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows: " + nrows);
		
		data=new Object[nrows][];
		
		for (int i = 0; i < data.length; i++)
		{
			//6.to select a particular row
			Row row = sheet.getRow(i);
			
			//7.to get col
			int ncell = row.getPhysicalNumberOfCells();
			System.out.println("no is col is: " + ncell);
			
			data[i] = new Object[ncell];
			
			for (int j = 0; j < data[i].length; j++) 
			{
				
				//8.to select a particilar cell				
				Cell cell = row.getCell(j);
				
				//9.to set all value to string
				cell.setCellType(CellType.STRING);
				
				//10.to get cell value
				data[i][j] = cell.getStringCellValue();
			}	
		}	
		return data;
	}
	
	
	WebDriver driver;
	
	@Test(dataProvider = "hemal")
	public void test(String keyword) throws 
			InterruptedException, InvalidFormatException, IOException {
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
			 		
			if (keyword.equals("open browser"))
			{
				driver=new ChromeDriver();
			}
			else if (keyword.equals("enter url")) 
			{
				driver.get("https://automationexercise.com/login");
				Thread.sleep(2000);
			}
			else if(keyword.equals("enter email address")) 
			{
				driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("hemlata123@gmail.com");
				Thread.sleep(2000);
			}
			else if(keyword.equals("enter password")) 
			{
				driver.findElement(By.id("password")).sendKeys("hem09876");
				Thread.sleep(2000);	
			}
			else if (keyword.equals("click login")) 
			{
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);	
			}
			else if (keyword.equals("close browser")) 
			{
				driver.close();
				Thread.sleep(2000);
			}
	     }
}
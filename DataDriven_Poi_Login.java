package Com_Assign;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDriven_Poi_Login 
{
	public String[][] readData() throws InvalidFormatException, IOException{
		
		String[][] data = null;
		
		//1.to give file path
		String filepath = "D:\\Selenium\\Hemal_Datadriven.xlsx";
		
		//2.to make file
		File file=new File(filepath);
		
		//3. to open a execl file
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//4.to open a sheet
		Sheet sheet=workbook.getSheet("Sheet5");
		
		//5.to get row
		int nrows=sheet.getPhysicalNumberOfRows();
		
		System.out.println("no of rows: " + nrows);
		
		//With the use of JAGGED ARRAY
		data=new String[nrows][];
		
		for (int i = 0; i < data.length; i++)
		{
			//6.to select a particular row
			Row row= sheet.getRow(i);
			
			//7.to get col
			int ncell = row.getPhysicalNumberOfCells();
			
			System.out.println("no is col is: "+ncell);
			
			data[i] = new String[ncell];
			
			for (int j = 0; j < data[i].length; j++) 
			{
				//8.to select a particilar cell
				
				Cell cell=row.getCell(j);
				
				//9.to set all value to string
				cell.setCellType(CellType.STRING);
				
				//10.to get cell value
				data[i][j]=cell.getStringCellValue();
			}
		}
		
		return data;
	}
	
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException {
		String[][] data=readData();
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	 
		for (int i = 0; i < data.length; i++) {
		
			driver = new ChromeDriver();
		
			driver.get("https://automationexercise.com/login");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.findElement(By.name("email")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys(data[i][0]);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
			Thread.sleep(5000);
			
			driver.close();
	
		}
	
	}
	


}

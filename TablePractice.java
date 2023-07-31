package firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TablePractice {

	public static void main(String[] args) {
		WebDriver driver;	
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
		//-----column list----/////
//		List< WebElement> tblhd=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
//		for(WebElement we:tblhd)
//		{
//			System.out.println(we.getText());
//		}
		
		
		////----horizontal header names print------////
		List< WebElement> tblhd=driver.findElements(By.xpath("//table/thead/tr/th"));
		for(WebElement we:tblhd)
		{
			System.out.println(we.getText());
		}
		
		
		///-----4th column list----/////
//		List< WebElement> tblhd1=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
//		for(WebElement we:tblhd1)
//		{
//			System.out.println(we.getText());
//		}
		
		/////----all table data without header names---////
	
//		List< WebElement> tblhd1=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
//		for(WebElement we:tblhd1)
//		{
//			System.out.println(we.getText());
//		}


		
		///-----3rd row list---/////
//		List< WebElement> tblhd1=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td"));
//		for(WebElement we:tblhd1)
//		{
//			System.out.println(we.getText());
//		}

	}

}


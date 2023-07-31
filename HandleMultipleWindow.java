package firstproject;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver.exe");
		driver=new  ChromeDriver();		
	     driver.get("https://www.online.citibank.co.in/");	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@class='txtSign']")).click();
	   Set<String> winhld=driver.getWindowHandles();
	   Iterator<String> i=winhld.iterator();
	   String mainwin=i.next();
	   String childwin=i.next();
	   System.out.println(driver.getTitle());
	   driver.switchTo().window(childwin);
	   System.out.println(driver.getTitle());
	   driver.switchTo().window(mainwin);
	   System.out.println(driver.getTitle());

	}

}

package firstproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeForAlert {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver;	
//		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver.exe");
//		driver=new  ChromeDriver();		
//	     driver.get("https://demoqa.com/alerts");	
//		System.out.println(driver.getTitle());
//		driver.manage().window().maximize();
		
		
		WebDriver driver;	
		System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
		driver=new  FirefoxDriver();		
	     driver.get("https://demoqa.com/alerts");	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
	    
		
		///////FOR 5 SECONDS TIME ALERT----/////
//	    driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
//	    Thread.sleep(6000);
//	    Alert a=driver.switchTo().alert();
//	    String msg=a.getText();
//	    a.accept();
//	    System.out.println(msg);
//	    //switch to main window
//	    driver.switchTo().defaultContent();
		    
		  			
		 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		 Thread.sleep(6000);
		    Alert a=driver.switchTo().alert();
		    String msg=a.getText();
		    a.sendKeys("megha");
		   // a.accept();
		    System.out.println(msg);
		    
			    
			   
			   




	}

}

package firstproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver.exe");
		driver=new  ChromeDriver();		
	     driver.get("https://demoqa.com/alerts");	
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	
	    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    Thread.sleep(7000);
	    Alert a=driver.switchTo().alert();
	    String msg=a.getText();
	    System.out.println(msg);
	    //a.accept();
	    a.dismiss();
	    //switch to main window
	    driver.switchTo().defaultContent();
	}

}

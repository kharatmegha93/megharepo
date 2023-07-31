package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MultipleWindows {
	WebDriver driver;		
	
		
  
  @Test
  public void google() {
	  driver.get("https://www.google.com/");	
  }
  @Test
  public void yahoo() {
	 driver.get("https://login.yahoo.com/?.intl=in"); 
  }
  @Test
  public void live() {
	  driver.get("https://en.wikipedia.org/wiki/Portal:Current_events");
  }
  @BeforeMethod
  public void beforeMethod() {
		driver =new ChromeDriver();	
  }


  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver.exe");
  }

  @AfterTest
  public void afterTest() {
  }

}

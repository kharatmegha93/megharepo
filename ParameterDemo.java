package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;

public class ParameterDemo {
	WebDriver driver;
  @Test
 @Parameters("url") 
  public void openGoogle(String url) {
	  driver.get(url);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver =new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
  }

}

////-----USED FOR GROUP------/////////

package testNg;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LaunchBrower {
	WebDriver driver;	
  @Test			//(groups= {"Smoke Test"})
  public void f() {
	  System.out.println(driver.getTitle());
  }
  @BeforeTest(groups= {"Smoke Test"})
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver.exe");
	  driver =new ChromeDriver();		
	 driver.get("https://www.google.com/");			
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

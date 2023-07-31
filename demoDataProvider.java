////-----USED FOR GROUP------/////////

package testNg;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class demoDataProvider {
	WebDriver driver;
	
  @Test(dataProvider = "dataLogin",groups= {"Smoke Test"})
  public void orangeLogin(String un, String pwd) throws InterruptedException {
	  Thread.sleep(3000);
	  //enter username,enter password,click on login
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  
  @Test(dataProvider = "dataLogin",groups= {"Smoke Test"})
  public void orangeLogin1(String un, String pwd) throws InterruptedException {
	  Thread.sleep(3000);
	  //enter username,enter password,click on login
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dataLogin() {
	  Object[][]obj=new Object[3][2];
	  
  
   obj[0][0]="Admin0";
   obj[0][1]= "admin123";
   obj[1][0]="Admin1";
   obj[1][1]="admin123";
   obj[2][0]="Admin2";
   obj[2][1]="admin123";
   return obj;
  }
  @BeforeTest(groups= {"Smoke Test"})
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "E:\\jarfiles\\geckodriver.exe");
	  driver=new  FirefoxDriver();		
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
  }

  @AfterTest
  public void afterTest() {
  }

}
